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
import java.sql.CallableStatement;
import java.sql.SQLException;

public class ProcedimientosAlmacenados {

    public static void RegistroProducto(String a, String b, String c, String d, String e, String f) throws SQLException {
        CallableStatement registro = Conexion.getConnection().prepareCall("{call AgregaProducto(?,?,?,?,?,?)}");
        registro.setString(1, a);
        registro.setString(2, b);
        registro.setString(3, c);
        registro.setString(4, d);
        registro.setString(5, e);
        registro.setString(6, f);
        registro.execute();
    }

    public static void EliminarRegistroProducto(String a) throws SQLException {
        CallableStatement registro = Conexion.getConnection().prepareCall("{call EliminarProducto(?)}");
        registro.setString(1, a);
        registro.execute();
    }

    public static void BuscarProductoCodigo(String a) throws SQLException {
        CallableStatement registro = Conexion.getConnection().prepareCall("{call BusquedaProductoPorCod(?)}");
        registro.setString(0, a);
        registro.execute();
    }

    public static void RegistrarClient(String a, String b, String c, String d, String e, String f, String g) throws SQLException {
        CallableStatement registro = Conexion.getConnection().prepareCall("{call AgregaCliente(?,?,?,?,?,?,?)}");
        registro.setString(1, a);
        registro.setString(2, b);
        registro.setString(3, c);
        registro.setString(4, d);
        registro.setString(5, e);
        registro.setString(6, f);
        registro.setString(7, g);
        registro.execute();
    }
    
    public static void EliminarClienteCod(String a)throws SQLException {
        CallableStatement registro = Conexion.getConnection().prepareCall("{call EliminarCliente(?)}");
        registro.setString(1, a);
        registro.execute();
    }

}
