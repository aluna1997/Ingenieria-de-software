/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.fciencias.mapita.controlador;

import javax.faces.bean.ManagedBean;
import unam.fciencias.mapita.modelo.Marcador;
import unam.fciencias.mapita.modelo.MarcadorDAO;

/**
 *
 * @author ailyn
 */
@ManagedBean
public class ActualizaMarcador {
    private int idmarcador;
    private String descripcion;
    private Double longitud;
    private Double latitud;
    private int idusuario;

    public int getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    public void actualizaMarcador(){
        MarcadorDAO mdao = new MarcadorDAO();
        Marcador m = mdao.find(idusuario);
        System.out.println(m);
        if (m != null){
            if(m.getDescripcion() != null)
                m.setDescripcion(descripcion);
            if(m.getLongitud() !=  0.00)
                m.setLongitud(longitud);
            //if(getLatitud() !=  0.00)
                //m.setLatutu(latitud);
            if(m.getIdusuario() != 0.00)
                m.setIdusuario(idusuario);
            mdao.update(m);
        }
    }
}