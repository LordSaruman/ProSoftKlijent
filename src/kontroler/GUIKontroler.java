/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.Korisnik;
import domen.OpstiDomenskiObjekat;
import domen.Tim;
import forme.PocetnaForma;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private ArrayList<OpstiDomenskiObjekat> listaKorisnika = null;
    private ArrayList<OpstiDomenskiObjekat> listaUlogovanihKorisnika = new ArrayList<>();
    private String imeIPrezime = "";
    private Korisnik korisnik;

    private GUIKontroler() {
    }

    public static GUIKontroler getInstance() {
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

    public ArrayList<OpstiDomenskiObjekat> vratiListuKorisnika() throws Exception {
        if (listaKorisnika == null) {
            listaKorisnika = vratiListu(new Korisnik());
        }

        return listaKorisnika;
    }

    public String postaviUlogovanogKorisnika() {
        String usernameName = VerifikatorLogInUsername.getInstance().username;
        String password = VerifikatorLogInPassword.getInstance().password;

        for (OpstiDomenskiObjekat odoKorisnik : listaKorisnika) {
            Korisnik korisnik = (Korisnik) odoKorisnik;
            if (korisnik.getUsername().equals(usernameName) && korisnik.getPassword().equals(password)) {
                if (imeIPrezime.isEmpty()) {
                    imeIPrezime += korisnik.getImeKorisnika() + " " + korisnik.getPrezimeKorisnika();
                    if (!listaUlogovanihKorisnika.contains(korisnik)) {
                        listaUlogovanihKorisnika.add(korisnik);
                        try {
                            posaljiListuUlogovanihKorisnika();
                        } catch (Exception ex) {
                            Logger.getLogger(GUIKontroler.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
        return imeIPrezime;
    }

    public ArrayList<OpstiDomenskiObjekat> vratiListu(OpstiDomenskiObjekat odo) throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacija.VRATI_LISTU);
        kz.setParametar(odo);
        Komunikacija.getInstance().posaljiZahtev(kz);

        ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
        if (so.getStatusZahteva() == StatusZahteva.USPESAN_ZAHTEV) {
            return (ArrayList<OpstiDomenskiObjekat>) so.getOdgovor();
        } else {
            throw new Exception("Doslo je do greske");
        }

    }

    public OpstiDomenskiObjekat sacuvajOpste(OpstiDomenskiObjekat odo) throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacija.SACUVAJ);
        kz.setParametar(odo);
        Komunikacija.getInstance().posaljiZahtev(kz);

        ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
        if (so.getStatusZahteva() == StatusZahteva.USPESAN_ZAHTEV) {
            return (OpstiDomenskiObjekat) so.getOdgovor();
        } else {
            throw new Exception("Doslo je do greske");
        }

    }

    public List<String> vratiListuManagera() throws Exception {
        List<OpstiDomenskiObjekat> list = vratiListu(new Tim());
        ArrayList<String> spisakMenadzera = new ArrayList<>();
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            Tim tim = (Tim) opstiDomenskiObjekat;
            if (!spisakMenadzera.contains(tim.getMenadzer())) {
                spisakMenadzera.add(tim.getMenadzer());
            }
        }

        return spisakMenadzera;
    }

    public void sacuvajListuRezultata(ArrayList<OpstiDomenskiObjekat> spisakRezultata) throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacija.SACUVAJ_REZULTATE);
        kz.setParametar(spisakRezultata);
        Komunikacija.getInstance().posaljiZahtev(kz);

        ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
        if (so.getStatusZahteva() != StatusZahteva.USPESAN_ZAHTEV) {
            throw new Exception("Doslo je do greske");
        }
    }

    private void posaljiListuUlogovanihKorisnika() throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacija.PROSLEDI_LISTU_ULOGOVANIH_KORISNIKA);
        kz.setParametar(listaUlogovanihKorisnika);
        Komunikacija.getInstance().posaljiZahtev(kz);
        
        ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
        if (so.getStatusZahteva() != StatusZahteva.USPESAN_ZAHTEV) {
            throw new Exception("Doslo je do greske");
        }
    }

}
