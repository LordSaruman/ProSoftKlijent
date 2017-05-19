/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.Date;

/**
 *
 * @author filip_000
 */
public class Turnir {
    
    private int idTurnira;
    private Date pocetak;
    private Date kraj;
    private String naziv;
    private Double nagradniFond;
    private Serija serija;
    private Lokacija lokacija;
    private Region region;

    public Turnir() {
    }

    public Turnir(int idTurnira, Date pocetak, Date kraj, String naziv, Double nagradniFond, Serija serija, Lokacija lokacija, Region region) {
        this.idTurnira = idTurnira;
        this.pocetak = pocetak;
        this.kraj = kraj;
        this.naziv = naziv;
        this.nagradniFond = nagradniFond;
        this.serija = serija;
        this.lokacija = lokacija;
        this.region = region;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public int getIdTurnira() {
        return idTurnira;
    }

    public void setIdTurnira(int idTurnira) {
        this.idTurnira = idTurnira;
    }

    public Date getPocetak() {
        return pocetak;
    }

    public void setPocetak(Date pocetak) {
        this.pocetak = pocetak;
    }

    public Date getKraj() {
        return kraj;
    }

    public void setKraj(Date kraj) {
        this.kraj = kraj;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Double getNagradniFond() {
        return nagradniFond;
    }

    public void setNagradniFond(Double nagradniFond) {
        this.nagradniFond = nagradniFond;
    }

    public Serija getSerija() {
        return serija;
    }

    public void setSerija(Serija serija) {
        this.serija = serija;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }
    
    
}
