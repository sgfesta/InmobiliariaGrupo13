/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import entidades.Propiedad;
import javax.swing.JRootPane;


public class MenuTest extends javax.swing.JFrame {

   
    public MenuTest() {
        initComponents();

       // jLPropiedades.setBackground(new java.awt.Color(0, 204,255));
       jPCardFondo.setVisible(true);
        
        jPMenuLateral.setVisible(rootPaneCheckingEnabled);
//        jLPropiedades.setBackground(new java.awt.Color(0, 204,255));


             paraPropiedades();
        
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
        jPCardFondo = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCBusquedaPropiedades1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTIDPropietario = new javax.swing.JTextField();
        jBNuevo1 = new javax.swing.JButton();
        jTIDPropietarios2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTIDPropietarios3 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTIDPropietarios4 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTIDPropietarios5 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTIDPropietarios6 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTIDPropietarios7 = new javax.swing.JTextField();
        jBNuevo2 = new javax.swing.JButton();
        jBNuevo3 = new javax.swing.JButton();
        jBNuevo4 = new javax.swing.JButton();
        jPCardAlquileres = new javax.swing.JPanel();
        jPBarraNavegador2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCBusquedaContrato = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jTIDContrato = new javax.swing.JTextField();
        jBNuevo5 = new javax.swing.JButton();
        jTIDPropiedad = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTIDPropietario3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTIDInquilino = new javax.swing.JTextField();
        jTIDVendedor = new javax.swing.JTextField();
        jTIDGarante = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTVigencia = new javax.swing.JTextField();
        jTActivo = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jBNuevo6 = new javax.swing.JButton();
        jBNuevo7 = new javax.swing.JButton();
        jBNuevo8 = new javax.swing.JButton();
        jDFechaFin = new com.toedter.calendar.JDateChooser();
        jDFechaInicio = new com.toedter.calendar.JDateChooser();
        jDFechaContrato = new com.toedter.calendar.JDateChooser();
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
        jLLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admin_lock_padlock_icon_205893.png"))); // NOI18N
        jLLogin.setText("   LOGIN");
        jLLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLoginMouseClicked(evt);
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
        });

        jLPropietarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLPropietarios.setForeground(new java.awt.Color(255, 255, 255));
        jLPropietarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3289576-individual-man-people-person_107097.png"))); // NOI18N
        jLPropietarios.setText("   PROPIETARIOS");
        jLPropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLPropietarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPropietariosMouseClicked(evt);
            }
        });

        jLAlquileres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLAlquileres.setForeground(new java.awt.Color(255, 255, 255));
        jLAlquileres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contract_icon-icons.com_64813.png"))); // NOI18N
        jLAlquileres.setText("   ALQUILERES");
        jLAlquileres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAlquileres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAlquileresMouseClicked(evt);
            }
        });

        jListados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jListados.setForeground(new java.awt.Color(255, 255, 255));
        jListados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        jListados.setText("  LISTADOS");
        jListados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListadosMouseClicked(evt);
            }
        });

        jLSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLSalir.setForeground(new java.awt.Color(255, 255, 255));
        jLSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_icon_137429.png"))); // NOI18N
        jLSalir.setText("  SALIR");
        jLSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPMenuLateralLayout = new javax.swing.GroupLayout(jPMenuLateral);
        jPMenuLateral.setLayout(jPMenuLateralLayout);
        jPMenuLateralLayout.setHorizontalGroup(
            jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(logo)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMenuLateralLayout.createSequentialGroup()
                        .addComponent(jLLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPMenuLateralLayout.createSequentialGroup()
                        .addGroup(jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jListados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                                .addComponent(jLSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                                .addGroup(jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        jPMenuLateralLayout.setVerticalGroup(
            jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(logo)
                .addGap(78, 78, 78)
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
                .addContainerGap(172, Short.MAX_VALUE))
        );

        Fondo.add(jPMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 670));

        jPBanner.setBackground(new java.awt.Color(0, 153, 255));
        jPBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Fondo.add(jPBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 760, 60));

        jPCards.setLayout(new java.awt.CardLayout());
        Fondo.add(jPCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPCardFondo.setBackground(new java.awt.Color(55, 55, 54));
        jPCardFondo.setMinimumSize(new java.awt.Dimension(748, 635));
        jPCardFondo.setPreferredSize(new java.awt.Dimension(748, 635));

        logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoceleste.png"))); // NOI18N

        javax.swing.GroupLayout jPCardFondoLayout = new javax.swing.GroupLayout(jPCardFondo);
        jPCardFondo.setLayout(jPCardFondoLayout);
        jPCardFondoLayout.setHorizontalGroup(
            jPCardFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardFondoLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPCardFondoLayout.setVerticalGroup(
            jPCardFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardFondoLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        Fondo.add(jPCardFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 55, 760, 610));

        jPPropiedades.setBackground(new java.awt.Color(55, 55, 54));
        jPPropiedades.setMinimumSize(new java.awt.Dimension(748, 635));
        jPPropiedades.setPreferredSize(new java.awt.Dimension(748, 635));
        jPPropiedades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Busqueda");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 161, 131, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.png"))); // NOI18N
        jLabel2.setText("  Formulario Propiedades");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 290, -1));

        jCBusquedaPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jCBusquedaPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jPPropiedades.add(jCBusquedaPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 165, 218, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 204, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("ID Propietarios");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 217, 131, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 204, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Direccion");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 247, 131, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 204, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Altura");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 277, 131, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 204, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Tipo");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 307, 131, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 204, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Super. Total");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 337, 131, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 204, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Precio Tasado");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 371, 131, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 204, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Antiguedad");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 397, 131, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 204, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Servicios");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 427, 131, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 204, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Inspector");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 455, 131, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 204, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Zona");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 486, 131, -1));

        jTIDPropietarios.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios.setForeground(new java.awt.Color(51, 51, 51));
        jPPropiedades.add(jTIDPropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 215, 187, -1));

        jTDireccion.setBackground(new java.awt.Color(153, 153, 153));
        jTDireccion.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDireccion.setForeground(new java.awt.Color(51, 51, 51));
        jTDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDireccionActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 245, 187, -1));

        jTAltura.setBackground(new java.awt.Color(153, 153, 153));
        jTAltura.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAltura.setForeground(new java.awt.Color(51, 51, 51));
        jTAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAlturaActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 275, 187, -1));

        jTTipo.setBackground(new java.awt.Color(153, 153, 153));
        jTTipo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTTipo.setForeground(new java.awt.Color(51, 51, 51));
        jTTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTipoActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 305, 187, -1));

        jTSuperTotal.setBackground(new java.awt.Color(153, 153, 153));
        jTSuperTotal.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTSuperTotal.setForeground(new java.awt.Color(51, 51, 51));
        jTSuperTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSuperTotalActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTSuperTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 335, 187, -1));

        jTPrecioTasado.setBackground(new java.awt.Color(153, 153, 153));
        jTPrecioTasado.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTPrecioTasado.setForeground(new java.awt.Color(51, 51, 51));
        jTPrecioTasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioTasadoActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTPrecioTasado, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 365, 187, -1));

        jTAntiguedad.setBackground(new java.awt.Color(153, 153, 153));
        jTAntiguedad.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAntiguedad.setForeground(new java.awt.Color(51, 51, 51));
        jTAntiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAntiguedadActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTAntiguedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 395, 187, -1));

        jTServicios.setBackground(new java.awt.Color(153, 153, 153));
        jTServicios.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTServicios.setForeground(new java.awt.Color(51, 51, 51));
        jTServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTServiciosActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 425, 187, -1));

        jTInspector.setBackground(new java.awt.Color(153, 153, 153));
        jTInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTInspector.setForeground(new java.awt.Color(51, 51, 51));
        jTInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTInspectorActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTInspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 455, 187, -1));

        jTZona.setBackground(new java.awt.Color(153, 153, 153));
        jTZona.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTZona.setForeground(new java.awt.Color(51, 51, 51));
        jTZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTZonaActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 485, 187, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 204, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Estado");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 217, 106, -1));

        jTEstado.setBackground(new java.awt.Color(153, 153, 153));
        jTEstado.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTEstado.setForeground(new java.awt.Color(51, 51, 51));
        jTEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEstadoActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 215, 187, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 204, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Disponibilidad");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 247, 118, -1));

        jTDisponibilidad.setBackground(new java.awt.Color(153, 153, 153));
        jTDisponibilidad.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDisponibilidad.setForeground(new java.awt.Color(51, 51, 51));
        jTDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDisponibilidadActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 245, 187, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 204, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Activo");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 275, 118, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Activo");
        jPPropiedades.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 277, 99, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 204, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Observaciones");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 327, 118, -1));

        jTObservaciones.setBackground(new java.awt.Color(153, 153, 153));
        jTObservaciones.setColumns(20);
        jTObservaciones.setRows(5);
        jScrollPane1.setViewportView(jTObservaciones);

        jPPropiedades.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 352, 312, 157));

        jBNuevo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo.setText("Nuevo");
        jBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPPropiedades.add(jBNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 546, -1, -1));

        jBModificar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(51, 204, 255));
        jBModificar.setText("Modificar");
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPPropiedades.add(jBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 546, -1, -1));

        jBEliminar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPPropiedades.add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 546, -1, -1));

        jBSalir.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(51, 204, 255));
        jBSalir.setText("Salir");
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPPropiedades.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 546, -1, -1));

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

        jPPropiedades.add(jPBarraNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, -1));

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

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.png"))); // NOI18N
        jLabel5.setText("  Formulario Propietarios");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Busqueda");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jCBusquedaPropiedades1.setBackground(new java.awt.Color(153, 153, 153));
        jCBusquedaPropiedades1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 204, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("ID Propietario");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietario.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietario.setForeground(new java.awt.Color(51, 51, 51));

        jBNuevo1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo1.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo1.setText("Modificar");
        jBNuevo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTIDPropietarios2.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 204, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Nombre");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietarios3.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 204, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Apellido");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietarios4.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios4.setForeground(new java.awt.Color(51, 51, 51));

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 204, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("DNI");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietarios5.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios5.setForeground(new java.awt.Color(51, 51, 51));

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 204, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Telefono");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietarios6.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios6.setForeground(new java.awt.Color(51, 51, 51));

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

        jTIDPropietarios7.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios7.setForeground(new java.awt.Color(51, 51, 51));

        jBNuevo2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo2.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo2.setText("Nuevo");
        jBNuevo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBNuevo3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo3.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo3.setText("Eliminar");
        jBNuevo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBNuevo4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo4.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo4.setText("Salir");
        jBNuevo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPCardPropietariosLayout = new javax.swing.GroupLayout(jPCardPropietarios);
        jPCardPropietarios.setLayout(jPCardPropietariosLayout);
        jPCardPropietariosLayout.setHorizontalGroup(
            jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBusquedaPropiedades1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                                .addComponent(jBNuevo2)
                                .addGap(18, 18, 18)
                                .addComponent(jBNuevo1)
                                .addGap(18, 18, 18)
                                .addComponent(jBNuevo3)
                                .addGap(18, 18, 18)
                                .addComponent(jBNuevo4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardPropietariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTIDPropietarios7)
                    .addComponent(jTIDPropietarios6)
                    .addComponent(jTIDPropietarios5)
                    .addComponent(jTIDPropietarios4)
                    .addComponent(jTIDPropietarios3)
                    .addComponent(jTIDPropietario)
                    .addComponent(jTIDPropietarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(237, 237, 237))
        );
        jPCardPropietariosLayout.setVerticalGroup(
            jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBusquedaPropiedades1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTIDPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTIDPropietarios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTIDPropietarios3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTIDPropietarios4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTIDPropietarios5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTIDPropietarios6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTIDPropietarios7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo2)
                    .addComponent(jBNuevo1)
                    .addComponent(jBNuevo3)
                    .addComponent(jBNuevo4))
                .addGap(56, 56, 56))
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
                .addContainerGap(469, Short.MAX_VALUE))
        );
        jPBarraNavegador2Layout.setVerticalGroup(
            jPBarraNavegador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.png"))); // NOI18N
        jLabel7.setText("  Formulario Alquiler");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Busqueda");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jCBusquedaContrato.setBackground(new java.awt.Color(153, 153, 153));
        jCBusquedaContrato.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 204, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("ID Contrato");
        jLabel35.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDContrato.setBackground(new java.awt.Color(153, 153, 153));
        jTIDContrato.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDContrato.setForeground(new java.awt.Color(51, 51, 51));

        jBNuevo5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo5.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo5.setText("Nuevo");
        jBNuevo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTIDPropiedad.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropiedad.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropiedad.setForeground(new java.awt.Color(51, 51, 51));

        jLabel36.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 204, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("ID Propiedad");
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDPropietario3.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietario3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietario3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 204, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("ID Propietario");
        jLabel37.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel38.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 204, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("ID Inquilino");
        jLabel38.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDInquilino.setBackground(new java.awt.Color(153, 153, 153));
        jTIDInquilino.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDInquilino.setForeground(new java.awt.Color(51, 51, 51));

        jTIDVendedor.setBackground(new java.awt.Color(153, 153, 153));
        jTIDVendedor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDVendedor.setForeground(new java.awt.Color(51, 51, 51));

        jTIDGarante.setBackground(new java.awt.Color(153, 153, 153));
        jTIDGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDGarante.setForeground(new java.awt.Color(51, 51, 51));

        jLabel39.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 204, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("ID Vendedor");
        jLabel39.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel40.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 204, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("ID Garante");
        jLabel40.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel41.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 204, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Fecha Inicio");
        jLabel41.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel42.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 204, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Fecha Fin");
        jLabel42.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel43.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 204, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("Vigencia");
        jLabel43.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel44.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 204, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Fecha Contrato");
        jLabel44.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTVigencia.setBackground(new java.awt.Color(153, 153, 153));
        jTVigencia.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTVigencia.setForeground(new java.awt.Color(51, 51, 51));

        jTActivo.setBackground(new java.awt.Color(153, 153, 153));
        jTActivo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTActivo.setForeground(new java.awt.Color(51, 51, 51));
        jTActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTActivoActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 204, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("Activo");
        jLabel45.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jBNuevo6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo6.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo6.setText("Modificar");
        jBNuevo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBNuevo7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo7.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo7.setText("Eliminar");
        jBNuevo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBNuevo8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo8.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo8.setText("Salir");
        jBNuevo8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPCardAlquileresLayout = new javax.swing.GroupLayout(jPCardAlquileres);
        jPCardAlquileres.setLayout(jPCardAlquileresLayout);
        jPCardAlquileresLayout.setHorizontalGroup(
            jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardAlquileresLayout.createSequentialGroup()
                            .addComponent(jBNuevo5)
                            .addGap(18, 18, 18)
                            .addComponent(jBNuevo6)
                            .addGap(18, 18, 18)
                            .addComponent(jBNuevo7)
                            .addGap(18, 18, 18)
                            .addComponent(jBNuevo8)
                            .addGap(204, 204, 204))
                        .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                            .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardAlquileresLayout.createSequentialGroup()
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTIDVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTIDContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTIDPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTIDPropietario3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTIDInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTIDGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardAlquileresLayout.createSequentialGroup()
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDFechaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTActivo))
                                    .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(57, 57, 57)))
                    .addComponent(jPBarraNavegador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                    .addGap(209, 209, 209)
                    .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCBusquedaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7))
                    .addContainerGap(210, Short.MAX_VALUE)))
        );
        jPCardAlquileresLayout.setVerticalGroup(
            jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPBarraNavegador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                        .addComponent(jDFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDFechaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jTVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jTActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                        .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel42))
                            .addComponent(jLabel41))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44))
                    .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                        .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jTIDContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jTIDPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jTIDPropietario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jTIDInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jTIDGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTIDVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo5)
                    .addComponent(jBNuevo6)
                    .addComponent(jBNuevo7)
                    .addComponent(jBNuevo8))
                .addGap(73, 73, 73))
            .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel7)
                    .addGap(48, 48, 48)
                    .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jCBusquedaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(422, Short.MAX_VALUE)))
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
                .addContainerGap(467, Short.MAX_VALUE))
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
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jPBarraNavegador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPCardListadosLayout.setVerticalGroup(
            jPCardListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardListadosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPBarraNavegador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(587, Short.MAX_VALUE))
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
paraPropiedadesTrue();
jPCardPropietarios.setVisible(false);
jPPropiedades.setVisible(true);
jPCardAlquileres.setVisible(false);
jPCardListados.setVisible(false);
jPCardFondo.setVisible(false);
   
    }//GEN-LAST:event_jLPropiedadesMouseClicked

    private void jLPropietariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropietariosMouseClicked
