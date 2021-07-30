/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.ConsumoCliente;
import datos.Metodos;
import java.util.ArrayList;

/**
 *
 * @author DIEGO HUAMANJULCA G
 */
public class Frm_registroconsumo extends javax.swing.JFrame {

    ConsumoCliente consumos;
    String codigo;
    float medida;
    String periodo;
    float monto_pago;
    float precio;

    /**
     * Creates new form Frm_registroconsumo
     */
    public Frm_registroconsumo() {
        initComponents();
        Txt_codigo.setEditable(false);
        txt_precio.setEditable(false);
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
        lblcodigo = new javax.swing.JLabel();
        lblconsulta = new javax.swing.JLabel();
        lblperiodo = new javax.swing.JLabel();
        Txt_codigo = new javax.swing.JTextField();
        Txt_consumo = new javax.swing.JTextField();
        Cb_periodo = new javax.swing.JComboBox<>();
        lblconsulta1 = new javax.swing.JLabel();
        Bt_registrar = new javax.swing.JButton();
        Bt_atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/graph-9_icon-icons.com_58019.png"))); // NOI18N
        jLabel1.setText("Registro Consumo");

        lblcodigo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblcodigo.setText("Codigo: ");

        lblconsulta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblconsulta.setText("Consumo: ");

        lblperiodo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblperiodo.setText("Periodo: ");

        Txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_codigoActionPerformed(evt);
            }
        });

        Cb_periodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cb_periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Noviembre", "Diciembre" }));

        lblconsulta1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblconsulta1.setText("Kwh");

        Bt_registrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Bt_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save_37110 (1).png"))); // NOI18N
        Bt_registrar.setText("Registrar");
        Bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_registrarActionPerformed(evt);
            }
        });

        Bt_atras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Bt_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logout_37127.png"))); // NOI18N
        Bt_atras.setText("Atrás");
        Bt_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_atrasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Precio: ");

        txt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcodigo)
                                .addGap(180, 180, 180)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Txt_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblconsulta1))
                                    .addComponent(Txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblconsulta)
                                            .addComponent(lblperiodo)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Cb_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bt_registrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Bt_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(Txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcodigo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblconsulta)
                    .addComponent(Txt_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblconsulta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblperiodo)
                    .addComponent(Cb_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_atras)
                    .addComponent(Bt_registrar))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_codigoActionPerformed

    }//GEN-LAST:event_Txt_codigoActionPerformed

    private void Bt_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_atrasActionPerformed
        dispose();
    }//GEN-LAST:event_Bt_atrasActionPerformed

    Metodos metodo = new Metodos();
    ArrayList<ConsumoCliente> lista = new ArrayList<ConsumoCliente>();
    private void Bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_registrarActionPerformed
                try {
            lista = metodo.leerFichero();
        } catch (Exception e) {

        }
        codigo = Txt_codigo.getText();
        medida = Float.parseFloat(Txt_consumo.getText());
        periodo = String.valueOf(Cb_periodo.getSelectedItem());
        precio = Float.parseFloat(txt_precio.getText());
        monto_pago = medida * precio;
        consumos = new ConsumoCliente(codigo, medida, periodo, monto_pago);
        metodo.escribirFichero(consumos);
        Frm_TablaConsumo.consumos.add(consumos);

         

    }//GEN-LAST:event_Bt_registrarActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_registroconsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_registroconsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_registroconsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_registroconsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_registroconsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_atras;
    private javax.swing.JButton Bt_registrar;
    private javax.swing.JComboBox<String> Cb_periodo;
    public static javax.swing.JTextField Txt_codigo;
    private javax.swing.JTextField Txt_consumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblconsulta;
    private javax.swing.JLabel lblconsulta1;
    private javax.swing.JLabel lblperiodo;
    public static javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
