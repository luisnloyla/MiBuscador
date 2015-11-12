package CongregacionDA;
import CongregacionBD.p_MiBuscador_del;
import CongregacionBD.p_MiBuscador_ins;
import CongregacionBD.p_MiBuscador_upd;
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
import CongregacionBE.MiBuscadorBE;
import ejecutar.Coneccion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
interface MiBuscadorDA {
        public int Insertar(Coneccion strCn,MiBuscadorBE objMiBuscadorBE );
        public int Insertar(Connection strCn,MiBuscadorBE objMiBuscadorBE );
        public int Eliminar(Coneccion strCn,MiBuscadorBE objMiBuscadorBE );
        public int Actualizar(Coneccion strCn,MiBuscadorBE objMiBuscadorBE );
}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
public class cMiBuscadorDA implements MiBuscadorDA{
    @Override
    public int Insertar(Coneccion strCn, MiBuscadorBE objMiBuscadorBE) {
        try {
            p_MiBuscador_ins MiBuscador_ins=new p_MiBuscador_ins(strCn,objMiBuscadorBE);
            return MiBuscador_ins.getReturnVal();
        } catch (SQLException ex) {
            Logger.getLogger(cMiBuscadorDA.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    @Override
    public int Insertar(Connection strCn, MiBuscadorBE objMiBuscadorBE) {
        p_MiBuscador_ins MiBuscador_ins=new p_MiBuscador_ins(strCn,objMiBuscadorBE);
        return MiBuscador_ins.getReturnVal();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int Eliminar(Coneccion strCn, MiBuscadorBE objMiBuscadorBE) {
        try {
            p_MiBuscador_del MiBuscador_del=new p_MiBuscador_del(strCn,objMiBuscadorBE);
            return MiBuscador_del.getReturnVal();
        } catch (SQLException ex) {
            return -1;
        }        
    }
    @Override
    public int Actualizar(Coneccion strCn, MiBuscadorBE objMiBuscadorBE) {
        try {
            p_MiBuscador_upd MiBuscador_upd=new p_MiBuscador_upd(strCn,objMiBuscadorBE);
            return MiBuscador_upd.getReturnVal();
        } catch (SQLException ex) {
            return -1;
        }   
    }
}