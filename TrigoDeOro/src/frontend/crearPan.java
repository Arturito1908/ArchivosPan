package frontend;

import java.sql.*;
import conexion.conexion;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class crearPan extends javax.swing.JFrame {

    conexion con = new conexion();
    PreparedStatement ps;
    ResultSet rs;
//    materiaPrima materia = new materiaPrima();

    public crearPan() {
        initComponents();
        this.setLocationRelativeTo(null);
        //rellenarComboProveedores(combo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        crear = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        areaCaducidad = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        textoCantidad = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        areaNombre = new javax.swing.JTextField();
        textoFecha = new javax.swing.JLabel();
        textoCaducidad = new javax.swing.JLabel();
        textoCosto = new javax.swing.JLabel();
        areaFecha = new javax.swing.JTextField();
        areaCantidad = new javax.swing.JTextField();
        textoTitulo2 = new javax.swing.JLabel();
        areaCosto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.setLayout(null);

        crear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        crear.setForeground(new java.awt.Color(255, 255, 255));
        crear.setText("CREAR");
        crear.setBorder(null);
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        jPanel1.add(crear);
        crear.setBounds(320, 420, 160, 50);

        Titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("EL TRIGO DE ORO");
        jPanel1.add(Titulo);
        Titulo.setBounds(140, 20, 330, 40);

        areaCaducidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        areaCaducidad.setForeground(new java.awt.Color(0, 0, 0));
        areaCaducidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaCaducidad.setBorder(null);
        areaCaducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCaducidadActionPerformed(evt);
            }
        });
        jPanel1.add(areaCaducidad);
        areaCaducidad.setBounds(190, 280, 340, 30);

        cancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("CANCELAR");
        cancelar.setBorder(null);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar);
        cancelar.setBounds(110, 420, 150, 50);

        textoCantidad.setBackground(new java.awt.Color(0, 102, 255));
        textoCantidad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textoCantidad.setForeground(new java.awt.Color(0, 0, 0));
        textoCantidad.setText("Cantidad:");
        jPanel1.add(textoCantidad);
        textoCantidad.setBounds(40, 230, 110, 30);

        textoNombre.setBackground(new java.awt.Color(0, 102, 255));
        textoNombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre.setText("Nombre:");
        jPanel1.add(textoNombre);
        textoNombre.setBounds(40, 130, 80, 30);

        areaNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        areaNombre.setForeground(new java.awt.Color(0, 0, 0));
        areaNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaNombre.setBorder(null);
        areaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaNombreActionPerformed(evt);
            }
        });
        jPanel1.add(areaNombre);
        areaNombre.setBounds(190, 130, 340, 30);

        textoFecha.setBackground(new java.awt.Color(0, 102, 255));
        textoFecha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textoFecha.setForeground(new java.awt.Color(0, 0, 0));
        textoFecha.setText("Fecha de compra:");
        jPanel1.add(textoFecha);
        textoFecha.setBounds(40, 180, 150, 30);

        textoCaducidad.setBackground(new java.awt.Color(0, 102, 255));
        textoCaducidad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textoCaducidad.setForeground(new java.awt.Color(0, 0, 0));
        textoCaducidad.setText("Caducidad:");
        jPanel1.add(textoCaducidad);
        textoCaducidad.setBounds(40, 280, 100, 30);

        textoCosto.setBackground(new java.awt.Color(0, 102, 255));
        textoCosto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textoCosto.setForeground(new java.awt.Color(0, 0, 0));
        textoCosto.setText("Costo:");
        jPanel1.add(textoCosto);
        textoCosto.setBounds(40, 330, 110, 30);

        areaFecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        areaFecha.setForeground(new java.awt.Color(0, 0, 0));
        areaFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaFecha.setBorder(null);
        areaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaFechaActionPerformed(evt);
            }
        });
        jPanel1.add(areaFecha);
        areaFecha.setBounds(190, 180, 340, 30);

        areaCantidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        areaCantidad.setForeground(new java.awt.Color(0, 0, 0));
        areaCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaCantidad.setBorder(null);
        areaCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(areaCantidad);
        areaCantidad.setBounds(190, 230, 340, 30);

        textoTitulo2.setBackground(new java.awt.Color(0, 102, 255));
        textoTitulo2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textoTitulo2.setForeground(new java.awt.Color(0, 0, 0));
        textoTitulo2.setText("Actualizar producto");
        jPanel1.add(textoTitulo2);
        textoTitulo2.setBounds(250, 70, 160, 40);

        areaCosto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        areaCosto.setForeground(new java.awt.Color(0, 0, 0));
        areaCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaCosto.setBorder(null);
        areaCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCostoActionPerformed(evt);
            }
        });
        jPanel1.add(areaCosto);
        areaCosto.setBounds(190, 330, 340, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoTrigoDeOro (1)_1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 110, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        Connection conexion = null;

        try {
            conexion = con.getConnection();//se establece la conexion
            ps = conexion.prepareStatement("INSERT INTO trigodeoro.materias_primas(nombre_mp,fecha_compra,cantidad,caducidad,costo) VALUES(?,?,?,?,?)");//Vincula con la tabla materias_primas

            //Todo lo de abajo sirve para poder llenar el CRUD
            ps.setString(1, areaNombre.getText());//El entero hace referencia a la posicion del "?" que se puso en la vinculacion
            ps.setDate(2, Date.valueOf(areaFecha.getText()));
            ps.setInt(3, Integer.valueOf(areaCantidad.getText()));
            ps.setDate(4, Date.valueOf(areaCaducidad.getText()));
            ps.setDouble(5, Double.valueOf(areaCosto.getText()));
            //ps.setDate(6, Date.valueOf(fechanac.getText()));

            int resultado = ps.executeUpdate();// Ejecuta la insercion dentro de la DB

            if (resultado > 0) {

                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                menuPan objeto1 = new menuPan();
                objeto1.inicial();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar el registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            conexion.close();//Cierra la conexion

        } catch (Exception ex) {

            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_crearActionPerformed

    private void areaCaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCaducidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaCaducidadActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // Cambio de ventanas para ir al menu de producto
        menuPan objeto1 = new menuPan();
        objeto1.inicial();
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void areaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaNombreActionPerformed

    private void areaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaFechaActionPerformed

    private void areaCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaCantidadActionPerformed

    private void areaCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaCostoActionPerformed

    
    public void inicial() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearPan().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField areaCaducidad;
    private javax.swing.JTextField areaCantidad;
    private javax.swing.JTextField areaCosto;
    private javax.swing.JTextField areaFecha;
    private javax.swing.JTextField areaNombre;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoCaducidad;
    private javax.swing.JLabel textoCantidad;
    private javax.swing.JLabel textoCosto;
    private javax.swing.JLabel textoFecha;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoTitulo2;
    // End of variables declaration//GEN-END:variables

}
