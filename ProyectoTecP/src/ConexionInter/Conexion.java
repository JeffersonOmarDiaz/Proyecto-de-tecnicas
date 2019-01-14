/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionInter;

/**
 *
 * @author Omar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    
    static Connection contacto= null;
    
    public static Connection getConnection(){
        String url="jdbc:sqlserver://DESKTOP-T60A972:1433;databaseName=TiendaSuave";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se puedo estableceer la conexion revisar driver"+e.getMessage());
        }
        try{
            contacto = DriverManager.getConnection(url,"sa","123");
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        return contacto;
    }
    
    public static ResultSet consulta (String consulta){
        Connection con = getConnection();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
          
        }
        return null;
    }
}
