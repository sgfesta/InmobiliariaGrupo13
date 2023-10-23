
package igu;

import entidades.Contrato;
import entidades.Estado;
import entidades.Garante;
import entidades.Inquilino;
import entidades.Inspector;
import entidades.Propiedad;
import entidades.Propietario;
import entidades.TipoPropiedad;
import entidades.Vendedor;
import entidades.Zona;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import persistencia.ContratoData;
import persistencia.PropiedadData;
import persistencia.TipoPropiedadData;
import persistencia.ZonaData;

public class MenuAlquileres extends javax.swing.JInternalFrame {
ContratoData cd = new ContratoData();
PropiedadData pd=new PropiedadData();
Propiedad pSelect = new Propiedad();
   
    public MenuAlquileres() {
        initComponents();
        QuitarLaBarraTitulo();
        cargarComboTipo();
        cargarComboZona();
        

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

        jComboBox3 = new javax.swing.JComboBox<>();
        jPCardAlquileres = new javax.swing.JPanel();
        jPBarraNavegador2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLTituloAlquiler = new javax.swing.JLabel();
        jCFiltroTipoAlquiler = new javax.swing.JComboBox<>();
        jBNuevoAlquiler = new javax.swing.JButton();
        jTIDPropiedadAlquiler = new javax.swing.JTextField();
        jLIDPropiedad = new javax.swing.JLabel();
        jTIDPropietarioAlquiler = new javax.swing.JTextField();
        jLIDPropietarioAlquiler = new javax.swing.JLabel();
        jLIDInquilinoAlquiler = new javax.swing.JLabel();
        jTIDInquilinoAlquiler = new javax.swing.JTextField();
        jTIDVendedor = new javax.swing.JTextField();
        jTIDGaranteAlquiler = new javax.swing.JTextField();
        jLIDVendedorAlquiler = new javax.swing.JLabel();
        jLIDGaranteAlquilino = new javax.swing.JLabel();
        jLFechaInicioAlquiler = new javax.swing.JLabel();
        jLFechaFinAlquiler = new javax.swing.JLabel();
        jLVigenciaAlquiler = new javax.swing.JLabel();
        jLFechaContratoAlquiler = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jBSalirAlquiler = new javax.swing.JButton();
        jDFechaFinAlquiler = new com.toedter.calendar.JDateChooser();
        jDFechaInicioAlquiler = new com.toedter.calendar.JDateChooser();
        jDFechaContratoAlquiler = new com.toedter.calendar.JDateChooser();
        jCFiltroZonaalquiler = new javax.swing.JComboBox<>();
        jRPrecioAlquiler = new javax.swing.JRadioButton();
        jBFiltrarAlquiler = new javax.swing.JButton();
        jCListadoFiltradoPropiedadesAlquiler = new javax.swing.JComboBox<>();
        jTprecioAlquiler = new javax.swing.JTextField();
        jRActivoAlquiler = new javax.swing.JRadioButton();
        jRVigenciaAlquiler = new javax.swing.JRadioButton();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPCardAlquileres.setBackground(new java.awt.Color(55, 55, 55));
        jPCardAlquileres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
        );
        jPBarraNavegador2Layout.setVerticalGroup(
            jPBarraNavegador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraNavegador2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPCardAlquileres.add(jPBarraNavegador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, -1));

        jLTituloAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLTituloAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jLTituloAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloAlquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/White-contract_icon-icons.com_64813.png"))); // NOI18N
        jLTituloAlquiler.setText("  Formulario Alquiler");
        jLTituloAlquiler.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLTituloAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 68, -1, -1));

        jCFiltroTipoAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jCFiltroTipoAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jCFiltroTipoAlquiler.setForeground(new java.awt.Color(51, 51, 51));
        jPCardAlquileres.add(jCFiltroTipoAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, -1));

        jBNuevoAlquiler.setBackground(new java.awt.Color(51, 51, 51));
        jBNuevoAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBNuevoAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jBNuevoAlquiler.setText("Nuevo");
        jBNuevoAlquiler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBNuevoAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoAlquilerActionPerformed(evt);
            }
        });
        jPCardAlquileres.add(jBNuevoAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 110, -1));

        jTIDPropiedadAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropiedadAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropiedadAlquiler.setForeground(new java.awt.Color(51, 51, 51));
        jPCardAlquileres.add(jTIDPropiedadAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 122, -1));

        jLIDPropiedad.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLIDPropiedad.setForeground(new java.awt.Color(51, 204, 255));
        jLIDPropiedad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLIDPropiedad.setText("ID Propiedad");
        jLIDPropiedad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLIDPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 140, -1));

        jTIDPropietarioAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jTIDPropietarioAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDPropietarioAlquiler.setForeground(new java.awt.Color(51, 51, 51));
        jPCardAlquileres.add(jTIDPropietarioAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 122, -1));

        jLIDPropietarioAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLIDPropietarioAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jLIDPropietarioAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLIDPropietarioAlquiler.setText("ID Propietario");
        jLIDPropietarioAlquiler.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLIDPropietarioAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 140, -1));

        jLIDInquilinoAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLIDInquilinoAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jLIDInquilinoAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLIDInquilinoAlquiler.setText("ID Inquilino");
        jLIDInquilinoAlquiler.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLIDInquilinoAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 140, -1));

        jTIDInquilinoAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jTIDInquilinoAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDInquilinoAlquiler.setForeground(new java.awt.Color(51, 51, 51));
        jPCardAlquileres.add(jTIDInquilinoAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 122, -1));

        jTIDVendedor.setBackground(new java.awt.Color(153, 153, 153));
        jTIDVendedor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDVendedor.setForeground(new java.awt.Color(51, 51, 51));
        jPCardAlquileres.add(jTIDVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 122, -1));

        jTIDGaranteAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jTIDGaranteAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jTIDGaranteAlquiler.setForeground(new java.awt.Color(51, 51, 51));
        jPCardAlquileres.add(jTIDGaranteAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 122, -1));

        jLIDVendedorAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLIDVendedorAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jLIDVendedorAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLIDVendedorAlquiler.setText("ID Vendedor");
        jLIDVendedorAlquiler.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLIDVendedorAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 140, -1));

        jLIDGaranteAlquilino.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLIDGaranteAlquilino.setForeground(new java.awt.Color(51, 204, 255));
        jLIDGaranteAlquilino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLIDGaranteAlquilino.setText("ID Garante");
        jLIDGaranteAlquilino.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLIDGaranteAlquilino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 140, -1));

        jLFechaInicioAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLFechaInicioAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jLFechaInicioAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLFechaInicioAlquiler.setText("Fecha Inicio");
        jLFechaInicioAlquiler.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLFechaInicioAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 140, 30));

        jLFechaFinAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLFechaFinAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jLFechaFinAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLFechaFinAlquiler.setText("Fecha Fin");
        jLFechaFinAlquiler.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLFechaFinAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 299, 140, 30));

        jLVigenciaAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLVigenciaAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jLVigenciaAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLVigenciaAlquiler.setText("Vigencia");
        jLVigenciaAlquiler.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLVigenciaAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 120, -1));

        jLFechaContratoAlquiler.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLFechaContratoAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jLFechaContratoAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLFechaContratoAlquiler.setText("Fecha Contrato");
        jLFechaContratoAlquiler.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLFechaContratoAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 140, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 204, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("Activo");
        jLabel45.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPCardAlquileres.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 70, -1));

        jBSalirAlquiler.setBackground(new java.awt.Color(51, 51, 51));
        jBSalirAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jBSalirAlquiler.setForeground(new java.awt.Color(51, 204, 255));
        jBSalirAlquiler.setText("Salir");
        jBSalirAlquiler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalirAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirAlquilerActionPerformed(evt);
            }
        });
        jPCardAlquileres.add(jBSalirAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 100, -1));

        jDFechaFinAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jPCardAlquileres.add(jDFechaFinAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 156, -1));

        jDFechaInicioAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jPCardAlquileres.add(jDFechaInicioAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 156, -1));

        jDFechaContratoAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jPCardAlquileres.add(jDFechaContratoAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 156, -1));

        jCFiltroZonaalquiler.setBackground(new java.awt.Color(153, 153, 153));
        jCFiltroZonaalquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jCFiltroZonaalquiler.setForeground(new java.awt.Color(51, 51, 51));
        jPCardAlquileres.add(jCFiltroZonaalquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 180, 30));

        jRPrecioAlquiler.setBackground(new java.awt.Color(51, 51, 51));
        jRPrecioAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jRPrecioAlquiler.setForeground(new java.awt.Color(51, 153, 255));
        jRPrecioAlquiler.setSelected(true);
        jRPrecioAlquiler.setText("Hasta");
        jRPrecioAlquiler.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRPrecioAlquilerStateChanged(evt);
            }
        });
        jPCardAlquileres.add(jRPrecioAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 30));

        jBFiltrarAlquiler.setBackground(new java.awt.Color(51, 51, 51));
        jBFiltrarAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jBFiltrarAlquiler.setForeground(new java.awt.Color(51, 153, 255));
        jBFiltrarAlquiler.setText("Filtrar");
        jBFiltrarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFiltrarAlquilerActionPerformed(evt);
            }
        });
        jPCardAlquileres.add(jBFiltrarAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 80, -1));

        jCListadoFiltradoPropiedadesAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jCListadoFiltradoPropiedadesAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jCListadoFiltradoPropiedadesAlquiler.setForeground(new java.awt.Color(51, 51, 51));
        jPCardAlquileres.add(jCListadoFiltradoPropiedadesAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 250, 30));

        jTprecioAlquiler.setBackground(new java.awt.Color(153, 153, 153));
        jTprecioAlquiler.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jTprecioAlquiler.setForeground(new java.awt.Color(102, 204, 255));
        jTprecioAlquiler.setText("Precio");
        jPCardAlquileres.add(jTprecioAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 120, 30));
        jPCardAlquileres.add(jRActivoAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));
        jPCardAlquileres.add(jRVigenciaAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCardAlquileres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCardAlquileres, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoAlquilerActionPerformed
       agregarContrato();
    }//GEN-LAST:event_jBNuevoAlquilerActionPerformed

    private void jBFiltrarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFiltrarAlquilerActionPerformed
        if (jRPrecioAlquiler.isSelected()==true){
            filtrarHasta();
        }else{
            filtrarDesde();
        }
    }//GEN-LAST:event_jBFiltrarAlquilerActionPerformed

    private void jRPrecioAlquilerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRPrecioAlquilerStateChanged
        actualizarPrecio();
    }//GEN-LAST:event_jRPrecioAlquilerStateChanged

    private void jBSalirAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirAlquilerActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            this.dispose();//cierro la ventana
        }
    }//GEN-LAST:event_jBSalirAlquilerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFiltrarAlquiler;
    private javax.swing.JButton jBNuevoAlquiler;
    private javax.swing.JButton jBSalirAlquiler;
    private javax.swing.JComboBox<TipoPropiedad> jCFiltroTipoAlquiler;
    private javax.swing.JComboBox<Zona> jCFiltroZonaalquiler;
    private javax.swing.JComboBox<Propiedad> jCListadoFiltradoPropiedadesAlquiler;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDFechaContratoAlquiler;
    private com.toedter.calendar.JDateChooser jDFechaFinAlquiler;
    private com.toedter.calendar.JDateChooser jDFechaInicioAlquiler;
    private javax.swing.JLabel jLFechaContratoAlquiler;
    private javax.swing.JLabel jLFechaFinAlquiler;
    private javax.swing.JLabel jLFechaInicioAlquiler;
    private javax.swing.JLabel jLIDGaranteAlquilino;
    private javax.swing.JLabel jLIDInquilinoAlquiler;
    private javax.swing.JLabel jLIDPropiedad;
    private javax.swing.JLabel jLIDPropietarioAlquiler;
    private javax.swing.JLabel jLIDVendedorAlquiler;
    private javax.swing.JLabel jLTituloAlquiler;
    private javax.swing.JLabel jLVigenciaAlquiler;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPBarraNavegador2;
    private javax.swing.JPanel jPCardAlquileres;
    private javax.swing.JRadioButton jRActivoAlquiler;
    private javax.swing.JRadioButton jRPrecioAlquiler;
    private javax.swing.JRadioButton jRVigenciaAlquiler;
    private javax.swing.JTextField jTIDGaranteAlquiler;
    private javax.swing.JTextField jTIDInquilinoAlquiler;
    private javax.swing.JTextField jTIDPropiedadAlquiler;
    private javax.swing.JTextField jTIDPropietarioAlquiler;
    private javax.swing.JTextField jTIDVendedor;
    private javax.swing.JTextField jTprecioAlquiler;
    // End of variables declaration//GEN-END:variables
 

     public void cargarComboTipo(){

        TipoPropiedadData tipD = new TipoPropiedadData();
        ArrayList<TipoPropiedad> tipoProp = new ArrayList<>();

        for (TipoPropiedad tipo : tipD.listarTipoPropiedadesActivas()) {
            tipoProp.add(tipo);
            jCFiltroTipoAlquiler.addItem(tipo);
            

        }
    }
     
      public void cargarComboZona(){
 ZonaData zonaD = new ZonaData();
        ArrayList<Zona> Zonas = new ArrayList<>();

        for (Zona zon : zonaD.listarZona()) {
            Zonas.add(zon);
            jCFiltroZonaalquiler.addItem(zon);

        }
    }
      
  
    
     public void agregarContrato(){
        ContratoData cd=new ContratoData();
         
           try {
            if (!jTIDPropiedadAlquiler.getText().isEmpty() && !jTIDPropietarioAlquiler.getText().isEmpty()
                    && !jTIDInquilinoAlquiler.getText().isEmpty() && !jTIDGaranteAlquiler.getText().isEmpty()
                    && !jTIDVendedor.getText().isEmpty() && jRVigenciaAlquiler.isSelected() == true
                    && jRActivoAlquiler.isSelected() == true) {
                // habilitarBotones();
                // Propiedad PSelec = (Propiedad) jCListaTipoPropiedades.getSelectedItem();

                Contrato alquiler = (Contrato) jCListadoFiltradoPropiedadesAlquiler.getSelectedItem();
                
                
                Propietario idprop=new Propietario();
                idprop.setIdPropietario(Integer.parseInt(jTIDPropiedadAlquiler.getText()));
                
                Propiedad idpro=new Propiedad();
                idpro.setIdPropiedad(Integer.parseInt(jTIDPropietarioAlquiler.getText()));
              
                Inquilino idinqui=new Inquilino();
                idinqui.setIdInquilino(Integer.parseInt(jTIDInquilinoAlquiler.getText()));
                
                Garante idgaran=new Garante();
                idgaran.setIdGarante(Integer.parseInt(jTIDGaranteAlquiler.getText()));
                
                Vendedor idven=new Vendedor();
                idven.setIdVendedor(Integer.parseInt(jTIDVendedor.getText()));
                int vendedor=Integer.parseInt(jTIDVendedor.getText());
                LocalDate fechaInicio = jDFechaInicioAlquiler.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaFin = jDFechaFinAlquiler.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaContrato = jDFechaContratoAlquiler.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                boolean vigente = jRVigenciaAlquiler.isSelected();
                boolean activo = jRActivoAlquiler.isSelected();
                Contrato nuevo = new Contrato(idprop ,  idpro,  idinqui,  idgaran,  idven,  fechaInicio,  fechaFin,  fechaContrato,  vigente,  activo);
                cd.guardarContrato(nuevo);
                JOptionPane.showMessageDialog(this, "Alquiler realizado exitosamente");
                limpiarCampos();
                //  desHabilitarBotones();
                

            } else {
                JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }

                
        
     }
    
     public void actualizarPrecio() {
        if (jRPrecioAlquiler.isSelected()) {
            jRPrecioAlquiler.setText("Hasta");
        } else {
            jRPrecioAlquiler.setText("Desde");
        }
    }
     
     
     public void limpiarCampos(){
         
         jTIDPropiedadAlquiler.setText("");
         jTIDPropietarioAlquiler.setText("");
         jTIDInquilinoAlquiler.setText("");
         jTIDGaranteAlquiler.setText("");
         jTIDVendedor.setText("");
         jDFechaInicioAlquiler.setDate(null);
         jDFechaFinAlquiler.setDate(null);
         jDFechaContratoAlquiler.setDate(null);
     }
     
     public void filtrarHasta(){
         
         TipoPropiedad tipoSelec = (TipoPropiedad) jCFiltroTipoAlquiler.getSelectedItem();
         Zona zonaSelec=(Zona)jCFiltroZonaalquiler.getSelectedItem();
         double precio=Double.parseDouble(jTprecioAlquiler.getText());
       pSelect = (Propiedad) jCListadoFiltradoPropiedadesAlquiler.getSelectedItem();
       double precioInmueble = pSelect.getPrecioTasado();
         
         for (Propiedad propiedades : pd.filtrado(tipoSelec, zonaSelec, precio)) {
                 jCListadoFiltradoPropiedadesAlquiler.addItem(propiedades);
//                 cargarComboPropiedades();
//                 if(precioInmueble < precio){
//                      cargarComboPropiedades();

                 
             }
         }
     }
     
//     public void filtrarDesde(){
//         
//     }
//     
//}
