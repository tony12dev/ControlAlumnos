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
public class ComprobantesDT {
    
    private int idcomprobantes;
    private String serie;
    private String nInicio;
    private String nFin;
    private String tipoComprobante;

    public ComprobantesDT(int idcomprobantes, String nInicio, String nFin, String serie, String tipoComprobante) {
        this.idcomprobantes = idcomprobantes;
        this.nInicio = nInicio;
        this.nFin = nFin;
        this.serie = serie;
        this.tipoComprobante = tipoComprobante;
    }
    
    
    public ComprobantesDT() {
    }


    public int getIdcomprobantes() {
        return idcomprobantes;
    }

    public void setIdcomprobantes(int idcomprobantes) {
        this.idcomprobantes = idcomprobantes;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getnInicio() {
        return nInicio;
    }

    public void setnInicio(String nInicio) {
        this.nInicio = nInicio;
    }

    public String getnFin() {
        return nFin;
    }

    public void setnFin(String nFin) {
        this.nFin = nFin;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
         
    @Override
    public String toString() {
      
     String a = String.valueOf(this.idcomprobantes);
         
     return serie;
    }
  
    public int a() {
     
        return  idcomprobantes;
    }
  
    
    
       
    
}