/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.PeriodoDAO;
import edu.sil.siga.bean.Periodo;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar Lopez
 */
public class Alumno_consultarNota extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarNota
     */
    
    List<Periodo> listaDeNiveles;
    
    public Alumno_consultarNota() {
        initComponents();
        
    }
    
    void CargarPeriodo() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            listaDeNiveles = new PeriodoDAO().ListarPeriodo();
            for (Periodo periodo : listaDeNiveles) {
                model.addElement(periodo.getDescripcion());
            }
            cboPeriodo.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos" + e.getMessage());
            System.out.println("error --> interfaz --> grado --> cargar Nivel" + e.getMessage());
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cboPeriodo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Consultar Nota");

        jLabel1.setText("Seleccione Trimestre :");

        jButton1.setText("Consultar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Algebra - Aritmetica", "12", "14", "13", "13", "15", "12", "13"},
                {"Trigonometria", "10", "10", "14", "20", "14", "13", "14"},
                {"Raz Matematica", "14", "11", "15", "16", "14", "12", "14"},
                {"Lenguaje", "15", "12", "10", "12", "13", "14", "13"},
                {"Raz Verbal", "12", "14", "15", "14", "12", "13", "14"},
                {"Historia", "", null, null, null, null, null, null},
                {"Geografia", "", null, null, null, null, null, null},
                {"Ciencias Politicas", "", null, null, null, null, null, null},
                {"CTA", "", null, null, null, null, null, null},
                {"Biologia", "", null, null, null, null, null, null},
                {"Computacion", "", null, null, null, null, null, null},
                {"Ingles", "", null, null, null, null, null, null},
                {"Arte", "", null, null, null, null, null, null}
            },
            new String [] {
                "Curso", "P1", "P2", "P3", "PP", "EP", "EF", "PF"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Consultar Nota");

        cboPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I Bimestre", "II Bimestre", "III Bimestre", "IV Bimestre" }));

        jLabel3.setText("28/04/2015");

        jLabel4.setText("15:26");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(cboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel2)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboPeriodo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
