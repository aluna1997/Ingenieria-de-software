/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.fciencias.mapita.controlador;

import javax.faces.bean.ManagedBean;
import unam.fciencias.mapita.modelo.Marcador;
import unam.fciencias.mapita.modelo.MarcadorDAO;
import unam.fciencias.mapita.modelo.Usuario;

/**
 *
 * @author default
 */
@ManagedBean
public class EliminaMarcador {
    private int idmarcador;
    private Usuario usuario;
    private String descripcion;
    private double longitud;
    private double latitud;
    
    
    public int getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    
    public void eliminarMarcador(){
        MarcadorDAO udb = new MarcadorDAO();
        Marcador m = udb.find(idmarcador);
        if(m != null){
            udb.delete(m);
        }
    }
     
}
