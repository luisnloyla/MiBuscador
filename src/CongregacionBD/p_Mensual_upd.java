package CongregacionBD;
import CongregacionBE.MensualBE;
import ejecutar.Coneccion;
import java.sql.*;
public class p_Mensual_upd {
    private int Accion;
    private int Id_Mensual ;
    private Date Fecha;
    
    private float Saldoanteriorr ;
    private float Entradar ;
    private float Salidar ;
    private float Saldorestanter ;

    private float Saldoanteriorcc ;
    private float Entradacc ;
    private float Salidacc ;
    private float Saldorestantecc ;
    
    private float Saldoanterioro ;
    private float Entradao ;
    private float Salidao ;
    private float Saldorestanteo ;

    private float Totfondmes ;
    private float Totactual ;
    private float Totplazo ;
    
    private int Guardado ;
    private String Flagactivo ;
    
    private int ReturnVal ;

    public p_Mensual_upd(Coneccion strCn,MensualBE objMensualBE) throws SQLException {
        this.Accion = objMensualBE.getAccion();
        this.Id_Mensual = objMensualBE.getId_Mensual();
        this.Fecha = objMensualBE.getFecha();        
        this.Saldoanteriorr = objMensualBE.getSaldoanteriorr();
        this.Entradar = objMensualBE.getEntradar();
        this.Salidar = objMensualBE.getSalidar();
        this.Saldorestanter = objMensualBE.getSaldorestanter();
        this.Saldoanteriorcc = objMensualBE.getSaldoanteriorcc();
        this.Entradacc = objMensualBE.getEntradacc();
        this.Salidacc = objMensualBE.getSalidacc();
        this.Saldorestantecc = objMensualBE.getSaldorestantecc();
        this.Saldoanterioro = objMensualBE.getSaldoanterioro();
        this.Entradao = objMensualBE.getEntradao();
        this.Salidao = objMensualBE.getSalidao();
        this.Saldorestanteo = objMensualBE.getSaldorestanteo();
        this.Totfondmes = objMensualBE.getTotfondmes();
        this.Totactual = objMensualBE.getTotactual();
        this.Totplazo = objMensualBE.getTotplazo();
        this.Guardado = objMensualBE.getGuardado();
        this.Flagactivo = objMensualBE.getFlagactivo();
        Connection con = strCn.getCon();
        ResultSet rs=null;
        PreparedStatement pstOperacion = null;
        PreparedStatement pstLista = null;
        try {
            con.setAutoCommit(false);
            if (this.Accion == 1){ //ACTUALIZACION DE DEGISTROS DE UNA TABLA
                pstOperacion=con.prepareStatement("UPDATE MENSUAL SET " +
                "FECHA = ?" +",SALDOANTERIORR = ?" +",ENTRADAR = ?" +",SALIDAR = ?" +
                ",SALDORESTANTER = ?" +",SALDOANTERIORCC = ?" +",ENTRADACC = ?" +
                ",SALIDACC = ?" +",SALDORESTANTECC = ?" +",SALDOANTERIORO = ?" +
                ",ENTRADAO = ?" +",SALIDAO = ?" +",SALDORESTANTEO = ?" +
                ",TOTFONDMES = ?" +",TOTACTUAL = ?" +",TOTPLAZO = ?" +
                ",GUARDADO = ?" + "WHERE ID_MENSUAL = ?");
                pstOperacion.setDate(1, this.Fecha);
                
                pstOperacion.setFloat(2, this.Saldoanteriorr);
                pstOperacion.setFloat(3, this.Entradar);
                pstOperacion.setFloat(4, this.Salidar);
                pstOperacion.setFloat(5, this.Saldorestanter);
                
                pstOperacion.setFloat(6, this.Saldoanteriorcc);
                pstOperacion.setFloat(7, this.Entradacc);
                pstOperacion.setFloat(8, this.Salidacc);
                pstOperacion.setFloat(9, this.Saldorestantecc);
                
                pstOperacion.setFloat(10, this.Saldoanterioro);
                pstOperacion.setFloat(11, this.Entradao);
                pstOperacion.setFloat(12, this.Salidao);
                pstOperacion.setFloat(13, this.Saldorestanteo);
                
                pstOperacion.setFloat(14, this.Totfondmes);
                pstOperacion.setFloat(15, this.Totactual);
                pstOperacion.setFloat(16, this.Totplazo);
                
                pstOperacion.setInt(17, this.Guardado);
                pstOperacion.setInt(18, this.Id_Mensual);
                
                pstOperacion.executeUpdate();                
                this.ReturnVal=0;                
            }
            if (this.Accion == 2){//ELIMINACION DE REGISTROEN FLAGACTIVO = 0
                pstOperacion=con.prepareStatement("UPDATE MENSUAL SET FLAGACTIVO = 0 WHERE ID_MENSUAL = ?");
                pstOperacion.setInt(1, this.Id_Mensual);
                pstOperacion.executeUpdate();
                this.ReturnVal=0;
            }
            if (this.Accion == 3){//ELIMINACION REAL DEL REGISTRO
                pstOperacion=con.prepareStatement("DELETE FROM MENSUAL WHERE ID_MENSUAL = ?");
                pstOperacion.setInt(1, this.Id_Mensual);
                pstOperacion.executeUpdate();
                this.ReturnVal=0;
            }
            con.commit();
            con.setAutoCommit(true);
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
    public p_Mensual_upd(Connection strCn,MensualBE objMensualBE) {
        this.Accion = objMensualBE.getAccion();
        this.Id_Mensual = objMensualBE.getId_Mensual();
        this.Fecha = objMensualBE.getFecha();        
        this.Saldoanteriorr = objMensualBE.getSaldoanteriorr();
        this.Entradar = objMensualBE.getEntradar();
        this.Salidar = objMensualBE.getSalidar();
        this.Saldorestanter = objMensualBE.getSaldorestanter();
        this.Saldoanteriorcc = objMensualBE.getSaldoanteriorcc();
        this.Entradacc = objMensualBE.getEntradacc();
        this.Salidacc = objMensualBE.getSalidacc();
        this.Saldorestantecc = objMensualBE.getSaldorestantecc();
        this.Saldoanterioro = objMensualBE.getSaldoanterioro();
        this.Entradao = objMensualBE.getEntradao();
        this.Salidao = objMensualBE.getSalidao();
        this.Saldorestanteo = objMensualBE.getSaldorestanteo();
        this.Totfondmes = objMensualBE.getTotfondmes();
        this.Totactual = objMensualBE.getTotactual();
        this.Totplazo = objMensualBE.getTotplazo();
        this.Guardado = objMensualBE.getGuardado();
        this.Flagactivo = objMensualBE.getFlagactivo();
//        this.ReturnVal = objMensualBE.getReturnVal();
    }
    public int getReturVal() {
        return ReturnVal;
    }

    public void setReturVal(int ReturVal) {
        this.ReturnVal = ReturVal;
    }
}