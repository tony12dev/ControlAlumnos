/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import dto.AlumnosDT;
import dto.ComprobantesDT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tonny
 */
public class ComprobantesDao extends ConexionBD {

    private final static String SQL_INSERT = "insert into comprobantes(ninicio,nfin,serie,tipocomprobante)values(?,?,?,?)";
    private final static String SQL_UPDATE = "update comprobantes set ninicio=?,nfin=?,serie=?,tipocomprobante=?  where idcomprobantes=?";
    private final static String DELETE = "delete from comprobantes where idcomprobantes=?";
    private final static String select = "select *from comprobantes where serie=?";
    private final static String SQL_SELECTALL = "select *from comprobantes";
    private final static String SQL_SELECTCom = "select idcomprobantes from comprobantes";
    

    public ComprobantesDao() {
        super();
    }

    public void crearComprobante(ComprobantesDT dto) throws Exception {
        try {

            PreparedStatement ps = null;
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, dto.getnInicio());
            ps.setString(2, dto.getnFin());
            ps.setString(3, dto.getSerie());
            ps.setString(4, dto.getTipoComprobante());
            ps.executeUpdate();
            System.out.println("holamundo");
            cerrar(ps);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Algo salio mal");
        }
    }

    public void ModificarComprobante(ComprobantesDT dto) throws Exception {
        try {

            PreparedStatement ps = null;
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, dto.getnInicio());
            ps.setString(2, dto.getnFin());
            ps.setString(3, dto.getSerie());
            ps.setString(4, dto.getTipoComprobante());
            ps.setInt(5, dto.getIdcomprobantes());
            ps.executeUpdate();
            System.out.println("holamundo");
            cerrar(ps);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Algo salio mal");
        }
    }

    public void EliminarComprobante(ComprobantesDT dto) throws Exception {
        PreparedStatement ps = null;
        ps = conn.prepareStatement(DELETE);
        ps.setInt(1, dto.getIdcomprobantes());
        ps.executeUpdate();
        cerrar(ps);
    }

    public ComprobantesDT busqueda(ComprobantesDT dto) throws Exception {

        PreparedStatement ps = null;
        ResultSet rs = null;
        ps = conn.prepareStatement(select);
        ps.setString(1, dto.getSerie());

        rs = ps.executeQuery();

        if (rs.next()) {
            dto.setIdcomprobantes(rs.getInt("idcomprobantes"));
            dto.setnInicio(rs.getString("ninicio"));
            dto.setnFin(rs.getString("nfin"));
            dto.setSerie(rs.getString("serie"));
            dto.setTipoComprobante(rs.getString("tipocomprobante"));

        } else {
            //    JOptionPane.showMessageDialog(null, "ERROR Datos no encontrados");
            return null;
        }

        return dto;
    }

    public List ListaComprobantes() throws Exception {
        List lista = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ComprobantesDT dto;
        ps = conn.prepareStatement(SQL_SELECTALL);
        rs = ps.executeQuery();

            while (rs.next()) {
            dto = new ComprobantesDT();
            dto.setIdcomprobantes(rs.getInt("idcomprobantes"));
            dto.setnInicio(rs.getString("ninicio"));
            dto.setnFin(rs.getString("nfin"));
            dto.setSerie(rs.getString("serie"));
            dto.setTipoComprobante(rs.getString("tipocomprobante"));
            lista.add(dto);
        }
        return lista;
    }
    
    
    
}
