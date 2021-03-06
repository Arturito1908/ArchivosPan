package frontend;

import conexion.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menuPan extends javax.swing.JFrame {
    
    conexion con = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel tablaMP = new DefaultTableModel(){
        @Override // De esta forma no se puede editar la tabla en ejecucion
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };    
    int id;
    
    public menuPan() {
        initComponents();
        this.setLocationRelativeTo(null);
        verTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     * .- .-. - ..- .-. ---
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        borrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        areaID = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        crear1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.setLayout(null);

        borrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("BORRAR");
        borrar.setBorder(null);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel1.add(borrar);
        borrar.setBounds(430, 410, 160, 30);

        buscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.setBorder(null);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar);
        buscar.setBounds(570, 130, 140, 30);

        Titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("EL TRIGO DE ORO");
        jPanel1.add(Titulo);
        Titulo.setBounds(250, 10, 330, 40);

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
        areaID.setBounds(210, 150, 340, 30);

        actualizar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("ACTUALIZAR");
        actualizar.setBorder(null);
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar);
        actualizar.setBounds(180, 410, 140, 30);

        jLabel4.setBackground(new java.awt.Color(0, 102, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID PRODUCTO:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 150, 140, 30);

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
        crear.setBounds(570, 80, 140, 30);

        crear1.setBackground(new java.awt.Color(51, 51, 255));
        crear1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        crear1.setForeground(new java.awt.Color(255, 255, 255));
        crear1.setText("PROVEEDORES");
        crear1.setBorder(null);
        crear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear1ActionPerformed(evt);
            }
        });
        jPanel1.add(crear1);
        crear1.setBounds(60, 20, 150, 30);

        tabla.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 200, 650, 200);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoTrigoDeOro (1)_1.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 40, 120, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
    Connection conexion = null;

        try {
            conexion = con.getConnection();//se establece la conexion
            ps = conexion.prepareStatement("delete from trigodeoro.materias_primas where id_mp=?");

            ps.setInt(1, Integer.parseInt(areaID.getText()));

            int resultado = ps.executeUpdate();// Ejecuta la eliminacion dentro de la DB

            if (resultado > 0) {

                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
               
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro", "ERROR", JOptionPane.ERROR_MESSAGE);

            }

            conexion.close();//Cierra la conexion

        } catch (Exception ex) {

            System.err.println("Error, " + ex);
        }
        
        
    }//GEN-LAST:event_borrarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       boolean encontrado = false;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            if (tabla.getValueAt(i, 0).equals(areaID.getText())) {
                tabla.changeSelection(i, 1, false, false);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No existe el registro", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void areaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaIDActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        //Try-catch para que se tome un dato
         Connection conexion = null;
        
        try {

            conexion = con.getConnection();
            ps = conexion.prepareStatement("select * from trigodeoro.materias_primas where id_mp=?");//Se hace la consula de la clave
            ps.setInt(1, Integer.valueOf(areaID.getText()));//Indica que va a buscar
            rs = ps.executeQuery();//Muestra el resultado

            if (rs.next()) {

                //Obtengo los datos de la DB y los muestro en mis cajas
                actualizarPan actuaPan = new actualizarPan();
                actuaPan.areaID.setText(String.valueOf(rs.getString("id_mp")));
                actuaPan.areaID.setText(rs.getString("nombre_mp"));
                actuaPan.areaFecha.setText(rs.getString("fecha_compra"));
                actuaPan.areaCantidad.setText(rs.getString("cantidad"));
                actuaPan.areaCaducidad.setText(rs.getString("caducidad"));
                actuaPan.areaCosto.setText(rs.getString("costo"));
                actuaPan.inicial();
                dispose();
            } else {

        
            }


        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
        
    }//GEN-LAST:event_actualizarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // Cambio de ventanas para Crear un producto
        crearPan objeto1 = new crearPan();
        objeto1.inicial();
        dispose();
    }//GEN-LAST:event_crearActionPerformed

    private void crear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear1ActionPerformed
        // Cambio de ventana al menu de Provedores
        menuProveedores objeto1 = new menuProveedores();
        objeto1.inicial();
        dispose();
    }//GEN-LAST:event_crear1ActionPerformed

   public void verTabla() {

        Connection conexion = null;

        try {

            conexion = con.getConnection();
            ps = conexion.prepareStatement("select * from trigodeoro.materias_primas");//Se buscan todos los proveedores
            rs = ps.executeQuery();//Ejecuta el Query
            tablaMP.addColumn("ID");
            tablaMP.addColumn("Nombre del producto");
            tablaMP.addColumn("fecha de compra");
            tablaMP.addColumn("cantidad");
            tablaMP.addColumn("caducidad");
            tablaMP.addColumn("costo");

            while (rs.next()) {
                tablaMP.addRow(new Object[]{rs.getString("id_mp"), rs.getString("nombre_mp"), rs.getString("fecha_compra"),
                rs.getString("cantidad"), rs.getString("caducidad"), rs.getString("costo")});
            }
            tabla.setModel(tablaMP);

            conexion.close();

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }
    
    public void inicial() {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField areaID;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton crear;
    private javax.swing.JButton crear1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    
}


