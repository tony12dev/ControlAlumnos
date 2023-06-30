/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import dto.UsuarioDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tonny
 */
public class UsuariosDao extends ConexionBD {

    private final static String SQL_INSERT = "insert into usuarios(nombre,usuario,contraseña)values(?,?,?)";
    private final static String SQL_UPDATE = "update usuarios set nombre=?,usuario=?,contraseña=? where idusuario=?";
    private final static String DELETE = "delete from usuarios where idusuario=?";
    private final static String select = "select *from usuarios where nombre=?";
    private final static String SQL_SELECTALL = "select *from usuarios";

    public UsuariosDao() {
        super();
    }

    public void crearUsuario(UsuarioDT dto) throws Exception {
        try {

            PreparedStatement ps = null;
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, dto.getNombre());
            ps.setString(2, dto.getUsuario());
            ps.setString(3, dto.getContraseña());
            ps.executeUpdate();
            System.out.println("holamundo");
            cerrar(ps);

        } catch (Exception e) {

            System.out.println("Algo salio mal");
            System.out.println(e);
        }
    }

    public void actualizarUsuario(UsuarioDT dto) throws Exception {
        PreparedStatement ps = null;
        ps = conn.prepareStatement(SQL_UPDATE);
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getUsuario());
        ps.setString(3, dto.getContraseña());
        ps.setInt(4, dto.getIdusuario());
        ps.executeUpdate();
        cerrar(ps);
    }

    public void eliminarUsuario(UsuarioDT dto) throws Exception {
        PreparedStatement ps = null;
        ps = conn.prepareStatement(DELETE);
        ps.setInt(1, dto.getIdusuario());
        ps.executeUpdate();
        cerrar(ps);

    }

    public UsuarioDT busqueda(UsuarioDT dto) throws Exception {

        PreparedStatement ps = null;
        ResultSet rs = null;
        ps = conn.prepareStatement(select);

        ps.setString(1, dto.getNombre());

        rs = ps.executeQuery();

        if (rs.next()) {
            dto.setIdusuario(rs.getInt("idusuario"));
            dto.setNombre(rs.getString("nombre"));
            dto.setUsuario(rs.getString("usuario"));
            dto.setContraseña(rs.getString("contraseña"));
        } else {
            //    JOptionPane.showMessageDialog(null, "ERROR Datos no encontrados");
            return null;
        }

        return dto;
    }

    public List ListaUsuario() throws Exception {
 
        
             List lista = new ArrayList();
            PreparedStatement ps = null;
            ResultSet rs = null;
            UsuarioDT dto;
            ps = conn.prepareStatement(SQL_SELECTALL);
            rs = ps.executeQuery();

            while (rs.next()) {
                dto = new UsuarioDT();
                dto.setIdusuario(rs.getInt("idusuario"));
                dto.setNombre(rs.getString("Nombre"));
                dto.setUsuario(rs.getString("usuario"));
                dto.setContraseña(rs.getString("contraseña"));
                lista.add(dto);

            }
            return lista;
        
        
    }
}
