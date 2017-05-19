/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author filip_000
 */
public class Korisnik {
    
    private int idKorisnika;
    private String imeKorisnika;
    private String prezimeKorisnika;
    private String username;
    private String password;

    public Korisnik() {
    }

    public Korisnik(int idKorisnika, String imeKorisnika, String prezimeKorisnika, String username, String password) {
        this.idKorisnika = idKorisnika;
        this.imeKorisnika = imeKorisnika;
        this.prezimeKorisnika = prezimeKorisnika;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdKorisnika() {
        return idKorisnika;
    }

    public void setIdKorisnika(int idKorisnika) {
        this.idKorisnika = idKorisnika;
    }

    public String getImeKorisnika() {
        return imeKorisnika;
    }

    public void setImeKorisnika(String imeKorisnika) {
        this.imeKorisnika = imeKorisnika;
    }

    public String getPrezimeKorisnika() {
        return prezimeKorisnika;
    }

    public void setPrezimeKorisnika(String prezimeKorisnika) {
        this.prezimeKorisnika = prezimeKorisnika;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
