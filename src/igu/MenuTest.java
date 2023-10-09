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
        jPMenuLateral.setVisible(rootPaneCheckingEnabled);
//        jLPropiedades.setBackground(new java.awt.Color(0, 204,255));
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMIngreso = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Fondo = new javax.swing.JPanel();
        jPMenuLateral = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLLogin = new javax.swing.JLabel();
        jLPropiedades = new javax.swing.JLabel();
        jLPropietarios = new javax.swing.JLabel();
        jLAlquileres = new javax.swing.JLabel();
        jListados = new javax.swing.JLabel();
        jLSalir = new javax.swing.JLabel();
        jPBanner = new javax.swing.JPanel();
        jPCards = new javax.swing.JPanel();
        jPPropiedades = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBusquedaPropiedades = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTIDPropietarios = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jTAltura = new javax.swing.JTextField();
        jTTipo = new javax.swing.JTextField();
        jTSuperTotal = new javax.swing.JTextField();
        jTPrecioTasado = new javax.swing.JTextField();
        jTAntiguedad = new javax.swing.JTextField();
        jTServicios = new javax.swing.JTextField();
        jTInspector = new javax.swing.JTextField();
        jTZona = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTEstado = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTDisponibilidad = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTObservaciones = new javax.swing.JTextArea();
        jBNuevo = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jPBarraNavegador = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPCardPropietarios = new javax.swing.JPanel();
        jPBarraNavegador1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPCardAlquileres = new javax.swing.JPanel();
        jPBarraNavegador2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPCardListados = new javax.swing.JPanel();
        jPBarraNavegador3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();

        jPopupMenu1.setBackground(new java.awt.Color(51, 204, 255));
        jPopupMenu1.setForeground(new java.awt.Color(51, 204, 255));

        jMIngreso.setBackground(new java.awt.Color(51, 204, 255));
        jMIngreso.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMIngreso.setForeground(new java.awt.Color(0, 0, 0));
        jMIngreso.setText("Ingreso de Propiedades");
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
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GRUPO 13 INMOBILIARIA");
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1020, 700));
        setPreferredSize(new java.awt.Dimension(1020, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(51, 51, 51));
        Fondo.setPreferredSize(new java.awt.Dimension(1020, 640));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPMenuLateral.setBackground(new java.awt.Color(51, 204, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logonegroreducido.png"))); // NOI18N

        jLLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_owner_private_file_data_icon_196451.png"))); // NOI18N
        jLLogin.setText("LOGIN");
        jLLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLoginMouseClicked(evt);
            }
        });

        jLPropiedades.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLPropiedades.setForeground(new java.awt.Color(255, 255, 255));
        jLPropiedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_owner_private_file_data_icon_196451.png"))); // NOI18N
        jLPropiedades.setText("PROPIEDADES");
        jLPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLPropiedades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPropiedadesMouseClicked(evt);
            }
        });

        jLPropietarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLPropietarios.setForeground(new java.awt.Color(255, 255, 255));
        jLPropietarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_owner_private_file_data_icon_196451.png"))); // NOI18N
        jLPropietarios.setText("PROPIETARIOS");
        jLPropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLPropietarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPropietariosMouseClicked(evt);
            }
        });

        jLAlquileres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLAlquileres.setForeground(new java.awt.Color(255, 255, 255));
        jLAlquileres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_owner_private_file_data_icon_196451.png"))); // NOI18N
        jLAlquileres.setText("ALQUILERES");
        jLAlquileres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAlquileres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAlquileresMouseClicked(evt);
            }
        });

        jListados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jListados.setForeground(new java.awt.Color(255, 255, 255));
        jListados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_owner_private_file_data_icon_196451.png"))); // NOI18N
        jListados.setText("LISTADOS");
        jListados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListadosMouseClicked(evt);
            }
        });

        jLSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLSalir.setForeground(new java.awt.Color(255, 255, 255));
        jLSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_owner_private_file_data_icon_196451.png"))); // NOI18N
        jLSalir.setText("SALIR");
        jLSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPMenuLateralLayout = new javax.swing.GroupLayout(jPMenuLateral);
        jPMenuLateral.setLayout(jPMenuLateralLayout);
        jPMenuLateralLayout.setHorizontalGroup(
            jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(logo)
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(jLLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLPropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLPropietarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLAlquileres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jListados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPMenuLateralLayout.setVerticalGroup(
            jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(logo)
                .addGap(76, 76, 76)
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
                .addComponent(jLSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        Fondo.add(jPMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 670));

        jPBanner.setBackground(new java.awt.Color(0, 153, 255));
        jPBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Fondo.add(jPBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 760, 60));

        jPCards.setLayout(new java.awt.CardLayout());
        Fondo.add(jPCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPPropiedades.setBackground(new java.awt.Color(55, 55, 54));
        jPPropiedades.setMinimumSize(new java.awt.Dimension(748, 635));
        jPPropiedades.setPreferredSize(new java.awt.Dimension(748, 635));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Busqueda");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_owner_private_file_data_icon_196451.png"))); // NOI18N
        jLabel2.setText("Formulario Propiedades");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jCBusquedaPropiedades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 204, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("ID Propietarios");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 204, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Direccion");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 204, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Altura");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 204, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Tipo");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 204, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Super. Total");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 204, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Precio Tasado");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 204, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Antiguedad");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 204, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Servicios");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 204, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Inspector");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 204, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Zona");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietarios.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios.setForeground(new java.awt.Color(51, 51, 51));

        jTDireccion.setBackground(new java.awt.Color(153, 153, 153));
        jTDireccion.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDireccion.setForeground(new java.awt.Color(51, 51, 51));
        jTDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDireccionActionPerformed(evt);
            }
        });

        jTAltura.setBackground(new java.awt.Color(153, 153, 153));
        jTAltura.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAltura.setForeground(new java.awt.Color(51, 51, 51));
        jTAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAlturaActionPerformed(evt);
            }
        });

        jTTipo.setBackground(new java.awt.Color(153, 153, 153));
        jTTipo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTTipo.setForeground(new java.awt.Color(51, 51, 51));
        jTTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTipoActionPerformed(evt);
            }
        });

        jTSuperTotal.setBackground(new java.awt.Color(153, 153, 153));
        jTSuperTotal.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTSuperTotal.setForeground(new java.awt.Color(51, 51, 51));
        jTSuperTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSuperTotalActionPerformed(evt);
            }
        });

        jTPrecioTasado.setBackground(new java.awt.Color(153, 153, 153));
        jTPrecioTasado.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTPrecioTasado.setForeground(new java.awt.Color(51, 51, 51));
        jTPrecioTasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioTasadoActionPerformed(evt);
            }
        });

        jTAntiguedad.setBackground(new java.awt.Color(153, 153, 153));
        jTAntiguedad.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAntiguedad.setForeground(new java.awt.Color(51, 51, 51));
        jTAntiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAntiguedadActionPerformed(evt);
            }
        });

        jTServicios.setBackground(new java.awt.Color(153, 153, 153));
        jTServicios.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTServicios.setForeground(new java.awt.Color(51, 51, 51));
        jTServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTServiciosActionPerformed(evt);
            }
        });

        jTInspector.setBackground(new java.awt.Color(153, 153, 153));
        jTInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTInspector.setForeground(new java.awt.Color(51, 51, 51));
        jTInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTInspectorActionPerformed(evt);
            }
        });

        jTZona.setBackground(new java.awt.Color(153, 153, 153));
        jTZona.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTZona.setForeground(new java.awt.Color(51, 51, 51));
        jTZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTZonaActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 204, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Estado");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTEstado.setBackground(new java.awt.Color(153, 153, 153));
        jTEstado.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTEstado.setForeground(new java.awt.Color(51, 51, 51));
        jTEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEstadoActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 204, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Disponibilidad");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTDisponibilidad.setBackground(new java.awt.Color(153, 153, 153));
        jTDisponibilidad.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDisponibilidad.setForeground(new java.awt.Color(51, 51, 51));
        jTDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDisponibilidadActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 204, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Activo");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Activo");

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 204, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Observaciones");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTObservaciones.setBackground(new java.awt.Color(153, 153, 153));
        jTObservaciones.setColumns(20);
        jTObservaciones.setRows(5);
        jScrollPane1.setViewportView(jTObservaciones);

        jBNuevo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo.setText("Nuevo");
        jBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBModificar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(51, 204, 255));
        jBModificar.setText("Modificar");
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBEliminar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBSalir.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(51, 204, 255));
        jBSalir.setText("Salir");
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jPBarraNavegador.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Inicio > Propiedades");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPBarraNavegadorLayout = new javax.swing.GroupLayout(jPBarraNavegador);
        jPBarraNavegador.setLayout(jPBarraNavegadorLayout);
        jPBarraNavegadorLayout.setHorizontalGroup(
            jPBarraNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPBarraNavegadorLayout.setVerticalGroup(
            jPBarraNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPPropiedadesLayout = new javax.swing.GroupLayout(jPPropiedades);
        jPPropiedades.setLayout(jPPropiedadesLayout);
        jPPropiedadesLayout.setHorizontalGroup(
            jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBarraNavegador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jCBusquedaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTIDPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTSuperTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPrecioTasado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTZona, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jBNuevo)
                .addGap(51, 51, 51)
                .addComponent(jBModificar)
                .addGap(34, 34, 34)
                .addComponent(jBEliminar)
                .addGap(36, 36, 36)
                .addComponent(jBSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPropiedadesLayout.setVerticalGroup(
            jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPBarraNavegador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jCBusquedaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTIDPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10)))
                .addGap(6, 6, 6)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel25))))
                .addGap(6, 6, 6)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel22))))
                .addGap(6, 6, 6)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel13)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel15)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel18)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel19)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel20)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel21))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addComponent(jTTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTSuperTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTPrecioTasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel27)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addGap(60, 60, 60))
        );

        Fondo.add(jPPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 65, 750, 600));

        jPCardPropietarios.setBackground(new java.awt.Color(55, 55, 55));
        jPCardPropietarios.setMinimumSize(new java.awt.Dimension(748, 635));
        jPCardPropietarios.setPreferredSize(new java.awt.Dimension(748, 635));

        jPBarraNavegador1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Inicio > Propietarios");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPBarraNavegador1Layout = new javax.swing.GroupLayout(jPBarraNavegador1);
        jPBarraNavegador1.setLayout(jPBarraNavegador1Layout);
        jPBarraNavegador1Layout.setHorizontalGroup(
            jPBarraNavegador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPBarraNavegador1Layout.setVerticalGroup(
            jPBarraNavegador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_owner_private_file_data_icon_196451.png"))); // NOI18N
        jLabel3.setText("Formulario Propietario");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPCardPropietariosLayout = new javax.swing.GroupLayout(jPCardPropietarios);
        jPCardPropietarios.setLayout(jPCardPropietariosLayout);
        jPCardPropietariosLayout.setHorizontalGroup(
            jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCardPropietariosLayout.setVerticalGroup(
            jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(522, Short.MAX_VALUE))
        );

        Fondo.add(jPCardPropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 65, -1, 600));

        jPCardAlquileres.setBackground(new java.awt.Color(55, 55, 55));

        jPBarraNavegador2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Inicio > Alquileres");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPBarraNavegador2Layout = new javax.swing.GroupLayout(jPBarraNavegador2);
        jPBarraNavegador2.setLayout(jPBarraNavegador2Layout);
        jPBarraNavegador2Layout.setHorizontalGroup(
            jPBarraNavegador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPBarraNavegador2Layout.setVerticalGroup(
            jPBarraNavegador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_owner_private_file_data_icon_196451.png"))); // NOI18N
        jLabel4.setText("Formulario Alquiler");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPCardAlquileresLayout = new javax.swing.GroupLayout(jPCardAlquileres);
        jPCardAlquileres.setLayout(jPCardAlquileresLayout);
        jPCardAlquileresLayout.setHorizontalGroup(
            jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardAlquileresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBarraNavegador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCardAlquileresLayout.setVerticalGroup(
            jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                .addComponent(jPBarraNavegador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 493, Short.MAX_VALUE))
        );

        Fondo.add(jPCardAlquileres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 65, -1, 600));

        jPCardListados.setBackground(new java.awt.Color(55, 55, 55));
        jPCardListados.setMinimumSize(new java.awt.Dimension(748, 635));
        jPCardListados.setPreferredSize(new java.awt.Dimension(748, 635));

        jPBarraNavegador3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel29.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Inicio > Listados");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPBarraNavegador3Layout = new javax.swing.GroupLayout(jPBarraNavegador3);
        jPBarraNavegador3.setLayout(jPBarraNavegador3Layout);
        jPBarraNavegador3Layout.setHorizontalGroup(
            jPBarraNavegador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPBarraNavegador3Layout.setVerticalGroup(
            jPBarraNavegador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPCardListadosLayout = new javax.swing.GroupLayout(jPCardListados);
        jPCardListados.setLayout(jPCardListadosLayout);
        jPCardListadosLayout.setHorizontalGroup(
            jPCardListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardListadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBarraNavegador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPCardListadosLayout.setVerticalGroup(
            jPCardListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardListadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBarraNavegador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(597, Short.MAX_VALUE))
        );

        Fondo.add(jPCardListados, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 60, -1, 600));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIngresoActionPerformed
      
        
    }//GEN-LAST:event_jMIngresoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDireccionActionPerformed

    private void jTAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAlturaActionPerformed

    private void jTTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTipoActionPerformed

    private void jTSuperTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSuperTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSuperTotalActionPerformed

    private void jTPrecioTasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioTasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecioTasadoActionPerformed

    private void jTAntiguedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAntiguedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAntiguedadActionPerformed

    private void jTServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTServiciosActionPerformed

    private void jTInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTInspectorActionPerformed

    private void jTZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTZonaActionPerformed

    private void jTEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEstadoActionPerformed

    private void jTDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDisponibilidadActionPerformed

    private void jLPropiedadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropiedadesMouseClicked
jPCardPropietarios.setVisible(false);
jPPropiedades.setVisible(true);
jPCardAlquileres.setVisible(false);
jPCardListados.setVisible(false);
//               jPMenuLateral.setVisible(rootPaneCheckingEnabled);
//        jLPropiedades.setBackground(new java.awt.Color(51, 51,51));
//        jPPropiedades.setVisible(true);
//        
//        //ocultamos otros paneles
//        
//        jLPropietarios.setBackground(new java.awt.Color(51, 51,51));
//        jLPropietarios.setVisible(true);
//        
//        jLAlquileres.setBackground(new java.awt.Color(51, 51,51));
//        jLAlquileres.setVisible(true);
//        
//        jListados.setBackground(new java.awt.Color(51, 51,51));
//        jListados.setVisible(true);
        
        
    }//GEN-LAST:event_jLPropiedadesMouseClicked

    private void jLPropietariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropietariosMouseClicked
jPCardPropietarios.setVisible(rootPaneCheckingEnabled);
jPPropiedades.setVisible(false);
jPCardAlquileres.setVisible(false);
jPCardListados.setVisible(false);

//               jPMenuLateral.setVisible(rootPaneCheckingEnabled);
//        jLPropiedades.setBackground(new java.awt.Color(51, 51,51));
//        jPPropiedades.setVisible(true);
//        
//       jLPropietarios.setBackground(new java.awt.Color(51, 51,51));
//        jLPropietarios.setVisible(true);
//        
//        jLAlquileres.setBackground(new java.awt.Color(51, 51,51));
//        jLAlquileres.setVisible(true);
//        
//        jListados.setBackground(new java.awt.Color(51, 51,51));
//        jListados.setVisible(true);
    }//GEN-LAST:event_jLPropietariosMouseClicked

    private void jLAlquileresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlquileresMouseClicked
