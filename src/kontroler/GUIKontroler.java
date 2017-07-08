/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.Korisnik;
import domen.OpstiDomenskiObjekat;
import forme.PocetnaForma;
import java.util.ArrayList;
import javax.swing.JFrame;
import komunikacija.Komunikacija;
import operacije.Operacija;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;
import transfer.StatusZahteva;
import verifikator.login.VerifikatorLogInPassword;
import verifikator.login.VerifikatorLogInUsername;

/**
 *
 * @author Filip
 */
public class GUIKontroler {
    
    private static GUIKontroler instance;
    private ArrayList<Korisnik> listaKorisnika = null;
    private String imeIPrezime = "";
    private Korisnik korisnik;
    
    private GUIKontroler() {
    }
    
    public static GUIKontroler getInstance(){
        if (instance == null) {
            instance = new GUIKontroler();
        }
        return instance;
    }
    
    private static PocetnaForma pocetnaForma;
    
    public void postaviInstancuForme(JFrame pocetna) {
        pocetnaForma = (PocetnaForma) pocetna;
    }

    public void ugasiPocetnuFormu() {
        pocetnaForma.setVisible(false);
    }

    public void vratiFormu() {
        pocetnaForma.setVisible(true);
    }
    
    public ArrayList<Korisnik> vratiListuKorisnika() throws Exception {
        if (listaKorisnika == null) {
            listaKorisnika = vratiListu();
        }

        return listaKorisnika;
    }

    public String postaviUlogovanogKorisnika() {
        String usernameName = VerifikatorLogInUsername.getInstance().username;
        String password = VerifikatorLogInPassword.getInstance().password;

        for (Korisnik korisnik : listaKorisnika) {
            if (korisnik.getUsername() == usernameName && korisnik.getPassword() == password) {
                if (imeIPrezime.isEmpty()) {
                    imeIPrezime += korisnik.getImeKorisnika() + " " + korisnik.getPrezimeKorisnika();
                }
            }
        }
        return imeIPrezime;
    }
    
    public ArrayList<OpstiDomenskiObjekat> vratiListu(OpstiDomenskiObjekat odo) throws Exception{
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacija.VRATI_LISTU);
        kz.setParametar(odo);
        Komunikacija.getInstance().posaljiZahtev(kz);
        
        ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
        if (so.getStatusZahteva() == StatusZahteva.USPESAN_ZAHTEV) {
             return (ArrayList<OpstiDomenskiObjekat>) so.getOdgovor();
        }else{
            throw new Exception("Doslo je do greske");
        }
        
    }
    
    public OpstiDomenskiObjekat sacuvajOpste(OpstiDomenskiObjekat odo) throws Exception{
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacija.SACUVAJ);
        kz.setParametar(odo);
        Komunikacija.getInstance().posaljiZahtev(kz);
        
        ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
        if (so.getStatusZahteva() == StatusZahteva.USPESAN_ZAHTEV) {
             return (OpstiDomenskiObjekat) so.getOdgovor();
        }else{
            throw new Exception("Doslo je do greske");
        }
        
    }
}
