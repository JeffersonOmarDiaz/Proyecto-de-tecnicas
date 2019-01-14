/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import ConexionInter.Conexion;
import ConexionInter.ProcedimientosAlmacenados;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar
 */
public class JFProforma extends javax.swing.JFrame {

    /**
     * Creates new form JFProforma
     */
    static ResultSet res;

    ConexionInter.Conexion con = new Conexion();
    Connection cn = con.getConnection();

    int seleccionTabla2;

    public JFProforma() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("VENTAS");
        /*estas dos lineas son para cambiar el icono al programa*/
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(("imagenes/logo.jpeg")));
        this.setIconImage(icono);

        llenarCmbDefecto();
        llenarTablaProducVenta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerUniVenta = new javax.swing.JSpinner();
        cmbPoducDisponible = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAderirAFactura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProducDisponibles = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblPrecioUnidad = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblTalla = new javax.swing.JLabel();
        lblCamisetaHMN = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Producto:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cantidad a vender:");

        jSpinnerUniVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinnerUniVenta.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerUniVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinnerUniVentaMouseClicked(evt);
            }
        });

        cmbPoducDisponible.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPoducDisponibleItemStateChanged(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoMouseClicked(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CÓDIGO:");

        btnAderirAFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAderirAFactura.setText("AÑADIR A VENTAS");
        btnAderirAFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAderirAFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbPoducDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSpinnerUniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btnAderirAFactura)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerUniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPoducDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnAderirAFactura))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jtbProducDisponibles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtbProducDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbProducDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbProducDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProducDisponibles);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CAMISETA DE:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("TALLA:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CÓDIGO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DESCRIPCIÓN:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("PRECIO UNIDAD:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("TOTAL:");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setText("0");

        lblPrecioUnidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecioUnidad.setText("----------");

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion.setText("----------");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo.setText("----------");

        lblTalla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTalla.setText("----------");

        lblCamisetaHMN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCamisetaHMN.setText("----------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCamisetaHMN)
                    .addComponent(lblTalla)
                    .addComponent(lblPrecioUnidad)
                    .addComponent(lblTotal)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblCamisetaHMN))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTalla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblPrecioUnidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(jLabel11))
                .addGap(26, 26, 26))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/persona.png"))); // NOI18N
        jButton1.setText("REGISTRAR NUEVO CLIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(89, 89, 89)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPoducDisponibleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPoducDisponibleItemStateChanged
        // TODO add your handling code here:
        System.out.println("El item selecccionado es: " + cmbPoducDisponible.getSelectedItem());

        Statement st;
        try {

            String[] registos = new String[5];
            String sql = "select * from Productos where camisetaHMN like '" + cmbPoducDisponible.getSelectedItem().toString() + "'";
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

//            ProcedimientosAlmacenados.BuscarProductoHMN(cmbPoducDisponible.getSelectedItem().toString());
            res = ConexionInter.Conexion.consulta("select * from Productos where camisetaHMN like '" + cmbPoducDisponible.getSelectedItem().toString() + "'");
            System.out.println("Los valores de codigo son: " + res.getString(1));
            ConexionInter.Conexion.consulta("select * from Productos where camisetaHMN like '" + cmbPoducDisponible.getSelectedItem().toString() + "'");
        } catch (SQLException e) {
            System.out.println("No se puede hace la busqueda");
        }
    }//GEN-LAST:event_cmbPoducDisponibleItemStateChanged

    private void jtbProducDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbProducDisponiblesMouseClicked
        // TODO add your handling code here:

        int row = jtbProducDisponibles.getSelectedRow();

        DefaultTableModel modelo = (DefaultTableModel) jtbProducDisponibles.getModel();
        String codigo = String.valueOf(jtbProducDisponibles.getValueAt(row, 2));
        String talla = String.valueOf(jtbProducDisponibles.getValueAt(row, 1));
        String producto = String.valueOf(jtbProducDisponibles.getValueAt(row, 0));
        String precioU = String.valueOf(jtbProducDisponibles.getValueAt(row, 5));
        String descrip = String.valueOf(jtbProducDisponibles.getValueAt(row, 3));

        txtCodigo.setText(codigo);

        lblCodigo.setText(codigo);
        lblTalla.setText(talla);
        lblCamisetaHMN.setText(producto);
        lblPrecioUnidad.setText(precioU);
        lblDescripcion.setText(descrip);
        Double total = Double.parseDouble(precioU) * (int) jSpinnerUniVenta.getValue();
        lblTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_jtbProducDisponiblesMouseClicked

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void jSpinnerUniVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinnerUniVentaMouseClicked
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo para aumentar productos");
        } else {
            int row = jtbProducDisponibles.getSelectedRow();

            Statement st;
            try {
                String[] Registros = new String[5];
                String sql = "SELECT * FROM productos";
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                int cuente = 0;
                while (rs.next()) {
                    System.out.println("contador de :" + cuente++);
                    Registros[1] = rs.getString("IdProduc");
                    System.out.println("Ingresando AL boton de busqueda y contiene: " + Registros[1]);
                    if (txtCodigo.getText().equals(Registros[1])) {
                        JOptionPane.showMessageDialog(null, "El codigo ya existe ingrese un nuevo codigo");
                        System.out.println("encontrado en la fila: " + cuente);
                        int rowss = cuente - 1;

//        DefaultTableModel modelo = (DefaultTableModel) jTablelBusqueda.getModel();
                        String codigo = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 2));
                        String unidades = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 3));
                        String talla = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 1));
                        String camisetaDE = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 0));
                        System.out.println("El elemento es codigo: " + codigo);
                        seleccionTabla2 = cuente - 1;

                        lblCodigo.setText(codigo);
                        lblTalla.setText(talla);
                        lblCamisetaHMN.setText(camisetaDE);
