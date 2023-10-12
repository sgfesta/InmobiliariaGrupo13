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

    public MenuPropiedades() {
        initComponents();
        QuitarLaBarraTitulo();
        cargarComboTipo();
        cargarComboZona();
        cargarComboEstado();
        cargarComboInspector();

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
        jTIDPropietarios = new javax.swing.JTextField();
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
        jBBotonBusqueda = new javax.swing.JButton();
        jCListaTipoPropiedades = new javax.swing.JComboBox<>();
        jRActivoPropiedades1 = new javax.swing.JRadioButton();
        jCListaPropiedades1 = new javax.swing.JComboBox<>();
        jCListarEstadoPropiedades = new javax.swing.JComboBox<>();
        jCListaInspectoresPropiedades = new javax.swing.JComboBox<>();
        jCListarZonaPropiedades = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPPropiedades.setBackground(new java.awt.Color(55, 55, 54));
        jPPropiedades.setMinimumSize(new java.awt.Dimension(748, 635));
        jPPropiedades.setPreferredSize(new java.awt.Dimension(748, 635));
        jPPropiedades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTituloPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLTituloPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLTituloPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloPropiedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita.png"))); // NOI18N
        jLTituloPropiedades.setText("  Formulario Propiedades");
        jLTituloPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLTituloPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 290, -1));

        jLIDPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLIDPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLIDPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLIDPropiedades.setText("ID Propietario");
        jPPropiedades.add(jLIDPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 150, 150, 30));

        jLDireccionPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLDireccionPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLDireccionPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDireccionPropiedades.setText("Direccion");
        jLDireccionPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLDireccionPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 131, -1));

        jLAlturaPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLAlturaPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLAlturaPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLAlturaPropiedades.setText("Altura");
        jLAlturaPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLAlturaPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 131, -1));

        jLTipoPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLTipoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLTipoPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLTipoPropiedades.setText("Tipo");
        jLTipoPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLTipoPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 131, -1));

        jLSuperTotalPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLSuperTotalPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLSuperTotalPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLSuperTotalPropiedades.setText("Super. Total");
        jLSuperTotalPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLSuperTotalPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 131, -1));

        jLPrecioTasadoPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLPrecioTasadoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLPrecioTasadoPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPrecioTasadoPropiedades.setText("Precio Tasado");
        jLPrecioTasadoPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLPrecioTasadoPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 131, -1));

        jLAntiguedadPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLAntiguedadPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLAntiguedadPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLAntiguedadPropiedades.setText("Antiguedad");
        jLAntiguedadPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLAntiguedadPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 131, -1));

        jLInspectorPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLInspectorPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLInspectorPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLInspectorPropiedades.setText("Inspector");
        jPPropiedades.add(jLInspectorPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 131, 30));

        jLZonaPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLZonaPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLZonaPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLZonaPropiedades.setText("Zona");
        jPPropiedades.add(jLZonaPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 131, 30));

        jTIDPropietarios.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarios.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarios.setForeground(new java.awt.Color(51, 51, 51));
        jPPropiedades.add(jTIDPropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 187, 30));

        jTDireccionPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTDireccionPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTDireccionPropiedades.setForeground(new java.awt.Color(51, 51, 51));
        jPPropiedades.add(jTDireccionPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 187, -1));

        jTAlturaPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTAlturaPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAlturaPropiedades.setForeground(new java.awt.Color(51, 51, 51));
        jPPropiedades.add(jTAlturaPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 187, -1));

        jTSuperTotalPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTSuperTotalPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTSuperTotalPropiedades.setForeground(new java.awt.Color(51, 51, 51));
        jPPropiedades.add(jTSuperTotalPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 187, -1));

        jTPrecioTasadoPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTPrecioTasadoPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTPrecioTasadoPropiedades.setForeground(new java.awt.Color(51, 51, 51));
        jPPropiedades.add(jTPrecioTasadoPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 187, -1));

        jTAntiguedadPropiedad.setBackground(new java.awt.Color(153, 153, 153));
        jTAntiguedadPropiedad.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTAntiguedadPropiedad.setForeground(new java.awt.Color(51, 51, 51));
        jPPropiedades.add(jTAntiguedadPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 187, -1));

        jLEstadoPropiedad.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLEstadoPropiedad.setForeground(new java.awt.Color(51, 204, 255));
        jLEstadoPropiedad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLEstadoPropiedad.setText("Estado");
        jLEstadoPropiedad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLEstadoPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 110, 30));

        jLDisponibilidadPropiedad.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLDisponibilidadPropiedad.setForeground(new java.awt.Color(51, 204, 255));
        jLDisponibilidadPropiedad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDisponibilidadPropiedad.setText("Disponibilidad");
        jLDisponibilidadPropiedad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLDisponibilidadPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 118, 30));

        jLActivoPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLActivoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLActivoPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLActivoPropiedades.setText("Activo");
        jLActivoPropiedades.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPPropiedades.add(jLActivoPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 118, 30));

        jLObservacionesPropiedades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLObservacionesPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jLObservacionesPropiedades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLObservacionesPropiedades.setText("Observaciones");
        jLObservacionesPropiedades.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPPropiedades.add(jLObservacionesPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 118, -1));

        jTObservacionesPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jTObservacionesPropiedades.setColumns(20);
        jTObservacionesPropiedades.setRows(5);
        jScrollPane1.setViewportView(jTObservacionesPropiedades);

        jPPropiedades.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 312, 157));

        jBNuevoPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevoPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevoPropiedades.setText("Nuevo");
        jBNuevoPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevoPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoPropiedadesActionPerformed(evt);
            }
        });
        jPPropiedades.add(jBNuevoPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));

        jBModificarPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBModificarPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBModificarPropiedades.setText("Modificar");
        jBModificarPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificarPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarPropiedadesActionPerformed(evt);
            }
        });
        jPPropiedades.add(jBModificarPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));

        jBEliminarPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBEliminarPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBEliminarPropiedades.setText("Eliminar");
        jBEliminarPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminarPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarPropiedadesActionPerformed(evt);
            }
        });
        jPPropiedades.add(jBEliminarPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

        jBSalirPropiedades.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalirPropiedades.setForeground(new java.awt.Color(51, 204, 255));
        jBSalirPropiedades.setText("Salir");
        jBSalirPropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalirPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirPropiedadesActionPerformed(evt);
            }
        });
        jPPropiedades.add(jBSalirPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, -1));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPBarraNavegadorLayout.setVerticalGroup(
            jPBarraNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNavegacionEnBarra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPPropiedades.add(jPBarraNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, -1));

        jRDisponibilidadPropiedades.setText("Activo");
        jPPropiedades.add(jRDisponibilidadPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        jBBotonBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3844432-magnifier-search-zoom_110300.png"))); // NOI18N
        jBBotonBusqueda.setBorder(null);
        jBBotonBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBotonBusqueda.setOpaque(false);
        jBBotonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBotonBusquedaActionPerformed(evt);
            }
        });
        jPPropiedades.add(jBBotonBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 40, 40));

        jCListaTipoPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jPPropiedades.add(jCListaTipoPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, 30));

        jRActivoPropiedades1.setText("Activo");
        jPPropiedades.add(jRActivoPropiedades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jCListaPropiedades1.setBackground(new java.awt.Color(153, 153, 153));
        jCListaPropiedades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCListaPropiedades1ActionPerformed(evt);
            }
        });
        jPPropiedades.add(jCListaPropiedades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 220, 30));

        jCListarEstadoPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jPPropiedades.add(jCListarEstadoPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 190, 30));

        jCListaInspectoresPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jPPropiedades.add(jCListaInspectoresPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 190, 30));

        jCListarZonaPropiedades.setBackground(new java.awt.Color(153, 153, 153));
        jPPropiedades.add(jCListarZonaPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
       // pendiente
    }//GEN-LAST:event_jBModificarPropiedadesActionPerformed

    private void jBBotonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBotonBusquedaActionPerformed
        jCListaPropiedades1.removeAllItems();
        try {

            int idPropietario = Integer.parseInt(jTIDPropietarios.getText());
            List<Propiedad> propiedades = pd.listarPropiedadesXDueño(idPropietario);

            for (Propiedad propiedad : propiedades) {
                jCListaPropiedades1.addItem(propiedad);
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje el campo vacío" + e.getMessage());
        }
    }//GEN-LAST:event_jBBotonBusquedaActionPerformed

    private void jCListaPropiedades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCListaPropiedades1ActionPerformed
        rellenarCampos();
    }//GEN-LAST:event_jCListaPropiedades1ActionPerformed

    private void jBEliminarPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarPropiedadesActionPerformed
        Propiedad propiedadSeleccionado = (Propiedad) jCListaPropiedades1.getSelectedItem();
       // ad.eliminarAlumno(alumnoSelecionado.getDni());
        pd.darBajaAPropiedad(propiedadSeleccionado);
        limpiarcampos();
       
    }//GEN-LAST:event_jBEliminarPropiedadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBotonBusqueda;
    private javax.swing.JButton jBEliminarPropiedades;
    private javax.swing.JButton jBModificarPropiedades;
    private javax.swing.JButton jBNuevoPropiedades;
    private javax.swing.JButton jBSalirPropiedades;
    private javax.swing.JComboBox<Inspector> jCListaInspectoresPropiedades;
    private javax.swing.JComboBox<Propiedad> jCListaPropiedades1;
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
    private javax.swing.JTextField jTIDPropietarios;
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
                    && !jTAntiguedadPropiedad.getText().isEmpty() && jRDisponibilidadPropiedades.isSelected() == true &&
                    !jTObservacionesPropiedades.getText().isEmpty()&& jRDisponibilidadPropiedades.isSelected() == true) {
                // habilitarBotones();

                Propiedad PSelec = (Propiedad) jCListaTipoPropiedades.getSelectedItem();
                int idp = Integer.parseInt(jTIDPropietarios.getText());
                Propietario propietario = prod.buscarPropietario(idp);
                String direccion = jTDireccionPropiedades.getText();
                int altura = Integer.parseInt(jTAlturaPropiedades.getText());
                TipoPropiedad tipoSelec = (TipoPropiedad) jCListaTipoPropiedades.getSelectedItem();
                int superficieTotal = Integer.parseInt(jTSuperTotalPropiedades.getText());
                double precioTasado = Double.parseDouble(jTPrecioTasadoPropiedades.getText());
                int antiguedad = Integer.parseInt(jTAntiguedadPropiedad.getText());
                Inspector insSelec = (Inspector) jCListaTipoPropiedades.getSelectedItem();
                Zona zona = (Zona) jCListarEstadoPropiedades.getSelectedItem();
                Estado estado = (Estado) jCListarEstadoPropiedades.getSelectedItem();
                String observaciones = jTObservacionesPropiedades.getText();
                boolean disponible = jRDisponibilidadPropiedades.isSelected();
                boolean activo = jRActivoPropiedades1.isSelected();
                Propiedad nuevo = new Propiedad(propietario, direccion, altura, tipoSelec, superficieTotal, precioTasado, antiguedad, insSelec, zona, estado, observaciones, disponible, activo);
                // pd.guardarAlumno(nuevo);
                // limpiarcampos();
                //  desHabilitarBotones();
                // cargarCombo();

            } else {
                JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
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
    
     public void limpiarcampos(){
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

        
        Propiedad propiedadSeleccionado = (Propiedad) jCListaPropiedades1.getSelectedItem();
        // boolean activo = jrbEstado.isSelected();

        if (propiedadSeleccionado != null) {

            jTDireccionPropiedades.setText(String.valueOf(propiedadSeleccionado.getDireccion()));
            jTAlturaPropiedades.setText(String.valueOf(propiedadSeleccionado.getAltura()));
            jTSuperTotalPropiedades.setText(String.valueOf(propiedadSeleccionado.getSuperficieTotal()));
            jTPrecioTasadoPropiedades.setText(String.valueOf(propiedadSeleccionado.getPrecioTasado()));
            jTAntiguedadPropiedad.setText(String.valueOf(propiedadSeleccionado.getAntiguedad()));
            //combos
            //jCListaTipoPropiedades
            //jCListaInspectoresPropiedades
            //jCListarZonaPropiedades
            //jCListarEstadoPropiedades
            
            jRDisponibilidadPropiedades.setSelected(propiedadSeleccionado.isActivo());
            jRActivoPropiedades1.setSelected(propiedadSeleccionado.isActivo());
            jTObservacionesPropiedades.setText(String.valueOf(propiedadSeleccionado.getObservaciones()));
        }
    }
       
    
    
    /*    public void modificar() {
       
        try {
           Alumno alumnoSelecionado = (Alumno) jComboBox1.getSelectedItem();
            int dni = Integer.parseInt(jtDocumento.getText());
            String ap = jtApellido.getText();
            String nom = jtNombre.getText();
            LocalDate fechaNacimiento = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean est = jrbEstado.isSelected();            
            Alumno nuevaP = new Alumno(PropietarioSelecionado.getIdAlumno(),PropietarioSelecionado.getDni(), ap, nom, fechaNacimiento, est);
            pd.modificarPropiedad(nuevaP);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error al modificar" + e.getMessage());
        }
    }*/
    }
