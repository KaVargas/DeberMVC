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
public class ProgramaVo {
    private int ID_PROGRAMA;
    private int ID_CANAL;
    private String NOMBRE;
    private int HORA_INICIO;
    private int HORA_FIN;

    public int getID_PROGRAMA() {
        return ID_PROGRAMA;
    }

    public void setID_PROGRAMA(int ID_PROGRAMA) {
        this.ID_PROGRAMA = ID_PROGRAMA;
    }

    public int getID_CANAL() {
        return ID_CANAL;
    }

    public void setID_CANAL(int ID_CANAL) {
        this.ID_CANAL = ID_CANAL;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getHORA_INICIO() {
        return HORA_INICIO;
    }

    public void setHORA_INICIO(int HORA_INICIO) {
        this.HORA_INICIO = HORA_INICIO;
    }

    public int getHORA_FIN() {
        return HORA_FIN;
    }

    public void setHORA_FIN(int HORA_FIN) {
        this.HORA_FIN = HORA_FIN;
    }
   
}
