package frontend;

import conexion.conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class crearProveedor extends javax.swing.JFrame {
    
//    Proveedor proveedor01 = new Proveedor();
      conexion con = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public crearProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        areaTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        areaID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        areaNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.setLayout(null);

        agregar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("AGREGAR");
        agregar.setBorder(null);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar);
        agregar.setBounds(350, 260, 160, 30);

        Titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("EL TRIGO DE ORO");
        jPanel1.add(Titulo);
        Titulo.setBounds(140, 20, 340, 40);

        areaTelefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        areaTelefono.setForeground(new java.awt.Color(0, 0, 0));
        areaTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaTelefono.setBorder(null);
        areaTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(areaTelefono);
        areaTelefono.setBounds(170, 200, 340, 30);

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CREAR PROVEEDOR");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 60, 200, 40);

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
        cancelar.setBounds(60, 260, 140, 30);

        jLabel4.setBackground(new java.awt.Color(0, 102, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Teléfono:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 200, 80, 30);

        jLabel5.setBackground(new java.awt.Color(0, 102, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 110, 80, 30);

        areaID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        areaID.setForeground(new java.awt.Color(0, 0, 0));
        areaID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaID.setBorder(null);
        areaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaIDActionPerformed(evt);
            }
        });
        jPanel1.add(areaID);
        areaID.setBounds(170, 100, 340, 30);

        jLabel6.setBackground(new java.awt.Color(0, 102, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 150, 80, 30);

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
        areaNombre.setBounds(170, 150, 340, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoTrigoDeOro (1)_1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 110, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void insertaTelefono(){
            Connection conexion = null;

        try {
            conexion = con.getConnection();//se establece la conexion
            ps = conexion.prepareStatement("INSERT INTO trigodeoro.telefonos(telefono,id_proveedor) VALUES(?,?)");//Vincula con la tabla persona
            
            try {
                long tel = Long.parseLong(areaTelefono.getText());
            }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "No es correcto el formato del número", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            ps.setString(1, areaTelefono.getText());
            ps.setInt(2, Integer.valueOf(areaID.getText()));//El entero hace referencia a la posicion del "?" que se puso en la vinculacion
            
            int resultado = ps.executeUpdate();// Ejecuta la insercion dentro de la DB

            if (resultado > 0) {

                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                menuProveedores mp = new menuProveedores();
                mp.inicial();
                dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            conexion.close();//Cierra la conexion

        } catch (Exception ex) {

            System.err.println("Error, " + ex);
        }
    }
    
    public void insertaProveedor(){
        Connection conexion = null;

        try {
            conexion = con.getConnection();//se establece la conexion
            ps = conexion.prepareStatement("INSERT INTO trigodeoro.proveedores(id_proveedor,nombre_proveedor) VALUES(?,?)");//Vincula con la tabla persona

            ps.setInt(1, Integer.valueOf(areaID.getText()));//El entero hace referencia a la posicion del "?" que se puso en la vinculacion
            ps.setString(2, areaNombre.getText());
            int resultado = ps.executeUpdate();// Ejecuta la insercion dentro de la DB

            if (resultado > 0) {

                insertaTelefono();
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar el registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            conexion.close();//Cierra la conexion

        } catch (Exception ex) {

            System.err.println("Error, " + ex);
        }
    
    }
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        insertaProveedor();
    }//GEN-LAST:event_agregarActionPerformed

    private void areaTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTelefonoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // Cambio de ventanas al menu
        menuProveedores objeto1 = new menuProveedores();
        objeto1.inicial();
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void areaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaIDActionPerformed

    private void areaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaNombreActionPerformed

    public void inicial() {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField areaID;
    private javax.swing.JTextField areaNombre;
    private javax.swing.JTextField areaTelefono;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}


