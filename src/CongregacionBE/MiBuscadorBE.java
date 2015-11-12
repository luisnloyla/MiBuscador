/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CongregacionBE;

import java.util.Date;

/**
 *
 * @author Loyola
 */
public class MiBuscadorBE {
    private int Accion;
    private int Id_MiBuscador ;
    private String Codigo ;
    private String Descripcion ;
    private Date Fecha;    
    private Date FechaFin; 
    private int ReturnVal;

    public MiBuscadorBE(int Accion, int Id_MiBuscador, String Codigo, String Descripcion, Date Fecha, Date FechaFin) {
        this.Accion = Accion;
        this.Id_MiBuscador = Id_MiBuscador;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.FechaFin = FechaFin;
    }
    
    /**
     * @return the Accion
     */
    public int getAccion() {
        return Accion;
    }

    /**
     * @param Accion the Accion to set
     */
    public void setAccion(int Accion) {
        this.Accion = Accion;
    }

    /**
     * @return the Id_MiBuscador
     */
    public int getId_MiBuscador() {
        return Id_MiBuscador;
    }

    /**
     * @param Id_MiBuscador the Id_MiBuscador to set
     */
    public void setId_MiBuscador(int Id_MiBuscador) {
        this.Id_MiBuscador = Id_MiBuscador;
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
     * @return the ReturnVal
     */
    public int getReturnVal() {
        return ReturnVal;
    }

    /**
     * @param ReturnVal the ReturnVal to set
     */
    public void setReturnVal(int ReturnVal) {
        this.ReturnVal = ReturnVal;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }
    
    
}