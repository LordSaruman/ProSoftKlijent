/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.model;

import domen.Turnir;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author filip_000
 */
public class TournamentTable extends AbstractTableModel {

    String kolone[] = new String[]{"Tournament", "Start Date", "End Date", "Prize Pool", "Series", "Region", "Location"};
    ArrayList<Turnir> spisakTurnira;

    public TournamentTable(ArrayList<Turnir> spisakTurnira) {
        this.spisakTurnira = spisakTurnira == null ? new ArrayList<>() : spisakTurnira;
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
        Turnir t = (Turnir) spisakTurnira.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return t.getNaziv();
            case 1:
                return t.getPocetak();
            case 2:
                return t.getKraj();
            case 3:
                return t.getNagradniFond();
            case 4:
                return t.getNagradniFond();
            case 5:
                return t.getSerija();
            case 6:
                return t.getRegion().getNazivRegiona();
            case 7:
                return t.getLokacija().getNazivLokacije();

            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    public Turnir vratiSelektovaniTurnir(int row){
        return spisakTurnira.get(row);
    }
}
