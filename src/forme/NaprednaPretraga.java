/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.util.ArrayList;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikola
 */
public class NaprednaPretraga extends javax.swing.JDialog {

    List<String> timovi;
    List<JCheckBox> boxovi = new ArrayList<>();
    PretrragaTimova cale;

    /**
     * Creates new form NaprednaPretraga
     */
    public NaprednaPretraga(java.awt.Frame parent, boolean modal, List<String> timovi, PretrragaTimova cale) {
        super(parent, modal);
        this.timovi = timovi;
        this.cale = cale;
        initComponents();
        kojiK();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnOdustani = new javax.swing.JButton();
        btnPrimeniPretragu = new javax.swing.JButton();
        btnObrisiFilter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Advanced Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        btnOdustani.setText("Close");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        btnPrimeniPretragu.setText("Use the Search");
        btnPrimeniPretragu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeniPretraguActionPerformed(evt);
            }
        });

        btnObrisiFilter.setText("Delete the Filter");
        btnObrisiFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnObrisiFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrimeniPretragu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOdustani)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOdustani)
                    .addComponent(btnPrimeniPretragu)
                    .addComponent(btnObrisiFilter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        int rez = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da odustanate", "Info", JOptionPane.YES_NO_OPTION);
        if (rez == JOptionPane.YES_OPTION) {
            setVisible(false);
        }
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnPrimeniPretraguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeniPretraguActionPerformed
        List<String> filter = new ArrayList<>();
        for (JCheckBox jCheckBox : boxovi) {
            if (jCheckBox.isSelected()) {
                filter.add(jCheckBox.getText());
            }
        }

        if (filter.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Molim izaberite manadzere po kojima zelite da filtirate");
            return;
        }

        cale.filtrirajPoNecemu(filter);
        setVisible(false);
    }//GEN-LAST:event_btnPrimeniPretraguActionPerformed

    private void btnObrisiFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiFilterActionPerformed
        cale.obrisiManadzerFilter();
        setVisible(false);
    }//GEN-LAST:event_btnObrisiFilterActionPerformed

    private void kojiK() {
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        GroupLayout.ParallelGroup pg = jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        GroupLayout.SequentialGroup sg = jPanel1Layout.createSequentialGroup();
        sg.addContainerGap();
        for (String string : timovi) {
            JCheckBox ch = new JCheckBox();
            boxovi.add(ch);
            ch.setText(string);
            pg.addComponent(ch);
            sg.addComponent(ch);

        }

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pg)
                                .addContainerGap(291, Short.MAX_VALUE))
        );

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sg)
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObrisiFilter;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnPrimeniPretragu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
