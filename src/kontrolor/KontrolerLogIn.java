/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrolor;

import domen.Korisnik;
import forme.PocetnaForma;
import forme.SignUp;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import login.panel.PanelInputTextFieldLogInPassword;
import sistemske.operacije.AbstractSistemskaOperacija;
import sistemske.operacije.VratiListuKorisnika;
import verifikator.login.VerifikatorLogInPassword;
import verifikator.login.VerifikatorLogInUsername;

/**
 *
 * @author filip_000
 */
public class KontrolerLogIn {

    private static PocetnaForma pocetnaForma;
    private static KontrolerLogIn instance;
    private ArrayList<Korisnik> listaKorisnika = null;
    private String imeIPrezime = "";

    private KontrolerLogIn() {
    }

    public static KontrolerLogIn getInstance() {
        if (instance == null) {
            instance = new KontrolerLogIn();
        }
        return instance;
    }

    public ArrayList<Korisnik> vratiListuKorisnika() throws Exception {
        if (listaKorisnika == null) {
            listaKorisnika = vratiListuKorisnikaIzBaze();
        }

        return listaKorisnika;
    }

    private ArrayList<Korisnik> vratiListuKorisnikaIzBaze() throws Exception {
        AbstractSistemskaOperacija aso = new VratiListuKorisnika();
        aso.izvrsiOperaciju(aso);
        return ((VratiListuKorisnika) aso).getListuKorisnika();
    }

    public void postaviInstancuForme(JFrame pocetna) {
        pocetnaForma = (PocetnaForma) pocetna;
    }

    public void ugasiPocetnuFormu() {
        pocetnaForma.setVisible(false);
    }

    public void vratiFormu() {
        pocetnaForma.setVisible(true);
    }

    public String postaviUlogovanogKorisnika() {
        VerifikatorLogInUsername username = new VerifikatorLogInUsername();
        VerifikatorLogInPassword password = new VerifikatorLogInPassword();
        
        imeIPrezime += username.vratiUsera() + "";
        return imeIPrezime  += password.vratiPassword();
    }
}
