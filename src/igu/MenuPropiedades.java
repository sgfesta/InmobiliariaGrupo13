/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import entidades.Estado;
import entidades.Inspector;
import entidades.Propiedad;
import entidades.Propietario;
import entidades.TipoPropiedad;
import entidades.Zona;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import persistencia.EstadoData;
import persistencia.InspectorData;
import persistencia.PropiedadData;
import persistencia.PropietarioData;
import persistencia.TipoPropiedadData;
import persistencia.ZonaData;

public class MenuPropiedades extends javax.swing.JInternalFrame {

    private int idPropietarioSeleccionado = -1;
    PropiedadData pd = new PropiedadData();
    PropietarioData propd=new PropietarioData();

    public MenuPropiedades() {
        initComponents();
        QuitarLaBarraTitulo();
        cargarComboTipo();
        cargarComboZona();
        cargarComboEstado();
        cargarComboInspector();
        cargarComboPropietarios();

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPropiedades = new javax.swing.JPanel();
        jLTituloPropiedades = new javax.swing.JLabel();
        jLIDPropiedades = new javax.swing.JLabel();
        jLDireccionPropiedades = new javax.swing.JLabel();
        jLAlturaPropiedades = new javax.swing.JLabel();
        jLTipoPropiedades = new javax.swing.JLabel();
        jLSuperTotalPropiedades = new javax.swing.JLabel();
        jLPrecioTasadoPropiedades = new javax.swing.JLabel();
        jLAntiguedadPropiedades = new javax.swing.JLabel();
        jLInspectorPropiedades = new javax.swing.JLabel();
        jLZonaPropiedades = new javax.swing.JLabel();
        jTDireccionPropiedades = new javax.swing.JTextField();
        jTAlturaPropiedades = new javax.swing.JTextField();
        jTSuperTotalPropiedades = new javax.swing.JTextField();
        jTPrecioTasadoPropiedades = new javax.swing.JTextField();
        jTAntiguedadPropiedad = new javax.swing.JTextField();
        jLEstadoPropiedad = new javax.swing.JLabel();
        jLDisponibilidadPropiedad = new javax.swing.JLabel();
        jLActivoPropiedades = new javax.swing.JLabel();
        jLObservacionesPropiedades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTObservacionesPropiedades = new javax.swing.JTextArea();
        jBNuevoPropiedades = new javax.swing.JButton();
        jBModificarPropiedades = new javax.swing.JButton();
        jBEliminarPropiedades = new javax.swing.JButton();
        jBSalirPropiedades = new javax.swing.JButton();
        jPBarraNavegador = new javax.swing.JPanel();
        jLNavegacionEnBarra = new javax.swing.JLabel();
        jRDisponibilidadPropiedades = new javax.swing.JRadioButton();
        jCListaTipoPropiedades = new javax.swing.JComboBox<>();
        jRActivoPropiedades1 = new javax.swing.JRadioButton();
        jCListaPropietarios = new javax.swing.JComboBox<>();
        jCListarEstadoPropiedades = new javax.swing.JComboBox<>();
        jCListaInspectoresPropiedades = new javax.swing.JComboBox<>();
        jCListarZonaPropiedades = new javax.swing.JComboBox<>();
        jCListaPropiedades2 = new javax.swing.JComboBox<>();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPPropiedades.setBackground(new java.awt.Color(55, 55, 54));
        jPPropiedades.setMinimumSize(new java.awt.Dimension(748, 635));
        jPPropiedades.setPreferredSize(new java.awt.Dimension(748, 635));

        jLTituloPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLTituloPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLTituloPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloPropiedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.png"))); // NOI18N
        jLTituloPropiedades.setText("  Formulario Propiedades");
        jLTituloPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLIDPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLIDPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLIDPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLIDPropiedades.setText("ID Propietario");

        jLDireccionPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLDireccionPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLDireccionPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDireccionPropiedades.setText("Direccion");
        jLDireccionPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLAlturaPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLAlturaPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLAlturaPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLAlturaPropiedades.setText("Altura");
        jLAlturaPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLTipoPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLTipoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLTipoPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLTipoPropiedades.setText("Tipo");
        jLTipoPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLSuperTotalPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLSuperTotalPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLSuperTotalPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLSuperTotalPropiedades.setText("Super. Total");
        jLSuperTotalPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLPrecioTasadoPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLPrecioTasadoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLPrecioTasadoPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPrecioTasadoPropiedades.setText("Precio Tasado");
        jLPrecioTasadoPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLAntiguedadPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLAntiguedadPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLAntiguedadPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLAntiguedadPropiedades.setText("Antiguedad");
        jLAntiguedadPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLInspectorPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLInspectorPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLInspectorPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLInspectorPropiedades.setText("Inspector");

        jLZonaPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLZonaPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLZonaPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLZonaPropiedades.setText("Zona");

        jTDireccionPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTDireccionPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDireccionPropiedades.setForeground(new java.awt.Color(51, 51, 51));

        jTAlturaPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTAlturaPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAlturaPropiedades.setForeground(new java.awt.Color(51, 51, 51));

        jTSuperTotalPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTSuperTotalPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTSuperTotalPropiedades.setForeground(new java.awt.Color(51, 51, 51));

        jTPrecioTasadoPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTPrecioTasadoPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTPrecioTasadoPropiedades.setForeground(new java.awt.Color(51, 51, 51));

        jTAntiguedadPropiedad.setBackground(new java.awt.Color(153, 153, 153));
        jTAntiguedadPropiedad.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAntiguedadPropiedad.setForeground(new java.awt.Color(51, 51, 51));

        jLEstadoPropiedad.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLEstadoPropiedad.setForeground(new java.awt.Color(51, 204, 255));
        jLEstadoPropiedad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLEstadoPropiedad.setText("Estado");
        jLEstadoPropiedad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLDisponibilidadPropiedad.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLDisponibilidadPropiedad.setForeground(new java.awt.Color(51, 204, 255));
        jLDisponibilidadPropiedad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDisponibilidadPropiedad.setText("Disponibilidad");
        jLDisponibilidadPropiedad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLActivoPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLActivoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLActivoPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLActivoPropiedades.setText("Activo");
        jLActivoPropiedades.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLObservacionesPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLObservacionesPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLObservacionesPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLObservacionesPropiedades.setText("Observaciones");
        jLObservacionesPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTObservacionesPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTObservacionesPropiedades.setColumns(20);
        jTObservacionesPropiedades.setRows(5);
        jScrollPane1.setViewportView(jTObservacionesPropiedades);

        jBNuevoPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevoPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevoPropiedades.setText("Nuevo");
        jBNuevoPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevoPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoPropiedadesActionPerformed(evt);
            }
        });

        jBModificarPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jBModificarPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificarPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBModificarPropiedades.setText("Modificar");
        jBModificarPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificarPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarPropiedadesActionPerformed(evt);
            }
        });

        jBEliminarPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jBEliminarPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminarPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminarPropiedades.setText("Eliminar");
        jBEliminarPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarPropiedadesActionPerformed(evt);
            }
        });

        jBSalirPropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jBSalirPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalirPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBSalirPropiedades.setText("Salir");
        jBSalirPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalirPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirPropiedadesActionPerformed(evt);
            }
        });

        jPBarraNavegador.setBackground(new java.awt.Color(153, 153, 153));

        jLNavegacionEnBarra.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLNavegacionEnBarra.setForeground(new java.awt.Color(255, 255, 255));
        jLNavegacionEnBarra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLNavegacionEnBarra.setText("Inicio > Propiedades");
        jLNavegacionEnBarra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPBarraNavegadorLayout = new javax.swing.GroupLayout(jPBarraNavegador);
        jPBarraNavegador.setLayout(jPBarraNavegadorLayout);
        jPBarraNavegadorLayout.setHorizontalGroup(
            jPBarraNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNavegacionEnBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPBarraNavegadorLayout.setVerticalGroup(
            jPBarraNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNavegacionEnBarra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRDisponibilidadPropiedades.setSelected(true);
        jRDisponibilidadPropiedades.setText("Activo");

        jCListaTipoPropiedades.setBackground(new java.awt.Color(153, 153, 153));

        jRActivoPropiedades1.setSelected(true);
        jRActivoPropiedades1.setText("Activo");

        jCListaPropietarios.setBackground(new java.awt.Color(153, 153, 153));
        jCListaPropietarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCListaPropietariosItemStateChanged(evt);
            }
        });
        jCListaPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCListaPropietariosActionPerformed(evt);
            }
        });

        jCListarEstadoPropiedades.setBackground(new java.awt.Color(153, 153, 153));

        jCListaInspectoresPropiedades.setBackground(new java.awt.Color(153, 153, 153));

        jCListarZonaPropiedades.setBackground(new java.awt.Color(153, 153, 153));

        jCListaPropiedades2.setBackground(new java.awt.Color(153, 153, 153));
        jCListaPropiedades2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCListaPropiedades2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPropiedadesLayout = new javax.swing.GroupLayout(jPPropiedades);
        jPPropiedades.setLayout(jPPropiedadesLayout);
        jPPropiedadesLayout.setHorizontalGroup(
            jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPBarraNavegador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLTituloPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLDireccionPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jTDireccionPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLDisponibilidadPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jRDisponibilidadPropiedades))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLAlturaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSuperTotalPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTAlturaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTSuperTotalPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLActivoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jRActivoPropiedades1))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLPrecioTasadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jTPrecioTasadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jLObservacionesPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                .addComponent(jLIDPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jCListaPropiedades2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLAntiguedadPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLTipoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLInspectorPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLZonaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLEstadoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTAntiguedadPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCListaTipoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCListaInspectoresPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCListarZonaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCListarEstadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPropiedadesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBNuevoPropiedades)
                .addGap(20, 20, 20)
                .addComponent(jBModificarPropiedades)
                .addGap(22, 22, 22)
                .addComponent(jBEliminarPropiedades)
                .addGap(20, 20, 20)
                .addComponent(jBSalirPropiedades)
                .addGap(192, 192, 192))
        );
        jPPropiedadesLayout.setVerticalGroup(
            jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPropiedadesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPBarraNavegador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLTituloPropiedades)
                .addGap(28, 28, 28)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIDPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCListaPropiedades2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDireccionPropiedades)
                    .addComponent(jTDireccionPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDisponibilidadPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRDisponibilidadPropiedades))
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addComponent(jLAlturaPropiedades)
                        .addGap(21, 21, 21)
                        .addComponent(jLSuperTotalPropiedades))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addComponent(jTAlturaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTSuperTotalPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLActivoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRActivoPropiedades1))))
                .addGap(1, 1, 1)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPrecioTasadoPropiedades)
                    .addComponent(jTPrecioTasadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLObservacionesPropiedades)))
                .addGap(1, 1, 1)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addComponent(jLAntiguedadPropiedades)
                        .addGap(21, 21, 21)
                        .addComponent(jLTipoPropiedades)
                        .addGap(11, 11, 11)
                        .addComponent(jLInspectorPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLZonaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLEstadoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addComponent(jTAntiguedadPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jCListaTipoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jCListaInspectoresPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jCListarZonaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jCListarEstadoPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPropiedadesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPPropiedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBNuevoPropiedades)
                    .addComponent(jBModificarPropiedades)
                    .addComponent(jBEliminarPropiedades)
                    .addComponent(jBSalirPropiedades))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirPropiedadesActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            this.dispose();//cierro la ventana
        }
    }//GEN-LAST:event_jBSalirPropiedadesActionPerformed

    private void jBNuevoPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoPropiedadesActionPerformed
        guardarPropiedad();
    }//GEN-LAST:event_jBNuevoPropiedadesActionPerformed

    private void jBModificarPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarPropiedadesActionPerformed

            modificarPropiedad(); // Llama al método modificar solo si se ha seleccionado un alumno
          
        
    }//GEN-LAST:event_jBModificarPropiedadesActionPerformed

    private void jBEliminarPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarPropiedadesActionPerformed
        Propiedad propiedadSeleccionado = (Propiedad) jCListaPropietarios.getSelectedItem();
        // ad.eliminarAlumno(alumnoSelecionado.getDni());
        pd.darBajaAPropiedad(propiedadSeleccionado);
        limpiarCampos();

    }//GEN-LAST:event_jBEliminarPropiedadesActionPerformed

    private void jCListaPropiedades2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCListaPropiedades2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCListaPropiedades2ActionPerformed

    private void jCListaPropietariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCListaPropietariosItemStateChanged
            int idPropietario = -1;
        Object selectedItem = jCListaPropietarios.getSelectedItem();
