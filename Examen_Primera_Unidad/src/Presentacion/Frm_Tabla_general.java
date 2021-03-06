/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.*;
import ModeloTablas.ModeloGeneral;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO HUAMANJULCA G
 */
public class Frm_Tabla_general extends javax.swing.JFrame {

    /**
     * Creates new form Frm_listaNatural
     */
    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public Frm_Tabla_general() {
        initComponents();
        listageneral.setModel(new ModeloGeneral(clientes));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listageneral = new javax.swing.JTable();
        Bt_regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bt_lista_consumos = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        Bt_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listageneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Dirección", "Tipo de conexión", "Valor de conexión", "Tipo de instalacion", "valor de instalacion", "Precio x Kwh"
            }
        ));
        jScrollPane1.setViewportView(listageneral);

        Bt_regresar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Bt_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logout_37127.png"))); // NOI18N
        Bt_regresar.setText("Atrás");
        Bt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_regresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/users_clients_group_16774 (1).png"))); // NOI18N
        jLabel1.setText("Tabla general");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione un codigo y haga click en registrar consumo ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486485588-add-create-new-math-sign-cross-plus_81186 (1).png"))); // NOI18N
        jButton1.setText("Registrar consumo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bt_lista_consumos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_lista_consumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1485476036-artboard-1_78544 (2).png"))); // NOI18N
        bt_lista_consumos.setText("Lista de consumos");
        bt_lista_consumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lista_consumosActionPerformed(evt);
            }
        });

        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });

        Bt_buscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Bt_buscar.setText("Buscar");
        Bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_buscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Busca y enlista datos del servicio de un cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(150, 150, 150)
                .addComponent(bt_lista_consumos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bt_regresar)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt_buscar)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_buscar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bt_regresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_lista_consumos)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_regresarActionPerformed
        dispose();
    }//GEN-LAST:event_Bt_regresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Frm_registroconsumo abrir = new Frm_registroconsumo();
        abrir.setVisible(true);
        int fila = listageneral.getSelectedRow();
        String v1;
        float v2;
        v1 = listageneral.getValueAt(fila, 0).toString();
        v2 = (float) listageneral.getValueAt(fila, 6);
        Frm_registroconsumo.Txt_codigo.setText(v1);
        Frm_registroconsumo.txt_precio.setText(String.valueOf(v2));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_lista_consumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lista_consumosActionPerformed
        Frm_TablaConsumo c = new Frm_TablaConsumo();
        c.setVisible(true);
    }//GEN-LAST:event_bt_lista_consumosActionPerformed

    private void Bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_buscarActionPerformed
        Cliente c = null;
        int cont = 0;
        String Dato = txt_buscar.getText();
        for (int i = 0; i < clientes.size(); i++) {
            if (Dato.equals(clientes.get(i).getCodigo())) {
                cont = i;
                c = new Cliente(clientes.get(i).getCodigo(), clientes.get(i).getDireccion(),
                        clientes.get(i).getT_conexion(), clientes.get(i).getV_conexion(),
                        clientes.get(i).getOp_tarifaria(), clientes.get(i).getVa_tarifa(),
                        clientes.get(i).getPrecio());

            }
            if (c == null) {
                cont = -1;
            }
        }
        for (int i = 0; i < clientes.size(); i++) {
            if (cont != -1) {
                JOptionPane.showMessageDialog(null, "Usuario encontrado");
                c = new Cliente(clientes.get(i).getCodigo(), clientes.get(i).getDireccion(),
                        clientes.get(i).getT_conexion(), clientes.get(i).getV_conexion(),
                        clientes.get(i).getOp_tarifaria(), clientes.get(i).getVa_tarifa(),
                        clientes.get(i).getPrecio());
                JOptionPane.showMessageDialog(null, "Codigo: " + clientes.get(i).getCodigo()
                        + "\n Dirección: " + clientes.get(i).getDireccion()
                        + "\n Tipo de conexion: " + clientes.get(i).getT_conexion()
                        + "\n Valor de conexion: " + clientes.get(i).getV_conexion()
                        + "\n Tipo de instalacion: " + clientes.get(i).getOp_tarifaria()
                        + "\n Valor de instalacion: " + clientes.get(i).getVa_tarifa()
                        + "\n Precio KwH: S/" + clientes.get(i).getPrecio(), "Usuario", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado", "No encontrado", 0);

            }
        }
    }//GEN-LAST:event_Bt_buscarActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Tabla_general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Tabla_general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Tabla_general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Tabla_general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Tabla_general().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_buscar;
    private javax.swing.JButton Bt_regresar;
    private javax.swing.JButton bt_lista_consumos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable listageneral;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
