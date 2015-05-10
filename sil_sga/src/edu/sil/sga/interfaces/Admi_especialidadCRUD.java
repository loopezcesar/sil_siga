/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.EspecialidadDAO;
import edu.sil.sga.entidades.Especialidad;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar Lopez
 */
public class Admi_especialidadCRUD extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admi_especialidadCRUD
     */
    
    public List<Especialidad> listaEspecialidad;
    public  Especialidad objEspecialidad;
    
    public Admi_especialidadCRUD() {
        initComponents();
        
        setSize(570, 340);
        setLocation(350,220);
        //btnGuardar.enable(false);
        //btnActualizar.enable(false);
        //btnCancelar.enable(false);

    }
    
    public void ListarEspecialidad(){
        this.setSize(570, 600);
        EspecialidadDAO dao = new EspecialidadDAO();
        listaEspecialidad = dao.ListarEspecialidad();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Descripcion");
        for(Especialidad objEspecialidad: listaEspecialidad){
            modelo.addRow(new String[]{objEspecialidad.getId()+"",objEspecialidad.getDescripcion()});
        }
        tablaLista.setModel(modelo);
    }
    
    public void ActivarBotones(boolean n,boolean b,boolean e,boolean g,boolean a,boolean c){
        btnNuevo.enable(n);
        btnBuscar.enable(b);
        btnEliminar.enable(e);
        btnGuardar.enable(g);
        btnActualizar.enable(a);
        btnCancelar.enable(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEspecialidad = new javax.swing.JPanel();
        txtdescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Especialidad - IEP San Ignacio de Loyola");

        panelEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Especialidad"));

        jLabel1.setText("Nombre:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        jLabel5.setText("Codigo");

        txtcodigo.setEnabled(false);

        javax.swing.GroupLayout panelEspecialidadLayout = new javax.swing.GroupLayout(panelEspecialidad);
        panelEspecialidad.setLayout(panelEspecialidadLayout);
        panelEspecialidadLayout.setHorizontalGroup(
            panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEspecialidadLayout.createSequentialGroup()
                        .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizar))
                            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelEspecialidadLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEspecialidadLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(30, 30, 30)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelEspecialidadLayout.setVerticalGroup(
            panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Especialidad");

        tablaLista.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLista);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Upload.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(panelEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel2)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panelEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListaMouseClicked
        // TODO add your handling code here:
        int fila = tablaLista.getSelectedRow();
        String codigo = tablaLista.getValueAt(fila, 0).toString();
        String descripcion = tablaLista.getValueAt(fila, 1).toString();
        if(descripcion.equals(""))
            descripcion = "";
        txtdescripcion.setText(descripcion);
        txtcodigo.setText(codigo);
    }//GEN-LAST:event_tablaListaMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtcodigo.setText("");
        txtdescripcion.setText("");
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String descripcion = txtdescripcion.getText();
        if(descripcion.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "debe ingresar una descripcion");
        }else{
            Especialidad objEspecialidad = new Especialidad();
            objEspecialidad.setDescripcion(descripcion);
            EspecialidadDAO dao = new EspecialidadDAO();
            if (dao.RegistrarEspecialidad(objEspecialidad)) {
                JOptionPane.showMessageDialog(this, "Se registro correctamente");
            ListarEspecialidad();
            }else{
                JOptionPane.showMessageDialog(this, "No se puede registrar");
            }
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String codigo = txtcodigo.getText();
        String descripcion = txtdescripcion.getText();
        if(codigo.equalsIgnoreCase("") && descripcion.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "debe seleccionar un registro");
        }else{
            Especialidad objEspecialidad = new Especialidad();
            objEspecialidad.setId(Integer.parseInt(txtcodigo.getText()));
            objEspecialidad.setDescripcion(txtdescripcion.getText());
            EspecialidadDAO dao = new EspecialidadDAO();
            if (dao.ActualizarEspecialidad(objEspecialidad)) {
                JOptionPane.showMessageDialog(this, "Se actualizo correctamente");
            ListarEspecialidad();
            }else{
                JOptionPane.showMessageDialog(this, "No se puede registrar");
            }
        }
        
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String codigo = txtcodigo.getText();
        if(codigo.equals("")){
            JOptionPane.showMessageDialog(this, "No ha seleccionado registro para eliminar.");
        }else{
            Especialidad especialidad = new Especialidad();
            especialidad.setId(Integer.parseInt(codigo));
            especialidad.setDescripcion(txtdescripcion.getText());
            EspecialidadDAO dao = new EspecialidadDAO();
            if (dao.EliminarEspecialidad(especialidad)) {
                JOptionPane.showMessageDialog(this, "Se elimino correctamente");
            ListarEspecialidad();
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo eliminar ");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        ListarEspecialidad();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        setSize(570, 340);
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEspecialidad;
    private javax.swing.JTable tablaLista;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
