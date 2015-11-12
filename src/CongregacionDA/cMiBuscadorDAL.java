/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CongregacionDA;

import CongregacionBD.p_MiBuscador_sel;
import CongregacionBE.MiBuscadorBE;
import ejecutar.Coneccion;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Loyola
 */
interface MiBuscadorDAL {
        public List<MiBuscadorBE> Leer(Coneccion strCn,MiBuscadorBE objMiBuscadorBE );              
}
public class cMiBuscadorDAL implements MiBuscadorDAL{

    public List<MiBuscadorBE> Leer(Coneccion strCn, MiBuscadorBE objMiBuscadorBE) {
        p_MiBuscador_sel MiBuscador_sel;
        try {
            MiBuscador_sel = new p_MiBuscador_sel(strCn,objMiBuscadorBE);
            return MiBuscador_sel.getaMiBuscadorBE();
        } catch (SQLException ex) {
            Logger.getLogger(cMiBuscadorDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    }
   
}