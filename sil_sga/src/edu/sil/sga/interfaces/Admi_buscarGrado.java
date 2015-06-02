/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.GradoDAO;
import edu.sil.sga.dao.NivelDAO;
import edu.sil.sga.entidades.Grado;
import edu.sil.sga.entidades.Nivel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paul
 */
public class Admi_buscarGrado extends javax.swing.JDialog {

    /**
     * Creates new form Admi_buscarGrado
     */
    
    public List<Nivel> listaNivel;
    
    
    
    public List<Grado> listaGrado;
    private List<Grado> lstGrado;
    
    
    public Admi_buscarGrado(java.awt.Frame parent, boolean modal, List<Grado> lstGrado) {
        super(parent, modal);
        initComponents();
        
        CargarNivel();
        listarGrado();
        ActivaSeleccionar(false);
        this.lstGrado = lstGrado;
        
        
    }
    
    
    public void ActivaSeleccionar(boolean a) {
        btnEnviar.setEnabled(a);
    }

    void CargarNivel() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            listaNivel = new NivelDAO().ListarNivel();
            for (Nivel nivel : listaNivel) {
                model.addElement(nivel.getNombreLargo());
            }
            cboNivel.setModel(model);
        } catch (Exception e) {
            System.out.println("error - cargar - combo - nivel");
        }
    }

    void listarGrado() {
        try {
            GradoDAO dao = new GradoDAO();
            listaGrado = dao.ListarGrado();
            DefaultTableModel modelo1 = new DefaultTableModel();
            modelo1.addColumn("id");
            modelo1.addColumn("Nivel");
            modelo1.addColumn("Grado");
            modelo1.addColumn("Seccion");

            for (Grado grado : listaGrado) {
                modelo1.addRow(new String[]{
                    grado.getId() + "",
                    grado.getNivel().getNombreCorto() + "",
                    grado.getDescripcion() + "",
                    grado.getSeccion().getDescripcion() + ""
                });
            }
            tblGrado.setModel(modelo1);
        } catch (Exception e) {
            System.out.println("Error - cargar - grado - listar");
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        cboNivel = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrado = new javax.swing.JTable();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda de Grado"));

        cboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblGrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblGrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGradoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGrado);

        btnEnviar.setText("Seleccionar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEnviar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(90, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 550, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        
        int index = tblGrado.getSelectedRow();
        if (index != -1) {
            Grado objGrado = listaGrado.get(index);
            lstGrado.add(objGrado);
            this.dispose();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void tblGradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGradoMouseClicked
        // TODO add your handling code here:
        ActivaSeleccionar(true);
    }//GEN-LAST:event_tblGradoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox cboNivel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblGrado;
    // End of variables declaration//GEN-END:variables
}
