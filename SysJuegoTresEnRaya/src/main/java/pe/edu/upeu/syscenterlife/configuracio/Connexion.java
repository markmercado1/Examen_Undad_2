
package pe.edu.upeu.syscenterlife.configuracio;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

    public static Connection getConexion() {
        Connection con = null;
        try {
            // Cargar el controlador JDBC de SQLite
            Class.forName("org.sqlite.JDBC");

            // Establecer la conexión con la base de datos SQLite
            String url = "jdbc:sqlite:C:\\Examen_Undad_2\\SysJuegoTresEnRaya\\data\\DB_JUEGO.db";
            con = DriverManager.getConnection(url);

            System.out.println("Conexion exitosa a la base de datos SQLite!");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
    
    public static void main(String[] args) {
        Connexion.getConexion();
        
    }
    
}

