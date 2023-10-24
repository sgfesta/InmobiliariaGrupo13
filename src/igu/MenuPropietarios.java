/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import entidades.Propietario;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import persistencia.PropietarioData;

/**
 *
 * @author Pirrupi
 */
public class MenuPropietarios extends javax.swing.JInternalFrame {

    PropietarioData pd = new PropietarioData();
    Propietario pSelect = new Propietario();

    /**
     * Creates new form MenuPropietarios
     */
    public MenuPropietarios() {
        initComponents();
        idPropietario.setVisible(false);
        QuitarLaBarraTitulo();
        limpiarCampos();
        deshabilitarBotones();

    }
    //defino dos métodosdentro del JInternalFrame y lo instanciamos de la siguiente manera.
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;
    //A continuación creamos una función dentro del mismo JInternalFrame como el ejemplo siguiente:

    public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPCardPropietarios = new javax.swing.JPanel();
        jPBarraNavegador1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBModificarPropietario = new javax.swing.JButton();
        jTIDPropietariosNom = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTIDPropietariosAp = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTIDPropietarios4 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTIDPropietarios5 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTIDPropietarios6 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jBNuevo2 = new javax.swing.JButton();
        jBEliminarPropietario = new javax.swing.JButton();
        jBSalirPropietario = new javax.swing.JButton();
        jrbPropietario = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        idPropietario = new javax.swing.JTextField();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPCardPropietarios.setBackground(new java.awt.Color(55, 55, 55));
        jPCardPropietarios.setMinimumSize(new java.awt.Dimension(748, 635));

        jPBarraNavegador1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Inicio > Propietarios");

