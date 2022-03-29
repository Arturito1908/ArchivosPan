package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class conexion {

    public static final String URL = "jdbc:mysql://129.146.254.135:3305/trigodeoro?zeroDateTimeBehavior=convertToNull";//URL para saber donde está la base de datos
    public static final String usuario = "equipo05";
    public static final String contraseña = "qlona";

    public conexion() {
    }

    public Connection getConnection() {

        Connection conexion = null;//variable de tipo Connection para poder establecer la conexion
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, usuario, contraseña); //Establece la conexion
        } catch (Exception ex) { //Cacha excepciones por si surge alguna
            System.err.println("Error " + ex);
        }

        return conexion;//Retorno la conexion, si salió xd
    }

}
