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
public class Rezultat {
    
    private Tim tim;
    private Turnir turnir;
    private String rezultat;
    private Korisnik korisnik;

    public Rezultat() {
    }

    public Rezultat(Tim tim, Turnir turnir, String rezultat, Korisnik korisnik) {
        this.tim = tim;
        this.turnir = turnir;
        this.rezultat = rezultat;
        this.korisnik = korisnik;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Tim getTim() {
        return tim;
    }

    public void setTim(Tim tim) {
        this.tim = tim;
    }

    public Turnir getTurnir() {
        return turnir;
    }

    public void setTurnir(Turnir turnir) {
        this.turnir = turnir;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }
    
    
}
