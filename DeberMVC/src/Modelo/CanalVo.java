/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author kened
 */
public class CanalVo {
    private int ID_CANAL;
    private int ID_PAQUETE;
    private String NOMBRE; 
    private String CATEGORIA;

    public int getID_CANAL() {
        return ID_CANAL;
    }

    public void setID_CANAL(int ID_CANAL) {
        this.ID_CANAL = ID_CANAL;
    }

    public int getID_PAQUETE() {
        return ID_PAQUETE;
    }

    public void setID_PAQUETE(int ID_PAQUETE) {
        this.ID_PAQUETE = ID_PAQUETE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }
    
    
}
