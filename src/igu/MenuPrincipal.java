package igu;

import java.awt.Color;
import javax.swing.JOptionPane;
import persistencia.ControlAcceso;

public class MenuPrincipal extends javax.swing.JFrame {

    //variable para el logueo
    private ControlAcceso controlAcceso;

    //Variables para los Menus
    private MenuLogin mlogin;
    private MenuPropiedades mpropiedades;
    private MenuPropietarios mpropietario;
    private MenuAlquileres malquileres;
    private MenuListados malistados;
    private MenuUsuario musuario;

    int xMouse, yMouse;

    public MenuPrincipal(ControlAcceso controlAcceso) {
        this.controlAcceso = controlAcceso;
        initComponents();
        jPCardFondo.setVisible(true);
        jPMenuLateral.setVisible(rootPaneCheckingEnabled);
        barraLateralOFF();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPMenuLateral = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLLogin = new javax.swing.JLabel();
        jLPropiedades = new javax.swing.JLabel();
        jLPropietarios = new javax.swing.JLabel();
        jLAlquileres = new javax.swing.JLabel();
        jListados = new javax.swing.JLabel();
        jLSalir = new javax.swing.JLabel();
        exitTxt = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLbarraNombre = new javax.swing.JLabel();
        jBcerrarSesion = new javax.swing.JButton();
        jLbarraAcesso = new javax.swing.JLabel();
        jPCardFondo = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Fmenuprincipal"); // NOI18N
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(51, 51, 51));
        Fondo.setPreferredSize(new java.awt.Dimension(1020, 640));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPMenuLateral.setBackground(new java.awt.Color(51, 204, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoGrupo13pequeño.png"))); // NOI18N

        jLLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/key-keys-main-password-privilege_113429.png"))); // NOI18N
        jLLogin.setText("   LOGIN");
        jLLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLLoginMouseExited(evt);
            }
        });

        jLPropiedades.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLPropiedades.setForeground(new java.awt.Color(255, 255, 255));
        jLPropiedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.png"))); // NOI18N
        jLPropiedades.setText("   PROPIEDADES");
        jLPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLPropiedades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPropiedadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLPropiedadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLPropiedadesMouseExited(evt);
            }
        });

        jLPropietarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLPropietarios.setForeground(new java.awt.Color(255, 255, 255));
        jLPropietarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/User_icon-icons.com_55902.png"))); // NOI18N
        jLPropietarios.setText("   PROPIETARIOS");
        jLPropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLPropietarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPropietariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLPropietariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLPropietariosMouseExited(evt);
            }
        });

        jLAlquileres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLAlquileres.setForeground(new java.awt.Color(255, 255, 255));
        jLAlquileres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contract_icon-icons.com_64813.png"))); // NOI18N
        jLAlquileres.setText("  ALQUILERES");
        jLAlquileres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAlquileres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAlquileresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLAlquileresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLAlquileresMouseExited(evt);
            }
        });

        jListados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jListados.setForeground(new java.awt.Color(255, 255, 255));
        jListados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        jListados.setText("   LISTADOS");
        jListados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jListadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jListadosMouseExited(evt);
            }
        });

        jLSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLSalir.setForeground(new java.awt.Color(255, 255, 255));
        jLSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_icon_137429.png"))); // NOI18N
        jLSalir.setText("   SALIR");
        jLSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSalirMouseExited(evt);
            }
        });

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(255, 255, 255));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        jLUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3289576-individual-man-people-person_107097.png"))); // NOI18N
        jLUsuario.setText("   USUARIO");
        jLUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLUsuarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPMenuLateralLayout = new javax.swing.GroupLayout(jPMenuLateral);
        jPMenuLateral.setLayout(jPMenuLateralLayout);
        jPMenuLateralLayout.setHorizontalGroup(
            jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGroup(jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLateralLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jListados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLAlquileres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLPropietarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLPropiedades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPMenuLateralLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPMenuLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMenuLateralLayout.setVerticalGroup(
            jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jListados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        Fondo.add(jPMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 670));

        header.setBackground(new java.awt.Color(51, 153, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbarraNombre.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLbarraNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLbarraNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/White -admin_lock_padlock_icon_205893.png"))); // NOI18N
        jLbarraNombre.setText("Usuario : Desconectado");
        header.add(jLbarraNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jBcerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jBcerrarSesion.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jBcerrarSesion.setForeground(new java.awt.Color(51, 51, 51));
        jBcerrarSesion.setText("Cerrar Sesion");
        jBcerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcerrarSesionActionPerformed(evt);
            }
        });
        header.add(jBcerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jLbarraAcesso.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLbarraAcesso.setForeground(new java.awt.Color(255, 255, 255));
        jLbarraAcesso.setText("Acceso:");
        header.add(jLbarraAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, 30));

        Fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 760, 60));

        jPCardFondo.setBackground(new java.awt.Color(55, 55, 54));
        jPCardFondo.setMinimumSize(new java.awt.Dimension(748, 635));

        logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoGrupo13Blanco.png"))); // NOI18N

        javax.swing.GroupLayout jPCardFondoLayout = new javax.swing.GroupLayout(jPCardFondo);
        jPCardFondo.setLayout(jPCardFondoLayout);
        jPCardFondoLayout.setHorizontalGroup(
            jPCardFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardFondoLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(logo1)
                .addGap(148, 148, 148))
        );
        jPCardFondoLayout.setVerticalGroup(
            jPCardFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardFondoLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(logo1)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        Fondo.add(jPCardFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 55, 760, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLoginMouseClicked
        if (jLLogin.isEnabled()) {
            jPCardFondo.removeAll();
            jPCardFondo.repaint();
            mlogin = new MenuLogin(controlAcceso);
            mlogin.setVisible(true);
            jPCardFondo.add(mlogin);
            jPCardFondo.setComponentZOrder(mlogin, 0);
        }
    }//GEN-LAST:event_jLLoginMouseClicked

    private void jLLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLoginMouseEntered
        jLLogin.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLLoginMouseEntered

    private void jLLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLoginMouseExited
        jLLogin.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLLoginMouseExited

    private void jLPropiedadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropiedadesMouseClicked
        if (jLPropiedades.isEnabled()) {
            jPCardFondo.removeAll();
            jPCardFondo.repaint();
            mpropiedades = new MenuPropiedades();
            mpropiedades.setVisible(true);
            jPCardFondo.add(mpropiedades);
            jPCardFondo.setComponentZOrder(mpropiedades, 0);
        }
    }//GEN-LAST:event_jLPropiedadesMouseClicked

    private void jLPropiedadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropiedadesMouseEntered
        jLPropiedades.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLPropiedadesMouseEntered

    private void jLPropiedadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropiedadesMouseExited
        jLPropiedades.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLPropiedadesMouseExited

    private void jLPropietariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropietariosMouseClicked
        if (jLPropietarios.isEnabled()) {
            jPCardFondo.removeAll();
            jPCardFondo.repaint();
            mpropietario = new MenuPropietarios();
            mpropietario.setVisible(true);
            jPCardFondo.add(mpropietario);
            jPCardFondo.setComponentZOrder(mpropietario, 0);
        }
    }//GEN-LAST:event_jLPropietariosMouseClicked

    private void jLPropietariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropietariosMouseEntered
        jLPropietarios.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLPropietariosMouseEntered

    private void jLPropietariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropietariosMouseExited
        jLPropietarios.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLPropietariosMouseExited

    private void jLAlquileresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlquileresMouseClicked
        if (jLAlquileres.isEnabled()) {
            jPCardFondo.removeAll();
            jPCardFondo.repaint();
            malquileres = new MenuAlquileres(controlAcceso);
            malquileres.setVisible(true);
            jPCardFondo.add(malquileres);
            jPCardFondo.setComponentZOrder(malquileres, 0);
        }
    }//GEN-LAST:event_jLAlquileresMouseClicked

    private void jLAlquileresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlquileresMouseEntered
        jLAlquileres.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLAlquileresMouseEntered

    private void jLAlquileresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlquileresMouseExited
        jLAlquileres.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLAlquileresMouseExited

    private void jListadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListadosMouseClicked
        if (jListados.isEnabled()) {
            jPCardFondo.removeAll();
            jPCardFondo.repaint();
            malistados = new MenuListados();
            malistados.setVisible(true);
            jPCardFondo.add(malistados);
            jPCardFondo.setComponentZOrder(malistados, 0);
        }
    }//GEN-LAST:event_jListadosMouseClicked

    private void jListadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListadosMouseEntered
        jListados.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jListadosMouseEntered

    private void jListadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListadosMouseExited
        jListados.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jListadosMouseExited

    private void jLSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseClicked
        String mensajeSalida = "¿Estás seguro que quieres salir?";
        String tituloSalidaTraducido = "Salir";

        int respuesta = JOptionPane.showConfirmDialog(this, mensajeSalida, tituloSalidaTraducido, JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            cerrarSession();
            this.dispose(); // cierra la ventana

        }   // TODO ccesadd your handling code here:
    }//GEN-LAST:event_jLSalirMouseClicked

    private void jLSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseEntered
        jLSalir.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLSalirMouseEntered

    private void jLSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseExited
        jLSalir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLSalirMouseExited

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        cerrarSession();
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        //   exitBtn.setBackground(Color.red);
        exitTxt.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        //   exitBtn.setBackground(new Color(153,153,153));

        exitTxt.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void jBcerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcerrarSesionActionPerformed

        cerrarSession();
    }//GEN-LAST:event_jBcerrarSesionActionPerformed

    private void jLUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLUsuarioMouseClicked
        if (jLUsuario.isEnabled()) {
            jPCardFondo.removeAll();
            jPCardFondo.repaint();
            musuario = new MenuUsuario();
            musuario.setVisible(true);
            jPCardFondo.add(musuario);
            jPCardFondo.setComponentZOrder(musuario, 0);
        }
    }//GEN-LAST:event_jLUsuarioMouseClicked

    private void jLUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLUsuarioMouseEntered
        jLUsuario.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLUsuarioMouseEntered

    private void jLUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLUsuarioMouseExited
        jLUsuario.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLUsuarioMouseExited

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JButton jBcerrarSesion;
    private javax.swing.JLabel jLAlquileres;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLPropiedades;
    private javax.swing.JLabel jLPropietarios;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLbarraAcesso;
    private javax.swing.JLabel jLbarraNombre;
    private javax.swing.JLabel jListados;
    private javax.swing.JPanel jPCardFondo;
    private javax.swing.JPanel jPMenuLateral;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    // End of variables declaration//GEN-END:variables
    //Metodos De inicio

    public void barraLateralOFF() {
        jLLogin.setEnabled(true);
        jLAlquileres.setVisible(false);
        jLPropiedades.setVisible(false);
        jLPropietarios.setVisible(false);
        jListados.setVisible(false);
        jBcerrarSesion.setEnabled(false);
        jLUsuario.setVisible(false);
    }

    public void cargarmenu(int nivelAcceso) {

        // Popula el componente de selección de menú según el nivel de acceso
        jLLogin.setEnabled(false);
        jLAlquileres.setVisible(true);
        jLPropiedades.setVisible(true);
        jLPropietarios.setVisible(true);
        jListados.setVisible(true);
        jLUsuario.setVisible(true);
        switch (nivelAcceso) {
            case 10:
                //Administrador
                jLLogin.setEnabled(false);
                jLAlquileres.setEnabled(true);
                jLPropiedades.setEnabled(true);
                jLPropietarios.setEnabled(true);
                jListados.setEnabled(true);
                jBcerrarSesion.setEnabled(true);
                jLUsuario.setEnabled(true);
                break;
            case 20:
                //Solo listados                
                jLLogin.setEnabled(false);
                jLAlquileres.setEnabled(false);
                jLPropiedades.setEnabled(true);
                jLPropietarios.setEnabled(true);
                jListados.setEnabled(true);
                jBcerrarSesion.setEnabled(true);
                jLUsuario.setEnabled(false);
                break;
            case 30:
                jLLogin.setEnabled(false);
                jLAlquileres.setEnabled(false);
                jLPropiedades.setEnabled(false);
                jLPropietarios.setEnabled(false);
                jListados.setEnabled(true);
                jBcerrarSesion.setEnabled(true);
                jLUsuario.setEnabled(false);
                break;
            default:

        }

    }

    public void actualizarJLabel(String nombreUsuario, String acesso) {
        jLbarraNombre.setText("Usuario: " + nombreUsuario);
        jLbarraAcesso.setText("Acesso: " + acesso);
    }

    private void cerrarSession() {
        //Cierro session de usuario
        controlAcceso.cerrarSesion();
        //Cierro conexion a la base de datos
        controlAcceso.cerrarConexion();
        //Pongo la barra lateral en Off modo logueo
        barraLateralOFF();
        //Pongo el usuario a Desconectado
        actualizarJLabel("Desconectado", "");
        //Libero Instancias
        liberarIntancias();
    }

    private void liberarIntancias() {

        if (mlogin != null) {
            mlogin.setVisible(false);
            mlogin = null;
        }
        if (mpropiedades != null) {
            mpropiedades.setVisible(false);
            mpropiedades = null;
        }
        if (mpropietario != null) {
            mpropietario.setVisible(false);
            mpropietario = null;
        }
        if (malquileres != null) {
            malquileres.setVisible(false);
            malquileres = null;
        }
        if (malistados != null) {
            malistados.setVisible(false);
            malistados = null;
        }
        if (musuario != null) {
            musuario.setVisible(false);
            musuario = null;
        }
        

    }

}
