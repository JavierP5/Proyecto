  
package sistemadegestiondealumnos;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.beans.Statement;
import javax.swing.JOptionPane;
import java.sql.*;


public class CConexion {
    Connection conectar = null;
    String usuario = "postgres";
    String contrasenia = "debian";
    String bd = "futbol2";
    String ip = "localhost";
    String puerto = "5432";
    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    public Connection establecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conectó a la BD");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse: " + e.toString());
        }
        return conectar;
    }
 
}
    