//                        lblUnidadesActuales.setText(unidades);

                        jtbProducDisponibles.getSelectionModel().addSelectionInterval(seleccionTabla2, seleccionTabla2);
//                        txtCodBuscado.setText(codigo);
//
//                        desactivarCampos(false);
//                        btnSumaProductos.setEnabled(true);
//                        btnCancelaSuma.setEnabled(true);
//                        jSpinner1.setEnabled(true);
                        seleccionTabla2 = 0;
                        return;
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El tipo de error es: " + ex);
            }
//            btnCancelaSuma.setEnabled(false);
//            btnSumaProductos.setEnabled(false);
//            jSpinner1.setEnabled(false);
//            jSpinner1.setValue(0);
//
//            lblCodBusque.setText("----------");
//            lblTallaBusq.setText("----------");
//            lblProBusqueda.setText("----------");
//            lblUnidadesActuales.setText("----------");

            JOptionPane.showMessageDialog(null, "No existe el codigo buscado", "Error", JOptionPane.ERROR_MESSAGE);
//            }
        }
    }//GEN-LAST:event_jSpinnerUniVentaMouseClicked

    private void btnAderirAFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAderirAFacturaActionPerformed
        // TODO add your handling code here:
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo para aumentar productos");
        } else {
            int row = jtbProducDisponibles.getSelectedRow();

            Statement st;
            try {
                String[] Registros = new String[5];
                String sql = "SELECT * FROM productos";
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                int cuente = 0;
                while (rs.next()) {
                    System.out.println("contador de :" + cuente++);
                    Registros[1] = rs.getString("IdProduc");
                    System.out.println("Ingresando AL boton de busqueda y contiene: " + Registros[1]);
                    if (txtCodigo.getText().equals(Registros[1])) {
                        System.out.println("encontrado en la fila: " + cuente);
                        int rowss = cuente - 2;
                        String codigo = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 2));
                        String unidades = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 3));
                        String talla = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 1));
                        String camisetaDE = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 0));
                        String detalle = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 3));
                        String precioventa = String.valueOf(jtbProducDisponibles.getValueAt(rowss, 5));
                        System.out.println("El elemento es codigo: " + codigo);
                        

                        lblCodigo.setText(codigo);
                        lblTalla.setText(talla);
                        lblCamisetaHMN.setText(camisetaDE);
                        lblDescripcion.setText(detalle);
                        lblPrecioUnidad.setText(precioventa);

                        Double total = Double.parseDouble(precioventa) * (int) jSpinnerUniVenta.getValue();
                        lblTotal.setText(String.valueOf(total));