        javax.swing.GroupLayout jPBarraNavegador1Layout = new javax.swing.GroupLayout(jPBarraNavegador1);
        jPBarraNavegador1.setLayout(jPBarraNavegador1Layout);
        jPBarraNavegador1Layout.setHorizontalGroup(
            jPBarraNavegador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPBarraNavegador1Layout.setVerticalGroup(
            jPBarraNavegador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/White-individual-man-people-person_107097.png"))); // NOI18N
        jLabel5.setText("  Formulario Propietarios");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jBModificarPropietario.setBackground(new java.awt.Color(51, 51, 51));
        jBModificarPropietario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificarPropietario.setForeground(new java.awt.Color(51, 204, 255));
        jBModificarPropietario.setText("Modificar");
        jBModificarPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarPropietarioActionPerformed(evt);
            }
        });

        jTIDPropietariosNom.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietariosNom.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietariosNom.setForeground(new java.awt.Color(51, 51, 51));
        jTIDPropietariosNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIDPropietariosNomKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 204, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Nombre");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietariosAp.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietariosAp.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietariosAp.setForeground(new java.awt.Color(51, 51, 51));
        jTIDPropietariosAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIDPropietariosApKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 204, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Apellido");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietarios4.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios4.setForeground(new java.awt.Color(51, 51, 51));
        jTIDPropietarios4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIDPropietarios4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTIDPropietarios4KeyTyped(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 204, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("DNI");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietarios5.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios5.setForeground(new java.awt.Color(51, 51, 51));
        jTIDPropietarios5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIDPropietarios5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTIDPropietarios5KeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 204, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Telefono");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietarios6.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios6.setForeground(new java.awt.Color(51, 51, 51));
        jTIDPropietarios6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIDPropietarios6KeyReleased(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 204, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Domicilio");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 204, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Activo");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jBNuevo2.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevo2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo2.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo2.setText("Nuevo");
        jBNuevo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevo2ActionPerformed(evt);
            }
        });

        jBEliminarPropietario.setBackground(new java.awt.Color(51, 51, 51));
        jBEliminarPropietario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminarPropietario.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminarPropietario.setText("Eliminar");
        jBEliminarPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarPropietarioActionPerformed(evt);
            }
        });

        jBSalirPropietario.setBackground(new java.awt.Color(51, 51, 51));
        jBSalirPropietario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalirPropietario.setForeground(new java.awt.Color(51, 204, 255));
        jBSalirPropietario.setText("Salir");
        jBSalirPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalirPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirPropietarioActionPerformed(evt);
            }
        });

        jrbPropietario.setSelected(true);
        jrbPropietario.setOpaque(false);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/White-magnifier-search-zoom_110300.png"))); // NOI18N
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash_bin_delete_remove_icon_191682.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        idPropietario.setEnabled(false);

        javax.swing.GroupLayout jPCardPropietariosLayout = new javax.swing.GroupLayout(jPCardPropietarios);
        jPCardPropietarios.setLayout(jPCardPropietariosLayout);
        jPCardPropietariosLayout.setHorizontalGroup(
            jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                        .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbPropietario)
                            .addComponent(jTIDPropietariosNom, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTIDPropietarios6)
                                    .addComponent(jTIDPropietarios5)
                                    .addComponent(jTIDPropietariosAp)
                                    .addComponent(jTIDPropietarios4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel46)
                                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(idPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel5)
                    .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                        .addComponent(jBNuevo2)
                        .addGap(18, 18, 18)
                        .addComponent(jBModificarPropietario)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminarPropietario)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalirPropietario)))
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardPropietariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCardPropietariosLayout.setVerticalGroup(
            jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(84, 84, 84)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(jTIDPropietarios4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTIDPropietariosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTIDPropietariosAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTIDPropietarios5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTIDPropietarios6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jrbPropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(idPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo2)
                    .addComponent(jBModificarPropietario)
                    .addComponent(jBEliminarPropietario)
                    .addComponent(jBSalirPropietario))
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPCardPropietarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPCardPropietarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBModificarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarPropietarioActionPerformed
        modificarPropietario();
        limpiarCampos();
        deshabilitarBotones();
    }//GEN-LAST:event_jBModificarPropietarioActionPerformed

    private void jBNuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevo2ActionPerformed
        agregarPropietario();
        limpiarCampos();
        deshabilitarBotones();
    }//GEN-LAST:event_jBNuevo2ActionPerformed

    private void jBEliminarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarPropietarioActionPerformed
        eliminarPropietario();
        limpiarCampos();
        deshabilitarBotones();

    }//GEN-LAST:event_jBEliminarPropietarioActionPerformed

    private void jBSalirPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirPropietarioActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            this.dispose();//cierro la ventana
        }

    }//GEN-LAST:event_jBSalirPropietarioActionPerformed

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        buscarPropietario();
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jTIDPropietariosNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDPropietariosNomKeyReleased
        if (!jTIDPropietariosAp.getText().isEmpty() && !jTIDPropietariosNom.getText().isEmpty() && !jTIDPropietarios4.getText().isEmpty() && !jTIDPropietarios5.getText().isEmpty() && !jTIDPropietarios6.getText().isEmpty()) {
            jBNuevo2.setEnabled(true);
        } else {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jTIDPropietariosNomKeyReleased

    private void jTIDPropietariosApKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDPropietariosApKeyReleased
        if (!jTIDPropietariosAp.getText().isEmpty() && !jTIDPropietariosNom.getText().isEmpty() && !jTIDPropietarios4.getText().isEmpty() && !jTIDPropietarios5.getText().isEmpty() && !jTIDPropietarios6.getText().isEmpty()) {
            jBNuevo2.setEnabled(true);
        } else {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jTIDPropietariosApKeyReleased

    private void jTIDPropietarios4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDPropietarios4KeyReleased
        if (!jTIDPropietariosAp.getText().isEmpty() && !jTIDPropietariosNom.getText().isEmpty() && !jTIDPropietarios4.getText().isEmpty() && !jTIDPropietarios5.getText().isEmpty() && !jTIDPropietarios6.getText().isEmpty()) {
            jBNuevo2.setEnabled(true);
        } else {
            deshabilitarBotones();
        }

    }//GEN-LAST:event_jTIDPropietarios4KeyReleased

    private void jTIDPropietarios5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDPropietarios5KeyReleased
        if (!jTIDPropietariosAp.getText().isEmpty() && !jTIDPropietariosNom.getText().isEmpty() && !jTIDPropietarios4.getText().isEmpty() && !jTIDPropietarios5.getText().isEmpty() && !jTIDPropietarios6.getText().isEmpty()) {
            jBNuevo2.setEnabled(true);
        }
    }//GEN-LAST:event_jTIDPropietarios5KeyReleased

    private void jTIDPropietarios6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDPropietarios6KeyReleased
        if (!jTIDPropietariosAp.getText().isEmpty() && !jTIDPropietariosNom.getText().isEmpty() && !jTIDPropietarios4.getText().isEmpty() && !jTIDPropietarios5.getText().isEmpty() && !jTIDPropietarios6.getText().isEmpty()) {
            jBNuevo2.setEnabled(true);
        } else {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jTIDPropietarios6KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTIDPropietarios4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDPropietarios4KeyTyped
        //Solo dejo introducir numeros 
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jTIDPropietarios4KeyTyped

    private void jTIDPropietarios5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDPropietarios5KeyTyped
        //Solo dejo introducir numeros y -
        int key = evt.getKeyChar();
        boolean numero = (key >= 48 && key <= 57) || key == 45;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jTIDPropietarios5KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idPropietario;
    private javax.swing.JButton jBEliminarPropietario;
    private javax.swing.JButton jBModificarPropietario;
    private javax.swing.JButton jBNuevo2;
    private javax.swing.JButton jBSalirPropietario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPBarraNavegador1;
    private javax.swing.JPanel jPCardPropietarios;
    private javax.swing.JTextField jTIDPropietarios4;
    private javax.swing.JTextField jTIDPropietarios5;
    private javax.swing.JTextField jTIDPropietarios6;
    private javax.swing.JTextField jTIDPropietariosAp;
    private javax.swing.JTextField jTIDPropietariosNom;
    private javax.swing.JRadioButton jrbPropietario;
    // End of variables declaration//GEN-END:variables

    public void agregarPropietario() {
        String ap = jTIDPropietariosAp.getText();
        String nom = jTIDPropietariosNom.getText();
        String documento = jTIDPropietarios4.getText();
        String tel = jTIDPropietarios5.getText();
        String dom = jTIDPropietarios6.getText();
        boolean est = jrbPropietario.isSelected();
        Propietario nuevo = new Propietario(ap, nom, documento, tel, dom, est);
        Propietario propietarioExistente = pd.buscarPropietarioPorDni(documento, est);
        if (propietarioExistente != null) {
            JOptionPane.showMessageDialog(this, "El propietario con este DNI ya existe");
        } else {
            pd.guardarPropietario(nuevo);
            JOptionPane.showMessageDialog(this, "Propietario ingresado correctamente");
        }

    }

    public void modificarPropietario() {
        try {
            int id = Integer.parseInt(idPropietario.getText());
            String ap = jTIDPropietariosAp.getText();
            String nom = jTIDPropietariosNom.getText();
            String documento = jTIDPropietarios4.getText();
            String tel = jTIDPropietarios5.getText();
            String dom = jTIDPropietarios6.getText();
            boolean est = jrbPropietario.isSelected();
            Propietario nuevoM = new Propietario(id, nom, ap, documento, tel, dom, est);
            //pd.modificarPropietario(nuevoM);
            int respuesta = JOptionPane.showConfirmDialog(this, "\n\n¿Estás seguro que deseas guardar los cambios?", "Confirmar Guardar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                pd.modificarPropietario(nuevoM); // Guardo el cambio
                JOptionPane.showMessageDialog(this, "Propietario modificado exitosamente.");
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Error al modificar " + ex.getMessage());
        }
    }

    public void eliminarPropietario() {
        String pSelect = jTIDPropietarios4.getText();
        boolean activo = jrbPropietario.isSelected();

        //pd.eliminarPropietario(pSelect);
         int respuesta = JOptionPane.showConfirmDialog(this, "\n\n¿Estás seguro que deseas eliminar a propietario?", "Confirmar Guardar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            pd.eliminarPropietario(pSelect); // Guardo el cambio
            JOptionPane.showMessageDialog(this, "Propietario eliminado exitosamente.");
        }
    }

    public void buscarPropietario() {
        try {
            String documento = jTIDPropietarios4.getText();
            boolean activo = jrbPropietario.isSelected();
            Propietario ps = pd.buscarPropietarioPorDni(documento, activo);
            if (ps != null) {
                idPropietario.setText(String.valueOf(ps.getIdPropietario()));
                jTIDPropietariosNom.setText(ps.getNombre());
                jTIDPropietariosAp.setText(ps.getApellido());
                jTIDPropietarios4.setText(String.valueOf(ps.getDni()));
                jTIDPropietarios5.setText(String.valueOf(ps.getTelefono()));
                jTIDPropietarios6.setText(ps.getDomicilio());
                jrbPropietario.setSelected(ps.isActivo());

                if (ps.isActivo() == true) {
                    habilitarBotones();
                } else {
                    deshabilitarBotones();
                    jBModificarPropietario.setEnabled(true);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar " + ex.getMessage());
        }

    }

    public void limpiarCampos() {
        idPropietario.setText("");
        jTIDPropietariosNom.setText("");
        jTIDPropietariosAp.setText("");
        jTIDPropietarios4.setText("");
        jTIDPropietarios5.setText("");
        jTIDPropietarios6.setText("");
        jrbPropietario.isSelected();
    }

    public void habilitarBotones() {
        jBModificarPropietario.setEnabled(true);
        jBEliminarPropietario.setEnabled(true);
        jBNuevo2.setEnabled(false);
    }

    public void deshabilitarBotones() {
        jBNuevo2.setEnabled(false);
        jBModificarPropietario.setEnabled(false);
        jBEliminarPropietario.setEnabled(false);
    }

    //ANTES DE MODIFICAR, PREGUNTAR A MATI POR CUALQUIER DUDA, GRACIAS <3
}
