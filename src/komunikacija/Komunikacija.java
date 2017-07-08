/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author filip_000
 */
public class Komunikacija {

    private static Komunikacija komunikacija;
    Socket s;

    private Komunikacija() {
    }

    public static Komunikacija getInstance() {
        if (komunikacija == null) {
            komunikacija = new Komunikacija();
        }
        return komunikacija;
    }
    
    public void poveziSe(String adresa, int port){
        try {
            s = new Socket(adresa, port);
        } catch (IOException ex) {
            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ServerskiOdgovor primiOdgovor() {

        ServerskiOdgovor so = new ServerskiOdgovor();
        try {
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            so = (ServerskiOdgovor) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        }

        return so;
    }

    public void posaljiZahtev(KlijentskiZahtev kz) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(kz);
        } catch (IOException ex) {
            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
