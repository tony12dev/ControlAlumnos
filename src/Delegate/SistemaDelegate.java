/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delegate;

import config.AlumnosDao;
import config.ComprobantesDao;
import config.MatriculaDao;
import config.UsuariosDao;
import dto.AlumnosDT;
import dto.ComprobantesDT;
import dto.MatriculaDT;
import dto.UsuarioDT;
import java.util.List;

/**
 *
 * @author tonny
 */
public class SistemaDelegate {
    
    public void agregarUsuario(UsuarioDT dto) throws Exception {
        
        UsuariosDao dao = new UsuariosDao();
        dao.crearUsuario(dto);
        
    }
    
    public void actualizarUsuario(UsuarioDT dto) throws Exception {
        
        UsuariosDao dao = new UsuariosDao();
        dao.actualizarUsuario(dto);
        
    }
    
    public void eliminarUsuario(UsuarioDT dto) throws Exception {
        
        UsuariosDao dao = new UsuariosDao();
        dao.eliminarUsuario(dto);
        
    }
    
    public UsuarioDT BuscarUsuario(UsuarioDT dto) throws Exception {
    
     UsuariosDao dao = new UsuariosDao();
    
      return dao.busqueda(dto);
    }
    
    public List lsUsuarios() throws Exception{
        UsuariosDao dao = new UsuariosDao();
        return dao.ListaUsuario();
    
    } 
    
    /////////////////////////Alumnos///////////////////
    
    public void agregarAlumnos(AlumnosDT dto1) throws Exception {
        
        AlumnosDao dao1 = new AlumnosDao();
        dao1.crearAlumno(dto1);
    }
    
    public void actualizarAlumno(AlumnosDT dto1) throws Exception {
        
        AlumnosDao dao1 = new AlumnosDao();
        dao1.ModificarAlumno(dto1);
        
    }
    
    public void eliminarAlumno(AlumnosDT dto1) throws Exception {
        
        AlumnosDao dao1 = new AlumnosDao();
        dao1.EliminarAlumno(dto1);
        
    }
    
    public AlumnosDT BuscarAlumno(AlumnosDT dto1) throws Exception {
    
     AlumnosDao dao1 = new AlumnosDao();
    
      return dao1.busqueda(dto1);
    }
    
    public List lsAlumnos() throws Exception{
        AlumnosDao dao1 = new AlumnosDao();
        return dao1.ListaAlumnos();
    
    } 
   ///////////////////////////////////////////////////////////////////////////////////// 
    public void agregarComprobantes(ComprobantesDT dto2) throws Exception {
        
        ComprobantesDao dao2 = new ComprobantesDao();
        dao2.crearComprobante(dto2);
    }
    
     public void ActualizarComprobantes(ComprobantesDT dto2) throws Exception {
        
        ComprobantesDao dao2 = new ComprobantesDao();
        dao2.ModificarComprobante(dto2);
    }
     
     public void EliminarComprobantes(ComprobantesDT dto2) throws Exception {
        
        ComprobantesDao dao2 = new ComprobantesDao();
        dao2.EliminarComprobante(dto2);
    } 
     
     public ComprobantesDT BuscarComprobante(ComprobantesDT dto2) throws Exception {
    
     ComprobantesDao dao2 = new ComprobantesDao();
    
      return dao2.busqueda(dto2);
    }
    
    public List lsComprobante() throws Exception{
     ComprobantesDao dao2 = new ComprobantesDao();
        return dao2.ListaComprobantes();
    
    }
   
    
    
   ///////////////////////////////Alumnos//////////////////////////////////////////////////////////////// 
    
    
    public void AgregarMatricula(MatriculaDT dt) throws Exception {
     
         MatriculaDao dao = new MatriculaDao();
         dao.AgregarMatricula(dt);
    }
    
    public MatriculaDT BuscarMatricula(MatriculaDT  dtob) throws Exception {
      
            MatriculaDao dao = new MatriculaDao();
            return dao.BuscarMatricula(dtob);
    }
    
    
    
    public Object[] numeros(int inicio, int fin){
      Object[] num = new Object[(fin - inicio +1)];
      
      int y=0;
      for(int x= inicio; x <= fin; x++) {
        num[y]=x;
        y++;
        
      }
      return num;
      }
}
