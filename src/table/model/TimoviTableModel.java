/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.model;

import domen.Tim;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Filip
 */
public class TimoviTableModel extends AbstractTableModel {

    private List<Tim> pocetniSpisakTimova;
    private List<Tim> spisakTimova;
    private String[] tableColumns = new String[]{"naziv", "menadzer", "sponzor"};

    public TimoviTableModel(List<Tim> spisakTimova) {
        this.spisakTimova = spisakTimova == null ? new ArrayList<>() : spisakTimova;
        pocetniSpisakTimova = spisakTimova;
    }

    @Override
    public int getRowCount() {
        return spisakTimova.size();
    }

    @Override
    public int getColumnCount() {
        return tableColumns.length;
    }

    @Override
    public String getColumnName(int column) {
        return tableColumns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tim time = spisakTimova.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return time.getNaziv();
            case 1:
                return time.getMenadzer();
            case 2:
                return time.getSponzor();
            default:
                return "N/A";
        }

    }

    public void filtirajTabela(String hint) {
        if (hint.isEmpty()) {
            spisakTimova = pocetniSpisakTimova;
        } else {
            spisakTimova = pocetniSpisakTimova.stream()
                    .filter((tim) -> {
                        return tim.getMenadzer().toLowerCase().contains(hint.toLowerCase()) || tim.getNaziv().toLowerCase().contains(hint.toLowerCase());
                    })
                    .collect(Collectors.toList());
        }
        fireTableDataChanged();
    }

    public void filtrirajPoNecemu(List<String> filter) {

        spisakTimova = spisakTimova.stream()
                .filter((tim) -> {
                    return filter.contains(tim.getMenadzer());
                })
                .collect(Collectors.toList());

        fireTableDataChanged();
    }

}
