/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifikator.login;

import domen.Korisnik;
import java.util.ArrayList;

/**
 *
 * @author filip_000
 */
public class VerifikatorLogInUsername implements IValidator{

    @Override
    public boolean validate(Object value) throws Exception {
        String user = value.toString();
        boolean flag = false;
        ArrayList<Korisnik> lista = kontrolor.KontrolerLogIn.getInstance().vratiListuKorisnika();
        
        for (Korisnik korisnik : lista) {
            if (korisnik.getUsername().equals(user)) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }
    
}
