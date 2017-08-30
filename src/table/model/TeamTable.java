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
public class TeamTable extends AbstractTableModel{
    
    String kolone[] = new String[]{"Team", "Coach", "Manager", "Sponsor", "Games", "Earned Money", "Region", "Location"};
    ArrayList<Tim> spisakTimova;

    public TeamTable(ArrayList<Tim> spisakTimova) {
        this.spisakTimova = spisakTimova == null ? new ArrayList<>() : spisakTimova;
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
        switch(columnIndex){
            case 0: 
                return tim.getNaziv();
            case 1:
                return tim.getTrener();
            case 2: 
                return tim.getMenadzer();
            case 3: 
                return tim.getIgre();
            case 4: 
                return tim.getZaradjenNovac();
            case 5: 
                return tim.getRegion();
            case 6:
                return tim.getLokacije();
                
            default: return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public Tim vratiSelektovanTim(int row) {
        return spisakTimova.get(row);
    }
    
    
}
