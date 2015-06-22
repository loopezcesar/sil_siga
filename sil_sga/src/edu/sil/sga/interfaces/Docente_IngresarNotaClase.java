/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.AlumnoDAO;
import edu.sil.sga.dao.NotaDAO;
import edu.sil.sga.entidades.Alumno;
import edu.sil.sga.entidades.Clase;
import edu.sil.sga.entidades.Nota;
import edu.sil.sga.entidades.Periodo;
import edu.sil.sga.entidades.TipoEvaluacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo Lopez
 */
public class Docente_IngresarNotaClase extends javax.swing.JInternalFrame {

    /**
     * Creates new form Docente_IngresarNotaClase
     */
    
    Clase clase = new Clase();
    Periodo periodo = new Periodo();
    TipoEvaluacion tipoEval = new TipoEvaluacion();
    public List<Nota> listaDeNotas;
    
    
    
    public Docente_IngresarNotaClase(Clase objClase, TipoEvaluacion objTipoEval, Periodo objPeriodo) {
        initComponents();
        
        clase = objClase;
        periodo = objPeriodo;
        tipoEval = objTipoEval;
        
        lblCurso.setText(clase.getCursoGrado().getCurso().getNombreLargo());
        lblPeriodo.setText(periodo.getDescripcion());
        lblTipoEvaluacion.setText(tipoEval.getDescripcion());

        ListarNotas();

        
        
    }//fin del INIT COMPONENTS
    
    
    void ListarNotas() {
        try {
            NotaDAO dao = new NotaDAO();
            listaDeNotas = dao.ListarNotas(clase, periodo, tipoEval);
            DefaultTableModel modelo1 = new DefaultTableModel();

            modelo1.addColumn("Nombre Completo");
            modelo1.addColumn("NOTA");

            for (Nota objNota : listaDeNotas) {
                modelo1.addRow(new String[]{
                     objNota.getAlumno().getNombre()+" "
                             +objNota.getAlumno().getApellidopaterno()+", "+
                             objNota.getAlumno().getApellidomaterno(),
                    objNota.getNota()+ "", 
                    
                    });
            }
            tblAlumnoNota.setModel(modelo1);
        } catch (Exception e) {
            System.out.println("ERROR - INTERFAZ - ALUMNO - LISTAR");
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
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnoNota = new javax.swing.JTable();
        lblCurso = new javax.swing.JLabel();
        lblTipoEvaluacion = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Ingresar Notas");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblAlumnoNota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAlumnoNota);

        lblCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCurso.setText("Cu");

        lblTipoEvaluacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoEvaluacion.setText("tipo eval");

        lblPeriodo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPeriodo.setText("periodo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Curso:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tipo de Nota:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Bimestre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(lblCurso)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(lblTipoEvaluacion)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblPeriodo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(btnGuardar)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblCurso)
                    .addComponent(jLabel3)
                    .addComponent(lblTipoEvaluacion)
                    .addComponent(jLabel4)
                    .addComponent(lblPeriodo))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnGuardar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblTipoEvaluacion;
    private javax.swing.JTable tblAlumnoNota;
    // End of variables declaration//GEN-END:variables
}
