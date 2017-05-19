/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrolor;

import domen.Lokacija;
import domen.Region;
import domen.Tim;
import sistemske.operacije.AbstractSistemskaOperacija;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemske.operacije.SacuvajTim;
import sistemske.operacije.VratiListuLokacija;
import sistemske.operacije.VratiListuManagera;
import sistemske.operacije.VratiListuRegiona;
import sistemske.operacije.VratiListuTimova;

/**
 *
 * @author filip_000
 */
public class Kontrolor {

    private static Kontrolor instance;

    private Kontrolor() {
    }

    public static Kontrolor getInstance() {
        if (instance == null) {
            instance = new Kontrolor();
        }
        return instance;
    }

    public ArrayList<Region> vratiListuRegiona() throws Exception {
        AbstractSistemskaOperacija aso = new VratiListuRegiona();
        aso.izvrsiOperaciju(aso);
        return ((VratiListuRegiona) aso).getListuRegiona();
    }

    public ArrayList<Lokacija> vratiListuLokacija() throws Exception {
        AbstractSistemskaOperacija aso = new VratiListuLokacija();
        aso.izvrsiOperaciju(aso);
        return ((VratiListuLokacija) aso).getListuLokacija();
    }

    public ArrayList<Tim> vratiListuTimova() throws Exception {
        AbstractSistemskaOperacija aso = new VratiListuTimova();
        aso.izvrsiOperaciju(aso);
        return ((VratiListuTimova) aso).getListuTimova();
    }

    public void sacuvajTim(Tim tim) throws Exception {
        AbstractSistemskaOperacija aso = new SacuvajTim();
        aso.izvrsiOperaciju(tim);

    }

    public List<String> vratiListuManagera() throws Exception {
        AbstractSistemskaOperacija aso = new VratiListuManagera();
        aso.izvrsiOperaciju(aso);
        return ((VratiListuManagera) aso).getListaManagera();
    }

}
