/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import entidades.Propiedad;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import jdk.nashorn.internal.ir.JumpToInlinedFinally;

public class MenuTest extends javax.swing.JFrame {

    int xMouse, yMouse;

    public MenuTest() {
        initComponents();

        // jLPropiedades.setBackground(new java.awt.Color(0, 204,255));
        jPCardFondo.setVisible(true);

        jPMenuLateral.setVisible(rootPaneCheckingEnabled);
//        jLPropiedades.setBackground(new java.awt.Color(0, 204,255));

        paraPropiedades();
        paraPropietarios();
        paraAlquileres();
        paraListadosGarante();
        paraListadosInquilinos();
        paraListadosInspector();
        bg.setVisible(false);

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
        header = new javax.swing.JPanel();
        jPCards = new javax.swing.JPanel();
        jPCardFondo = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        jPLogin1 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jPLogin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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
        jLTituloAlquiler = new javax.swing.JLabel();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPInquilinos = new javax.swing.JPanel();
        jLTituloInquilinos = new javax.swing.JLabel();
        jLBusquedaInquilinos = new javax.swing.JLabel();
        jCBusquedaInquilinos = new javax.swing.JComboBox<>();
        jLIdInquilinos = new javax.swing.JLabel();
        jTIDContrato1 = new javax.swing.JTextField();
        jBNuevoInquilinos = new javax.swing.JButton();
        jBModificarInquilinos = new javax.swing.JButton();
        jBEliminarInquilinos = new javax.swing.JButton();
        jBSalirInquilinos = new javax.swing.JButton();
        jTNombreInquilinos = new javax.swing.JTextField();
        jLNombreInquilinos = new javax.swing.JLabel();
        jLApellidoInquilinos = new javax.swing.JLabel();
        jTApellidoInquilinos = new javax.swing.JTextField();
        jLDNIInquilinos = new javax.swing.JLabel();
        jTDNIInquilinos = new javax.swing.JTextField();
        jLCuitInquilinos = new javax.swing.JLabel();
        jTLugarTrabajoInquilinos = new javax.swing.JTextField();
        jLLugarTrabajoInquilinos = new javax.swing.JLabel();
        jTCuitInquilinos = new javax.swing.JTextField();
        jLActivoInquilinos = new javax.swing.JLabel();
        jTActivoInquilinos = new javax.swing.JTextField();
        jPGarante = new javax.swing.JPanel();
        jLTituloGarante = new javax.swing.JLabel();
        jLBusquedaGarante = new javax.swing.JLabel();
        jCBusquedaGarante = new javax.swing.JComboBox<>();
        jLIDGarante = new javax.swing.JLabel();
        jTIDGarante1 = new javax.swing.JTextField();
        jLNombreGarante = new javax.swing.JLabel();
        jTNombreGarante = new javax.swing.JTextField();
        jLApellidoGarante = new javax.swing.JLabel();
        jTApellidoGarante = new javax.swing.JTextField();
        jLDNIGarante = new javax.swing.JLabel();
        jTDNIGarante = new javax.swing.JTextField();
        jLDomicilio = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jLTelefonoGarante = new javax.swing.JLabel();
        jTTelefonoGarante = new javax.swing.JTextField();
        jLActivoGarante = new javax.swing.JLabel();
        jTActivoGarante = new javax.swing.JTextField();
        jBNuevoGarante = new javax.swing.JButton();
        jBModificarGarante = new javax.swing.JButton();
        jBEliminarGarante = new javax.swing.JButton();
        jBSalirGarante = new javax.swing.JButton();
        jPInspector = new javax.swing.JPanel();
        jLTituloInspector = new javax.swing.JLabel();
        jLBusquedaInspector = new javax.swing.JLabel();
        jCBusquedaInspector = new javax.swing.JComboBox<>();
        jBNuevoInspector = new javax.swing.JButton();
        jBModificarInspector = new javax.swing.JButton();
        jBEliminarInspector = new javax.swing.JButton();
        jBSalirInspector = new javax.swing.JButton();
        jLIDInspector = new javax.swing.JLabel();
        jTIDInspector = new javax.swing.JTextField();
        jLMatriculaInspector = new javax.swing.JLabel();
        jTMatriculaInspector = new javax.swing.JTextField();
        jLNombreInspector = new javax.swing.JLabel();
        jTNombreInspector = new javax.swing.JTextField();
        jLApellidoInspector = new javax.swing.JLabel();
        jTApellidoInspector = new javax.swing.JTextField();
        jLTelefonoInspector = new javax.swing.JLabel();
        jTTelefonoInspector = new javax.swing.JTextField();
        jLActivoInspector = new javax.swing.JLabel();
        jTActivoInspector = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GRUPO 13 INMOBILIARIA");
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1020, 700));
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
        jLPropietarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3289576-individual-man-people-person_107097.png"))); // NOI18N
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

        javax.swing.GroupLayout jPMenuLateralLayout = new javax.swing.GroupLayout(jPMenuLateral);
        jPMenuLateral.setLayout(jPMenuLateralLayout);
        jPMenuLateralLayout.setHorizontalGroup(
            jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGroup(jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMenuLateralLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLateralLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jListados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLAlquileres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLPropietarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLPropiedades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMenuLateralLayout.setVerticalGroup(
            jPMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLateralLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(logo)
                .addGap(58, 58, 58)
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
                .addContainerGap(137, Short.MAX_VALUE))
        );

        Fondo.add(jPMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 670));

        header.setBackground(new java.awt.Color(51, 204, 255));
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
        Fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1030, 60));

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
                .addGap(278, 278, 278)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPCardFondoLayout.setVerticalGroup(
            jPCardFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardFondoLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        Fondo.add(jPCardFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 55, 760, 590));

        jPLogin1.setBackground(new java.awt.Color(255, 51, 153));

        bg.setBackground(new java.awt.Color(51, 51, 51));
        bg.setEnabled(false);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoceleste.png"))); // NOI18N
        bg.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 200, 220));

        userTxt.setBackground(new java.awt.Color(51, 51, 51));
        userTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userTxt.setText("Ingrese nombre de usuario");
        userTxt.setBorder(null);
        userTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 290, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 290, 20));

        passTxt.setBackground(new java.awt.Color(51, 51, 51));
        passTxt.setForeground(new java.awt.Color(255, 255, 255));
        passTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 290, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 290, 20));

        loginBtn.setBackground(new java.awt.Color(51, 51, 51));
        loginBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), null));

        loginBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("INGRESAR");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 130, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GRUPO 13");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 90, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INMOBILIARIA");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 130, -1));

        javax.swing.GroupLayout jPLogin1Layout = new javax.swing.GroupLayout(jPLogin1);
        jPLogin1.setLayout(jPLogin1Layout);
        jPLogin1Layout.setHorizontalGroup(
            jPLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        jPLogin1Layout.setVerticalGroup(
            jPLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        Fondo.add(jPLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 65, -1, -1));

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
        jPPropiedades.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 106, -1));

        jTEstado.setBackground(new java.awt.Color(153, 153, 153));
        jTEstado.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTEstado.setForeground(new java.awt.Color(51, 51, 51));
        jTEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEstadoActionPerformed(evt);
            }
        });
        jPPropiedades.add(jTEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 215, 200, -1));

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
        jPPropiedades.add(jTDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 245, 200, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 204, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Activo");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 275, 118, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Activo");
        jPPropiedades.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 280, 90, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 204, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Observaciones");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 118, -1));

        jTObservaciones.setBackground(new java.awt.Color(153, 153, 153));
        jTObservaciones.setColumns(20);
        jTObservaciones.setRows(5);
        jScrollPane1.setViewportView(jTObservaciones);

        jPPropiedades.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 352, 312, 157));

        jBNuevo.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo.setText("Nuevo");
        jBNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPPropiedades.add(jBNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 546, -1, -1));

        jBModificar.setBackground(new java.awt.Color(51, 51, 51));
        jBModificar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(51, 204, 255));
        jBModificar.setText("Modificar");
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPPropiedades.add(jBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 546, -1, -1));

        jBEliminar.setBackground(new java.awt.Color(51, 51, 51));
        jBEliminar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPPropiedades.add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 546, -1, -1));

        jBSalir.setBackground(new java.awt.Color(51, 51, 51));
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

        jPPropiedades.add(jPBarraNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, -1));

        jPLogin.setBackground(new java.awt.Color(51, 51, 51));
        jPLogin.setMinimumSize(new java.awt.Dimension(748, 635));
        jPLogin.setPreferredSize(new java.awt.Dimension(748, 635));

        jLabel3.setText("hola");

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        jPPropiedades.add(jPLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -10, 750, 640));

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
                .addContainerGap(469, Short.MAX_VALUE))
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

        jBNuevo1.setBackground(new java.awt.Color(51, 51, 51));
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

        jBNuevo2.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevo2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo2.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo2.setText("Nuevo");
        jBNuevo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBNuevo3.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevo3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo3.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo3.setText("Eliminar");
        jBNuevo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBNuevo4.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevo4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo4.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo4.setText("Salir");
        jBNuevo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPCardPropietariosLayout = new javax.swing.GroupLayout(jPCardPropietarios);
        jPCardPropietarios.setLayout(jPCardPropietariosLayout);
        jPCardPropietariosLayout.setHorizontalGroup(
            jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardPropietariosLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardPropietariosLayout.createSequentialGroup()
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
                    .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPCardPropietariosLayout.setVerticalGroup(
            jPCardPropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardPropietariosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPBarraNavegador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
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

        jLTituloAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLTituloAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jLTituloAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloAlquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.png"))); // NOI18N
        jLTituloAlquiler.setText("  Formulario Alquiler");
        jLTituloAlquiler.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        jBNuevo5.setBackground(new java.awt.Color(51, 51, 51));
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

        jBNuevo6.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevo6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo6.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo6.setText("Modificar");
        jBNuevo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBNuevo7.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevo7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevo7.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevo7.setText("Eliminar");
        jBNuevo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBNuevo8.setBackground(new java.awt.Color(51, 51, 51));
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
                        .addComponent(jLTituloAlquiler))
                    .addContainerGap(210, Short.MAX_VALUE)))
        );
        jPCardAlquileresLayout.setVerticalGroup(
            jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo5)
                    .addComponent(jBNuevo6)
                    .addComponent(jBNuevo7)
                    .addComponent(jBNuevo8))
                .addGap(73, 73, 73))
            .addGroup(jPCardAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPCardAlquileresLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLTituloAlquiler)
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

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPInquilinos.setBackground(new java.awt.Color(51, 51, 51));

        jLTituloInquilinos.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLTituloInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jLTituloInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloInquilinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        jLTituloInquilinos.setText("  Formulario Inquilinos");
        jLTituloInquilinos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLBusquedaInquilinos.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLBusquedaInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jLBusquedaInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBusquedaInquilinos.setText("Busqueda");

        jCBusquedaInquilinos.setBackground(new java.awt.Color(153, 153, 153));
        jCBusquedaInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

        jLIdInquilinos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLIdInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jLIdInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLIdInquilinos.setText("ID Inquilino");
        jLIdInquilinos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDContrato1.setBackground(new java.awt.Color(153, 153, 153));
        jTIDContrato1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDContrato1.setForeground(new java.awt.Color(51, 51, 51));
        jTIDContrato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDContrato1ActionPerformed(evt);
            }
        });

        jBNuevoInquilinos.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevoInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevoInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevoInquilinos.setText("Nuevo");
        jBNuevoInquilinos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBModificarInquilinos.setBackground(new java.awt.Color(51, 51, 51));
        jBModificarInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificarInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jBModificarInquilinos.setText("Modificar");
        jBModificarInquilinos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBEliminarInquilinos.setBackground(new java.awt.Color(51, 51, 51));
        jBEliminarInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminarInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminarInquilinos.setText("Eliminar");
        jBEliminarInquilinos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarInquilinosActionPerformed(evt);
            }
        });

        jBSalirInquilinos.setBackground(new java.awt.Color(51, 51, 51));
        jBSalirInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalirInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jBSalirInquilinos.setText("Salir");
        jBSalirInquilinos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTNombreInquilinos.setBackground(new java.awt.Color(153, 153, 153));
        jTNombreInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTNombreInquilinos.setForeground(new java.awt.Color(51, 51, 51));
        jTNombreInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreInquilinosActionPerformed(evt);
            }
        });

        jLNombreInquilinos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLNombreInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jLNombreInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombreInquilinos.setText("Nombre");
        jLNombreInquilinos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLApellidoInquilinos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLApellidoInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jLApellidoInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLApellidoInquilinos.setText("Apellido");
        jLApellidoInquilinos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTApellidoInquilinos.setBackground(new java.awt.Color(153, 153, 153));
        jTApellidoInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTApellidoInquilinos.setForeground(new java.awt.Color(51, 51, 51));
        jTApellidoInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoInquilinosActionPerformed(evt);
            }
        });

        jLDNIInquilinos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLDNIInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jLDNIInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDNIInquilinos.setText("DNI");
        jLDNIInquilinos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTDNIInquilinos.setBackground(new java.awt.Color(153, 153, 153));
        jTDNIInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDNIInquilinos.setForeground(new java.awt.Color(51, 51, 51));
        jTDNIInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDNIInquilinosActionPerformed(evt);
            }
        });

        jLCuitInquilinos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLCuitInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jLCuitInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCuitInquilinos.setText("CUIT");
        jLCuitInquilinos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTLugarTrabajoInquilinos.setBackground(new java.awt.Color(153, 153, 153));
        jTLugarTrabajoInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTLugarTrabajoInquilinos.setForeground(new java.awt.Color(51, 51, 51));
        jTLugarTrabajoInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLugarTrabajoInquilinosActionPerformed(evt);
            }
        });

        jLLugarTrabajoInquilinos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLLugarTrabajoInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jLLugarTrabajoInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLLugarTrabajoInquilinos.setText("Lugar de Trabajo");
        jLLugarTrabajoInquilinos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTCuitInquilinos.setBackground(new java.awt.Color(153, 153, 153));
        jTCuitInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTCuitInquilinos.setForeground(new java.awt.Color(51, 51, 51));
        jTCuitInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCuitInquilinosActionPerformed(evt);
            }
        });

        jLActivoInquilinos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLActivoInquilinos.setForeground(new java.awt.Color(51, 204, 255));
        jLActivoInquilinos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLActivoInquilinos.setText("Activo");
        jLActivoInquilinos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTActivoInquilinos.setBackground(new java.awt.Color(153, 153, 153));
        jTActivoInquilinos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTActivoInquilinos.setForeground(new java.awt.Color(51, 51, 51));
        jTActivoInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTActivoInquilinosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPInquilinosLayout = new javax.swing.GroupLayout(jPInquilinos);
        jPInquilinos.setLayout(jPInquilinosLayout);
        jPInquilinosLayout.setHorizontalGroup(
            jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInquilinosLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInquilinosLayout.createSequentialGroup()
                        .addComponent(jLTituloInquilinos)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInquilinosLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBusquedaInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCBusquedaInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(171, 171, 171))
                        .addGroup(jPInquilinosLayout.createSequentialGroup()
                            .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPInquilinosLayout.createSequentialGroup()
                                    .addComponent(jBNuevoInquilinos)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBModificarInquilinos)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBEliminarInquilinos)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBSalirInquilinos))
                                .addGroup(jPInquilinosLayout.createSequentialGroup()
                                    .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLIdInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLApellidoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLDNIInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLNombreInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLCuitInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLLugarTrabajoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLActivoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTIDContrato1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTApellidoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTDNIInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTNombreInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTCuitInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTLugarTrabajoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTActivoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(170, 170, 170)))))
        );
        jPInquilinosLayout.setVerticalGroup(
            jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInquilinosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLTituloInquilinos)
                .addGap(32, 32, 32)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBusquedaInquilinos)
                    .addComponent(jCBusquedaInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIDContrato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIdInquilinos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombreInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombreInquilinos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTApellidoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellidoInquilinos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDNIInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDNIInquilinos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCuitInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCuitInquilinos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTLugarTrabajoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLLugarTrabajoInquilinos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTActivoInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLActivoInquilinos))
                .addGap(58, 58, 58)
                .addGroup(jPInquilinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevoInquilinos)
                    .addComponent(jBModificarInquilinos)
                    .addComponent(jBEliminarInquilinos)
                    .addComponent(jBSalirInquilinos))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INQUILINOS", jPInquilinos);

        jPGarante.setBackground(new java.awt.Color(51, 51, 51));

        jLTituloGarante.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLTituloGarante.setForeground(new java.awt.Color(51, 204, 255));
        jLTituloGarante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloGarante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        jLTituloGarante.setText("  Formulario Garante");
        jLTituloGarante.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLBusquedaGarante.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLBusquedaGarante.setForeground(new java.awt.Color(51, 204, 255));
        jLBusquedaGarante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLBusquedaGarante.setText("Busqueda");
        jLBusquedaGarante.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jCBusquedaGarante.setBackground(new java.awt.Color(153, 153, 153));
        jCBusquedaGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

        jLIDGarante.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLIDGarante.setForeground(new java.awt.Color(51, 204, 255));
        jLIDGarante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLIDGarante.setText("ID Garante");
        jLIDGarante.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDGarante1.setBackground(new java.awt.Color(153, 153, 153));
        jTIDGarante1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDGarante1.setForeground(new java.awt.Color(51, 51, 51));
        jTIDGarante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDGarante1ActionPerformed(evt);
            }
        });

        jLNombreGarante.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLNombreGarante.setForeground(new java.awt.Color(51, 204, 255));
        jLNombreGarante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombreGarante.setText("Nombre");
        jLNombreGarante.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTNombreGarante.setBackground(new java.awt.Color(153, 153, 153));
        jTNombreGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTNombreGarante.setForeground(new java.awt.Color(51, 51, 51));
        jTNombreGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreGaranteActionPerformed(evt);
            }
        });

        jLApellidoGarante.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLApellidoGarante.setForeground(new java.awt.Color(51, 204, 255));
        jLApellidoGarante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLApellidoGarante.setText("Apellido");
        jLApellidoGarante.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTApellidoGarante.setBackground(new java.awt.Color(153, 153, 153));
        jTApellidoGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTApellidoGarante.setForeground(new java.awt.Color(51, 51, 51));
        jTApellidoGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoGaranteActionPerformed(evt);
            }
        });

        jLDNIGarante.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLDNIGarante.setForeground(new java.awt.Color(51, 204, 255));
        jLDNIGarante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDNIGarante.setText("DNI");
        jLDNIGarante.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTDNIGarante.setBackground(new java.awt.Color(153, 153, 153));
        jTDNIGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDNIGarante.setForeground(new java.awt.Color(51, 51, 51));
        jTDNIGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDNIGaranteActionPerformed(evt);
            }
        });

        jLDomicilio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLDomicilio.setForeground(new java.awt.Color(51, 204, 255));
        jLDomicilio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDomicilio.setText("Domicilio");
        jLDomicilio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTDomicilio.setBackground(new java.awt.Color(153, 153, 153));
        jTDomicilio.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDomicilio.setForeground(new java.awt.Color(51, 51, 51));
        jTDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDomicilioActionPerformed(evt);
            }
        });

        jLTelefonoGarante.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLTelefonoGarante.setForeground(new java.awt.Color(51, 204, 255));
        jLTelefonoGarante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTelefonoGarante.setText("Telefono");
        jLTelefonoGarante.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTTelefonoGarante.setBackground(new java.awt.Color(153, 153, 153));
        jTTelefonoGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTTelefonoGarante.setForeground(new java.awt.Color(51, 51, 51));
        jTTelefonoGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefonoGaranteActionPerformed(evt);
            }
        });

        jLActivoGarante.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLActivoGarante.setForeground(new java.awt.Color(51, 204, 255));
        jLActivoGarante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLActivoGarante.setText("Activo");
        jLActivoGarante.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTActivoGarante.setBackground(new java.awt.Color(153, 153, 153));
        jTActivoGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTActivoGarante.setForeground(new java.awt.Color(51, 51, 51));
        jTActivoGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTActivoGaranteActionPerformed(evt);
            }
        });

        jBNuevoGarante.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevoGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevoGarante.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevoGarante.setText("Nuevo");
        jBNuevoGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevoGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoGaranteActionPerformed(evt);
            }
        });

        jBModificarGarante.setBackground(new java.awt.Color(51, 51, 51));
        jBModificarGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificarGarante.setForeground(new java.awt.Color(51, 204, 255));
        jBModificarGarante.setText("Modificar");
        jBModificarGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificarGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarGaranteActionPerformed(evt);
            }
        });

        jBEliminarGarante.setBackground(new java.awt.Color(51, 51, 51));
        jBEliminarGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminarGarante.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminarGarante.setText("Eliminar");
        jBEliminarGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarGaranteActionPerformed(evt);
            }
        });

        jBSalirGarante.setBackground(new java.awt.Color(51, 51, 51));
        jBSalirGarante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalirGarante.setForeground(new java.awt.Color(51, 204, 255));
        jBSalirGarante.setText("Salir");
        jBSalirGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPGaranteLayout = new javax.swing.GroupLayout(jPGarante);
        jPGarante.setLayout(jPGaranteLayout);
        jPGaranteLayout.setHorizontalGroup(
            jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGaranteLayout.createSequentialGroup()
                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPGaranteLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLTituloGarante))
                    .addGroup(jPGaranteLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLBusquedaGarante)
                        .addGap(12, 12, 12)
                        .addComponent(jCBusquedaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPGaranteLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLIDGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTIDGarante1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPGaranteLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPGaranteLayout.createSequentialGroup()
                                    .addComponent(jLNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPGaranteLayout.createSequentialGroup()
                                    .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLApellidoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLDNIGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLTelefonoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLActivoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTDomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTDNIGarante, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTApellidoGarante)
                                        .addComponent(jTTelefonoGarante)
                                        .addComponent(jTActivoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPGaranteLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jBNuevoGarante)
                                .addGap(18, 18, 18)
                                .addComponent(jBModificarGarante)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminarGarante)
                                .addGap(18, 18, 18)
                                .addComponent(jBSalirGarante)))))
                .addGap(161, 161, 161))
        );
        jPGaranteLayout.setVerticalGroup(
            jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGaranteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPGaranteLayout.createSequentialGroup()
                        .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPGaranteLayout.createSequentialGroup()
                                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLDomicilio)
                                    .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
                            .addGroup(jPGaranteLayout.createSequentialGroup()
                                .addComponent(jLTituloGarante)
                                .addGap(32, 32, 32)
                                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPGaranteLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLBusquedaGarante))
                                    .addComponent(jCBusquedaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPGaranteLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLIDGarante))
                                    .addComponent(jTIDGarante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLNombreGarante)
                                    .addComponent(jTNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTApellidoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLApellidoGarante))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTDNIGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDNIGarante))
                                .addGap(38, 38, 38)))
                        .addComponent(jTTelefonoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLTelefonoGarante))
                .addGap(7, 7, 7)
                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTActivoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLActivoGarante))
                .addGap(41, 41, 41)
                .addGroup(jPGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBNuevoGarante)
                    .addComponent(jBModificarGarante)
                    .addComponent(jBEliminarGarante)
                    .addComponent(jBSalirGarante))
                .addContainerGap())
        );

        jTabbedPane1.addTab("GARANTES", jPGarante);

        jPInspector.setBackground(new java.awt.Color(51, 51, 51));

        jLTituloInspector.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLTituloInspector.setForeground(new java.awt.Color(51, 204, 255));
        jLTituloInspector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloInspector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        jLTituloInspector.setText("  Formulario Inspector");
        jLTituloInspector.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLBusquedaInspector.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLBusquedaInspector.setForeground(new java.awt.Color(51, 204, 255));
        jLBusquedaInspector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBusquedaInspector.setText("Busqueda");
        jLBusquedaInspector.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jCBusquedaInspector.setBackground(new java.awt.Color(153, 153, 153));
        jCBusquedaInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

        jBNuevoInspector.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevoInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevoInspector.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevoInspector.setText("Nuevo");
        jBNuevoInspector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevoInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoInspectorActionPerformed(evt);
            }
        });

        jBModificarInspector.setBackground(new java.awt.Color(51, 51, 51));
        jBModificarInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificarInspector.setForeground(new java.awt.Color(51, 204, 255));
        jBModificarInspector.setText("Modificar");
        jBModificarInspector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificarInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarInspectorActionPerformed(evt);
            }
        });

        jBEliminarInspector.setBackground(new java.awt.Color(51, 51, 51));
        jBEliminarInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminarInspector.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminarInspector.setText("Eliminar");
        jBEliminarInspector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarInspectorActionPerformed(evt);
            }
        });

        jBSalirInspector.setBackground(new java.awt.Color(51, 51, 51));
        jBSalirInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalirInspector.setForeground(new java.awt.Color(51, 204, 255));
        jBSalirInspector.setText("Salir");
        jBSalirInspector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLIDInspector.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLIDInspector.setForeground(new java.awt.Color(51, 204, 255));
        jLIDInspector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLIDInspector.setText("ID Inspector");
        jLIDInspector.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTIDInspector.setBackground(new java.awt.Color(153, 153, 153));
        jTIDInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDInspector.setForeground(new java.awt.Color(51, 51, 51));
        jTIDInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDInspectorActionPerformed(evt);
            }
        });

        jLMatriculaInspector.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLMatriculaInspector.setForeground(new java.awt.Color(51, 204, 255));
        jLMatriculaInspector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMatriculaInspector.setText("Matricula");
        jLMatriculaInspector.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTMatriculaInspector.setBackground(new java.awt.Color(153, 153, 153));
        jTMatriculaInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTMatriculaInspector.setForeground(new java.awt.Color(51, 51, 51));
        jTMatriculaInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMatriculaInspectorActionPerformed(evt);
            }
        });

        jLNombreInspector.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLNombreInspector.setForeground(new java.awt.Color(51, 204, 255));
        jLNombreInspector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombreInspector.setText("Nombre");
        jLNombreInspector.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTNombreInspector.setBackground(new java.awt.Color(153, 153, 153));
        jTNombreInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTNombreInspector.setForeground(new java.awt.Color(51, 51, 51));
        jTNombreInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreInspectorActionPerformed(evt);
            }
        });

        jLApellidoInspector.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLApellidoInspector.setForeground(new java.awt.Color(51, 204, 255));
        jLApellidoInspector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLApellidoInspector.setText("Apellido");
        jLApellidoInspector.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTApellidoInspector.setBackground(new java.awt.Color(153, 153, 153));
        jTApellidoInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTApellidoInspector.setForeground(new java.awt.Color(51, 51, 51));
        jTApellidoInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoInspectorActionPerformed(evt);
            }
        });

        jLTelefonoInspector.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLTelefonoInspector.setForeground(new java.awt.Color(51, 204, 255));
        jLTelefonoInspector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTelefonoInspector.setText("Telefono");
        jLTelefonoInspector.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTTelefonoInspector.setBackground(new java.awt.Color(153, 153, 153));
        jTTelefonoInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTTelefonoInspector.setForeground(new java.awt.Color(51, 51, 51));
        jTTelefonoInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefonoInspectorActionPerformed(evt);
            }
        });

        jLActivoInspector.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLActivoInspector.setForeground(new java.awt.Color(51, 204, 255));
        jLActivoInspector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLActivoInspector.setText("Activo");
        jLActivoInspector.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTActivoInspector.setBackground(new java.awt.Color(153, 153, 153));
        jTActivoInspector.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTActivoInspector.setForeground(new java.awt.Color(51, 51, 51));
        jTActivoInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTActivoInspectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPInspectorLayout = new javax.swing.GroupLayout(jPInspector);
        jPInspector.setLayout(jPInspectorLayout);
        jPInspectorLayout.setHorizontalGroup(
            jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInspectorLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTituloInspector)
                    .addGroup(jPInspectorLayout.createSequentialGroup()
                        .addComponent(jLBusquedaInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBusquedaInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPInspectorLayout.createSequentialGroup()
                        .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPInspectorLayout.createSequentialGroup()
                                .addComponent(jBNuevoInspector)
                                .addGap(18, 18, 18)
                                .addComponent(jBModificarInspector))
                            .addComponent(jLIDInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLMatriculaInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLActivoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTelefonoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLApellidoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNombreInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTMatriculaInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTIDInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTNombreInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTApellidoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTTelefonoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTActivoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPInspectorLayout.createSequentialGroup()
                                .addComponent(jBEliminarInspector)
                                .addGap(18, 18, 18)
                                .addComponent(jBSalirInspector)))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPInspectorLayout.setVerticalGroup(
            jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInspectorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLTituloInspector)
                .addGap(36, 36, 36)
                .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBusquedaInspector)
                    .addComponent(jCBusquedaInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIDInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIDInspector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTMatriculaInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMatriculaInspector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombreInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombreInspector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTApellidoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellidoInspector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTelefonoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefonoInspector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTActivoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLActivoInspector))
                .addGap(74, 74, 74)
                .addGroup(jPInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevoInspector)
                    .addComponent(jBModificarInspector)
                    .addComponent(jBEliminarInspector)
                    .addComponent(jBSalirInspector))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INSPECTORES", jPInspector);

        javax.swing.GroupLayout jPCardListadosLayout = new javax.swing.GroupLayout(jPCardListados);
        jPCardListados.setLayout(jPCardListadosLayout);
        jPCardListadosLayout.setHorizontalGroup(
            jPCardListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCardListadosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPBarraNavegador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPCardListadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPCardListadosLayout.setVerticalGroup(
            jPCardListadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCardListadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPBarraNavegador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
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
        jPLogin.setVisible(false);
        bg.setVisible(false);

    }//GEN-LAST:event_jLPropiedadesMouseClicked

    private void jLPropietariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropietariosMouseClicked
        paraPropietariosTrue();
        jPCardPropietarios.setVisible(true);
        jPPropiedades.setVisible(false);
        jPCardAlquileres.setVisible(false);
        jPCardListados.setVisible(false);
        jPCardFondo.setVisible(false);
        jPLogin.setVisible(false);
        bg.setVisible(false);

    }//GEN-LAST:event_jLPropietariosMouseClicked

    private void jLAlquileresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlquileresMouseClicked
        paraAlquileresTrue();
        jPCardFondo.setVisible(false);
        jPCardPropietarios.setVisible(false);
        jPPropiedades.setVisible(false);
        jPCardAlquileres.setVisible(true);
        jPCardListados.setVisible(false);
        jPLogin.setVisible(false);
        bg.setVisible(false);


    }//GEN-LAST:event_jLAlquileresMouseClicked

    private void jListadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListadosMouseClicked
        
        jPCardPropietarios.setVisible(false);
        jPPropiedades.setVisible(false);
        jPCardAlquileres.setVisible(false);
        jPCardListados.setVisible(true);
        jPCardFondo.setVisible(false);
        jPLogin.setVisible(false);
        bg.setVisible(false);
        
        if(jPInquilinos.isVisible()==true && jPGarante.isVisible()==false && jPInspector.isVisible()==false){
        paraListadosInquilinosTrue();
        paraListadosGarante();
        paraListadosInspector();
//        } else if(jPGarante.isVisible()==true && jPInquilinos.isVisible()==false && jPInspector.isVisible()==false){
//            paraListadosGaranteTrue();
//            paraListadosInquilinos();
//            paraListadosInspector();
//        } else if(jPInspector.isVisible()==true && jPGarante.isVisible()==false && jPInquilinos.isVisible()==false){
//            paraListadosInspectorTrue();
//            paraListadosGarante();
//            paraListadosInquilinos();
        }

    }//GEN-LAST:event_jListadosMouseClicked

    private void jLLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLoginMouseClicked
        bg.setVisible(true);
        jPLogin1.setVisible(true);
        jPCardPropietarios.setVisible(false);
        jPPropiedades.setVisible(false);
        jPCardAlquileres.setVisible(false);
        jPCardListados.setVisible(false);
        jPCardFondo.setVisible(false);
    }//GEN-LAST:event_jLLoginMouseClicked

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTActivoActionPerformed


    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
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

    private void jLLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLoginMouseEntered
        jLLogin.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLLoginMouseEntered

    private void jLLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLoginMouseExited
        jLLogin.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLLoginMouseExited

    private void jLPropiedadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropiedadesMouseEntered
        jLPropiedades.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLPropiedadesMouseEntered

    private void jLPropiedadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropiedadesMouseExited
        jLPropiedades.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLPropiedadesMouseExited

    private void jLPropietariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropietariosMouseEntered
        jLPropietarios.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLPropietariosMouseEntered

    private void jLPropietariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPropietariosMouseExited
        jLPropietarios.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLPropietariosMouseExited

    private void jLAlquileresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlquileresMouseEntered
        jLAlquileres.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLAlquileresMouseEntered

    private void jLAlquileresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAlquileresMouseExited
        jLAlquileres.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLAlquileresMouseExited

    private void jListadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListadosMouseEntered
        jListados.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jListadosMouseEntered

    private void jListadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListadosMouseExited
        jListados.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jListadosMouseExited

    private void jLSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseEntered
        jLSalir.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jLSalirMouseEntered

    private void jLSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseExited
        jLSalir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLSalirMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingrese nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.white);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");

            passTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.white);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese nombre de usuaio");
            userTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + userTxt.getText() + "\nContraseña: " + String.valueOf(passTxt.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void jLSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseClicked
         String mensajeSalida = "¿Estás seguro que quieres salir?";
  String tituloSalidaTraducido="Salir";
 
    int respuesta = JOptionPane.showConfirmDialog(this, mensajeSalida, tituloSalidaTraducido, JOptionPane.YES_NO_OPTION);

    if (respuesta == JOptionPane.YES_OPTION) {
        this.dispose(); // cierra la ventana
    
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jLSalirMouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        int SelectPestaña = jTabbedPane1.getSelectedIndex();
        if(SelectPestaña == 0){
            paraListadosInquilinosTrue();
        } else if(SelectPestaña == 1){
            paraListadosGaranteTrue();
        } else if(SelectPestaña == 2){
            paraListadosInspectorTrue();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTActivoInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTActivoInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTActivoInspectorActionPerformed

    private void jTTelefonoInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefonoInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefonoInspectorActionPerformed

    private void jTApellidoInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoInspectorActionPerformed

    private void jTNombreInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreInspectorActionPerformed

    private void jTMatriculaInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMatriculaInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMatriculaInspectorActionPerformed

    private void jTIDInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDInspectorActionPerformed

    private void jBEliminarInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEliminarInspectorActionPerformed

    private void jBModificarInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModificarInspectorActionPerformed

    private void jBNuevoInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoInspectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNuevoInspectorActionPerformed

    private void jTActivoGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTActivoGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTActivoGaranteActionPerformed

    private void jTDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDomicilioActionPerformed

    private void jTDNIGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDNIGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDNIGaranteActionPerformed

    private void jTApellidoGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoGaranteActionPerformed

    private void jTNombreGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreGaranteActionPerformed

    private void jTIDGarante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDGarante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDGarante1ActionPerformed

    private void jTActivoInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTActivoInquilinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTActivoInquilinosActionPerformed

    private void jTCuitInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCuitInquilinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCuitInquilinosActionPerformed

    private void jTLugarTrabajoInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLugarTrabajoInquilinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLugarTrabajoInquilinosActionPerformed

    private void jTDNIInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDNIInquilinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDNIInquilinosActionPerformed

    private void jTApellidoInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoInquilinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoInquilinosActionPerformed

    private void jTNombreInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreInquilinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreInquilinosActionPerformed

    private void jBEliminarInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarInquilinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEliminarInquilinosActionPerformed

    private void jTIDContrato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDContrato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDContrato1ActionPerformed

    private void jBNuevoGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNuevoGaranteActionPerformed

    private void jBModificarGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModificarGaranteActionPerformed

    private void jBEliminarGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEliminarGaranteActionPerformed

    private void jTTelefonoGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefonoGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefonoGaranteActionPerformed

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
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBEliminarGarante;
    private javax.swing.JButton jBEliminarInquilinos;
    private javax.swing.JButton jBEliminarInspector;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBModificarGarante;
    private javax.swing.JButton jBModificarInquilinos;
    private javax.swing.JButton jBModificarInspector;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBNuevo1;
    private javax.swing.JButton jBNuevo2;
    private javax.swing.JButton jBNuevo3;
    private javax.swing.JButton jBNuevo4;
    private javax.swing.JButton jBNuevo5;
    private javax.swing.JButton jBNuevo6;
    private javax.swing.JButton jBNuevo7;
    private javax.swing.JButton jBNuevo8;
    private javax.swing.JButton jBNuevoGarante;
    private javax.swing.JButton jBNuevoInquilinos;
    private javax.swing.JButton jBNuevoInspector;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSalirGarante;
    private javax.swing.JButton jBSalirInquilinos;
    private javax.swing.JButton jBSalirInspector;
    private javax.swing.JComboBox<Propiedad> jCBusquedaContrato;
    private javax.swing.JComboBox<Propiedad> jCBusquedaGarante;
    private javax.swing.JComboBox<Propiedad> jCBusquedaInquilinos;
    private javax.swing.JComboBox<Propiedad> jCBusquedaInspector;
    private javax.swing.JComboBox<Propiedad> jCBusquedaPropiedades;
    private javax.swing.JComboBox<Propiedad> jCBusquedaPropiedades1;
    private com.toedter.calendar.JDateChooser jDFechaContrato;
    private com.toedter.calendar.JDateChooser jDFechaFin;
    private com.toedter.calendar.JDateChooser jDFechaInicio;
    private javax.swing.JLabel jLActivoGarante;
    private javax.swing.JLabel jLActivoInquilinos;
    private javax.swing.JLabel jLActivoInspector;
    private javax.swing.JLabel jLAlquileres;
    private javax.swing.JLabel jLApellidoGarante;
    private javax.swing.JLabel jLApellidoInquilinos;
    private javax.swing.JLabel jLApellidoInspector;
    private javax.swing.JLabel jLBusquedaGarante;
    private javax.swing.JLabel jLBusquedaInquilinos;
    private javax.swing.JLabel jLBusquedaInspector;
    private javax.swing.JLabel jLCuitInquilinos;
    private javax.swing.JLabel jLDNIGarante;
    private javax.swing.JLabel jLDNIInquilinos;
    private javax.swing.JLabel jLDomicilio;
    private javax.swing.JLabel jLIDGarante;
    private javax.swing.JLabel jLIDInspector;
    private javax.swing.JLabel jLIdInquilinos;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLLugarTrabajoInquilinos;
    private javax.swing.JLabel jLMatriculaInspector;
    private javax.swing.JLabel jLNombreGarante;
    private javax.swing.JLabel jLNombreInquilinos;
    private javax.swing.JLabel jLNombreInspector;
    private javax.swing.JLabel jLPropiedades;
    private javax.swing.JLabel jLPropietarios;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JLabel jLTelefonoGarante;
    private javax.swing.JLabel jLTelefonoInspector;
    private javax.swing.JLabel jLTituloAlquiler;
    private javax.swing.JLabel jLTituloGarante;
    private javax.swing.JLabel jLTituloInquilinos;
    private javax.swing.JLabel jLTituloInspector;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPBarraNavegador;
    private javax.swing.JPanel jPBarraNavegador1;
    private javax.swing.JPanel jPBarraNavegador2;
    private javax.swing.JPanel jPBarraNavegador3;
    private javax.swing.JPanel jPCardAlquileres;
    private javax.swing.JPanel jPCardFondo;
    private javax.swing.JPanel jPCardListados;
    private javax.swing.JPanel jPCardPropietarios;
    private javax.swing.JPanel jPCards;
    private javax.swing.JPanel jPGarante;
    private javax.swing.JPanel jPInquilinos;
    private javax.swing.JPanel jPInspector;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPLogin1;
    private javax.swing.JPanel jPMenuLateral;
    private javax.swing.JPanel jPPropiedades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTActivo;
    private javax.swing.JTextField jTActivoGarante;
    private javax.swing.JTextField jTActivoInquilinos;
    private javax.swing.JTextField jTActivoInspector;
    private javax.swing.JTextField jTAltura;
    private javax.swing.JTextField jTAntiguedad;
    private javax.swing.JTextField jTApellidoGarante;
    private javax.swing.JTextField jTApellidoInquilinos;
    private javax.swing.JTextField jTApellidoInspector;
    private javax.swing.JTextField jTCuitInquilinos;
    private javax.swing.JTextField jTDNIGarante;
    private javax.swing.JTextField jTDNIInquilinos;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTDisponibilidad;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTEstado;
    private javax.swing.JTextField jTIDContrato;
    private javax.swing.JTextField jTIDContrato1;
    private javax.swing.JTextField jTIDGarante;
    private javax.swing.JTextField jTIDGarante1;
    private javax.swing.JTextField jTIDInquilino;
    private javax.swing.JTextField jTIDInspector;
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
    private javax.swing.JTextField jTLugarTrabajoInquilinos;
    private javax.swing.JTextField jTMatriculaInspector;
    private javax.swing.JTextField jTNombreGarante;
    private javax.swing.JTextField jTNombreInquilinos;
    private javax.swing.JTextField jTNombreInspector;
    private javax.swing.JTextArea jTObservaciones;
    private javax.swing.JTextField jTPrecioTasado;
    private javax.swing.JTextField jTServicios;
    private javax.swing.JTextField jTSuperTotal;
    private javax.swing.JTextField jTTelefonoGarante;
    private javax.swing.JTextField jTTelefonoInspector;
    private javax.swing.JTextField jTTipo;
    private javax.swing.JTextField jTVigencia;
    private javax.swing.JTextField jTZona;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables

    public void paraPropiedades() {
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

    public void paraPropiedadesTrue() {
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

    public void paraPropietarios() {
        jCBusquedaPropiedades1.setVisible(false);
        jTIDPropietario.setVisible(false);
        jTIDPropietarios2.setVisible(false);
        jTIDPropietarios3.setVisible(false);
        jTIDPropietarios4.setVisible(false);
        jTIDPropietarios5.setVisible(false);
        jTIDPropietarios6.setVisible(false);
        jTIDPropietarios7.setVisible(false);
        jBNuevo3.setVisible(false);
        jBNuevo1.setVisible(false);
        jBNuevo2.setVisible(false);
        jBNuevo4.setVisible(false);
    }

    public void paraPropietariosTrue() {
        jCBusquedaPropiedades1.setVisible(true);
        jTIDPropietario.setVisible(true);
        jTIDPropietarios2.setVisible(true);
        jTIDPropietarios3.setVisible(true);
        jTIDPropietarios4.setVisible(true);
        jTIDPropietarios5.setVisible(true);
        jTIDPropietarios6.setVisible(true);
        jTIDPropietarios7.setVisible(true);
        jBNuevo3.setVisible(true);
        jBNuevo1.setVisible(true);
        jBNuevo2.setVisible(true);
        jBNuevo4.setVisible(true);
    }

    public void paraAlquileres() {
        jCBusquedaContrato.setVisible(false);
        jTIDPropietario3.setVisible(false);
        jTIDPropiedad.setVisible(false);
        jTIDContrato.setVisible(false);
        jTIDInquilino.setVisible(false);
        jTIDGarante.setVisible(false);
        jTIDVendedor.setVisible(false);
        jTVigencia.setVisible(false);
        jTActivo.setVisible(false);
        jDFechaInicio.setVisible(false);
        jDFechaFin.setVisible(false);
        jDFechaContrato.setVisible(false);
        jBNuevo7.setVisible(false);
        jBNuevo6.setVisible(false);
        jBNuevo5.setVisible(false);
        jBNuevo8.setVisible(false);
    }

    public void paraAlquileresTrue() {
        jCBusquedaContrato.setVisible(true);
        jTIDPropietario3.setVisible(true);
        jTIDPropiedad.setVisible(true);
        jTIDContrato.setVisible(true);
        jTIDInquilino.setVisible(true);
        jTIDGarante.setVisible(true);
        jTIDVendedor.setVisible(true);
        jTVigencia.setVisible(true);
        jTActivo.setVisible(true);
        jDFechaInicio.setVisible(true);
        jDFechaFin.setVisible(true);
        jDFechaContrato.setVisible(true);
        jBNuevo7.setVisible(true);
        jBNuevo6.setVisible(true);
        jBNuevo5.setVisible(true);
        jBNuevo8.setVisible(true);
    }

    public void paraListadosInquilinos() {
        jTabbedPane1.setVisible(false);
        jPInquilinos.setVisible(false);
        jLTituloInquilinos.setVisible(false);
        jLBusquedaInquilinos.setVisible(false);
        jCBusquedaInquilinos.setVisible(false);
        jLIdInquilinos.setVisible(false);
        jTIDContrato1.setVisible(false);
        jBNuevoInquilinos.setVisible(false);
        jBModificarInquilinos.setVisible(false);
        jBEliminarInquilinos.setVisible(false);
        jBSalirInquilinos.setVisible(false);
        jTNombreInquilinos.setVisible(false);
        jLNombreInquilinos.setVisible(false);
        jLApellidoInquilinos.setVisible(false);
        jTApellidoInquilinos.setVisible(false);
        jLDNIInquilinos.setVisible(false);
        jTDNIInquilinos.setVisible(false);
        jLCuitInquilinos.setVisible(false);
        jTLugarTrabajoInquilinos.setVisible(false);
        jLLugarTrabajoInquilinos.setVisible(false);
        jTCuitInquilinos.setVisible(false);
        jLActivoInquilinos.setVisible(false);
        jTActivoInquilinos.setVisible(false);

    }

    public void paraListadosGarante() {
        jPGarante.setVisible(false);
        jLTituloGarante.setVisible(false);
        jLBusquedaGarante.setVisible(false);
        jCBusquedaGarante.setVisible(false);
        jBNuevoGarante.setVisible(false);
        jBModificarGarante.setVisible(false);
        jBEliminarGarante.setVisible(false);
        jBSalirGarante.setVisible(false);
        jLIDGarante.setVisible(false);
        jTIDGarante1.setVisible(false);
        jLNombreGarante.setVisible(false);
        jTNombreGarante.setVisible(false);
        jLApellidoGarante.setVisible(false);
        jTApellidoGarante.setVisible(false);
        jLDNIGarante.setVisible(false);
        jTDNIGarante.setVisible(false);
        jLDomicilio.setVisible(false);
        jTDomicilio.setVisible(false);
        jLTelefonoGarante.setVisible(false);
        jLActivoGarante.setVisible(false);
        jTActivoGarante.setVisible(false);
    }

    public void paraListadosInspector() {
        jPInspector.setVisible(false);
        jLTituloInspector.setVisible(false);
        jLBusquedaInspector.setVisible(false);
        jCBusquedaInspector.setVisible(false);
        jBNuevoInspector.setVisible(false);
        jBModificarInspector.setVisible(false);
        jBEliminarInspector.setVisible(false);
        jBSalirInspector.setVisible(false);
        jLIDInspector.setVisible(false);
        jTIDInspector.setVisible(false);
        jLMatriculaInspector.setVisible(false);
        jTMatriculaInspector.setVisible(false);
        jLNombreInspector.setVisible(false);
        jTNombreInspector.setVisible(false);
        jLApellidoInspector.setVisible(false);
        jTApellidoInspector.setVisible(false);
        jLTelefonoInspector.setVisible(false);
        jTTelefonoInspector.setVisible(false);
        jLActivoInspector.setVisible(false);
        jTActivoInspector.setVisible(false);
    }

    public void paraListadosInquilinosTrue() {
        jTabbedPane1.setVisible(true);
        jPBarraNavegador3.setVisible(true);
        jPInquilinos.setVisible(true);
        jLTituloInquilinos.setVisible(true);
        jLBusquedaInquilinos.setVisible(true);
        jCBusquedaInquilinos.setVisible(true);
        jLIdInquilinos.setVisible(true);
        jTIDContrato1.setVisible(true);
        jBNuevoInquilinos.setVisible(true);
        jBModificarInquilinos.setVisible(true);
        jBEliminarInquilinos.setVisible(true);
        jBSalirInquilinos.setVisible(true);
        jTNombreInquilinos.setVisible(true);
        jLNombreInquilinos.setVisible(true);
        jLApellidoInquilinos.setVisible(true);
        jTApellidoInquilinos.setVisible(true);
        jLDNIInquilinos.setVisible(true);
        jTDNIInquilinos.setVisible(true);
        jLCuitInquilinos.setVisible(true);
        jTLugarTrabajoInquilinos.setVisible(true);
        jLLugarTrabajoInquilinos.setVisible(true);
        jTCuitInquilinos.setVisible(true);
        jLActivoInquilinos.setVisible(true);
        jTActivoInquilinos.setVisible(true);

    }

    public void paraListadosGaranteTrue() {
        jPGarante.setVisible(true);
        jLTituloGarante.setVisible(true);
        jLBusquedaGarante.setVisible(true);
        jCBusquedaGarante.setVisible(true);
        jBNuevoGarante.setVisible(true);
        jBModificarGarante.setVisible(true);
        jBEliminarGarante.setVisible(true);
        jBSalirGarante.setVisible(true);
        jLIDGarante.setVisible(true);
        jTIDGarante1.setVisible(true);
        jLNombreGarante.setVisible(true);
        jTNombreGarante.setVisible(true);
        jLApellidoGarante.setVisible(true);
        jTApellidoGarante.setVisible(true);
        jLDNIGarante.setVisible(true);
        jTDNIGarante.setVisible(true);
        jLDomicilio.setVisible(true);
        jTDomicilio.setVisible(true);
        jLTelefonoGarante.setVisible(true);
        jLActivoGarante.setVisible(true);
        jTActivoGarante.setVisible(true);

    }

    public void paraListadosInspectorTrue() {
        jPInspector.setVisible(true);
        jLTituloInspector.setVisible(true);
        jLBusquedaInspector.setVisible(true);
        jCBusquedaInspector.setVisible(true);
        jBNuevoInspector.setVisible(true);
        jBModificarInspector.setVisible(true);
        jBEliminarInspector.setVisible(true);
        jBSalirInspector.setVisible(true);
        jLIDInspector.setVisible(true);
        jTIDInspector.setVisible(true);
        jLMatriculaInspector.setVisible(true);
        jTMatriculaInspector.setVisible(true);
        jLNombreInspector.setVisible(true);
        jTNombreInspector.setVisible(true);
        jLApellidoInspector.setVisible(true);
        jTApellidoInspector.setVisible(true);
        jLTelefonoInspector.setVisible(true);
        jTTelefonoInspector.setVisible(true);
        jLActivoInspector.setVisible(true);
        jTActivoInspector.setVisible(true);
    }
}
