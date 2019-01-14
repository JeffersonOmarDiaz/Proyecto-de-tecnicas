/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CASA
 */
public class ClsConection {
//    private String driver="com.mysql.jdbc.Driver";

    private String driver = "com.mysql.jdbc.Driver";
    private String cadenaConection = "jdbc:mysql://127.0.0.1/tiendasuave";
    private String usuario = "oamr";
    private String contraseña = "12345";
    public Connection con = null;

    public ClsConection() {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(cadenaConection, usuario, contraseña);
            if (con != null){
            System.out.println("Coneccion establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("errro al conectar: "+e);
        }
    }

    ///este metodo nos retorna a conexion
    public Connection getConnection(){
        return con;
    }
    //con este metodo me desconecto de la bas de datos 
    public void desconectar(){
        con=null;
        if(con == null){
            System.out.println("Coneccion terminada");
        }
    }
}
