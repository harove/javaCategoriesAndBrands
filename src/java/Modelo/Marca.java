/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author edgar.haro
 */
public class Marca {
    private int codigoMarca;
    private String nombreMarca;

    public Marca(int codigoMarca, String nombreMarca) {
        this.codigoMarca = codigoMarca;
        this.nombreMarca = nombreMarca;
    }

    public Marca() {
        this.codigoMarca=0;
        this.nombreMarca="";
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    } 
}
