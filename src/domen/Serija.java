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
public class Serija {
    
    private int idSerije;
    private String nazivSerije;

    public Serija() {
    }

    public Serija(int idSerije, String nazivSerije) {
        this.idSerije = idSerije;
        this.nazivSerije = nazivSerije;
    }

    public String getNazivSerije() {
        return nazivSerije;
    }

    public void setNazivSerije(String nazivSerije) {
        this.nazivSerije = nazivSerije;
    }

    public int getIdSerije() {
        return idSerije;
    }

    public void setIdSerije(int idSerije) {
        this.idSerije = idSerije;
    }

    @Override
    public String toString() {
        return nazivSerije;
    }
    
    
}
