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
public class Tim {
    
    private int idTima;
    private String naziv;
    private String trener;
    private String menadzer;
    private String sponzor;
    private String igre;
    private Double zaradjenNovac;
    private Region region;
    private Lokacija lokacije;

    public Tim() {
    }

    public Tim(int idTima, String naziv, String trener, String menadzer, String sponzor, String igre, Double zaradjenNovac, Region region, Lokacija lokacije) {
        this.idTima = idTima;
        this.naziv = naziv;
        this.trener = trener;
        this.menadzer = menadzer;
        this.sponzor = sponzor;
        this.igre = igre;
        this.zaradjenNovac = zaradjenNovac;
        this.region = region;
        this.lokacije = lokacije;
    }

    public Lokacija getLokacije() {
        return lokacije;
    }

    public void setLokacije(Lokacija lokacije) {
        this.lokacije = lokacije;
    }

    public int getIdTima() {
        return idTima;
    }

    public void setIdTima(int idTima) {
        this.idTima = idTima;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTrener() {
        return trener;
    }

    public void setTrener(String trener) {
        this.trener = trener;
    }

    public String getMenadzer() {
        return menadzer;
    }

    public void setMenadzer(String menadzer) {
        this.menadzer = menadzer;
    }

    public String getSponzor() {
        return sponzor;
    }

    public void setSponzor(String sponzor) {
        this.sponzor = sponzor;
    }

    public String getIgre() {
        return igre;
    }

    public void setIgre(String igre) {
        this.igre = igre;
    }

    public Double getZaradjenNovac() {
        return zaradjenNovac;
    }

    public void setZaradjenNovac(Double zaradjenNovac) {
        this.zaradjenNovac = zaradjenNovac;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
}
