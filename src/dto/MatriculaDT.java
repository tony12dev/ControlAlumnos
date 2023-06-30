/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TONY
 */
public class MatriculaDT {
    Date date = new Date();
    SimpleDateFormat simpledate = new java.text.SimpleDateFormat("yyyy-mm-dd");
    
 private int idmatricula;
 private String grado;
 private String seccion;
 private String horario;
 private Double precio;
 private Double importe;
 private Double saldo; 
 private String fecha = simpledate.format(date);
 private int comprobante;
 private String numerorecibo;
 private double preciopension;
 private int cantpensiones;
 private String escuela;

    public MatriculaDT() {
    }

    public MatriculaDT(int idmatricula, String grado, String seccion, String horario, Double precio, Double importe, Double saldo, int comprobante, String numerorecibo, double preciopension, int cantpensiones, String escuela) {
        this.idmatricula = idmatricula;
        this.grado = grado;
        this.seccion = seccion;
        this.horario = horario;
        this.precio = precio;
        this.importe = importe;
        this.saldo = saldo;
        this.comprobante = comprobante;
        this.numerorecibo = numerorecibo;
        this.preciopension = preciopension;
        this.cantpensiones = cantpensiones;
        this.escuela = escuela;
    }

    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SimpleDateFormat getSimpledate() {
        return simpledate;
    }

    public void setSimpledate(SimpleDateFormat simpledate) {
        this.simpledate = simpledate;
    }

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getComprobante() {
        return comprobante;
    }

    public void setComprobante(int comprobante) {
        this.comprobante = comprobante;
    }

    public String getNumerorecibo() {
        return numerorecibo;
    }

    public void setNumerorecibo(String numerorecibo) {
        this.numerorecibo = numerorecibo;
    }

    public double getPreciopension() {
        return preciopension;
    }

    public void setPreciopension(double preciopension) {
        this.preciopension = preciopension;
    }

    public int getCantpensiones() {
        return cantpensiones;
    }

    public void setCantpensiones(int cantpensiones) {
        this.cantpensiones = cantpensiones;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
       
}
