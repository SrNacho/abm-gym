/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abm;

import java.awt.Color;
import java.awt.HeadlessException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Nacho
 */
public class Registro extends javax.swing.JFrame {

    Consultas consultas;
    Inicio ini;

    /**
     * Creates new form Registro
     */
    Connection con;
    Conns cons = new Conns();

    public Registro() {

        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(240, 100, 70));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DNI = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDateChooser2.setEnabled(false);

        jButton1.setText("Actualizar expiracion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        jLabel1.setText("Registrar nuevo usuario");

        DNI.setText("DNI");
        DNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DNIKeyTyped(evt);
            }
        });

        Nombre.setText("Nombre");
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel4.setText("DNI (8 digitos)");

        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel5.setText("Nombre (hasta 16)");

        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel6.setText("Apellido (hasta 16)");

        Apellido.setText("Apellido");
        Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de ingreso");

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de expiración");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abm/back.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))))
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(29, 29, 29)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(13, 13, 13)
                        .addComponent(jButton1)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String Fecha() {

        int mm = 2 + jDateChooser1.getCalendar().get(Calendar.MONTH);
        int dd = jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);
        int yy = jDateChooser1.getCalendar().get(Calendar.YEAR);
        String de = yy + "-" + mm + "-" + dd;
        return de;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Date date2 = jDateChooser1.getDate();
            if (date2 != null) {
                String de = Fecha();
                //JOptionPane.showMessageDialog(null, de);
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(de);
                jDateChooser2.setDate(date);
            } else {
                JOptionPane.showMessageDialog(null, "Primero ingrese la fecha de ingreso");
            }
        } catch (ParseException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String str = DNI.getText().toLowerCase();
        if (DNI.getText().equals("dni") || Nombre.getText().toLowerCase().equals("nombre") || Apellido.getText().toLowerCase().equals("apellido")) {
            JOptionPane.showMessageDialog(null, "Verificar campos");
        } else {
            if (cons.ValNum(str)) {
                if (str.length() == 8) {
                    if (cons.valLetras(Nombre.getText().toLowerCase())) {
                        if (Nombre.getText().length() <= 16) {
                            if (cons.valLetras(Apellido.getText().toLowerCase())) {
                                if (Apellido.getText().length() <= 16) {
                                    Date date = jDateChooser1.getDate();
                                    if (date != null) {
                                        Date date2 = jDateChooser2.getDate();
                                        if (date2 != null) {
                                            int mm = 1 + jDateChooser1.getCalendar().get(Calendar.MONTH);
                                            int dd = jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);
                                            int yy = jDateChooser1.getCalendar().get(Calendar.YEAR);
                                            String fechaini = yy + "-" + mm + "-" + dd;
                                            String fechaexp = Fecha();
                                            String sql = "INSERT INTO `anotados` (`dni`, `nombre`, `apellido`) VALUES ('" + DNI.getText() + "', '" + Nombre.getText().toLowerCase() + "', '" + Apellido.getText().toLowerCase() + "');INSERT INTO `fechas` (`id`, `fechapago`, `fechaexp`) VALUES ('" + DNI.getText() + "', '" + fechaini + "', '" + fechaexp + "')";
                                            //String sql2 = "INSERT INTO `fechas` (`id`, `fechapago`, `fechaexp`) VALUES ('" + DNI.getText() + "', '"+fechaini+"', '"+fechaexp+"')";
                                            try {
                                                cons.Insertar(sql);
                                                //cons.Insertar(sql2);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Clickee el boton actualizar expiración");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Seleccione la fecha de inicio");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El apellido no se permite con mas de 16 caracteres");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El apellido solo admite letras sin espacios");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El nombre no se permite con mas de 16 caracteres");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El nombre solo admite letras sin espacios");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "el DNI debe tener 8 caracteres");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Entrada DNI invalida");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        /*try{
            JOptionPane.showMessageDialog(null,"asd");
        }
        catch(HeadlessException ex){
        }*/
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Inicio ul;
        try {
            ul = new Inicio();
            ul.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("back-hover.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("back.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void DNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNIKeyTyped
        char c = evt.getKeyChar();

        if((c<'0' || c>'9'))evt.consume();
     
    }//GEN-LAST:event_DNIKeyTyped

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
         char c = evt.getKeyChar();

        if((c<'a' || c>'z') && (c<'A')|(c>'Z'))evt.consume();
    }//GEN-LAST:event_NombreKeyTyped

    private void ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoKeyTyped
         char c = evt.getKeyChar();

        if((c<'a' || c>'z') && (c<'A')|(c>'Z'))evt.consume();
    }//GEN-LAST:event_ApellidoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
