package unam.fciencias.mapita.modelo;
// Generated 5/02/2019 03:58:19 PM by Hibernate Tools 4.3.1



/**
 * Marcador generated by hbm2java
 */
public class Marcador implements java.io.Serializable {
     private int idmarcador;
     private Usuario usuario;
     private String descripcion;
     private double longitud;
     private double latutu;
     private int idusuario;

    public Marcador() {
    }

    public Marcador(int idmarcador, Usuario usuario, String descripcion, double longitud, double latitud, int idusuario) {
       this.idmarcador = idmarcador;
       this.usuario = usuario;
       this.descripcion = descripcion;
       this.longitud = longitud;
       this.latutu = latitud;
       this.idusuario = idusuario;
    }
   
    public int getIdmarcador() {
        return this.idmarcador;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getLatutu() {
        return this.latutu;
    }
    
    public void setLatutu(double latutu) {
        this.latutu = latutu;
    }

    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    
    

}

