/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domen.Korisnik;
import domen.Lokacija;
import domen.Region;
import domen.Tim;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author filip_000
 */
public class DBBroker {
    
    private static DBBroker dbbInstance;

    private DBBroker() {
    }
    
    public static DBBroker getInstance(){
        if (dbbInstance == null) {
            dbbInstance = new DBBroker();
        }
        return dbbInstance;
    } 
    
    Connection konekcija;
    
    public void ucitajDrajver(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Nije ucitan drajver");
        }
    }
    
    public void otvoriKonekciju(){
        try {
            konekcija = DriverManager.getConnection("jdbc:mysql://localhost:3306/csgobaza", "root", "");
            konekcija.setAutoCommit(false);
        } catch (SQLException ex) {
            System.err.println("Nije otvorena konekcija");        }
    }
    
    public void zatvoriKonekciju(){
        try {
            konekcija.close();
        } catch (SQLException ex) {
            System.err.println("Nije zatvorena konekcija");
        }
    }
    
    public void commit(){
        try {
            konekcija.commit();
        } catch (SQLException ex) {
            System.out.println("Nije izvrsen commit");
        }
    }
    
    public void rollback(){
        try {
            konekcija.rollback();
        } catch (SQLException ex) {
            System.out.println("Nije izvrsen rollback");    
        }
    }

    public ArrayList<Korisnik> getListuKorisnika() throws Exception {
        ArrayList<Korisnik> listaK = new ArrayList<>();
        try {
            String sql = "SELECT * FROM korisnik";
            Statement s = konekcija.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                int idKorisnika = rs.getInt("idKorisnika");
                String imeKorisnika = rs.getString("imeKorisnika");
                String prezimeKorisnika = rs.getString("prezimeKorisnika");
                String username = rs.getString("username");
                String password = rs.getString("password");
                
                Korisnik korisnik = new Korisnik(idKorisnika, imeKorisnika, prezimeKorisnika, username, password);
                listaK.add(korisnik);
            }
        } catch (Exception e) {
            throw new Exception("Neuspesno vadjenje podataka o korisniku", e);
        }
        return listaK;
    }

    public ArrayList<Region> getListuRegiona() throws SQLException {
        ArrayList<Region> listaRegiona = new ArrayList<>();
        
        String sql = "SELECT * FROM region";
        
        Statement s = konekcija.createStatement();
        ResultSet rs = s.executeQuery(sql);
        
        while(rs.next()){
            int idRegiona = rs.getInt("idRegiona");
            String nazivRegiona = rs.getString("nazivRegiona");
            
            Region r = new Region(idRegiona, nazivRegiona);
            listaRegiona.add(r);
        }
        return listaRegiona;
    }

    public ArrayList<Lokacija> getListuLokacija() throws SQLException {
        ArrayList<Lokacija> listaLokacija = new ArrayList<>();
        ArrayList<Region> listaRegiona = new ArrayList<>();
        Region r = null;
        
        listaRegiona = getListuRegiona();
        String sql = "SELECT * FROM lokacija";
        
        Statement s = konekcija.createStatement();
        ResultSet rs = s.executeQuery(sql);
        
        while(rs.next()){
            int idLokacije = rs.getInt("idLokacije");
            String nazivLokacije = rs.getString("nazivLokacije");
            int idRegiona = rs.getInt("idRegiona");
            
            for (Region region : listaRegiona) {
                if (region.getIdRegiona() == idRegiona) {
                    r = region;
                }
            }
            
            Lokacija l = new Lokacija(idLokacije, r, nazivLokacije);
            listaLokacija.add(l);
        }
        return listaLokacija;
    }

    public ArrayList<Tim> getListuTimova() throws SQLException {
        ArrayList<Tim> listaTimova = new ArrayList<>();
        ArrayList<Lokacija> listaLokacija = getListuLokacija();
        ArrayList<Region> listaRegiona = getListuRegiona();
        Region r = null;
        Lokacija l = null;
        
        String sql = "SELECT * FROM tim";
        
        Statement s = konekcija.createStatement();
        ResultSet rs = s.executeQuery(sql);
        
        while(rs.next()){
            int idTima = rs.getInt("idTima");
            String naziv = rs.getString("naziv");
            String trener = rs.getString("trener");
            String menadzer = rs.getString("menadzer");
            String sponzor = rs.getString("sponzor");
            String igre = rs.getString("igre");
            Double novac = rs.getDouble("zaradjenNovac");
            int idRegiona = rs.getInt("idRegiona");
            int idLokacije = rs.getInt("idLokacije");
            
            for (Region region : listaRegiona) {
                if (region.getIdRegiona() == idRegiona) {
                    r = region;
                }
            }
            
            for (Lokacija lokacija : listaLokacija) {
                if (lokacija.getIdLokacije() == idLokacije) {
                    l = lokacija;
                }
            }
            
            Tim t = new Tim(idTima, naziv, trener, menadzer, sponzor, igre, novac, r, l);
            listaTimova.add(t);
        }
        return listaTimova;
    }

    public void sacuvajTim(Tim tim) throws SQLException {
        String upit = "INSERT INTO tim (naziv, trener, menadzer, sponzor, igre, zaradjenNovac, idRegiona, idLokacije) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement ps = konekcija.prepareStatement(upit);
        
        try {
            ps.setString(1, tim.getNaziv());
            ps.setString(2, tim.getTrener());
            ps.setString(3, tim.getMenadzer());
            ps.setString(4, tim.getSponzor());
            ps.setString(5, tim.getIgre());
            ps.setDouble(6, tim.getZaradjenNovac());
            ps.setInt(7, tim.getRegion().getIdRegiona());
            ps.setInt(8, tim.getLokacije().getIdLokacije());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            ps.close();
        }
        
    }

    public ArrayList<String> getListaManagera() throws SQLException {
        ArrayList<String> listaTimova = new ArrayList<>();
        
        String sql = "SELECT * FROM tim join region on tim.idRegiona = region.idRegiona join lokacija on tim.idLokacije = lokacija.idLokacije";
        
        Statement s = konekcija.createStatement();
        ResultSet rs = s.executeQuery(sql);
        
        while(rs.next()){
            String naziv = rs.getString("menadzer");
            listaTimova.add(naziv);
        }
        return listaTimova;
    }
}
