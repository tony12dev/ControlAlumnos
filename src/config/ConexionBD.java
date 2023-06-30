/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tonny
 */
public class ConexionBD {
    
protected Connection conn;

    protected void cerrar(PreparedStatement stm) throws Exception {
      stm.close();
    }
    
    protected void cerrar(ResultSet rst) throws Exception {
     rst.close();
    
    }

    public ConexionBD() {
        
        String driver="com.mysql.jdbc.Driver";//ruta del Driver de mysql
        String user="root";//nombre del usuario
        String pwd="tony1234";//Contraseña
        String bd="usuario";//nombre de la base de datos 
        String server="jdbc:mysql://localhost:3306/"+bd;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(server, user, pwd);
            System.out.println("conexion correctamente");
        } catch (SQLException e) {
            
            System.out.println(e);
            
        } catch(ClassNotFoundException e){
        
            System.out.println(e);
            System.out.println("Algo ests mal en la conexion");
        }
    }
    
}
