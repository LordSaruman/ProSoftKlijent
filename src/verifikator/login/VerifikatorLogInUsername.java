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
public class VerifikatorLogInUsername implements IValidator {

    //singletone
    private static VerifikatorLogInUsername inUsername;

    private VerifikatorLogInUsername() {
        username = "";
    }

    public static VerifikatorLogInUsername getInstance() {
        if (inUsername == null) {
            inUsername = new VerifikatorLogInUsername();
        }
        return inUsername;
    }

    public String username;

    @Override
    public boolean validate(Object value) throws Exception {
        String user = value.toString();
        boolean flag = false;
        ArrayList<OpstiDomenskiObjekat> lista = GUIKontroler.getInstance().vratiListuKorisnika();

        for (OpstiDomenskiObjekat odoKorisnik : lista) {
            Korisnik korisnik = (Korisnik) odoKorisnik;
            if (korisnik.getUsername().equals(user)) {
                flag = true;
                username = korisnik.getUsername();
                return flag;
            }
        }
        return flag;
    }
}
