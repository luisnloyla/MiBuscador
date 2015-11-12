/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CongregacionBD;

import CongregacionBE.MiBuscadorBE;
import ejecutar.Coneccion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author Loyola
 */
public class p_MiBuscador_upd {
    private int Accion;
    private int Id_MiBuscador ;
    private String Codigo ;
    private String Descripcion ;
    private Date Fecha;
    private int ReturnVal;
    public p_MiBuscador_upd(Coneccion strCn,MiBuscadorBE objMiBuscadorBE) throws SQLException {
        this.Accion = objMiBuscadorBE.getAccion();
        this.Id_MiBuscador = objMiBuscadorBE.getId_MiBuscador();
        this.Codigo = objMiBuscadorBE.getCodigo();
        this.Descripcion = objMiBuscadorBE.getDescripcion();
        this.Fecha = objMiBuscadorBE.getFecha();
        this.ReturnVal = objMiBuscadorBE.getReturnVal();
        Connection con = strCn.getCon();
        Statement st=null;
        ResultSet rs=null;
        try {
            con.setAutoCommit(false);
            st = con.createStatement();
            if (this.Accion == 1){
                st.executeUpdate("UPDATE MiBuscador SET "
                        +"CODIGO='"+this.Codigo+"'"
                        +",DESCRIPCION='"+this.Descripcion+"'"                        
               + " WHERE ID_MiBuscador = "+this.Id_MiBuscador);
                
//                st.close(); 
              this.ReturnVal=0;
            }
            if (this.Accion == 2){//CREACION DE UNA TABLA FISICA EN UNA BASE DE DATOS
              
              this.ReturnVal=0;
            }
            if (this.Accion == 3){//ELIMINACION DE UNA TABLA FISICA EN UNA BASE DE DATOS
              
//              st.close(); 
              this.ReturnVal=0;
            }
            con.commit();
            con.setAutoCommit(true);
            st.close();
        } catch (Exception e) {
            con.rollback();
            con.setAutoCommit(true);
            st.close();
            System.out.println(e);
            this.ReturnVal=-1;
        }        
    }
    public p_MiBuscador_upd(Connection strCn,MiBuscadorBE objMiBuscadorBE) {
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