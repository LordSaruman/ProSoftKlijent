/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.model;

import domen.OpstiDomenskiObjekat;
import domen.Rezultat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Filip
 */
public class RezultatiTabelModel extends AbstractTableModel {

    String kolone[] = new String[]{"Tim", "Turnir", "Ruzultat", "Korisnik"};
    ArrayList<OpstiDomenskiObjekat> spisakRezultata;

    public RezultatiTabelModel(ArrayList<OpstiDomenskiObjekat> spisakRezultata) {
        this.spisakRezultata = spisakRezultata;
    }

    @Override
    public int getRowCount() {
        return spisakRezultata.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    @Override
    public Object getValueAt(int row, int column) {
        Rezultat rezultat = (Rezultat) spisakRezultata.get(row);

        switch (column) {
            case 0:
                return rezultat.getTim().getNaziv();
            case 1:
                return rezultat.getTurnir();
            case 2:
                return rezultat.getRezultat();
            case 3:
                return rezultat.getKorisnik();
            default:
                return "N/A";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 2;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Rezultat rezultat = (Rezultat) spisakRezultata.get(rowIndex);
        rezultat.setRezultat((String) aValue);
    }

    public void setSpisakRezultata(ArrayList<OpstiDomenskiObjekat> spisakRezultata) {
        this.spisakRezultata = spisakRezultata;
        fireTableDataChanged();
    }

    public void dodajNoviRezultat(Rezultat rez) {
        spisakRezultata.add(rez);
        fireTableDataChanged();
    }

    public ArrayList<OpstiDomenskiObjekat> getSpisakRezultata() {
        return spisakRezultata;
    }

}
