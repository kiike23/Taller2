package edu.uv.model.pojos;
// Generated 06-may-2014 20:27:14 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idUsuario;
     private Personal personal;
     private String usuario;
     private String contrasenia;
     private Integer estado;
     private Set roleses = new HashSet(0);

    public Usuarios() {
    }

	
    public Usuarios(Personal personal, String usuario, String contrasenia) {
        this.personal = personal;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    public Usuarios(Personal personal, String usuario, String contrasenia, Integer estado, Set roleses) {
       this.personal = personal;
       this.usuario = usuario;
       this.contrasenia = contrasenia;
       this.estado = estado;
       this.roleses = roleses;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Integer getEstado() {
        return this.estado;
    }
    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public Set getRoleses() {
        return this.roleses;
    }
    
    public void setRoleses(Set roleses) {
        this.roleses = roleses;
    }




}


