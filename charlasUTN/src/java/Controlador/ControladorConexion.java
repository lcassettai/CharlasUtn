package Controlador;

import Modelo.Charla;
import Modelo.Orador;
import Modelo.ReporteCuatro;
import Modelo.ReporteDos;
import Modelo.Tematica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ControladorConexion {

    private Connection con;

    private void conectar() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://;databaseName=trabajoFinalLab", "BDlucho", "terminal10");
            System.out.println("Conexion exitosa!");
        } catch (Exception e) {
            System.out.println("No se pudo establecer la conexion motivo : " + e.getMessage());
        }
    }

    private void desconectar() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("No se pudo cerrar la conexion, motivo : " + e.getMessage());
        }
    }

    public ArrayList<Charla> obtenerCharlas() {
        ArrayList<Charla> listaCharlas = new ArrayList<>();
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "exec SP_obtenerCharlas";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Charla c = new Charla();
                c.setCodigo(rs.getInt(1));
                c.setTitulo(rs.getString(2));
                c.setDescrip(rs.getString(3));
                c.setHoraIni(rs.getString(4));
                c.setHoraFin(rs.getString(5));
                if (rs.getString(6) != null) {
                    c.setDuracionReal(rs.getString(6));
                }
                if (rs.getString(7) != null) {
                    c.setCantAsistentes(rs.getInt(7));
                }
                c.setEstado(rs.getBoolean(8));
                c.setOrador(rs.getString(9));
                c.setTematica(rs.getString(10));
                listaCharlas.add(c);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("No se pudieron obtener las charlas, motivo : " + e.getMessage());
        } finally {
            desconectar();
        }
        return listaCharlas;
    }

    public ArrayList<Orador> obtenerOradores() {
        ArrayList<Orador> listaOradores = new ArrayList<>();
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "EXEC sp_buscarOradores";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Orador o = new Orador();
                o.setCodigoOrador(rs.getInt(1));
                o.setNombre(rs.getString(2));
                o.setApellido(rs.getString(3));
                o.setDni(rs.getString(4));
                o.setTelefono(rs.getString(5));
                listaOradores.add(o);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("No se pudo obtener el orador motivo : " + e.getMessage());
        } finally {
            desconectar();
        }

        return listaOradores;
    }

    public ArrayList<Tematica> obtenerTematicas() {
        ArrayList<Tematica> listaTematica = new ArrayList<>();
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "exec sp_obtenerTematicas";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Tematica t = new Tematica();
                t.setCodigo(rs.getInt(1));
                t.setTematica(rs.getString(2));
                listaTematica.add(t);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("No se pudo obtener el orador motivo : " + e.getMessage());
        } finally {
            desconectar();
        }

        return listaTematica;
    }

    public void insertarCharla(Charla c) {
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "exec SP_insertarCharla '" + c.getTitulo() + "','" + c.getDescrip() + "','" + c.getHoraIni() + "','" + c.getHoraFin() + "'," + c.getIdOrador() + "," + c.getIdOrador();
            st.executeUpdate(sql);
            st.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar las charlas, motivo : " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    public void actualizarCharla(int id, String hFin, int asistentes) {
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "exec  SP_actualizarEstadoCharla " + id + ",'" + hFin + "'," + asistentes;
            st.executeUpdate(sql);
            st.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar las charlas, motivo : " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    /*– Listado completo de charlas. El mismo debe mostrar toda la informaci´on de
     todas las charlas.*/
    public ArrayList<Charla> obtenerReporte1() {
        ArrayList<Charla> listaCharla = new ArrayList<>();
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "exec SP_reporte1";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Charla c = new Charla();
                c.setCodigo(rs.getInt(1));
                c.setTitulo(rs.getString(2));
                c.setTematica(rs.getString(3));
                c.setOrador(rs.getString(4));
                c.setHoraIni(rs.getString(5));
                c.setHoraFin(rs.getString(6));
                c.setDuracionReal(rs.getString(7));
                c.setCantAsistentes(rs.getInt(8));
                c.setEstado(rs.getBoolean(9));
                c.setDescrip(rs.getString(10));
                listaCharla.add(c);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        return listaCharla;
    }

    /*
     Listado de charlas que se prolongaron m´as all´a de la duraci´on planificada.
     Se debe mostrar nombre del orador y minutos de exceso de aquellas charlas
     cuya duraci´on real super´o en 10 minutos o m´as la duraci´on prevista.    
     */
    public ArrayList<ReporteDos> obtenerReporte2() {
        ArrayList<ReporteDos> listaCharla = new ArrayList<>();
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "exec SP_reporte2 ";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ReporteDos r = new ReporteDos();
                r.setCodigo(rs.getInt(1));
                r.setTitulo(rs.getString(2));
                r.setOrador(rs.getString(3));
                r.setExceso(rs.getInt(4));
                listaCharla.add(r);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        return listaCharla;
    }

    /*Listado de charlas de mayor convocatoria. Se debe mostrar tıtulo de la charla
     y nombre del orador de aquellas charlas que superaron el promedio de asistentes.*/
    public ArrayList<Charla> obtenerReporte3() {
        ArrayList<Charla> listaCharla = new ArrayList<>();
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "exec SP_reporte3";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Charla c = new Charla();
                c.setTitulo(rs.getString(1));
                c.setOrador(rs.getString(2));
                c.setCantAsistentes(rs.getInt(3));
                listaCharla.add(c);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        return listaCharla;
    }

    /*
     Listado de todas las tem´aticas, incluyendo por cada una la cantidad de charlas
     correspondientes a la misma, y el promedio de duraci´on real de ´estas, y la
     suma total de asistentes entre todas las charlas.
     */
    public ArrayList<ReporteCuatro> obtenerReporte4() {
        ArrayList<ReporteCuatro> listaCharla = new ArrayList<>();
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "SP_reporte4";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ReporteCuatro r = new ReporteCuatro();
                r.setTematica(rs.getString(1));
                r.setCantCharlas(rs.getInt(2));
                r.setCantAsistentes(rs.getInt(3));
                r.setTiempoPromedio(rs.getInt(4));
                listaCharla.add(r);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        return listaCharla;
    }

    /* 
     Nombre del orador m´as cumplidor con el horario. Debe mostrarse el nombre
     del orador, la duraci´on estimada y la duraci´on real de la charla en la que
     ambas duraciones est´en m´as cerca una de otra. Es decir, la que presente
     menor diferencia entre ambas.    
     */
    public Charla obtenerReporte5() {
        Charla c = null;
        try {
            conectar();
            Statement st = con.createStatement();
            String sql = "exec sp_reporte5";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                c = new Charla();
                c.setOrador(rs.getString(1));
                c.setHoraIni(rs.getString(2));
                c.setHoraFin(rs.getString(3));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        return c;
    }

}
