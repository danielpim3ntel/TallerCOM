/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author lilia
 */
public class CarroC {
    int id,año;
    String placas,modelo,color,mes,idCl;
    public CarroC(int id,String placas,int año,String modelo,String color,String mes,String idCl) {
        this.id=id;
        this.placas=placas;
        this.año=año;
        this.modelo=modelo;
        this.color=color;
        this.mes=mes;
        this.idCl=idCl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdCl() {
        return idCl;
    }

    public void setIdCl(String idCl) {
        this.idCl = idCl;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
}
