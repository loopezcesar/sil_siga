/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.NivelDAO;
import edu.sil.sga.entidades.Nivel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar Lopez
 */
public class Admi_nivelCRUD extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admi_nivelCRUD
     */
    public List<Nivel> listaNivel;
    public Nivel objNivelSeleccionado;

    public Admi_nivelCRUD() {
        initComponents();
        
        setLocation(280, 50);
        activaBotones(true, false, false, false);
        ListarNiveles();
        activaCajas(false);

    }

    //METODOS A REUTILIZAR EN EL FORMULARIO =D  -------------------------------
    void activaCajas(boolean a) {
        txtNombreCorto.setEnabled(a);
        txtNombreLargo.setEnabled(a);
    }

    void limpiarCajas() {

        txtNombreCorto.setText("");
        txtNombreLargo.setText("");
    }

    public void activaBotones(boolean a, boolean b, boolean c, boolean d) {
        btnNuevo.setEnabled(a);
        btnGuardar.setEnabled(b);
        btnActualizar.setEnabled(c);
        btnEliminar.setEnabled(d);
    }

    public void ListarNiveles() {

        try {

            NivelDAO dao = new NivelDAO();
            listaNivel = dao.ListarNivel();

            DefaultTableModel modelo1 = new DefaultTableModel();

            //modelo1.addColumn("id");
            modelo1.addColumn("Nombre Corto");
            modelo1.addColumn("Nombre Largo");

            for (Nivel nivel : listaNivel) {
                modelo1.addRow(new String[]{
                    //nivel.getId() + "",
                    nivel.getNombreCorto() + "",
                    nivel.getNombreLargo() + ""
                });
            }
            tblNivel.setModel(modelo1);

        } catch (Exception e) {
            System.out.println("Ups.. error interno :( ");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreLargo = new javax.swing.JTextField();
        txtNombreCorto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNivel = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Nivel de eduacacion - SIL");
        setVisible(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nivel de educacion");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Nivel"));

        jLabel2.setText("* Nombre corto:");

        jLabel3.setText("* Nombre largo:");

        txtNombreLargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreLargoKeyTyped(evt);
            }
        });

        txtNombreCorto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCortoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCorto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreLargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCorto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar niveles"));

        tblNivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblNivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNivelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNivel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:

        if (btnNuevo.getText().equals("Nuevo")) {
            limpiarCajas();
            activaBotones(true, true, false, false);
            btnNuevo.setText("Cancelar");
            activaCajas(true);
        } else {
            activaBotones(true, false, false, false);
            btnNuevo.setText("Nuevo");
            activaCajas(false);
            limpiarCajas();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        if (txtNombreCorto.getText().equalsIgnoreCase("")
                || txtNombreLargo.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Debe los campos requeridos (*) ", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else {
            try {
                Nivel nivel = new Nivel();
                NivelDAO dao = new NivelDAO();

                nivel.setNombreCorto(txtNombreCorto.getText());
                nivel.setNombreLargo(txtNombreLargo.getText());

                if (dao.RegistrarNivel(nivel)) {
                    JOptionPane.showMessageDialog(null, "Se registro correctamente", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    activaBotones(true, false, false, false);
                    btnNuevo.setText("Nuevo");
                    limpiarCajas();
                    ListarNiveles();
                    activaCajas(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Ups.. Ocurrio un problema interno :(");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:


        if (txtNombreCorto.getText().equals("")
                || txtNombreLargo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro e ingresar los campos requeridos (*) ");
        } else {

            try {
                Nivel nivel = new Nivel();
                NivelDAO dao = new NivelDAO();

                nivel.setId(objNivelSeleccionado.getId());
                nivel.setNombreCorto(txtNombreCorto.getText());
                nivel.setNombreLargo(txtNombreLargo.getText());

                if (dao.ActualizarNivel(nivel)) {
                    JOptionPane.showMessageDialog(this, "Se actualizo correctamente");
                    limpiarCajas();
                    activaBotones(true, false, false, false);
                    activaCajas(false);
                    ListarNiveles();
                } else {
                    JOptionPane.showMessageDialog(null, "Ups.. Ocurrio un problema interno :( ", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        if (txtNombreCorto.getText().equals("")
                || txtNombreLargo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro e ingresar los campos requeridos (*) ");
        } else {

            try {
                Nivel nivel = new Nivel();
                NivelDAO dao = new NivelDAO();

                nivel.setId(objNivelSeleccionado.getId());
                nivel.setNombreCorto(txtNombreCorto.getText());
                nivel.setNombreLargo(txtNombreLargo.getText());

                if (dao.EliminarNivel(nivel)) {
                    JOptionPane.showMessageDialog(this, "Se elimino correctamente");
                    limpiarCajas();
                    activaBotones(true, false, false, false);
                    ListarNiveles();
                    activaCajas(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Ups.. Ocurrio un problema interno :( ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblNivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNivelMouseClicked
        // TODO add your handling code here:
        int fila = tblNivel.getSelectedRow();
        if (fila != -1) {
            
            objNivelSeleccionado = listaNivel.get(fila);

            txtNombreCorto.setText(objNivelSeleccionado.getNombreCorto());
            txtNombreLargo.setText(objNivelSeleccionado.getNombreLargo());

        
        activaCajas(true);
        btnNuevo.setText("Nuevo");
        activaBotones(true, false, true, true);
        }
    }//GEN-LAST:event_tblNivelMouseClicked

    private void txtNombreCortoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCortoKeyTyped
        // TODO add your handling code here:
        if (txtNombreCorto.getText().length() == 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCortoKeyTyped

    private void txtNombreLargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreLargoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreLargoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNivel;
    private javax.swing.JTextField txtNombreCorto;
    private javax.swing.JTextField txtNombreLargo;
    // End of variables declaration//GEN-END:variables
}