if (selectedItem != null) {
    if (selectedItem instanceof Propietario) { //USO UN instanceof PARA VERIFICAR SI EL OBJETO ES UNA INSTANCIA DE LA CALSE PROPIETARIO, LO CASTEO Y SACO EL ID DEL PROPIETARIO
        Propietario propietarioSeleccionado = (Propietario) selectedItem;
        idPropietario = propietarioSeleccionado.getIdPropietario(); //UNA VEZ TENGO EL ID, LLAMO, LIMPIO LOS CAMPOS DEL COMBO BOX DE PROPIEDADES Y CARGO LAS PROPIEDADES
        jCListaPropiedades2.removeAllItems();
        List<Propiedad> propiedadesDelPropietario = pd.listarPropiedadesXDueño(propietarioSeleccionado.getIdPropietario());

for (Propiedad propiedad : propiedadesDelPropietario) {
    jCListaPropiedades2.addItem(propiedad);
}
limpiarCampos();
        rellenarCampos();
        
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un propietario válido");
    }
} else {
    JOptionPane.showMessageDialog(this, "No ha seleccionado ningún propietario");
}
    }//GEN-LAST:event_jCListaPropietariosItemStateChanged

    private void jCListaPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCListaPropietariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCListaPropietariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminarPropiedades;
    private javax.swing.JButton jBModificarPropiedades;
    private javax.swing.JButton jBNuevoPropiedades;
    private javax.swing.JButton jBSalirPropiedades;
    private javax.swing.JComboBox<Inspector> jCListaInspectoresPropiedades;
    private javax.swing.JComboBox<Propiedad> jCListaPropiedades2;
    private javax.swing.JComboBox<Propietario> jCListaPropietarios;
    private javax.swing.JComboBox<TipoPropiedad> jCListaTipoPropiedades;
    private javax.swing.JComboBox<Estado> jCListarEstadoPropiedades;
    private javax.swing.JComboBox<Zona> jCListarZonaPropiedades;
    private javax.swing.JLabel jLActivoPropiedades;
    private javax.swing.JLabel jLAlturaPropiedades;
    private javax.swing.JLabel jLAntiguedadPropiedades;
    private javax.swing.JLabel jLDireccionPropiedades;
    private javax.swing.JLabel jLDisponibilidadPropiedad;
    private javax.swing.JLabel jLEstadoPropiedad;
    private javax.swing.JLabel jLIDPropiedades;
    private javax.swing.JLabel jLInspectorPropiedades;
    private javax.swing.JLabel jLNavegacionEnBarra;
    private javax.swing.JLabel jLObservacionesPropiedades;
    private javax.swing.JLabel jLPrecioTasadoPropiedades;
    private javax.swing.JLabel jLSuperTotalPropiedades;
    private javax.swing.JLabel jLTipoPropiedades;
    private javax.swing.JLabel jLTituloPropiedades;
    private javax.swing.JLabel jLZonaPropiedades;
    private javax.swing.JPanel jPBarraNavegador;
    private javax.swing.JPanel jPPropiedades;
    private javax.swing.JRadioButton jRActivoPropiedades1;
    private javax.swing.JRadioButton jRDisponibilidadPropiedades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAlturaPropiedades;
    private javax.swing.JTextField jTAntiguedadPropiedad;
    private javax.swing.JTextField jTDireccionPropiedades;
    private javax.swing.JTextArea jTObservacionesPropiedades;
    private javax.swing.JTextField jTPrecioTasadoPropiedades;
    private javax.swing.JTextField jTSuperTotalPropiedades;
    // End of variables declaration//GEN-END:variables

    public void guardarPropiedad() {
        PropiedadData pd = new PropiedadData();
        PropietarioData prod = new PropietarioData();

        try {
            if (!jTDireccionPropiedades.getText().isEmpty() && !jTAlturaPropiedades.getText().isEmpty()
                    && !jTSuperTotalPropiedades.getText().isEmpty() && !jTPrecioTasadoPropiedades.getText().isEmpty()
                    && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true
                    && !jTObservacionesPropiedades.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true) {
                // habilitarBotones();
                // Propiedad PSelec = (Propiedad) jCListaTipoPropiedades.getSelectedItem();
               
                Propietario propietario =(Propietario) jCListaPropietarios.getSelectedItem();
                String direccion = jTDireccionPropiedades.getText();
                int altura = Integer.parseInt(jTAlturaPropiedades.getText());
                TipoPropiedad tipoSelec = (TipoPropiedad) jCListaTipoPropiedades.getSelectedItem();
                int superficieTotal = Integer.parseInt(jTSuperTotalPropiedades.getText());
                double precioTasado = Double.parseDouble(jTPrecioTasadoPropiedades.getText());
                int antiguedad = Integer.parseInt(jTAntiguedadPropiedad.getText());
                Inspector insSelec = (Inspector) jCListaInspectoresPropiedades.getSelectedItem();
                Zona zona = (Zona) jCListarZonaPropiedades.getSelectedItem();
                Estado estado = (Estado) jCListarEstadoPropiedades.getSelectedItem();
                String observaciones = jTObservacionesPropiedades.getText();
                boolean disponible = jRDisponibilidadPropiedades.isSelected();
                boolean activo = jRActivoPropiedades1.isSelected();
                Propiedad nuevo = new Propiedad(propietario, direccion, altura, tipoSelec, superficieTotal, precioTasado, antiguedad, insSelec, zona, estado, observaciones, disponible, activo);
                 pd.agregarPropiedad(nuevo);
                 JOptionPane.showMessageDialog(this, "Propiedad agregada exitosamente");
                 limpiarCampos();
                //  desHabilitarBotones();
                // cargarCombo();

            } else {
                JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }
    }
    
    public void cargarComboPropietarios() {
        jCListaPropietarios.removeAllItems();

        List<Propietario> propietarios = propd.listarPropietarios();

        for (Propietario propietario:propietarios) {
           
            jCListaPropietarios.addItem(propietario);
        }
    }

    private void cargarComboTipo() {

        TipoPropiedadData tipD = new TipoPropiedadData();
        ArrayList<TipoPropiedad> tipoProp = new ArrayList<>();

        for (TipoPropiedad tipo : tipD.listarTipoPropiedadesActivas()) {
            tipoProp.add(tipo);
            jCListaTipoPropiedades.addItem(tipo);

        }
    }

    public void cargarComboInspector() {

        InspectorData inspectorD = new InspectorData();
        ArrayList<Inspector> inspectores = new ArrayList<>();

        for (Inspector inspector : inspectorD.listarInspectoresActivos()) {
            inspectores.add(inspector);
            jCListaInspectoresPropiedades.addItem(inspector);

        }
    }

    public void cargarComboEstado() {

        EstadoData estadoD = new EstadoData();
        ArrayList<Estado> Estados = new ArrayList<>();

        for (Estado est : estadoD.listarEstadosActivos()) {
            Estados.add(est);
            jCListarEstadoPropiedades.addItem(est);

        }
    }

    public void cargarComboZona() {

        ZonaData zonaD = new ZonaData();
        ArrayList<Zona> Zonas = new ArrayList<>();

        for (Zona zon : zonaD.listarZona()) {
            Zonas.add(zon);
            jCListarZonaPropiedades.addItem(zon);

        }
    }

    public void limpiarCampos() {
        //Cintia: Agrego limpieza de campos
        jTDireccionPropiedades.setText("");
        jTAlturaPropiedades.setText("");
        jTSuperTotalPropiedades.setText("");
        jTPrecioTasadoPropiedades.setText("");
        jTAntiguedadPropiedad.setText("");
        jRDisponibilidadPropiedades.setSelected(true);
        jRActivoPropiedades1.setSelected(true);
    }

    public void rellenarCampos() {

        Propiedad propiedadSeleccionado = (Propiedad) jCListaPropiedades2.getSelectedItem();
        // boolean activo = jrbEstado.isSelected();

        if (propiedadSeleccionado != null) {

            jTDireccionPropiedades.setText(String.valueOf(propiedadSeleccionado.getDireccion()));
            jTAlturaPropiedades.setText(String.valueOf(propiedadSeleccionado.getAltura()));
            jTSuperTotalPropiedades.setText(String.valueOf(propiedadSeleccionado.getSuperficieTotal()));
            jTPrecioTasadoPropiedades.setText(String.valueOf(propiedadSeleccionado.getPrecioTasado()));
            jTAntiguedadPropiedad.setText(String.valueOf(propiedadSeleccionado.getAntiguedad()));
            //combos
            // jCListaTipoPropiedades 

            for (int i = 0; i < jCListaTipoPropiedades.getItemCount(); i++) {
                TipoPropiedad x = jCListaTipoPropiedades.getItemAt(i);
                if (x.getIdTipo() == propiedadSeleccionado.getTipo().getIdTipo()) {
                    jCListaTipoPropiedades.setSelectedIndex(i);
                }
            }

            //jCListaInspectoresPropiedades
            for (int i = 0; i < jCListaInspectoresPropiedades.getItemCount(); i++) {
                Inspector x = jCListaInspectoresPropiedades.getItemAt(i);
                if (x.getIdInspector() == propiedadSeleccionado.getInspector().getIdInspector()) {
                    jCListaInspectoresPropiedades.setSelectedIndex(i);
                }
            }

            //jCListarZonaPropiedades
            for (int i = 0; i < jCListarZonaPropiedades.getItemCount(); i++) {
                Zona x = jCListarZonaPropiedades.getItemAt(i);
                if (x.getIdZona() == propiedadSeleccionado.getZona().getIdZona()) {
                    jCListarZonaPropiedades.setSelectedIndex(i);
                }
            }

            //jCListarEstadoPropiedades
            for (int i = 0; i < jCListarEstadoPropiedades.getItemCount(); i++) {
                Estado x = jCListarEstadoPropiedades.getItemAt(i);
                if (x.getIdEstado() == propiedadSeleccionado.getEstado().getIdEstado()) {
                    jCListarEstadoPropiedades.setSelectedIndex(i);
                }
            }

            jRDisponibilidadPropiedades.setSelected(propiedadSeleccionado.isActivo());
            jRActivoPropiedades1.setSelected(propiedadSeleccionado.isActivo());
            jTObservacionesPropiedades.setText(String.valueOf(propiedadSeleccionado.getObservaciones()));
            System.out.println(jCListaTipoPropiedades.getSelectedIndex());
        }
    }

    public void modificarPropiedad() {

        try {
            PropietarioData prod = new PropietarioData();
            Propiedad propiedadSeleccionada = (Propiedad) jCListaPropiedades2.getSelectedItem();
           int id = propiedadSeleccionada.getIdPropiedad();
          //  int idp = Integer.parseInt(jTIDPropietarios.getText());
            Propietario propietario = (Propietario)jCListaPropietarios.getSelectedItem();
            String direccion = jTDireccionPropiedades.getText();
            int altura = Integer.parseInt(jTAlturaPropiedades.getText());
            TipoPropiedad tipoSelec = (TipoPropiedad) jCListaTipoPropiedades.getSelectedItem();
            int superficieTotal = Integer.parseInt(jTSuperTotalPropiedades.getText());
            double precioTasado = Double.parseDouble(jTPrecioTasadoPropiedades.getText());
            int antiguedad = Integer.parseInt(jTAntiguedadPropiedad.getText());
            Inspector insSelec = (Inspector) jCListaInspectoresPropiedades.getSelectedItem();
            Zona zona = (Zona) jCListarZonaPropiedades.getSelectedItem();
            Estado estado = (Estado) jCListarEstadoPropiedades.getSelectedItem();
            String observaciones = jTObservacionesPropiedades.getText();
            boolean disponible = jRDisponibilidadPropiedades.isSelected();
            boolean activo = jRActivoPropiedades1.isSelected();
            Propiedad nuevoP = new Propiedad(id, propietario, direccion, altura, tipoSelec, superficieTotal, precioTasado, antiguedad, insSelec, zona, estado, observaciones, disponible, activo);
            pd.modificarPropiedad(nuevoP);
            JOptionPane.showMessageDialog(this, "Propiedad modificada exitosamente");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error al modificar" + e.getMessage());
        }
        }
    
}
