/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CongregacionBL;

import CongregacionBE.MiBuscadorBE;
import CongregacionDA.cMiBuscadorDA;
import ejecutar.Coneccion;
import java.sql.Connection;

/**
 *
 * @author Loyola
 */
//******************************************************************************
interface MiBuscadorBL {
    public int Insertar(Coneccion strCn,MiBuscadorBE objMiBuscadorBE );
    public int Insertar(Connection strCn,MiBuscadorBE objMiBuscadorBE );
    public int Eliminar(Coneccion strCn,MiBuscadorBE objMiBuscadorBE );
    public int Actualizar(Coneccion strCn,MiBuscadorBE objMiBuscadorBE );
}
//******************************************************************************
public class cMiBuscadorBL implements MiBuscadorBL{

    @Override
    public int Insertar(Coneccion strCn, MiBuscadorBE objMiBuscadorBE) {
        cMiBuscadorDA MiBuscadorDA = new cMiBuscadorDA();
        return MiBuscadorDA.Insertar(strCn, objMiBuscadorBE);
    }
    @Override
    public int Insertar(Connection strCn, MiBuscadorBE objMiBuscadorBE) {
        cMiBuscadorDA MiBuscadorDA = new cMiBuscadorDA();
        return MiBuscadorDA.Insertar(strCn, objMiBuscadorBE);
    }
    @Override
    public int Eliminar(Coneccion strCn, MiBuscadorBE objMiBuscadorBE) {
        cMiBuscadorDA MiBuscadorDA = new cMiBuscadorDA();
        return MiBuscadorDA.Eliminar(strCn, objMiBuscadorBE);
    }

    @Override
    public int Actualizar(Coneccion strCn, MiBuscadorBE objMiBuscadorBE) {
        cMiBuscadorDA MiBuscadorDA = new cMiBuscadorDA();
        return MiBuscadorDA.Actualizar(strCn, objMiBuscadorBE);
    }
}