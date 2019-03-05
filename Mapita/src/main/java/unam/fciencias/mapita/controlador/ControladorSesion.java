/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.fciencias.mapita.controlador;

import java.util.List;
import unam.fciencias.mapita.modelo.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import unam.fciencias.mapita.modelo.UsuarioDAO;

/**
 *
 * @author falv
 */
@ManagedBean
@SessionScoped
public class ControladorSesion {
    private String correo;
    private String contrasesnia;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasesnia() {
        return contrasesnia;
    }

    public void setContrasesnia(String contrasesnia) {
        this.contrasesnia = contrasesnia;
    }
    
    public String login(){
        List<Usuario> user = null;
        UsuarioDAO usr = new UsuarioDAO();
        user = usr.buscaPorCorreo(correo);
        String resultado = "";
        FacesContext context = FacesContext.getCurrentInstance();
        if(user != null){
            for(Usuario log : user){
                if (log.getCorreo().equals(correo)){
                    if(log.getContrasenia().equals(contrasesnia)){
                        context.getExternalContext().getSessionMap().put("user",user);
                        resultado = "/user/perfil?faces-redirect=true";
                    }
                }

            }
        
        }
        
        return resultado;
    }
    
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index?faces-redirect=true";
    }
}