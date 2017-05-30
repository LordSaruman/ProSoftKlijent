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
public class VerifikatorLogInPassword implements IValidator{

    public String password = "";
    @Override
    public boolean validate(Object value) throws Exception {
        String pass = value.toString();
        boolean flag = false;
        ArrayList<Korisnik> lista = kontrolor.KontrolerLogIn.getInstance().vratiListuKorisnika();
        
        for (Korisnik korisnik : lista) {
            if (korisnik.getPassword().equals(pass)) {
                flag = true;
                password = korisnik.getPassword();
                return flag;
            }
        }
        return flag;
    }
    
    public String vratiPassword(){
        return password;
    }
}