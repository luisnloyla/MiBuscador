/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congregacion;

import CongregacionBE.MiBuscadorBE;
import CongregacionBL.cMiBuscadorBL;
import CongregacionBL.cMiBuscadorBLL;
import com.toedter.calendar.JDateChooser;
import ejecutar.Coneccion;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class TestArtesanal {

    /**
     * @param args the command line arguments
     */

    public TestArtesanal() {

    }

    public static void main02(String[] args) {
        // TODO code application logic here
        //        Coneccion coneccion= new Coneccion();
        int accion = 2;

        if (accion == 1) { //insertar
            try {
                JDateChooser jdcFecha = new JDateChooser();
                //CODIGO PARA ASIGNAR FECHA ACTUAL o del sistema...
                jdcFecha.setDate(new Date());//ASIGANMOS VALOR DEL SISTEMA A JDCFECHA
                Date date = new Date();//LUEGO ESOS PARAMATROS LO GUARDAMOS EN UNA VARIABLE
                date = jdcFecha.getDate();
                date.setYear(jdcFecha.getCalendar().get(Calendar.YEAR));
                //************************************************************************
                Coneccion coneccion = new Coneccion();
                MiBuscadorBE miBuscardorBE = new MiBuscadorBE(1, 0, "", "que la vida es dificultosa", date, new Date());
                cMiBuscadorBL miBuscadorBL = new cMiBuscadorBL();
                miBuscadorBL.Insertar(coneccion, miBuscardorBE);
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "No se inserto");
            }
        }
//        System.out.println("Hola Como Estas");
        if (accion == 2) { //Listar
            try {
                JDateChooser jdcFecha = new JDateChooser();
                //CODIGO PARA ASIGNAR FECHA ACTUAL o del sistema...
                jdcFecha.setDate(new Date());//ASIGANMOS VALOR DEL SISTEMA A JDCFECHA
                Date date = new Date();//LUEGO ESOS PARAMATROS LO GUARDAMOS EN UNA VARIABLE
                date = jdcFecha.getDate();
                date.setYear(jdcFecha.getCalendar().get(Calendar.YEAR));
                //**************************************************************
                Coneccion coneccion = new Coneccion();
                MiBuscadorBE miBuscardorBE = new MiBuscadorBE(3, 0, " vida", "", date, date);
                cMiBuscadorBLL miBuscadorBLL = new cMiBuscadorBLL();
                List<MiBuscadorBE> alist = miBuscadorBLL.Leer(coneccion, miBuscardorBE);
                for (MiBuscadorBE olist : alist) {
                    System.out.println( "\n"+olist.getCodigo() + "\t ::: " + olist.getDescripcion() +"\t ::: " +olist.getFecha()+ "\n");
                }
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Error al listar");
            }
        }
    }
    public void btnSabeActionPerformed() {

    }

}
