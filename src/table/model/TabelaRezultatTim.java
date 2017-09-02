/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.model;

import domen.OpstiDomenskiObjekat;
import domen.Tim;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ifpr85
 */
public class TabelaRezultatTim extends AbstractTableModel {

    String kolone[] = new String[]{"Team", "Coach", "Manager", "Sponsor", "Games", "Earned Money", "Region", "Location"};
    ;
    ArrayList<OpstiDomenskiObjekat> spisakTimova;

    public TabelaRezultatTim(ArrayList<OpstiDomenskiObjekat> spisakTimova) {
        this.spisakTimova = spisakTimova;
    }

    @Override
    public int getRowCount() {
        return spisakTimova.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tim tim = (Tim) spisakTimova.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tim.getNaziv();
            case 1:
                return tim.getTrener();
            case 2:
                return tim.getMenadzer();
            case 3:
                return tim.getSponzor();
            case 4:
                return tim.getIgre();
            case 5:
                return tim.getZaradjenNovac();
            case 6:
                return tim.getRegion().getNazivRegiona();
            case 7:
                return tim.getLokacije().getNazivLokacije();

            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

}
