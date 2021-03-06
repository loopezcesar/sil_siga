/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.siga.bean.Docente;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Paul
 */
public class Docente_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Docente_Principal
     */
    Docente docente = new Docente();

    public Docente_Principal(Docente objDocente) {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        docente = objDocente;
        txtNombreDocente.setText(docente.getNombre() + " "
                + docente.getApellidopaterno() + ", "
                + docente.getApellidomaterno());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPrincipalDocente = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        txtNombreDocente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jGestionarNota = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdPrincipalDocente.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido Sr:");

        txtNombreDocente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtNombreDocente.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreDocente.setText("nombre docente");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        javax.swing.GroupLayout jdPrincipalDocenteLayout = new javax.swing.GroupLayout(jdPrincipalDocente);
        jdPrincipalDocente.setLayout(jdPrincipalDocenteLayout);
        jdPrincipalDocenteLayout.setHorizontalGroup(
            jdPrincipalDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdPrincipalDocenteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(txtNombreDocente)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdPrincipalDocenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(78, 78, 78))
        );
        jdPrincipalDocenteLayout.setVerticalGroup(
            jdPrincipalDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdPrincipalDocenteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jdPrincipalDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jdPrincipalDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreDocente))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jdPrincipalDocente.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdPrincipalDocente.setLayer(txtNombreDocente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdPrincipalDocente.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdPrincipalDocente.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu4.setText("Inicio");

        jMenuItem1.setText("Principal");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Cerrar Sesion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Datos");
        jMenuBar2.add(jMenu5);

        jMenu1.setText("Gestionar");

        jGestionarNota.setText("Notas");
        jGestionarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionarNotaActionPerformed(evt);
            }
        });
        jMenu1.add(jGestionarNota);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipalDocente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipalDocente)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGestionarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionarNotaActionPerformed
        // TODO add your handling code here:
        Docente_seleccionarClase frm = new Docente_seleccionarClase(docente, jdPrincipalDocente);
        jdPrincipalDocente.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_jGestionarNotaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login dialog = new Login(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Docente_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docente_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docente_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docente_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Docente_Principal(new Docente()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jGestionarNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JDesktopPane jdPrincipalDocente;
    private javax.swing.JLabel txtNombreDocente;
    // End of variables declaration//GEN-END:variables
}
