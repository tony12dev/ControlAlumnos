/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import dto.MatriculaDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TONY
 */
public class MatriculaDao extends ConexionBD {

    private final static String SQL_INSERT = "insert into matricula(grado,seccion,horario,precio,importe,saldo,fecha,comprobante,norecibo,preciopension,cantpensiones)values(?,?,?,?,?,?,?,?,?,?,?)";
    private final static String SQL_UPDATE = "update matricula set grado=?,seccion=?,horario=?,precio=?,importe=?,saldo=?,fecha=?,comprobante=?,norecibo=?,preciopension=?,cantpensiones=? where idmatricula=?";
    private final static String DELETE = "delete from matricula where idmatricula=?";
    private final static String select = "select *from matricula where matricula=?";
    private final static String select2 = "select *from matricula where comprobante=?";
    private final static String SQL_SELECTALL = "select *from matricula";

    public MatriculaDao() {

    }

    public void AgregarMatricula(MatriculaDT dto) throws Exception {
        try {

        PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_INSERT);
        ps.setString(1, dto.getGrado());
        ps.setString(2, dto.getSeccion());
        ps.setString(3, dto.getHorario());
        ps.setDouble(4, dto.getPrecio());
        ps.setDouble(5, dto.getImporte());
        ps.setDouble(6, dto.getSaldo());
        ps.setString(7, dto.getFecha());
        ps.setInt(8, dto.getComprobante());
        ps.setString(9, dto.getNumerorecibo());
        ps.setDouble(10, dto.getPreciopension());
        ps.setInt(11, dto.getCantpensiones());
       
        ps.executeUpdate();
            System.out.println("holamundo");
        cerrar(ps);
            
            
        } catch (Exception e) {
              System.out.println("algo salio mal en esta insercion");
        }

    }
    public void ModificarMatricula(MatriculaDT dto) throws Exception {
    
    }
    
    public MatriculaDT BuscarMatricula(MatriculaDT dto) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ps = conn.prepareStatement(select2);
        
        ps.setInt(1, dto.getComprobante());
        
        rs = ps.executeQuery();
        
        if(rs.next()){
             dto.setComprobante(rs.getInt("comprobante"));
        }else{
        //    JOptionPane.showMessageDialog(null, "ERROR Datos no encontrados");
            return null;
        }
        
    return dto;
    
    }

}
