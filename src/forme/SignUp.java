/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import domen.OpstiDomenskiObjekat;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
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
public class SignUp extends javax.swing.JDialog implements ActionListener {

    private static SignUp instance;
    private int idKorisnika;
    private String hideAndReveal = "HideAndReveal";
    private JPasswordField passwordField;
    private String greska = "";

    public static SignUp getInstance() {
        if (instance == null) {
            instance = new SignUp(null, true);
        }
        return instance;
    }

    /**
     * Creates new form SignUp
     */
    public SignUp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        passwordField = new JPasswordField(10);
        passwordField.setEchoChar('*');
        passwordField.setActionCommand(hideAndReveal);
        passwordField.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlblPorukaName = new javax.swing.JLabel();
        jlblPorukaSurname = new javax.swing.JLabel();
        jlblPorukaUsername = new javax.swing.JLabel();
        jlblPorukaPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("[CSGO] Sign up Form");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Account info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(size());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forme/slike/art_28.jpg"))); // NOI18N

        jLabel3.setText("Name:");

        jLabel4.setText("Surname:");

        jLabel5.setText("Username:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel6.setText("Password:");

        jButton1.setText("Create an account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlblPorukaName.setForeground(new java.awt.Color(255, 0, 51));

        jlblPorukaSurname.setForeground(new java.awt.Color(255, 0, 51));

        jlblPorukaUsername.setForeground(new java.awt.Color(255, 0, 51));

        jlblPorukaPassword.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlblPorukaName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jlblPorukaUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlblPorukaSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addComponent(jLabel6)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblPorukaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jlblPorukaName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblPorukaUsername)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPorukaSurname)
                            .addComponent(jlblPorukaPassword))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(36, 36, 36))))
        );

        jLabel1.setText("Welcome to the sign up page. Please provide the following info:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String name = txtName.getText().trim();
            String surname = txtSurname.getText().trim();
            String username = txtUsername.getText().trim();
            String password = txtPassword.getText().trim();

            Korisnik korisnik;

            try {

                if (kreirajIIzvrsiValidaciju(name, surname, username, password) == true) {
                    korisnik = vratiKorisnika(name, surname, username, password);

                    KlijentskiZahtev kz = new KlijentskiZahtev();
                    kz.setOperacija(Operacija.SACUVAJ);
                    kz.setParametar(korisnik);
                    Komunikacija.getInstance().posaljiZahtev(kz);
                    srediTextField();

                    ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
                    if (so.getStatusZahteva() == StatusZahteva.USPESAN_ZAHTEV) {
                        JOptionPane.showMessageDialog(this, "Successful sign up!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Unsuccessful sign up.", "Error", JOptionPane.ERROR_MESSAGE);
                        invalidate();
                        repaint();
                        validate();
                        return;
                    }

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Unsuccessful sign up.", "Error", JOptionPane.ERROR_MESSAGE);
                invalidate();
                repaint();
                validate();
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(UnosTimova.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblPorukaName;
    private javax.swing.JLabel jlblPorukaPassword;
    private javax.swing.JLabel jlblPorukaSurname;
    private javax.swing.JLabel jlblPorukaUsername;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private boolean kreirajIIzvrsiValidaciju(String name, String surname, String username, String password) throws Exception {
        boolean validnaForma = true;
        ArrayList<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Korisnik());
        ArrayList<Korisnik> lista = new ArrayList<>();
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            lista.add((Korisnik) opstiDomenskiObjekat);
        }

        if (name == null || name.isEmpty()) {
            jlblPorukaName.setText("Name field is empty");
            jlblPorukaName.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblPorukaName.setText("");
        }

        if (surname == null || surname.isEmpty()) {
            jlblPorukaSurname.setText("Surname field is empty");
            jlblPorukaSurname.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblPorukaSurname.setText("");
        }

        if (username == null || username.isEmpty()) {
            jlblPorukaUsername.setText("Username field is empty");
            jlblPorukaUsername.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblPorukaUsername.setText("");
        }

        if (password == null || password.isEmpty()) {
            jlblPorukaPassword.setText("Password field is empty");
            jlblPorukaPassword.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblPorukaPassword.setText("");
        }

        for (Korisnik korisnik : lista) {
            if (korisnik.getUsername().equals(username)) {
                JOptionPane.showMessageDialog(this, "Invalid username. It's already used by another user. Please, use another username", "Error", JOptionPane.ERROR_MESSAGE);
                validnaForma = false;
            }
        }

        char[] input = passwordField.getPassword();
        if (!akoJeSifraDobra(input) == true) {
            jlblPorukaPassword.setText("Password doesn't contain all the necessery special charachters");
            jlblPorukaPassword.setForeground(Color.red);
        } else {
            jlblPorukaPassword.setText("");
        }

        if (!validnaForma) {
            JOptionPane.showMessageDialog(this, "You didn't provide info for all fields on the form or you have some input errors.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        if (hideAndReveal.equals(cmd)) {
            passwordField.setEchoChar((char)0);
        }
    }

    //mora da sadrzi najmanje 8 karaktera, jedno veliko slovo, jedan znak
    private boolean akoJeSifraDobra(char[] input) {
        boolean flag = true;
        String password = new String(input);
        //String[] mark = {"!", "/", "*", "-", "+", ",", ".", "`", "@", "#", "$", "%", "^", "&", "(", ")", "_", "?", "<", ">", "|",};
        for (char c : input) {
            password += c;
        }

        boolean hasUppercase = !password.equals(password.toUpperCase());
        boolean hasLowercase = !password.equals(password.toLowerCase());
        boolean hasSpecial = password.matches(".*[!@#$%^&*].*");

        if (password.length() < 8) {
            flag = false;
            greska = "Password doesn't have at least 8 characters";
            return flag;
        }

        if (!hasLowercase && !hasUppercase) {
            flag = false;
            greska = "Password doesn't contains both uppercase and lowercase letter";
            return false;
        }

        if (!hasSpecial) {
            greska = "Password doesn't contains special characters [!@#$%^&*]";
            flag = false;
            return flag;
        }

        return flag;
    }

    private void resetFocus() {
        passwordField.requestFocusInWindow();
    }

    private Korisnik vratiKorisnika(String name, String surname, String username, String password) {
        return new Korisnik(idKorisnika, name, surname, username, password);
    }

    private void srediTextField() {
        char[] input = passwordField.getPassword();
        Arrays.fill(input, '0');
        passwordField.selectAll();
        resetFocus();
    }

}
