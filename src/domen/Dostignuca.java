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
public class Dostignuca {
    
    private int idDostignuca;
    private Tim tim;
    private String mesto;
    private Double nagrada;
    private String pozicija;
    private Turnir turnir;

    public Dostignuca() {
    }

    public Dostignuca(int idDostignuca, Tim tim, String mesto, Double nagrada, String pozicija, Turnir turnir) {
        this.idDostignuca = idDostignuca;
        this.tim = tim;
        this.mesto = mesto;
        this.nagrada = nagrada;
        this.pozicija = pozicija;
        this.turnir = turnir;
    }

    public Turnir getTurnir() {
        return turnir;
    }

    public void setTurnir(Turnir turnir) {
        this.turnir = turnir;
    }

    public int getIdDostignuca() {
        return idDostignuca;
    }

    public void setIdDostignuca(int idDostignuca) {
        this.idDostignuca = idDostignuca;
    }

    public Tim getTim() {
        return tim;
    }

    public void setTim(Tim tim) {
        this.tim = tim;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public Double getNagrada() {
        return nagrada;
    }

    public void setNagrada(Double nagrada) {
        this.nagrada = nagrada;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }
    
    
}
