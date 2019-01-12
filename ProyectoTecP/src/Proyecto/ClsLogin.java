/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author CASA
 */
public class ClsLogin {

    private String usuario;
    private String clave;

    public ClsLogin() {
        this.usuario="omar";
        this.clave="6194omar";

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean comprobar(String admin, String pass){
        boolean ToF = false;
        if(admin.equals(this.usuario)){
            if(pass.equals(clave)){
                System.out.println("Datos ingresados con exito");
                return true;
            }else{
                System.out.println("La clave no coincide");
            }
        }else{
            System.out.println("Usuario no existe");
        }
        return false;
    }
    

}
