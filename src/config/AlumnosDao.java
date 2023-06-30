/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import dto.AlumnosDT;
import dto.UsuarioDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tonny
 */
public class AlumnosDao extends ConexionBD{
    
    private final static String SQL_INSERT = "insert into alumnos(nombre,apellidoP,apellidoM,edad)values(?,?,?,?)";
    private final static String SQL_UPDATE = "update alumnos set nombre=?,apellidoP=?,apellidoM=?, edad=? where idalumnos=?";
    private final static String DELETE = "delete from alumnos where idalumnos=?";
    private final static String select = "select *from alumnos where nombre=?";
    private final static String SQL_SELECTALL = "select *from alumnos";

    public AlumnosDao() {
        super();
    }
    
    public void crearAlumno(AlumnosDT dto) throws Exception {
        try {
            
            PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_INSERT);
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getApellidoParterno());
        ps.setString(3, dto.getApellidoMaterno());
        ps.setInt(4, dto.getEdad());
        ps.executeUpdate();
            System.out.println("holamundo");
        cerrar(ps);    
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e);
            System.out.println("Algo salio mal en esta insercion");
        }
    }
    
    
    public void ModificarAlumno(AlumnosDT dto) throws Exception {
        try {
            
            PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_UPDATE);
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getApellidoParterno());
        ps.setString(3, dto.getApellidoMaterno());
        ps.setInt(4, dto.getEdad());
        ps.setInt(5, dto.getIdalumnos());
        ps.executeUpdate();
            System.out.println("holamundo");
        cerrar(ps);    
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Algo salio mal");
        }
    }
    
    public void EliminarAlumno(AlumnosDT dto) throws Exception {
    PreparedStatement ps = null;  
     ps = conn.prepareStatement(DELETE);
     ps.setInt(1, dto.getIdalumnos());
     ps.executeUpdate();
     cerrar(ps);  
    }
    
    public AlumnosDT busqueda(AlumnosDT dto)throws Exception{
    
        PreparedStatement ps = null;
        ResultSet rs = null;
        ps = conn.prepareStatement(select);
        
        ps.setString(1, dto.getNombre());
        
        rs = ps.executeQuery();
        
        if(rs.next()){
             dto.setIdalumnos(rs.getInt("idalumnos"));
             dto.setNombre(rs.getString("nombre"));
             dto.setApellidoParterno(rs.getString("apellidoP"));
             dto.setApellidoMaterno(rs.getString("apellidoM"));
             dto.setEdad(rs.getInt("edad"));
        }else{
        //    JOptionPane.showMessageDialog(null, "ERROR Datos no encontrados");
            return null;
        }
        
    return dto;
}
    
   public List ListaAlumnos() throws Exception{
       try {
           List lista = new ArrayList();
       PreparedStatement ps = null;
       ResultSet rs = null;
        AlumnosDT dto;
        ps = conn.prepareStatement(SQL_SELECTALL);
        rs = ps.executeQuery();
    
        while(rs.next()){
          dto = new AlumnosDT();
             dto.setIdalumnos(rs.getInt("idalumnos"));
             dto.setNombre(rs.getString("nombre"));
             dto.setApellidoParterno(rs.getString("apellidoP"));
             dto.setApellidoMaterno(rs.getString("apellidoM"));
             dto.setEdad(rs.getInt("edad"));
          lista.add(dto);
               
        }
      return lista;
       } catch (Exception e) {
           System.out.println(e);
           System.out.println("algo esta mal sss");
       }
       
       return null;
    }    
  
    
}