/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.*;
import javax.swing.*;

public class ClsConexion {
     Connection conect = null;
   public Connection conexion()
    {
      try{
         Class.forName("com.mysql.jdbc.Driver");
         conect =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/suave","root","");
        
      }catch(ClassNotFoundException  | SQLException e){
          JOptionPane.showMessageDialog(null, "Error al conectarse");
          
      }
     return conect;
    }
}
