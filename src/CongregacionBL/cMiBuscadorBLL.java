/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CongregacionBL;

import CongregacionBE.MiBuscadorBE;
import CongregacionDA.cMiBuscadorDAL;
import ejecutar.Coneccion;
import java.util.List;

/**
 *
 * @author Loyola
 */
interface MiBuscadorBLL {
    public List<MiBuscadorBE> Leer(Coneccion strCn,MiBuscadorBE objMiBuscadorBE );
}
public class cMiBuscadorBLL implements MiBuscadorBLL{

    @Override
    public List<MiBuscadorBE> Leer(Coneccion strCn, MiBuscadorBE objMiBuscadorBE) {
        cMiBuscadorDAL MiBuscadorDAL = new cMiBuscadorDAL();
        return MiBuscadorDAL.Leer(strCn, objMiBuscadorBE);
    }

   
}