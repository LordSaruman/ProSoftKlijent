/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.model;

import domen.OpstiDomenskiObjekat;
import domen.Turnir;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ifpr85
 */
public class TabelaRezultatTurnir extends AbstractTableModel{

    String kolone[] = new String[]{"Tournament", "Start", "End", "Prize Pool", "Series", "Location", "Region"};;
    ArrayList<OpstiDomenskiObjekat> spisakTurnira;

    public TabelaRezultatTurnir(ArrayList<OpstiDomenskiObjekat> spisakTimova) {
        this.spisakTurnira = spisakTimova;
    }
    
    @Override
    public int getRowCount() {
        return spisakTurnira.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Turnir turnir = (Turnir) spisakTurnira.get(rowIndex);
        switch(columnIndex){
            case 0: 
                return turnir.getNaziv();
            case 1:
                return turnir.getPocetak();
            case 2: 
                return turnir.getKraj();
            case 3: 
                return turnir.getNagradniFond();
            case 4: 
                return turnir.getSerija().getNazivSerije();
            case 5: 
                return turnir.getLokacija().getNazivLokacije();
            case 6:
                return turnir.getRegion().getNazivRegiona();
                
            default: return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
}
