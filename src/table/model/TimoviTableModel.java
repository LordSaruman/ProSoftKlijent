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
    private String[] tableColumns = new String[]{"Team Name", "Manager", "Sponsor"};

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

    private String hint = "";
    private List<String> filter = new ArrayList<>();
    private int moneyFrom = -1;
    private int moneyTo = -1;

    public void filtirajTabela(String hint) {
        this.hint = hint;
        izvrsiSveFiltere();
    }

    public void filtrirajPoNecemu(List<String> filter) {
        this.filter = filter;
        izvrsiSveFiltere();
    }

    public void filtirajTabelaPoZaradi(int moneyFrom, int moneyTo) {
        this.moneyFrom = moneyFrom;
        this.moneyTo = moneyTo;
        izvrsiSveFiltere();
    }

    private void izvrsiSveFiltere() {
        spisakTimova = pocetniSpisakTimova.stream()
                .filter((tim) -> {
                    return filter1(tim) && filter2(tim) && filter3(tim);
                }).collect(Collectors.toList());

        fireTableDataChanged();
    }

    private boolean filter1(Tim tim) {
        if (hint.isEmpty()) {
            return true;
        }

        return tim.getMenadzer().toLowerCase().contains(hint.toLowerCase()) || tim.getNaziv().toLowerCase().contains(hint.toLowerCase());
    }

    private boolean filter2(Tim tim) {
        if (filter.isEmpty()) {
            return true;
        }
        return filter.contains(tim.getMenadzer());
    }

    private boolean filter3(Tim tim) {
        if (moneyFrom != -1 && moneyTo != -1) {
            return tim.getZaradjenNovac() > moneyFrom && tim.getZaradjenNovac() < moneyTo;
        } else if (moneyFrom != -1) {
            return tim.getZaradjenNovac() > moneyFrom;
        } else if (moneyTo != -1) {
            return tim.getZaradjenNovac() < moneyTo;
        }
        return true;
    }

}
