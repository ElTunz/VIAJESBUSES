
package dao;

import beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.MySQLConexion;


public class Negocio {
    public List<Ruta> lisRutas() {
        List<Ruta> lis = new ArrayList<>();
        Connection conn = null;
        try {
            conn = MySQLConexion.getConexion();
            String sql = "select RUTCOD,RUTNOM from ruta";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Ruta a = new Ruta();
                a.setRutacod(rs.getString(1));
                a.setRutanom(rs.getString(2));
                lis.add(a);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }
        return lis;
    }
    
    public List<Viaje> lisRutasViajes(String cod) {
        List<Viaje> lis = new ArrayList<>();
        Connection conn = null;
        try {
            conn = MySQLConexion.getConexion();
            String sql = "select VIANRO,VIAFCH,VIAHRS,COSVIA from viaje WHERE RUTCOD=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Viaje a = new Viaje();
                a.setViajeNro(rs.getString(1));
                a.setViajeFechas(rs.getString(2));
                a.setViajeHoras(rs.getString(3));
                a.setCostoViaje(rs.getDouble(4));
                lis.add(a);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }
        return lis;
    }
    
    public List<Comprobante> pasajeros(String cod) {
        List<Comprobante> lis = new ArrayList<>();
        Connection conn = null;
        try {
            conn = MySQLConexion.getConexion();
            String sql = "select BOL_NRO,Nom_pas,pago_total from comprobante WHERE VIA_NRO=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Comprobante p = new Comprobante();
                p.setNum_boleta(rs.getString(1));
                p.setNom_pasajero(rs.getString(2));
                p.setPago_total(rs.getDouble(3));
                lis.add(p);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lis;
    }
    
    public List<Chofer> filtraChoferes(String nom) {
        List<Chofer> lis = new ArrayList<>();
        Connection conn = null;
        try {
            conn = MySQLConexion.getConexion();
            String sql = "select IDCOD,CHONOM,CHOFIN,CHOCAT from chofer WHERE CHONOM LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + nom + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Chofer a = new Chofer();
                a.setCodigo(rs.getString(1));
                a.setNombre(rs.getString(2));
                a.setFechaingreso(rs.getString(3));
                a.setCategoria(rs.getString(4));
                lis.add(a);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }
        return lis;
    }
    
    public List<Chofer> lisChofer() {
        List<Chofer> lis = new ArrayList<>();
        Connection cn = MySQLConexion.getConexion();
        String sql = "select IDCOD,CHONOM,CHOFIN,CHOCAT from chofer";
        Chofer p = null;
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                p = new Chofer();
                p.setCodigo(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setFechaingreso(rs.getString(3));
                p.setCategoria(rs.getString(4));
                //p.setSueldo(rs.getDouble(5));
                lis.add(p);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lis;
    }
}
