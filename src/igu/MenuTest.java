/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import javax.swing.JRootPane;


public class MenuTest extends javax.swing.JFrame {

   
    public MenuTest() {
        initComponents();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMIngreso = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Fondo = new javax.swing.JPanel();
        JPMenuLateral = new javax.swing.JPanel();
        jBLogin = new javax.swing.JButton();
        jBPropiedades = new javax.swing.JButton();
        jBPropietarios = new javax.swing.JButton();
        jBAlquileres = new javax.swing.JButton();
        jBListados = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        logo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelDeFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPopupMenu1.setBackground(new java.awt.Color(51, 204, 255));
        jPopupMenu1.setForeground(new java.awt.Color(51, 204, 255));

        jMIngreso.setBackground(new java.awt.Color(51, 204, 255));
        jMIngreso.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMIngreso.setForeground(new java.awt.Color(0, 0, 0));
        jMIngreso.setText("Ingreso de Propiedades");
        jMIngreso.setOpaque(false);
        jMIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIngresoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMIngreso);

        jMenuItem3.setBackground(new java.awt.Color(51, 204, 255));
        jMenuItem3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setText("Listado de Propiedades Disp.");
        jMenuItem3.setOpaque(false);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(51, 204, 255));
        jMenuItem4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setText("Modificaciones");
        jMenuItem4.setOpaque(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GRUPO 13 INMOBILIARIA");
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1020, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(51, 51, 51));
        Fondo.setPreferredSize(new java.awt.Dimension(1020, 640));

        JPMenuLateral.setBackground(new java.awt.Color(51, 153, 255));
        JPMenuLateral.setAutoscrolls(true);

        jBLogin.setBackground(new java.awt.Color(51, 51, 51));
        jBLogin.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jBLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBLogin.setText("LOGIN");
        jBLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jBPropiedades.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jBPropiedades.setForeground(new java.awt.Color(255, 255, 255));
        jBPropiedades.setText("PROPIEDADES");
        jBPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPropiedadesActionPerformed(evt);
            }
        });

        jBPropietarios.setBackground(new java.awt.Color(51, 51, 51));
        jBPropietarios.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jBPropietarios.setForeground(new java.awt.Color(255, 255, 255));
        jBPropietarios.setText("PROPIETARIOS");
        jBPropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPropietariosActionPerformed(evt);
            }
        });

        jBAlquileres.setBackground(new java.awt.Color(51, 51, 51));
        jBAlquileres.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jBAlquileres.setForeground(new java.awt.Color(255, 255, 255));
        jBAlquileres.setText("ALQUILARES");
        jBAlquileres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAlquileres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlquileresActionPerformed(evt);
            }
        });

        jBListados.setBackground(new java.awt.Color(51, 51, 51));
        jBListados.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jBListados.setForeground(new java.awt.Color(255, 255, 255));
        jBListados.setText("LISTADOS");
        jBListados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBListados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListadosActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(51, 51, 51));
        jBSalir.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("SALIR");
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logonegroreducido.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("GRUPO 13");

        javax.swing.GroupLayout JPMenuLateralLayout = new javax.swing.GroupLayout(JPMenuLateral);
        JPMenuLateral.setLayout(JPMenuLateralLayout);
        JPMenuLateralLayout.setHorizontalGroup(
            JPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMenuLateralLayout.createSequentialGroup()
                .addGroup(JPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPMenuLateralLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(JPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBPropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBListados, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPMenuLateralLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(JPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPMenuLateralLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        JPMenuLateralLayout.setVerticalGroup(
            JPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMenuLateralLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jBLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPropiedades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPropietarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAlquileres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBListados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSalir)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanelDeFormulario.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("ESTE MENU ESTA EN FASE DE PRUEBA NO USAR!!!!");

        javax.swing.GroupLayout jPanelDeFormularioLayout = new javax.swing.GroupLayout(jPanelDeFormulario);
        jPanelDeFormulario.setLayout(jPanelDeFormularioLayout);
        jPanelDeFormularioLayout.setHorizontalGroup(
            jPanelDeFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeFormularioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelDeFormularioLayout.setVerticalGroup(
            jPanelDeFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeFormularioLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(JPMenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDeFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDeFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBListadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListadosActionPerformed

    }//GEN-LAST:event_jBListadosActionPerformed

    private void jBAlquileresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlquileresActionPerformed

    }//GEN-LAST:event_jBAlquileresActionPerformed

    private void jBPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPropietariosActionPerformed
      
        
    }//GEN-LAST:event_jBPropietariosActionPerformed

    private void jBPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPropiedadesActionPerformed
             jPopupMenu1.show(jBPropiedades, jBPropiedades.getWidth(), 0);
    }//GEN-LAST:event_jBPropiedadesActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jMIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIngresoActionPerformed
        PropiedadesVistaPanel pvp=new PropiedadesVistaPanel();
        jPanelDeFormulario.removeAll();
        jPanelDeFormulario.repaint();
        pvp.setVisible(true);
        jPanelDeFormulario.add(pvp);
        jPanelDeFormulario.setComponentZOrder(pvp, 0);
        
        
    }//GEN-LAST:event_jMIngresoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel JPMenuLateral;
    private javax.swing.JButton jBAlquileres;
    private javax.swing.JButton jBListados;
    private javax.swing.JButton jBLogin;
    private javax.swing.JButton jBPropiedades;
    private javax.swing.JButton jBPropietarios;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMIngreso;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanelDeFormulario;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel logo1;
    // End of variables declaration//GEN-END:variables
}
