/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Registar_Movimientos_Caja_Chica;

/**
 *
 * @author sebas
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Movimientos extends javax.swing.JFrame {
    private ArrayList<Object> registromovimientos;
    /**
     * Creates new form Movimientos
     */
    public Movimientos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        cmovi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tmovimiento = new javax.swing.JComboBox<>();
        mes = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRAR MOVIMIENTOS DE CAJA CHICA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(48, 29, 780, 62);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Fecha del Movimiento");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(48, 161, 337, 52);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Tipo de Movimiento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(48, 225, 337, 52);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel4.setText("Monto");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 280, 337, 52);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Codigo de Movimiento");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(48, 97, 337, 52);

        monto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        monto.setForeground(new java.awt.Color(102, 255, 102));
        monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoActionPerformed(evt);
            }
        });
        getContentPane().add(monto);
        monto.setBounds(480, 290, 290, 40);

        cmovi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cmovi.setForeground(new java.awt.Color(102, 255, 102));
        cmovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmoviActionPerformed(evt);
            }
        });
        getContentPane().add(cmovi);
        cmovi.setBounds(480, 110, 290, 40);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 380, 220, 50);

        tmovimiento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tmovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingreso", "Egreso" }));
        tmovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmovimientoActionPerformed(evt);
            }
        });
        getContentPane().add(tmovimiento);
        tmovimiento.setBounds(480, 240, 100, 30);

        mes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        mes.setForeground(new java.awt.Color(102, 255, 102));
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        getContentPane().add(mes);
        mes.setBounds(590, 170, 60, 40);

        año.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        año.setForeground(new java.awt.Color(102, 255, 102));
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });
        getContentPane().add(año);
        año.setBounds(700, 170, 60, 40);

        dia.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dia.setForeground(new java.awt.Color(102, 255, 102));
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });
        getContentPane().add(dia);
        dia.setBounds(480, 170, 60, 40);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jTextField2.setText("/");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(660, 170, 30, 40);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jTextField3.setText("/");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(550, 170, 30, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void cmoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmoviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmoviActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //hacer que el boton abra uan nueva ventana
        
     String codigoMovimiento = cmovi.getText();
    String fechaMovimiento = dia.getText() + "/" + mes.getText() + "/" + año.getText();
    String tipoMovimiento = (String) tmovimiento.getSelectedItem();
    String montoStr = monto.getText();
    
    

    // Agregar los datos al ArrayList
    registromovimientos.add(codigoMovimiento); // Almacena como String
    registromovimientos.add(fechaMovimiento);   // Almacena como String
    registromovimientos.add(tipoMovimiento);     // Almacena como String
    registromovimientos.add(montoStr);    // Almacena como Integer

    // Mostrar mensaje de registro completado
    JOptionPane.showMessageDialog(this, "Registro completado.");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tmovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmovimientoActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField año;
    private javax.swing.JTextField cmovi;
    private javax.swing.JTextField dia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField monto;
    private javax.swing.JComboBox<String> tmovimiento;
    // End of variables declaration//GEN-END:variables
}
