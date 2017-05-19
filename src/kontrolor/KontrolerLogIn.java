/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrolor;

import domen.Korisnik;
import forme.PocetnaForma;
import java.util.ArrayList;
import javax.swing.JFrame;
import sistemske.operacije.AbstractSistemskaOperacija;
import sistemske.operacije.VratiListuKorisnika;


/**
 *
 * @author filip_000
 */
public class KontrolerLogIn {
    
    private static PocetnaForma pocetnaForma;
    private static KontrolerLogIn instance;
    private ArrayList<Korisnik> listaKorisnika = null;

    private KontrolerLogIn() {
    }
    
    public static KontrolerLogIn getInstance(){
        if (instance == null) {
            instance = new KontrolerLogIn();
        }
        return instance;
    }
    
    public ArrayList<Korisnik> vratiListuKorisnika() throws Exception{
        if (listaKorisnika == null) {
            listaKorisnika = vratiListuKorisnikaIzBaze();
        }
        
        return listaKorisnika;
    }

    private ArrayList<Korisnik> vratiListuKorisnikaIzBaze() throws Exception {
        AbstractSistemskaOperacija aso = new VratiListuKorisnika();
        aso.izvrsiOperaciju(aso);
        return ((VratiListuKorisnika)aso).getListuKorisnika();
    }

    public void postaviInstancuForme(JFrame pocetna) {
        pocetnaForma = (PocetnaForma) pocetna;
    }
    
    public void ugasiPocetnuFormu(){
        pocetnaForma.setVisible(false);
    }

    public void vratiFormu() {
        pocetnaForma.setVisible(true);
    }
}
