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
public class AlumnosDT {

private int idalumnos;
private String nombre;
private String apellidoParterno;
private String apellidoMaterno;
private int edad;



public AlumnosDT(){

}

   public AlumnosDT(int idalumnos, String nombre, String apellidoParterno, String apellidoMaterno, int edad) {
        this.idalumnos = idalumnos;
        this.nombre = nombre;
        this.apellidoParterno = apellidoParterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
    }

    public int getIdalumnos() {
        return idalumnos;
    }

    public void setIdalumnos(int idalumnos) {
        this.idalumnos = idalumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoParterno() {
        return apellidoParterno;
    }

    public void setApellidoParterno(String apellidoParterno) {
        this.apellidoParterno = apellidoParterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

        
}
