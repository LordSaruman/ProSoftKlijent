/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.model;

import domen.OpstiDomenskiObjekat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ifpr85
 */
public class TabelaRezultatTurnir extends AbstractTableModel{

    String kolone[] = new String[]{"Team", "Coach", "Manager", "Sponsor", "Games", "Earned Money", "Region", "Location"};;
    ArrayList<OpstiDomenskiObjekat> spisakTimova;
    
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
