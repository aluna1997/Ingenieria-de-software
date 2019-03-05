/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.fciencias.mapita.controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import unam.fciencias.mapita.modelo.Usuario;
import unam.fciencias.mapita.modelo.UsuarioDAO;

/**
 *
 * @author default
 */
@ManagedBean
@SessionScoped

public class BuscaPorCorreo {
    public String correo;
    public List<Usuario> resultado;
    
    public List<Usuario> getResultado(){
        return resultado;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String buscaPorCorreo(){
        if(correo.equals(""))
            return "";
        UsuarioDAO ubd = new UsuarioDAO();
        resultado =  ubd.buscaPorCorreo(correo);
        return "resultado?faces-redirect=true";
    }
        
    }
    
