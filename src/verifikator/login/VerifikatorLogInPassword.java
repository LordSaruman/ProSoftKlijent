/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifikator.login;

import domen.Korisnik;
import domen.OpstiDomenskiObjekat;
import java.util.ArrayList;
import kontroler.GUIKontroler;

/**
 *
 * @author filip_000
 */
public class VerifikatorLogInPassword implements IValidator {

    private static VerifikatorLogInPassword inPassword;

    private VerifikatorLogInPassword() {
        password = "";
    }

    public static VerifikatorLogInPassword getInstance() {
        if (inPassword == null) {
            inPassword = new VerifikatorLogInPassword();
        }
        return inPassword;
    }

    public String password = "";

    @Override
    public boolean validate(Object value) throws Exception {
        String pass = value.toString();
        boolean flag = false;
        ArrayList<OpstiDomenskiObjekat> lista = GUIKontroler.getInstance().vratiListuKorisnika();

        for (OpstiDomenskiObjekat odoKorisnik : lista) {
            Korisnik korisnik = (Korisnik) odoKorisnik;
            if (korisnik.getPassword().equals(pass)) {
                flag = true;
                password = korisnik.getPassword();
                return flag;
            }
        }
        return flag;
    }
}
