/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import entidades.Usuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import persistencia.UsuarioData;

/**
 *
 * @author Pirrupi
 */
public class MenuUsuario extends javax.swing.JInternalFrame {

    UsuarioData ud = new UsuarioData();

    public MenuUsuario() {
        initComponents();
        cargarCombos();
        QuitarLaBarraTitulo();
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

        jPCardUsuarios = new javax.swing.JPanel();
        jPBarraNavegador1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTIDUsuario = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTIEmail = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTPwd = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTNacceso = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBEliminarUsuario = new javax.swing.JButton();
        javax.swing.JButton jBSalirUsuario = new javax.swing.JButton();
        jrbUAvtivo = new javax.swing.JRadioButton();
        jCBusquedaUsuario = new javax.swing.JComboBox<>();
        jBModificarUsuario = new javax.swing.JButton();
        jBLimpiezaUsuario = new javax.swing.JButton();
        jBInfo = new javax.swing.JButton();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPCardUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        jPCardUsuarios.setMinimumSize(new java.awt.Dimension(748, 635));

        jPBarraNavegador1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Inicio > Usuarios");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPBarraNavegador1Layout = new javax.swing.GroupLayout(jPBarraNavegador1);
        jPBarraNavegador1.setLayout(jPBarraNavegador1Layout);
        jPBarraNavegador1Layout.setHorizontalGroup(
            jPBarraNavegador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(628, Short.MAX_VALUE))
        );
        jPBarraNavegador1Layout.setVerticalGroup(
            jPBarraNavegador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/White-individual-man-people-person_107097.png"))); // NOI18N
        jLabel5.setText("  Creacion de Usuarios");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Busqueda");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 204, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("ID Usuario");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDUsuario.setBackground(new java.awt.Color(153, 153, 153));
        jTIDUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDUsuario.setForeground(new java.awt.Color(51, 51, 51));

        jTNombre.setBackground(new java.awt.Color(153, 153, 153));
        jTNombre.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(51, 51, 51));
        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNombreKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 204, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Nombre");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIEmail.setBackground(new java.awt.Color(153, 153, 153));
        jTIEmail.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIEmail.setForeground(new java.awt.Color(51, 51, 51));
        jTIEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIEmailKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 204, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Email");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTPwd.setBackground(new java.awt.Color(153, 153, 153));
        jTPwd.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTPwd.setForeground(new java.awt.Color(51, 51, 51));
        jTPwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPwdKeyReleased(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 204, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Contraseña");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTNacceso.setBackground(new java.awt.Color(153, 153, 153));
        jTNacceso.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTNacceso.setForeground(new java.awt.Color(51, 51, 51));
        jTNacceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNaccesoKeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 204, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("NIvel Acceso");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 204, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Activo");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jBNuevo.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo.setText("Crear");
        jBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jBEliminarUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminarUsuario.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminarUsuario.setText("Eliminar");
        jBEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarUsuarioActionPerformed(evt);
            }
        });

        jBSalirUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jBSalirUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalirUsuario.setForeground(new java.awt.Color(51, 204, 255));
        jBSalirUsuario.setText("Salir");
        jBSalirUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirUsuarioActionPerformed(evt);
            }
        });

        jrbUAvtivo.setBackground(new java.awt.Color(51, 51, 51));
        jrbUAvtivo.setSelected(true);

        jCBusquedaUsuario.setToolTipText("");
        jCBusquedaUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBusquedaUsuarioItemStateChanged(evt);
            }
        });

        jBModificarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jBModificarUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificarUsuario.setForeground(new java.awt.Color(51, 204, 255));
        jBModificarUsuario.setText("Modificar");
        jBModificarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarUsuarioActionPerformed(evt);
            }
        });

        jBLimpiezaUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jBLimpiezaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash_bin_delete_remove_icon_191682.png"))); // NOI18N
        jBLimpiezaUsuario.setBorder(null);
        jBLimpiezaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiezaUsuarioActionPerformed(evt);
            }
        });

        jBInfo.setBackground(new java.awt.Color(51, 51, 51));
        jBInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_info_outline_128_28513.png"))); // NOI18N
        jBInfo.setBorder(null);
        jBInfo.setContentAreaFilled(false);
        jBInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCardUsuariosLayout = new javax.swing.GroupLayout(jPCardUsuarios);
        jPCardUsuarios.setLayout(jPCardUsuariosLayout);
        jPCardUsuariosLayout.setHorizontalGroup(
            jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardUsuariosLayout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPCardUsuariosLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCardUsuariosLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5))
                    .addGroup(jPCardUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jCBusquedaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpiezaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardUsuariosLayout.createSequentialGroup()
                        .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbUAvtivo)
                            .addGroup(jPCardUsuariosLayout.createSequentialGroup()
                                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTNacceso)
                                    .addComponent(jTPwd)
                                    .addComponent(jTIEmail)
                                    .addComponent(jTIDUsuario)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBInfo)))
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardUsuariosLayout.createSequentialGroup()
                        .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBModificarUsuario)
                        .addGap(26, 26, 26)
                        .addComponent(jBEliminarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
        );
        jPCardUsuariosLayout.setVerticalGroup(
            jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardUsuariosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jCBusquedaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBLimpiezaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTIEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(jTNacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBInfo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jrbUAvtivo))
                .addGap(54, 54, 54)
                .addGroup(jPCardUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminarUsuario)
                    .addComponent(jBSalirUsuario)
                    .addComponent(jBModificarUsuario))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPCardUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPCardUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        agregarUsuario();
        limpiarCampos();
        cargarCombos();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarUsuarioActionPerformed
        eliminarUsuario();
        limpiarCampos();
        cargarCombos();
    }//GEN-LAST:event_jBEliminarUsuarioActionPerformed

    private void jBSalirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirUsuarioActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            this.dispose();//cierro la ventana
        }

    }//GEN-LAST:event_jBSalirUsuarioActionPerformed

    private void jCBusquedaUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBusquedaUsuarioItemStateChanged
        rellenarCampos();
        habilitarBotones();
    }//GEN-LAST:event_jCBusquedaUsuarioItemStateChanged

    private void jBModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarUsuarioActionPerformed
        modificarUsuario();
        limpiarCampos();
        cargarCombos();
        rellenarCampos();
    }//GEN-LAST:event_jBModificarUsuarioActionPerformed

    private void jBLimpiezaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiezaUsuarioActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiezaUsuarioActionPerformed

    private void jBInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInfoActionPerformed
        String mensaje = "Nivel 10 : Super Usuario acceso total" + "\n"
                + "Nivel 20 : Administrativo Full  " + "\n"
                + "Nivel 30 : Vendedor  Full" + "\n";
        JOptionPane.showMessageDialog(null, mensaje, "Detalle de Niveles", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBInfoActionPerformed

    private void jTNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyReleased
       if(!jTNombre.getText().isEmpty() && !jTIEmail.getText().isEmpty() && !jTPwd.getText().isEmpty() && !jTNacceso.getText().isEmpty()){
           jBNuevo.setEnabled(true);    
       }else{
           deshabilitarBotones();
       }
    }//GEN-LAST:event_jTNombreKeyReleased

    private void jTIEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIEmailKeyReleased
         if(!jTNombre.getText().isEmpty() && !jTIEmail.getText().isEmpty() && !jTPwd.getText().isEmpty() && !jTNacceso.getText().isEmpty()){
           jBNuevo.setEnabled(true);    
       }else{
           deshabilitarBotones();
       }
    }//GEN-LAST:event_jTIEmailKeyReleased

    private void jTPwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPwdKeyReleased
         if(!jTNombre.getText().isEmpty() && !jTIEmail.getText().isEmpty() && !jTPwd.getText().isEmpty() && !jTNacceso.getText().isEmpty()){
           jBNuevo.setEnabled(true);    
       }else{
           deshabilitarBotones();
       }
    }//GEN-LAST:event_jTPwdKeyReleased

    private void jTNaccesoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNaccesoKeyReleased
         if(!jTNombre.getText().isEmpty() && !jTIEmail.getText().isEmpty() && !jTPwd.getText().isEmpty() && !jTNacceso.getText().isEmpty()){
           jBNuevo.setEnabled(true);    
       }else{
           deshabilitarBotones();
       }
    }//GEN-LAST:event_jTNaccesoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminarUsuario;
    private javax.swing.JButton jBInfo;
    private javax.swing.JButton jBLimpiezaUsuario;
    private javax.swing.JButton jBModificarUsuario;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JComboBox<Usuario> jCBusquedaUsuario;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPBarraNavegador1;
    private javax.swing.JPanel jPCardUsuarios;
    private javax.swing.JTextField jTIDUsuario;
    private javax.swing.JTextField jTIEmail;
    private javax.swing.JTextField jTNacceso;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPwd;
    private javax.swing.JRadioButton jrbUAvtivo;
    // End of variables declaration//GEN-END:variables

    public void cargarCombos() {

        jCBusquedaUsuario.removeAllItems();
        UsuarioData usuarioD = new UsuarioData();
        List<Usuario> usuarios = usuarioD.listarUsuario();

        jCBusquedaUsuario.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (value instanceof Usuario) {
                    Usuario usuario = (Usuario) value;

                    if (usuario.isActivo() == false) {
                        setForeground(Color.RED); // Cambia el color del texto a rojo si el estado es 0
                    } else {
                        setForeground(Color.BLACK); // Restablece el color del texto a negro
                    }
                }

                return this;
            }
        });

        for (Usuario usuario : usuarios) {

            jCBusquedaUsuario.addItem(usuario);
        }
    }

    public void agregarUsuario() {

        try {
            if (!jTNombre.getText().isEmpty() && !jTIEmail.getText().isEmpty() && !jTPwd.getText().isEmpty() && !jTNacceso.getText().isEmpty()
                    && jrbUAvtivo.isSelected() == true) {
                // habilitarBotones();

                String nombre = jTNombre.getText();
                String email = jTIEmail.getText();
                String password = jTPwd.getText();
                boolean activo = jrbUAvtivo.isSelected();
                int nivelAcceso = Integer.parseInt(jTNacceso.getText());

                Usuario nuevo = new Usuario(nombre, email, password, activo, nivelAcceso);
                if (ud.guardarUsuario(nuevo)) {
                    JOptionPane.showMessageDialog(this, "Usuario agregado exitosamente");
                    limpiarCampos();
                    // deshabilitarBotones();
                    cargarCombos();
                } else {
                    JOptionPane.showMessageDialog(this, "Error Usuario repetido o error al acceder a la base de datos");
                }

            } else {
                JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }
    }

    public void limpiarCampos() {

        jTIDUsuario.setText("");
        jTNombre.setText("");
        jTIEmail.setText("");
        jTPwd.setText("");
        jTNacceso.setText("");
        jrbUAvtivo.setSelected(true);
    }

    public void modificarUsuario() {
        try {
            int id = Integer.parseInt(jTIDUsuario.getText());
            String nombre = jTNombre.getText();
            String email = jTIEmail.getText();
            String contraseña = jTPwd.getText();
            int nivelAcceso = Integer.parseInt(jTNacceso.getText());
            boolean activo = jrbUAvtivo.isSelected();
            Usuario nuevoU = new Usuario(id, nombre, email, contraseña, activo, nivelAcceso);
            int respuesta = JOptionPane.showConfirmDialog(this, "\n\n¿Estás seguro que deseas guardar los cambios?", "Confirmar Guardar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                ud.modificarUsuario(nuevoU); // Guardo el cambio
                JOptionPane.showMessageDialog(this, "Usuario modificado exitosamente.");
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Error al modificar " + ex.getMessage());
        }
    }

    public void eliminarUsuario() {
        int uSelect = Integer.parseInt(jTIDUsuario.getText());
        boolean activo = jrbUAvtivo.isSelected();

        int respuesta = JOptionPane.showConfirmDialog(this, "\n\n¿Estás seguro que deseas eliminar al usuario?", "Confirmar Guardar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            ud.eliminarUsuario(uSelect); // Guardo el cambio
            JOptionPane.showMessageDialog(this, "Usuario eliminado exitosamente.");
        }
    }

    public void rellenarCampos() {

        Usuario usuarioSeleccionado = (Usuario) jCBusquedaUsuario.getSelectedItem();
        // boolean activo = jrbEstado.isSelected();

        if (usuarioSeleccionado != null) {

            jTIDUsuario.setText(String.valueOf(usuarioSeleccionado.getIdUsuario()));
            jTNombre.setText(String.valueOf(usuarioSeleccionado.getNombre()));
            jTIEmail.setText(String.valueOf(usuarioSeleccionado.getEmail()));
            jTPwd.setText(String.valueOf(usuarioSeleccionado.getPassword()));
            jTNacceso.setText(String.valueOf(usuarioSeleccionado.getNivelAcceso()));

            // Botones Radiales
            // actualizarDisponibilidad();
            if (usuarioSeleccionado.isActivo() == true) {
                jrbUAvtivo.setSelected(true);
            } else {
                jrbUAvtivo.setSelected(false);
            }

        }
            //actualizarActivo();
    }
    
 public void habilitarBotones() {
        jBModificarUsuario.setEnabled(true);
        jBEliminarUsuario.setEnabled(true);
        jBNuevo.setEnabled(false);
    }

    public void deshabilitarBotones() {
        jBNuevo.setEnabled(false);
        jBModificarUsuario.setEnabled(false);
        jBEliminarUsuario.setEnabled(false);
}
}
