/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.Serializable;

/**
 *
 * @author CASA
 */
public class ClsProductos implements Serializable{
    
    private String camisetaPara;
    private String talla;
    private String codigo;
    private int unidadProdcu;
    private double precioVentaUnid;

    public ClsProductos() {
    }

    public ClsProductos(String camisetaPara, String talla, String codigo, int unidadProdcu, double precioVentaUnid) {
        this.camisetaPara = camisetaPara;
        this.talla = talla;
        this.codigo = codigo;
        this.unidadProdcu = unidadProdcu;
        this.precioVentaUnid = precioVentaUnid;
    }

    
    public String getCamisetaPara() {
        return camisetaPara;
    }

    public void setCamisetaPara(String camisetaPara) {
        this.camisetaPara = camisetaPara;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUnidadProdcu() {
        return unidadProdcu;
    }

    public void setUnidadProdcu(int unidadProdcu) {
        this.unidadProdcu = unidadProdcu;
    }

    public double getPrecioVentaUnid() {
        return precioVentaUnid;
    }

    public void setPrecioVentaUnid(double precioVentaUnid) {
        this.precioVentaUnid = precioVentaUnid;
    }

    @Override
    public String toString() {
        return "ClsProductos{" + "camisetaPara=" + camisetaPara + ", talla=" + talla + ", codigo=" + codigo + ", unidadProdcu=" + unidadProdcu + ", precioVentaUnid=" + precioVentaUnid + '}';
    }
    
}
