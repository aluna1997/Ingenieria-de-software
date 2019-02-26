/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.fciencias.mapita.controlador;

import javax.faces.bean.ManagedBean;
import unam.fciencias.mapita.modelo.Marcador;
import unam.fciencias.mapita.modelo.MarcadorDAO;
import unam.fciencias.mapita.modelo.UsuarioDAO;

/**
 *
 * @author default
 */
@ManagedBean
public class AgregarMarcador {
    private int usuario;
    private String descripcion;
    private double longitud;
    private double latutu;
    
    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
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

    public double getLatutu() {
        return latutu;
    }

    public void setLatutu(double latutu) {
        this.latutu = latutu;
    }
    
    public void agregarMarcador(){
        Marcador m = new Marcador();
        UsuarioDAO u = new UsuarioDAO();
        m.setLatutu(latutu);
        m.setUsuario(u.find(usuario));
        m.setDescripcion(descripcion);
        m.setLongitud(longitud);
        MarcadorDAO udb = new MarcadorDAO();
        udb.save(m);
        
    }
    
    
}
