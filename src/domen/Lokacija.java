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
public class Lokacija {
    
    private int idLokacije;
    private Region Region;
    private String nazivLokacije;

    public Lokacija() {
    }

    public Lokacija(int idLokacije, Region Region, String nazivLokacije) {
        this.idLokacije = idLokacije;
        this.Region = Region;
        this.nazivLokacije = nazivLokacije;
    }

    public String getNazivLokacije() {
        return nazivLokacije;
    }

    public void setNazivLokacije(String nazivLokacije) {
        this.nazivLokacije = nazivLokacije;
    }

    public int getIdLokacije() {
        return idLokacije;
    }

    public void setIdLokacije(int idLokacije) {
        this.idLokacije = idLokacije;
    }

    public Region getRegion() {
        return Region;
    }

    public void setRegion(Region Region) {
        this.Region = Region;
    }

    @Override
    public String toString() {
        return nazivLokacije;
    }
    
    
}
