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
public class AjusteC {
    int id;
    float costo;
    String fecha, tipoAj, descripcion, pendientes,carro,trabajador;
    public AjusteC(int id, String fecha, String tipoAj, String descripcion, String pendientes, String carro, String trabajador, float costo){
        this.id=id;
        this.fecha=fecha;
        this.tipoAj=tipoAj;
        this.descripcion=descripcion;
        this.pendientes=pendientes;
        this.carro=carro;
        this.trabajador=trabajador;
        this.costo=costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoAj() {
        return tipoAj;
    }

    public void setTipoAj(String tipoAj) {
        this.tipoAj = tipoAj;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPendientes() {
        return pendientes;
    }

    public void setPendientes(String pendientes) {
        this.pendientes = pendientes;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }
    
    
    
}
