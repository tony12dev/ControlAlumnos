/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author tonny
 */
public class UsuarioDT {

    private int idusuario;
    private String nombre;
    private String usuario;
    private String contraseña;

    public UsuarioDT(int idusuario, String nombre, String usuario, String contraseña) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

   

    public UsuarioDT() {
    
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }    

}
