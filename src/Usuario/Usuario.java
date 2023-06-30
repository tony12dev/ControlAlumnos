/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import config.UsuariosDao;
import dto.UsuarioDT;

/**
 *
 * @author tonny
 */
public class Usuario {
 
    public void agregarUsuario( UsuarioDT dto ) throws Exception {
          UsuariosDao dao = new  UsuariosDao();
          dao.crearUsuario(dto); //encapsulamineto
    }
    
    public Object[] numeros(int inicio, int fin){
    Object[] num = new Object[ fin - inicio + 1];
    
      int y=0;
       for(int x = inicio; x <= fin; x++) {
        
           num[y] = x;
           y++;
       }  
       return num;
    }
}