jPCardPropietarios.setVisible(true);
jPPropiedades.setVisible(false);
jPCardAlquileres.setVisible(false);
jPCardListados.setVisible(false);
jPCardFondo.setVisible(false);

    }//GEN-LAST:event_jLPropietariosMouseClicked

    private void jLAlquileresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlquileresMouseClicked
jPCardFondo.setVisible(false);
jPCardPropietarios.setVisible(false);
jPPropiedades.setVisible(false);
jPCardAlquileres.setVisible(true);
jPCardListados.setVisible(false);

    }//GEN-LAST:event_jLAlquileresMouseClicked

    private void jListadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListadosMouseClicked
jPCardPropietarios.setVisible(false);
jPPropiedades.setVisible(false);
jPCardAlquileres.setVisible(false);
jPCardListados.setVisible(true);
jPCardFondo.setVisible(false);

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

    private void jTActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTActivoActionPerformed

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
    private javax.swing.JButton jBNuevo1;
    private javax.swing.JButton jBNuevo2;
    private javax.swing.JButton jBNuevo3;
    private javax.swing.JButton jBNuevo4;
    private javax.swing.JButton jBNuevo5;
    private javax.swing.JButton jBNuevo6;
    private javax.swing.JButton jBNuevo7;
    private javax.swing.JButton jBNuevo8;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Propiedad> jCBusquedaContrato;
    private javax.swing.JComboBox<Propiedad> jCBusquedaPropiedades;
    private javax.swing.JComboBox<Propiedad> jCBusquedaPropiedades1;
    private javax.swing.JComboBox<Propiedad> jCBusquedaPropietario;
    private javax.swing.JComboBox<Propiedad> jCBusquedaPropietario1;
    private javax.swing.JComboBox<Propiedad> jCBusquedaPropietario2;
    private com.toedter.calendar.JDateChooser jDFechaContrato;
    private com.toedter.calendar.JDateChooser jDFechaFin;
    private com.toedter.calendar.JDateChooser jDFechaInicio;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JPanel jPCardFondo;
    private javax.swing.JPanel jPCardListados;
    private javax.swing.JPanel jPCardPropietarios;
    private javax.swing.JPanel jPCards;
    private javax.swing.JPanel jPMenuLateral;
    private javax.swing.JPanel jPPropiedades;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTActivo;
    private javax.swing.JTextField jTAltura;
    private javax.swing.JTextField jTAntiguedad;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTDisponibilidad;
    private javax.swing.JTextField jTEstado;
    private javax.swing.JTextField jTIDContrato;
    private javax.swing.JTextField jTIDGarante;
    private javax.swing.JTextField jTIDInquilino;
    private javax.swing.JTextField jTIDPropiedad;
    private javax.swing.JTextField jTIDPropietario;
    private javax.swing.JTextField jTIDPropietario3;
    private javax.swing.JTextField jTIDPropietarios;
    private javax.swing.JTextField jTIDPropietarios2;
    private javax.swing.JTextField jTIDPropietarios3;
    private javax.swing.JTextField jTIDPropietarios4;
    private javax.swing.JTextField jTIDPropietarios5;
    private javax.swing.JTextField jTIDPropietarios6;
    private javax.swing.JTextField jTIDPropietarios7;
    private javax.swing.JTextField jTIDVendedor;
    private javax.swing.JTextField jTInspector;
    private javax.swing.JTextArea jTObservaciones;
    private javax.swing.JTextField jTPrecioTasado;
    private javax.swing.JTextField jTServicios;
    private javax.swing.JTextField jTSuperTotal;
    private javax.swing.JTextField jTTipo;
    private javax.swing.JTextField jTVigencia;
    private javax.swing.JTextField jTZona;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    // End of variables declaration//GEN-END:variables

    public void paraPropiedades(){
           jCBusquedaPropiedades.setVisible(false);
        jTAltura.setVisible(false);
    jTAntiguedad.setVisible(false);
     jTDireccion.setVisible(false);
     jTDisponibilidad.setVisible(false);
    jTEstado.setVisible(false);
     jTIDPropietarios.setVisible(false);
     jTInspector.setVisible(false);
     jTObservaciones.setVisible(false);
     jTPrecioTasado.setVisible(false);
     jTServicios.setVisible(false);
     jTSuperTotal.setVisible(false);
     jTTipo.setVisible(false);
     jTZona.setVisible(false);
     jBEliminar.setVisible(false);
     jBModificar.setVisible(false);
     jBNuevo.setVisible(false);
     jBSalir.setVisible(false);
}
    public void paraPropiedadesTrue(){
           jCBusquedaPropiedades.setVisible(true);
        jTAltura.setVisible(true);
    jTAntiguedad.setVisible(true);
     jTDireccion.setVisible(true);
     jTDisponibilidad.setVisible(true);
    jTEstado.setVisible(true);
     jTIDPropietarios.setVisible(true);
     jTInspector.setVisible(true);
     jTObservaciones.setVisible(true);
     jTPrecioTasado.setVisible(true);
     jTServicios.setVisible(true);
     jTSuperTotal.setVisible(true);
     jTTipo.setVisible(true);
     jTZona.setVisible(true);
     jBEliminar.setVisible(true);
     jBModificar.setVisible(true);
     jBNuevo.setVisible(true);
     jBSalir.setVisible(true);
}
}