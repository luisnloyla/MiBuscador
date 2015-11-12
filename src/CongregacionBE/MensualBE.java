/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CongregacionBE;

import java.sql.Date;

/**
 *
 * @author Loyola
 */
public class MensualBE {
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

    public MensualBE(int Accion,int Id_Mensual, Date Fecha, float Saldoanteriorr, float Entradar, float Salidar, float Saldorestanter, float Saldoanteriorcc, float Entradacc, float Salidacc, float Saldorestantecc, float Saldoanterioro, float Entradao, float Salidao, float Saldorestanteo, float Totfondmes, float Totactual, float Totplazo, int Guardado, String Flagactivo) {
        this.Accion = Accion;
        this.Id_Mensual = Id_Mensual;
        this.Fecha = Fecha;        
        this.Saldoanteriorr = Saldoanteriorr;
        this.Entradar = Entradar;
        this.Salidar = Salidar;
        this.Saldorestanter = Saldorestanter;
        this.Saldoanteriorcc = Saldoanteriorcc;
        this.Entradacc = Entradacc;
        this.Salidacc = Salidacc;
        this.Saldorestantecc = Saldorestantecc;
        this.Saldoanterioro = Saldoanterioro;
        this.Entradao = Entradao;
        this.Salidao = Salidao;
        this.Saldorestanteo = Saldorestanteo;
        this.Totfondmes = Totfondmes;
        this.Totactual = Totactual;
        this.Totplazo = Totplazo;
        this.Guardado = Guardado;
        this.Flagactivo = Flagactivo;
    }

    public int getAccion() {
        return Accion;
    }

    public void setAccion(int Accion) {
        this.Accion = Accion;
    }

    public int getReturnVal() {
        return ReturnVal;
    }

    public void setReturnVal(int ReturnVal) {
        this.ReturnVal = ReturnVal;
    }
    
    /**
     * @return the Id_Mensual
     */
    public int getId_Mensual() {
        return Id_Mensual;
    }

    /**
     * @param Id_Mensual the Id_Mensual to set
     */
    public void setId_Mensual(int Id_Mensual) {
        this.Id_Mensual = Id_Mensual;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Saldoanteriorr
     */
    public float getSaldoanteriorr() {
        return Saldoanteriorr;
    }

    /**
     * @param Saldoanteriorr the Saldoanteriorr to set
     */
    public void setSaldoanteriorr(float Saldoanteriorr) {
        this.Saldoanteriorr = Saldoanteriorr;
    }

    /**
     * @return the Entradar
     */
    public float getEntradar() {
        return Entradar;
    }

    /**
     * @param Entradar the Entradar to set
     */
    public void setEntradar(float Entradar) {
        this.Entradar = Entradar;
    }

    /**
     * @return the Salidar
     */
    public float getSalidar() {
        return Salidar;
    }

    /**
     * @param Salidar the Salidar to set
     */
    public void setSalidar(float Salidar) {
        this.Salidar = Salidar;
    }

    /**
     * @return the Saldorestanter
     */
    public float getSaldorestanter() {
        return Saldorestanter;
    }

    /**
     * @param Saldorestanter the Saldorestanter to set
     */
    public void setSaldorestanter(float Saldorestanter) {
        this.Saldorestanter = Saldorestanter;
    }

    /**
     * @return the Saldoanteriorcc
     */
    public float getSaldoanteriorcc() {
        return Saldoanteriorcc;
    }

    /**
     * @param Saldoanteriorcc the Saldoanteriorcc to set
     */
    public void setSaldoanteriorcc(float Saldoanteriorcc) {
        this.Saldoanteriorcc = Saldoanteriorcc;
    }

    /**
     * @return the Entradacc
     */
    public float getEntradacc() {
        return Entradacc;
    }

    /**
     * @param Entradacc the Entradacc to set
     */
    public void setEntradacc(float Entradacc) {
        this.Entradacc = Entradacc;
    }

    /**
     * @return the Salidacc
     */
    public float getSalidacc() {
        return Salidacc;
    }

    /**
     * @param Salidacc the Salidacc to set
     */
    public void setSalidacc(float Salidacc) {
        this.Salidacc = Salidacc;
    }

    /**
     * @return the Saldorestantecc
     */
    public float getSaldorestantecc() {
        return Saldorestantecc;
    }

    /**
     * @param Saldorestantecc the Saldorestantecc to set
     */
    public void setSaldorestantecc(float Saldorestantecc) {
        this.Saldorestantecc = Saldorestantecc;
    }

    /**
     * @return the Saldoanterioro
     */
    public float getSaldoanterioro() {
        return Saldoanterioro;
    }

    /**
     * @param Saldoanterioro the Saldoanterioro to set
     */
    public void setSaldoanterioro(float Saldoanterioro) {
        this.Saldoanterioro = Saldoanterioro;
    }

    /**
     * @return the Entradao
     */
    public float getEntradao() {
        return Entradao;
    }

    /**
     * @param Entradao the Entradao to set
     */
    public void setEntradao(float Entradao) {
        this.Entradao = Entradao;
    }

    /**
     * @return the Salidao
     */
    public float getSalidao() {
        return Salidao;
    }

    /**
     * @param Salidao the Salidao to set
     */
    public void setSalidao(float Salidao) {
        this.Salidao = Salidao;
    }

    /**
     * @return the Saldorestanteo
     */
    public float getSaldorestanteo() {
        return Saldorestanteo;
    }

    /**
     * @param Saldorestanteo the Saldorestanteo to set
     */
    public void setSaldorestanteo(float Saldorestanteo) {
        this.Saldorestanteo = Saldorestanteo;
    }

    /**
     * @return the Totfondmes
     */
    public float getTotfondmes() {
        return Totfondmes;
    }

    /**
     * @param Totfondmes the Totfondmes to set
     */
    public void setTotfondmes(float Totfondmes) {
        this.Totfondmes = Totfondmes;
    }

    /**
     * @return the Totactual
     */
    public float getTotactual() {
        return Totactual;
    }

    /**
     * @param Totactual the Totactual to set
     */
    public void setTotactual(float Totactual) {
        this.Totactual = Totactual;
    }

    /**
     * @return the Totplazo
     */
    public float getTotplazo() {
        return Totplazo;
    }

    /**
     * @param Totplazo the Totplazo to set
     */
    public void setTotplazo(float Totplazo) {
        this.Totplazo = Totplazo;
    }

    /**
     * @return the Guardado
     */
    public int getGuardado() {
        return Guardado;
    }

    /**
     * @param Guardado the Guardado to set
     */
    public void setGuardado(int Guardado) {
        this.Guardado = Guardado;
    }

    /**
     * @return the Flagactivo
     */
    public String getFlagactivo() {
        return Flagactivo;
    }

    /**
     * @param Flagactivo the Flagactivo to set
     */
    public void setFlagactivo(String Flagactivo) {
        this.Flagactivo = Flagactivo;
    }
    
    public int getReturVal() {
        return ReturnVal;
    }
}