//                        jtbProducDisponibles.getSelectionModel().addSelectionInterval(seleccionTabla2, seleccionTabla2);
                        txtCodigo.setText(codigo);
                        return;
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El tipo de error es: " + ex);
            }

            lblCodigo.setText("----------");
            lblTalla.setText("----------");
            lblCamisetaHMN.setText("----------");
            lblDescripcion.setText("----------");
            lblPrecioUnidad.setText("----------");
            lblTotal.setText("0");

            JOptionPane.showMessageDialog(null, "No existe el codigo buscado", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAderirAFacturaActionPerformed

    private void txtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseClicked
        // TODO add your handling code here:
        lblCodigo.setText("----------");
            lblTalla.setText("----------");
            lblCamisetaHMN.setText("----------");
            lblDescripcion.setText("----------");
            lblPrecioUnidad.setText("----------");
            lblTotal.setText("0");
//        jSpinner1.setEnabled(false);
//        btnCancelaSuma.setEnabled(false);
//        btnSumaProductos.setEnabled(false);
        jSpinnerUniVenta.setValue(1);

        jtbProducDisponibles.setSelectionMode(seleccionTabla2);//.addSelectionInterval(seleccionTabla2, seleccionTabla2);
        seleccionTabla2 = 0;
    }//GEN-LAST:event_txtCodigoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrClientes abrir = new JFrClientes();
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFProforma().setVisible(true);
            }
        });
    }

    public void llenarCmbDefecto() {

        cmbPoducDisponible.addItem("Seleccione");
        cmbPoducDisponible.addItem("Hombre");
        cmbPoducDisponible.addItem("Mujer");
        cmbPoducDisponible.addItem("Niñ@");
    }

    public void llenarTablaProducVenta() {

//        ClsConection cc = new ClsConection();
        Conexion cc = new Conexion();
        Connection cn = cc.getConnection();

        ConexionInter.Conexion.getConnection();
        System.out.println("LA conexcion se establecio");

        String[] Titulos2 = {"CAMISETA DE", "TALLA", "CÓDIGO", "DETALLE", "UNIDADES DISPONIBLES", "PRECIO POR UNIDAD"};
        String[] RegistrosA = new String[6];

        String sql = "SELECT * FROM productos where unidadesProduc > 0";
        DefaultTableModel VenderProductos = (DefaultTableModel) jtbProducDisponibles.getModel();
        VenderProductos = new DefaultTableModel(null, Titulos2);

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                RegistrosA[0] = rs.getString("camisetaHMN");
                RegistrosA[1] = rs.getString("tallaProduc");
                RegistrosA[2] = rs.getString("IdProduc");
                RegistrosA[3] = rs.getString("detalles");
                RegistrosA[4] = rs.getString("unidadesProduc");
                RegistrosA[5] = rs.getString("precioVentaProduc");
                VenderProductos.addRow(RegistrosA);
            }
            jtbProducDisponibles.setModel(VenderProductos);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El tipo de error es: " + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAderirAFactura;
    private javax.swing.JComboBox<String> cmbPoducDisponible;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerUniVenta;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtbProducDisponibles;
    private javax.swing.JLabel lblCamisetaHMN;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblPrecioUnidad;
    private javax.swing.JLabel lblTalla;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

}