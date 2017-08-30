/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Lokacija;
import domen.OpstiDomenskiObjekat;
import domen.Region;
import domen.Tim;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static java.lang.Character.isLetter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import komunikacija.Komunikacija;
import kontroler.GUIKontroler;
import operacije.Operacija;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;
import transfer.StatusZahteva;

/**
 *
 * @author filip_000
 */
public class IzmenaTimova extends javax.swing.JDialog {

    private ArrayList<Region> listaR;
    private ArrayList<Lokacija> listaL;
    private int idTima;
    private Tim tim;
    Double gold = 0.0;
    /**
     * Creates new form IzmenaTimova
     */
    public IzmenaTimova(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        listaR = vratiListuR();
        listaL = vratiListuL();
        popuniComboNazivTimova();
        srediTextFieldSignedIn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldTrener = new javax.swing.JTextField();
        txtFieldSponzor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldZaradjenNovac = new javax.swing.JTextField();
        btnSacuvajTim = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtFieldMenadzer = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jcbCSGO = new javax.swing.JCheckBox();
        jcbDota2 = new javax.swing.JCheckBox();
        jlblTrenerPoruka = new javax.swing.JLabel();
        jlbMenadzerPoruka = new javax.swing.JLabel();
        jlblSponzorPoruka = new javax.swing.JLabel();
        jlblZaradjenNovacPoruka = new javax.swing.JLabel();
        jlblIgreKojeTimIgraPoruka = new javax.swing.JLabel();
        comboNazivTima = new javax.swing.JComboBox();
        btnIzmeni = new javax.swing.JButton();
        comboRegion = new javax.swing.JComboBox();
        comboLokacija = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        checkBoxNewName = new javax.swing.JCheckBox();
        txtNewName = new javax.swing.JTextField();
        jlblNewTeam = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFieldSignedUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("[CSGO] Change a Team");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Team"));

        jLabel1.setText("Name of team:");

        jLabel2.setText("Location:");

        jLabel3.setText("Region:");

        jLabel4.setText("Coach:");

        jLabel5.setText("Sponsor:");

        jLabel6.setText("Earned money:");

        btnSacuvajTim.setText("Save the team");
        btnSacuvajTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajTimActionPerformed(evt);
            }
        });

        jLabel13.setText("Manager:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Games that team plays\n"));

        jcbCSGO.setText("Counter-Strike: Global Offensive");

        jcbDota2.setText("Dota 2");
        jcbDota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDota2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbDota2)
                    .addComponent(jcbCSGO, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbCSGO)
                .addGap(18, 18, 18)
                .addComponent(jcbDota2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jlblTrenerPoruka.setForeground(new java.awt.Color(255, 0, 0));

        jlbMenadzerPoruka.setForeground(new java.awt.Color(255, 0, 0));

        jlblSponzorPoruka.setForeground(new java.awt.Color(255, 0, 0));

        jlblZaradjenNovacPoruka.setForeground(new java.awt.Color(255, 0, 0));

        jlblIgreKojeTimIgraPoruka.setForeground(new java.awt.Color(255, 0, 0));

        comboNazivTima.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNazivTimaItemStateChanged(evt);
            }
        });

        btnIzmeni.setText("Change the data");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("New Team Name"));

        checkBoxNewName.setText("New name:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBoxNewName)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblNewTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNewName, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxNewName)
                    .addComponent(txtNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblNewTeam)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                    .addComponent(txtFieldMenadzer, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jlbMenadzerPoruka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(37, 37, 37)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlblTrenerPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFieldTrener)
                                        .addComponent(comboNazivTima, 0, 221, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlblSponzorPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFieldSponzor)
                                        .addComponent(comboRegion, 0, 221, Short.MAX_VALUE)
                                        .addComponent(comboLokacija, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFieldZaradjenNovac)
                                    .addComponent(jlblZaradjenNovacPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblIgreKojeTimIgraPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIzmeni)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSacuvajTim)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboNazivTima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFieldTrener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblTrenerPoruka)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtFieldMenadzer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbMenadzerPoruka)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFieldSponzor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblSponzorPoruka)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(comboLokacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblIgreKojeTimIgraPoruka))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)
                                .addComponent(txtFieldZaradjenNovac, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlblZaradjenNovacPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSacuvajTim)
                            .addComponent(btnIzmeni)
                            .addComponent(btnCancel))
                        .addContainerGap())))
        );

        jLabel7.setText("Signed in user:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldSignedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(txtFieldSignedUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajTimActionPerformed
        
        String naziv = (String) comboNazivTima.getSelectedItem();
        String trener = txtFieldTrener.getText().trim();
        String menadzer = txtFieldMenadzer.getText().trim();
        String sponzor = txtFieldSponzor.getText().trim();
        Region region = (Region) comboRegion.getSelectedItem();
        Lokacija lokacija = (Lokacija) comboLokacija.getSelectedItem();
        String novac = txtFieldZaradjenNovac.getText().trim();
        Tim tim;

        String igre = "";
        if (jcbCSGO.isSelected()) {
            igre += "CSGO" + "";
            if (jcbDota2.isSelected()) {
                igre += "Dota2";
            }
        }
        boolean flag = true;
        try {
            if (checkBoxNewName.isSelected()) {
                if (txtNewName.getText().isEmpty() || txtNewName == null) {
                    jlblNewTeam.setText("Field for new name is empty");
                    jlblNewTeam.setForeground(Color.red);
                    flag = false;
                }else{
                    jlblNewTeam.setText("");
                    naziv = txtNewName.getText();
                }
            }
            
            if (kreirajIIzvrsiValidaciju(naziv, trener, menadzer, sponzor, region, lokacija, igre, novac) == true) {
                tim = vratiTim(naziv, trener, menadzer, sponzor, region, lokacija, igre, novac);
                KlijentskiZahtev kz = new KlijentskiZahtev();
                kz.setOperacija(Operacija.IZMENI);
                kz.setParametar(tim);
                Komunikacija.getInstance().posaljiZahtev(kz);

                ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
                if (so.getStatusZahteva() == StatusZahteva.USPESAN_ZAHTEV) {
                    JOptionPane.showMessageDialog(this, "Team has been successfully changed!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Team has not beenchanged. Error occured.", "Error", JOptionPane.ERROR_MESSAGE);
                    invalidate();
                    repaint();
                    validate();
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Failed validation. Check all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                invalidate();
                repaint();
                validate();
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(UnosTimova.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSacuvajTimActionPerformed

    private void jcbDota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDota2ActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        jcbCSGO.setEnabled(true);
        jcbDota2.setEnabled(true);
        comboLokacija.setEnabled(true);
        txtFieldMenadzer.setEnabled(true);
        comboRegion.setEnabled(true);
        txtFieldSponzor.setEnabled(true);
        txtFieldTrener.setEnabled(true);
        txtFieldZaradjenNovac.setEnabled(true);
        txtNewName.setEnabled(true);
        checkBoxNewName.setEnabled(true);
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void comboNazivTimaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNazivTimaItemStateChanged

        comboNazivTima.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getItem() + " " + e.getStateChange());
            }
        });

        Tim tim = (Tim) comboNazivTima.getSelectedItem();
        comboLokacija.setSelectedItem(tim.getLokacije());
        txtFieldMenadzer.setText(tim.getMenadzer());
        comboRegion.setSelectedItem(tim.getRegion());
        txtFieldSponzor.setText(tim.getSponzor());
        txtFieldTrener.setText(tim.getTrener());
        txtFieldZaradjenNovac.setText(tim.getZaradjenNovac().toString());

        String igre = tim.getIgre();
        if (igre.contains("CSGO")) {
            jcbCSGO.isSelected();
            jcbCSGO.setEnabled(false);
            if (igre.contains("Dota2")) {
                jcbDota2.isSelected();
                jcbDota2.setEnabled(false);
            }
        }

        comboLokacija.setEnabled(false);
        txtFieldMenadzer.setEnabled(false);
        comboRegion.setEnabled(false);
        txtFieldSponzor.setEnabled(false);
        txtFieldTrener.setEnabled(false);
        txtFieldZaradjenNovac.setEnabled(false);
        txtNewName.setEnabled(false);
        checkBoxNewName.setEnabled(false);
    }//GEN-LAST:event_comboNazivTimaItemStateChanged

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        JOptionPane.showMessageDialog(this, "No changes have been made", "Success", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnSacuvajTim;
    private javax.swing.JCheckBox checkBoxNewName;
    private javax.swing.JComboBox comboLokacija;
    private javax.swing.JComboBox comboNazivTima;
    private javax.swing.JComboBox comboRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox jcbCSGO;
    private javax.swing.JCheckBox jcbDota2;
    private javax.swing.JLabel jlbMenadzerPoruka;
    private javax.swing.JLabel jlblIgreKojeTimIgraPoruka;
    private javax.swing.JLabel jlblNewTeam;
    private javax.swing.JLabel jlblSponzorPoruka;
    private javax.swing.JLabel jlblTrenerPoruka;
    private javax.swing.JLabel jlblZaradjenNovacPoruka;
    private javax.swing.JTextField txtFieldMenadzer;
    private javax.swing.JTextField txtFieldSignedUser;
    private javax.swing.JTextField txtFieldSponzor;
    private javax.swing.JTextField txtFieldTrener;
    private javax.swing.JTextField txtFieldZaradjenNovac;
    private javax.swing.JTextField txtNewName;
    // End of variables declaration//GEN-END:variables

     private ArrayList<Region> vratiListuR() throws Exception {
        List<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Region());
        ArrayList<Region> lista = new ArrayList<>();
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            lista.add((Region) opstiDomenskiObjekat);
        }

        return lista;
    }

    private ArrayList<Lokacija> vratiListuL() throws Exception {
        List<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Lokacija());
        ArrayList<Lokacija> lista = new ArrayList<>();
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            lista.add((Lokacija) opstiDomenskiObjekat);
        }
        return lista;
    }
    
    private void popuniComboNazivTimova() throws Exception {
        comboNazivTima.removeAllItems();
        ArrayList<Tim> lista = new ArrayList<>();
        KlijentskiZahtev kz = new KlijentskiZahtev();
        kz.setOperacija(Operacija.VRATI_LISTU);
        kz.setParametar(new Tim());
        Komunikacija.getInstance().posaljiZahtev(kz);

        ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
        if (so.getStatusZahteva() == StatusZahteva.USPESAN_ZAHTEV) {
            lista = (ArrayList<Tim>) so.getOdgovor();
            for (Tim tim : lista) {
                comboNazivTima.addItem(tim);
            }
        }
    }

    private void srediTextFieldSignedIn() {
        if (txtFieldSignedUser.getText().isEmpty()) {
            txtFieldSignedUser.setText(GUIKontroler.getInstance().postaviUlogovanogKorisnika());
            txtFieldSignedUser.setEditable(false);
        }
    }

    private boolean kreirajIIzvrsiValidaciju(String naziv, String trener, String menadzer, String sponzor, Region region, Lokacija lokacija, String igre, String novac) throws Exception {
        boolean validnaForma = true;
        ArrayList<Tim> listaTimova = new ArrayList<>();
        ArrayList<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Tim());
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            listaTimova.add((Tim) opstiDomenskiObjekat);
        }

        if (trener == null || trener.isEmpty()) {
            jlblTrenerPoruka.setText("Field for coach is empty.");
            jlblTrenerPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblTrenerPoruka.setText("");
        }

        if (menadzer == null || menadzer.isEmpty()) {
            jlbMenadzerPoruka.setText("Field for manager is empty.");
            jlbMenadzerPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlbMenadzerPoruka.setText("");
        }

        if (sponzor == null || sponzor.isEmpty()) {
            jlblSponzorPoruka.setText("Field for sponsor is empty.");
            jlblSponzorPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblSponzorPoruka.setText("");
        }

        if (novac == null || novac.isEmpty()) {
            jlblZaradjenNovacPoruka.setText("Field for money is empty.");
            jlblZaradjenNovacPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblZaradjenNovacPoruka.setText("");
            for (int i = 0; i < novac.length(); i++) {
                if (!Character.isDigit(novac.charAt(i))) {
                    jlblZaradjenNovacPoruka.setText("Only numbers can be accepted here.");
                    jlblZaradjenNovacPoruka.setForeground(Color.red);
                    validnaForma = false;
                    break;
                }
            }
        }

        if (igre == null || igre.isEmpty()) {
            jlblIgreKojeTimIgraPoruka.setText("At least one option must be checked.");
            jlblIgreKojeTimIgraPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblIgreKojeTimIgraPoruka.setText("");
        }

        for (Tim tim : listaTimova) {
            if (tim.getNaziv().equals(naziv)) {
                JOptionPane.showMessageDialog(this, "Team with given name already exist. Please, try another.", "Error", JOptionPane.ERROR_MESSAGE);
                validnaForma = false;
            }
        }

        boolean prosao = true;
        for (int i = 0; i < novac.length(); i++) {
            if (isLetter(novac.charAt(i)) || novac.isEmpty()) {
                validnaForma = false;
                prosao = false;
                break;
            }
        }

        try {
            if (prosao == true) {
                gold = Double.parseDouble(novac);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        if (!validnaForma) {
            JOptionPane.showMessageDialog(this, "You didn't provide info for all fields on the form or you have some input errors.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private Tim vratiTim(String naziv, String trener, String menadzer, String sponzor, Region region, Lokacija lokacija, String igre, String novac) {
        return new Tim(idTima, naziv, trener, menadzer, sponzor, igre, gold, region, lokacija);
    }
}