jPCardPropietarios.setVisible(false);
jPPropiedades.setVisible(false);
jPCardAlquileres.setVisible(true);
jPCardListados.setVisible(false);
//              jPMenuLateral.setVisible(rootPaneCheckingEnabled);
//        jLPropiedades.setBackground(new java.awt.Color(51, 51,51));
//        jPPropiedades.setVisible(true);
//        
//        //ocultamos otros paneles
//        
//        jLPropietarios.setBackground(new java.awt.Color(51, 51,51));
//        jLPropietarios.setVisible(true);
//        
//        jLAlquileres.setBackground(new java.awt.Color(51, 51,51));
//        jLAlquileres.setVisible(true);
//        
//        jListados.setBackground(new java.awt.Color(51, 51,51));
//        jListados.setVisible(true);
    }//GEN-LAST:event_jLAlquileresMouseClicked

    private void jListadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListadosMouseClicked
jPCardPropietarios.setVisible(false);
jPPropiedades.setVisible(false);
jPCardAlquileres.setVisible(false);
jPCardListados.setVisible(true);
//               jPMenuLateral.setVisible(rootPaneCheckingEnabled);
//        jLPropiedades.setBackground(new java.awt.Color(51, 51,51));
//        jPPropiedades.setVisible(true);
//        
//        
//        
//        jLPropietarios.setBackground(new java.awt.Color(51, 51,51));
//        jLPropietarios.setVisible(true);
//        
//        jLAlquileres.setBackground(new java.awt.Color(51, 51,51));
//        jLAlquileres.setVisible(true);
//        
//        jListados.setBackground(new java.awt.Color(51, 51,51));
//        jListados.setVisible(true);
    }//GEN-LAST:event_jListadosMouseClicked

    private void jLLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLoginMouseClicked
        Fondo.removeAll();
        Fondo.repaint();
        Login log=new Login();
        log.setVisible(true);
       
    }//GEN-LAST:event_jLLoginMouseClicked

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

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
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBusquedaPropiedades;
    private javax.swing.JLabel jLAlquileres;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLPropiedades;
    private javax.swing.JLabel jLPropietarios;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jListados;
    private javax.swing.JMenuItem jMIngreso;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPBanner;
    private javax.swing.JPanel jPBarraNavegador;
    private javax.swing.JPanel jPBarraNavegador1;
    private javax.swing.JPanel jPBarraNavegador2;
    private javax.swing.JPanel jPBarraNavegador3;
    private javax.swing.JPanel jPCardAlquileres;
    private javax.swing.JPanel jPCardListados;
    private javax.swing.JPanel jPCardPropietarios;
    private javax.swing.JPanel jPCards;
    private javax.swing.JPanel jPMenuLateral;
    private javax.swing.JPanel jPPropiedades;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAltura;
    private javax.swing.JTextField jTAntiguedad;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTDisponibilidad;
    private javax.swing.JTextField jTEstado;
    private javax.swing.JTextField jTIDPropietarios;
    private javax.swing.JTextField jTInspector;
    private javax.swing.JTextArea jTObservaciones;
    private javax.swing.JTextField jTPrecioTasado;
    private javax.swing.JTextField jTServicios;
    private javax.swing.JTextField jTSuperTotal;
    private javax.swing.JTextField jTTipo;
    private javax.swing.JTextField jTZona;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
