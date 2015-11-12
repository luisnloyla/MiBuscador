/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CongregacionBD;

import CongregacionBE.MiBuscadorBE;
import ejecutar.Coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Loyola
 */
public class p_MiBuscador_del {
    private int Accion;
    private int Id_MiBuscador ;
    private String Codigo ;
    private String Descripcion ;
    private Date Fecha;
    private int ReturnVal;

    public p_MiBuscador_del(Coneccion strCn,MiBuscadorBE objMiBuscadorBE) throws SQLException {
        this.Accion = objMiBuscadorBE.getAccion();
        this.Id_MiBuscador = objMiBuscadorBE.getId_MiBuscador();
        this.Codigo = objMiBuscadorBE.getCodigo();
        this.Descripcion = objMiBuscadorBE.getDescripcion();
        this.Fecha = objMiBuscadorBE.getFecha();
        this.ReturnVal = objMiBuscadorBE.getReturnVal();
        Connection con = strCn.getCon();
//        Statement st=null;
        ResultSet rs=null;
        
        PreparedStatement pstOperacion = null;
        PreparedStatement pstLista = null;
        try {
            con.setAutoCommit(false);
//            st = con.createStatement();
            if (this.Accion == 1){
                pstOperacion=con.prepareStatement("DELETE FROM MiBuscador WHERE ID_MiBuscador = ?");
                pstOperacion.setInt(1, this.Id_MiBuscador);
                pstOperacion.executeUpdate();
//                st.executeUpdate("DELETE FROM MiBuscador WHERE ID_MiBuscador = "+this.Id_MiBuscador);
                this.ReturnVal= 0;
//                rs=st.executeQuery("SELECT * FROM MiBuscador WHERE ID_MiBuscador = " + this.Id_MiBuscador);
                pstLista=con.prepareStatement("SELECT * FROM MiBuscador WHERE ID_MiBuscador = ?");
                pstLista.setInt(1, this.Id_MiBuscador);
                rs = pstLista.executeQuery();
                while (rs.next()) {
                    this.ReturnVal= -1;
                }
            }
            if (this.Accion == 2){               //DESTRUCCION TOTAL DE DATOS
                pstOperacion=con.prepareStatement("DELETE FROM MiBuscador");
                pstOperacion.executeUpdate();
////                st.executeUpdate("DELETE FROM MiBuscador");
                this.ReturnVal=0;
                pstLista=con.prepareStatement("SELECT * FROM MiBuscador WHERE ID_MiBuscador = ?");
                rs = pstLista.executeQuery();
//                rs=st.executeQuery("SELECT * FROM MiBuscador");
                while (rs.next()) {
                    this.ReturnVal=-1;
                }
            }
            con.commit();
            con.setAutoCommit(true);
//            st.close();
            pstOperacion.close();
            pstLista.close();
        } catch (Exception e) {
            con.rollback();
            con.setAutoCommit(true);
            pstOperacion.close();
            pstLista.close();
            System.out.println(e);
            this.ReturnVal=-1;
        }
    }
    public p_MiBuscador_del(Connection strCn,MiBuscadorBE objMiBuscadorBE) {
        this.Accion = objMiBuscadorBE.getAccion();
        this.Id_MiBuscador = objMiBuscadorBE.getId_MiBuscador();
        this.Codigo = objMiBuscadorBE.getCodigo();
        this.Descripcion = objMiBuscadorBE.getDescripcion();
        this.Fecha = objMiBuscadorBE.getFecha();
        this.ReturnVal = objMiBuscadorBE.getReturnVal();
    }

    public int getReturnVal() {
        return ReturnVal;
    }

    public void setReturnVal(int ReturnVal) {
        this.ReturnVal = ReturnVal;
    }
    
}