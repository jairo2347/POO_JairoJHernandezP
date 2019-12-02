package app;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AngelDeLaraPC
 */

    
public class Conexion {
    public static String url;
    public static String user;
    public static String pass;
    
    
    public Conexion(){
        Conexion.url = "jdbc:mysql://localhost:3306/inventario";
        Conexion.user  = "root";
        Conexion.pass = "";
    }
        
     public Connection getConexion(){
         Connection con = null;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);
            //JOptionPane.showMessageDialog(new JFrame(), "          Conexión exitosa...", "MySQL dice: ", JOptionPane.PLAIN_MESSAGE);
            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
             System.out.println(ex);
        }
         return con;
     }          
}