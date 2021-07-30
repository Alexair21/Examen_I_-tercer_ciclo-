/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO HUAMANJULCA G
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Frm_presentacion
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Bt_registro_medidor = new javax.swing.JButton();
        Bt_registroconsumo = new javax.swing.JButton();
        Bt_salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Listajuridico = new javax.swing.JMenuItem();
        ListaNaturales = new javax.swing.JMenuItem();
        Listageneral = new javax.swing.JMenuItem();
        ListaConsumo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido");

        Bt_registro_medidor.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Bt_registro_medidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Citycons_meter_icon-icons.com_67924.png"))); // NOI18N
        Bt_registro_medidor.setText("Registrar medidor");
        Bt_registro_medidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_registro_medidorActionPerformed(evt);
            }
        });

        Bt_registroconsumo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Bt_registroconsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lightning_77962 (1).png"))); // NOI18N
        Bt_registroconsumo.setText("Registrar Consumo");
        Bt_registroconsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_registroconsumoActionPerformed(evt);
            }
        });

        Bt_salir.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Bt_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logout_37127.png"))); // NOI18N
        Bt_salir.setText("Salir");
        Bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_salirActionPerformed(evt);
            }
        });

        jMenu2.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu2.setText("Listas");

        Listajuridico.setText("Lista Juridicos");
        Listajuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListajuridicoActionPerformed(evt);
            }
        });
        jMenu2.add(Listajuridico);

        ListaNaturales.setText("Lista Naturales");
        ListaNaturales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaNaturalesActionPerformed(evt);
            }
        });
        jMenu2.add(ListaNaturales);

        Listageneral.setText("Lista General");
        Listageneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListageneralActionPerformed(evt);
            }
        });
        jMenu2.add(Listageneral);

        ListaConsumo.setText("Lista consumo");
        ListaConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaConsumoActionPerformed(evt);
            }
        });
        jMenu2.add(ListaConsumo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bt_registroconsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bt_registro_medidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(Bt_registro_medidor)
                .addGap(36, 36, 36)
                .addComponent(Bt_registroconsumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(Bt_salir)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_registro_medidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_registro_medidorActionPerformed
        Frm_registrousuario registro = new Frm_registrousuario();
        registro.setVisible(true);
    }//GEN-LAST:event_Bt_registro_medidorActionPerformed

    private void Bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_salirActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por su visita", "Salida", 1);
        System.exit(0);
    }//GEN-LAST:event_Bt_salirActionPerformed

    private void ListaNaturalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaNaturalesActionPerformed
        Frm_listanatural c = new Frm_listanatural();
        c.setVisible(true);
    }//GEN-LAST:event_ListaNaturalesActionPerformed

    private void ListajuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListajuridicoActionPerformed
        Frm_listaJuridicos c = new Frm_listaJuridicos();
        c.setVisible(true);
    }//GEN-LAST:event_ListajuridicoActionPerformed

    private void ListageneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListageneralActionPerformed
        Frm_Tabla_general c = new Frm_Tabla_general();
        c.setVisible(true);
    }//GEN-LAST:event_ListageneralActionPerformed

    private void Bt_registroconsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_registroconsumoActionPerformed
       Frm_Tabla_general general = new Frm_Tabla_general();
        general.setVisible(true);
    }//GEN-LAST:event_Bt_registroconsumoActionPerformed

    private void ListaConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaConsumoActionPerformed
        Frm_TablaConsumo c = new Frm_TablaConsumo();
        c.setVisible(true);
    }//GEN-LAST:event_ListaConsumoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_registro_medidor;
    private javax.swing.JButton Bt_registroconsumo;
    private javax.swing.JButton Bt_salir;
    private javax.swing.JMenuItem ListaConsumo;
    private javax.swing.JMenuItem ListaNaturales;
    private javax.swing.JMenuItem Listageneral;
    private javax.swing.JMenuItem Listajuridico;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
