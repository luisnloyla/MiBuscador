/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CongregacionBD;

import CongregacionBE.MensualBE;
import CongregacionBE.MiBuscadorBE;
import ejecutar.Coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Loyola
 */
public class p_MiBuscador_sel {
    private int Accion;
    private int Id_MiBuscador ;
    private String Codigo ;
    private String Descripcion ;
    private Date Fecha;
    private Date FechaFin;
    private int ReturnVal;
    private List<MiBuscadorBE> aMiBuscadorBE = new ArrayList<>(); 

    public p_MiBuscador_sel(Coneccion strCn,MiBuscadorBE objMiBuscadorBE) throws SQLException {
        this.Accion = objMiBuscadorBE.getAccion();
        this.Id_MiBuscador = objMiBuscadorBE.getId_MiBuscador();
        this.Codigo = objMiBuscadorBE.getCodigo().toUpperCase();
        this.Descripcion = objMiBuscadorBE.getDescripcion().toUpperCase();
        this.Fecha = objMiBuscadorBE.getFecha();
        this.FechaFin = objMiBuscadorBE.getFechaFin();
        this.ReturnVal = objMiBuscadorBE.getReturnVal();
        //**********************************************************************
        String a0="";        String a1="";        String a2="";        String a3="";        String a4="";        String a5="";        String a6="";        String a7="";        String a8="";        String a9="";
        String a10="";        String a11="";        String a12="";        String a13="";        String a14="";        String a15="";        String a16="";        String a17="";        String a18="";        String a19="";
        String a20="";        String a21="";        String a22="";        String a23="";        String a24="";        String a25="";        String a26="";        String a27="";        String a28="";        String a29="";
        String a30="";        String a31="";        String a32="";        String a33="";        String a34="";        String a35="";        String a36="";        String a37="";        String a38="";        String a39="";
        String a40="";        String a41="";        String a42="";        String a43="";        String a44="";        String a45="";        String a46="";        String a47="";        String a48="";        String a49="";
        String a50="";        String a51="";        String a52="";        String a53="";        String a54="";        String a55="";        String a56="";        String a57="";        String a58="";        String a59="";
        String a60="";        String a61="";        String a62="";        String a63="";        String a64="";        String a65="";        String a66="";        String a67="";        String a68="";        String a69="";
        String a70="";        String a71="";        String a72="";        String a73="";        String a74="";        String a75="";        String a76="";        String a77="";        String a78="";        String a79="";
        String a80="";        String a81="";        String a82="";        String a83="";        String a84="";        String a85="";        String a86="";        String a87="";        String a88="";        String a89="";
        String a90="";        String a91="";        String a92="";        String a93="";        String a94="";        String a95="";        String a96="";        String a97="";        String a98="";        String a99="";
        
        String b0="";        String b1="";        String b2="";        String b3="";        String b4="";        String b5="";        String b6="";        String b7="";        String b8="";        String b9="";
        String b10="";        String b11="";        String b12="";        String b13="";        String b14="";        String b15="";        String b16="";        String b17="";        String b18="";        String b19="";
        String b20="";        String b21="";        String b22="";        String b23="";        String b24="";        String b25="";        String b26="";        String b27="";        String b28="";        String b29="";
        String b30="";        String b31="";        String b32="";        String b33="";        String b34="";        String b35="";        String b36="";        String b37="";        String b38="";        String b39="";
        String b40="";        String b41="";        String b42="";        String b43="";        String b44="";        String b45="";        String b46="";        String b47="";        String b48="";        String b49="";
        String b50="";        String b51="";        String b52="";        String b53="";        String b54="";        String b55="";        String b56="";        String b57="";        String b58="";        String b59="";
        String b60="";        String b61="";        String b62="";        String b63="";        String b64="";        String b65="";        String b66="";        String b67="";        String b68="";        String b69="";
        String b70="";        String b71="";        String b72="";        String b73="";        String b74="";        String b75="";        String b76="";        String b77="";        String b78="";        String b79="";
        String b80="";        String b81="";        String b82="";        String b83="";        String b84="";        String b85="";        String b86="";        String b87="";        String b88="";        String b89="";
        String b90="";        String b91="";        String b92="";        String b93="";        String b94="";        String b95="";        String b96="";        String b97="";        String b98="";        String b99="";
        
        //**********************************************************************
        int contadorA=0;
        String cadA="";
        for (int i = 0; i < this.Codigo.length(); i++) {
            if (' '!=this.Codigo.charAt(i)){
                cadA=cadA+this.Codigo.substring(i,i+1);
                if(contadorA==0) a0=cadA;        if(contadorA==1) a1=cadA;        if(contadorA==2) a2=cadA;        if(contadorA==3) a3=cadA;        if(contadorA==4) a4=cadA;        if(contadorA==5) a5=cadA;        if(contadorA==6) a6=cadA;        if(contadorA==7) a7=cadA;        if(contadorA==8) a8=cadA;        if(contadorA==9) a9=cadA;
                if(contadorA==10) a10=cadA;        if(contadorA==11) a11=cadA;        if(contadorA==12) a12=cadA;        if(contadorA==13) a13=cadA;        if(contadorA==14) a14=cadA;        if(contadorA==15) a15=cadA;        if(contadorA==16) a16=cadA;        if(contadorA==17) a17=cadA;        if(contadorA==18) a18=cadA;        if(contadorA==19) a19=cadA;
                if(contadorA==20) a20=cadA;        if(contadorA==21) a21=cadA;        if(contadorA==22) a22=cadA;        if(contadorA==23) a23=cadA;        if(contadorA==24) a24=cadA;        if(contadorA==25) a25=cadA;        if(contadorA==26) a26=cadA;        if(contadorA==27) a27=cadA;        if(contadorA==28) a28=cadA;        if(contadorA==29) a29=cadA;
                if(contadorA==30) a30=cadA;        if(contadorA==31) a31=cadA;        if(contadorA==32) a32=cadA;        if(contadorA==33) a33=cadA;        if(contadorA==34) a34=cadA;        if(contadorA==35) a35=cadA;        if(contadorA==36) a36=cadA;        if(contadorA==37) a37=cadA;        if(contadorA==38) a38=cadA;        if(contadorA==39) a39=cadA;
                if(contadorA==40) a40=cadA;        if(contadorA==41) a41=cadA;        if(contadorA==42) a42=cadA;        if(contadorA==43) a43=cadA;        if(contadorA==44) a44=cadA;        if(contadorA==45) a45=cadA;        if(contadorA==46) a46=cadA;        if(contadorA==47) a47=cadA;        if(contadorA==48) a48=cadA;        if(contadorA==49) a49=cadA;
                if(contadorA==50) a50=cadA;        if(contadorA==51) a51=cadA;        if(contadorA==52) a52=cadA;        if(contadorA==53) a53=cadA;        if(contadorA==54) a54=cadA;        if(contadorA==55) a55=cadA;        if(contadorA==56) a56=cadA;        if(contadorA==57) a57=cadA;        if(contadorA==58) a58=cadA;        if(contadorA==59) a59=cadA;
                if(contadorA==60) a60=cadA;        if(contadorA==61) a61=cadA;        if(contadorA==62) a62=cadA;        if(contadorA==63) a63=cadA;        if(contadorA==64) a64=cadA;        if(contadorA==65) a65=cadA;        if(contadorA==66) a66=cadA;        if(contadorA==67) a67=cadA;        if(contadorA==68) a68=cadA;        if(contadorA==69) a69=cadA;
                if(contadorA==70) a70=cadA;        if(contadorA==71) a71=cadA;        if(contadorA==72) a72=cadA;        if(contadorA==73) a73=cadA;        if(contadorA==74) a74=cadA;        if(contadorA==75) a75=cadA;        if(contadorA==76) a76=cadA;        if(contadorA==77) a77=cadA;        if(contadorA==78) a78=cadA;        if(contadorA==79) a79=cadA;
                if(contadorA==80) a80=cadA;        if(contadorA==81) a81=cadA;        if(contadorA==82) a82=cadA;        if(contadorA==83) a83=cadA;        if(contadorA==84) a84=cadA;        if(contadorA==85) a85=cadA;        if(contadorA==86) a86=cadA;        if(contadorA==87) a87=cadA;        if(contadorA==88) a88=cadA;        if(contadorA==89) a89=cadA;
                if(contadorA==90) a90=cadA;        if(contadorA==91) a91=cadA;        if(contadorA==92) a92=cadA;        if(contadorA==93) a93=cadA;        if(contadorA==94) a94=cadA;        if(contadorA==95) a95=cadA;        if(contadorA==96) a96=cadA;        if(contadorA==97) a97=cadA;        if(contadorA==98) a98=cadA;        if(contadorA==99) a99=cadA;
            }
            else{
                if(cadA.length()>0){
                    cadA="";
                    contadorA++;
                }
            }
        }
        //**********************************************************************
        int contadorB=0;
        String cadB="";
        for (int i = 0; i < this.Descripcion.length(); i++) {
            if (' '!=this.Descripcion.charAt(i)){
                cadB=cadB+this.Descripcion.substring(i,i+1);
                if(contadorB==0) b0=cadB;        if(contadorB==1) b1=cadB;        if(contadorB==2) b2=cadB;        if(contadorB==3) b3=cadB;        if(contadorB==4) b4=cadB;        if(contadorB==5) b5=cadB;        if(contadorB==6) b6=cadB;        if(contadorB==7) b7=cadB;        if(contadorB==8) b8=cadB;        if(contadorB==9) b9=cadB;
                if(contadorB==10) b10=cadB;        if(contadorB==11) b11=cadB;        if(contadorB==12) b12=cadB;        if(contadorB==13) b13=cadB;        if(contadorB==14) b14=cadB;        if(contadorB==15) b15=cadB;        if(contadorB==16) b16=cadB;        if(contadorB==17) b17=cadB;        if(contadorB==18) b18=cadB;        if(contadorB==19) b19=cadB;
                if(contadorB==20) b20=cadB;        if(contadorB==21) b21=cadB;        if(contadorB==22) b22=cadB;        if(contadorB==23) b23=cadB;        if(contadorB==24) b24=cadB;        if(contadorB==25) b25=cadB;        if(contadorB==26) b26=cadB;        if(contadorB==27) b27=cadB;        if(contadorB==28) b28=cadB;        if(contadorB==29) b29=cadB;
                if(contadorB==30) b30=cadB;        if(contadorB==31) b31=cadB;        if(contadorB==32) b32=cadB;        if(contadorB==33) b33=cadB;        if(contadorB==34) b34=cadB;        if(contadorB==35) b35=cadB;        if(contadorB==36) b36=cadB;        if(contadorB==37) b37=cadB;        if(contadorB==38) b38=cadB;        if(contadorB==39) b39=cadB;
                if(contadorB==40) b40=cadB;        if(contadorB==41) b41=cadB;        if(contadorB==42) b42=cadB;        if(contadorB==43) b43=cadB;        if(contadorB==44) b44=cadB;        if(contadorB==45) b45=cadB;        if(contadorB==46) b46=cadB;        if(contadorB==47) b47=cadB;        if(contadorB==48) b48=cadB;        if(contadorB==49) b49=cadB;
                if(contadorB==50) b50=cadB;        if(contadorB==51) b51=cadB;        if(contadorB==52) b52=cadB;        if(contadorB==53) b53=cadB;        if(contadorB==54) b54=cadB;        if(contadorB==55) b55=cadB;        if(contadorB==56) b56=cadB;        if(contadorB==57) b57=cadB;        if(contadorB==58) b58=cadB;        if(contadorB==59) b59=cadB;
                if(contadorB==60) b60=cadB;        if(contadorB==61) b61=cadB;        if(contadorB==62) b62=cadB;        if(contadorB==63) b63=cadB;        if(contadorB==64) b64=cadB;        if(contadorB==65) b65=cadB;        if(contadorB==66) b66=cadB;        if(contadorB==67) b67=cadB;        if(contadorB==68) b68=cadB;        if(contadorB==69) b69=cadB;
                if(contadorB==70) b70=cadB;        if(contadorB==71) b71=cadB;        if(contadorB==72) b72=cadB;        if(contadorB==73) b73=cadB;        if(contadorB==74) b74=cadB;        if(contadorB==75) b75=cadB;        if(contadorB==76) b76=cadB;        if(contadorB==77) b77=cadB;        if(contadorB==78) b78=cadB;        if(contadorB==79) b79=cadB;
                if(contadorB==80) b80=cadB;        if(contadorB==81) b81=cadB;        if(contadorB==82) b82=cadB;        if(contadorB==83) b83=cadB;        if(contadorB==84) b84=cadB;        if(contadorB==85) b85=cadB;        if(contadorB==86) b86=cadB;        if(contadorB==87) b87=cadB;        if(contadorB==88) b88=cadB;        if(contadorB==89) b89=cadB;
                if(contadorB==90) b90=cadB;        if(contadorB==91) b91=cadB;        if(contadorB==92) b92=cadB;        if(contadorB==93) b93=cadB;        if(contadorB==94) b94=cadB;        if(contadorB==95) b95=cadB;        if(contadorB==96) b96=cadB;        if(contadorB==97) b97=cadB;        if(contadorB==98) b98=cadB;        if(contadorB==99) b99=cadB;
            }
            else{
                if(cadB.length()>0){
                    cadB="";
                    contadorB++;
                }
            }
        }
        //**********************************************************************
//        Statement st=null;
//        ResultSet rs=null;
        Connection con = strCn.getCon();
        ResultSet rs=null;
        
//        PreparedStatement pstOperacion = null;
        PreparedStatement pstLista = null;
        MiBuscadorBE MiBuscadorBE = null;
        try {
//            st = strCn.getSt();
            //        this.ReturVal = ReturVal;
            con.setAutoCommit(false);
            if (this.Accion == 1){
                pstLista=con.prepareStatement("SELECT*FROM MiBuscador");
                rs=pstLista.executeQuery();
                while (rs.next()) {
                    System.out.println(""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
                    MiBuscadorBE = new MiBuscadorBE(0, rs.getInt(1), rs.getString(2), rs.getString(3),  rs.getDate(4),new Date());
                    aMiBuscadorBE.add(MiBuscadorBE);
                }
                this.ReturnVal=0;
            }
//            if (this.Accion == 2){
//                pstLista=con.prepareStatement("SELECT * FROM MiBuscador WHERE "
//                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%'"
//                        
//                );                
//                pstLista.setString(1, a0);                pstLista.setString(2, a1);
//                
////                pstLista.setString(101,"'"+this.Fecha.getYear()+"-"+this.Fecha.getMonth()+"-"+this.Fecha.getDate()+"'");
////                pstLista.setString(102,"'"+this.FechaFin.getYear()+"-"+this.FechaFin.getMonth()+"-"+this.FechaFin.getDate()+"'");
//                //**************************************************************
//                rs=pstLista.executeQuery();
//                while (rs.next()) {
//                    System.out.println(""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+ rs.getDate(4));
//                    MiBuscadorBE = new MiBuscadorBE(0, rs.getInt(1), rs.getString(2), rs.getString(3),  rs.getDate(4),new Date());
//                    aMiBuscadorBE.add(MiBuscadorBE);
//                }
//                this.ReturnVal=0;
//            }
            if (this.Accion == 2){
                pstLista=con.prepareStatement("SELECT * FROM MiBuscador WHERE "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "(Fecha BETWEEN ? AND ?)"
                );
                
                pstLista.setString(1, a0);                pstLista.setString(2, a1);                pstLista.setString(3, a2);                pstLista.setString(4, a3);                pstLista.setString(5, a4);                pstLista.setString(6, a5);                pstLista.setString(7, a6);                pstLista.setString(8, a7);                pstLista.setString(9, a8);                pstLista.setString(10, a9);
                
                pstLista.setString(11, a10);                pstLista.setString(12, a11);                pstLista.setString(13, a12);                pstLista.setString(14, a13);                pstLista.setString(15, a14);                pstLista.setString(16, a15);                pstLista.setString(17, a16);                pstLista.setString(18, a17);                pstLista.setString(19, a18);                pstLista.setString(20, a19);
                
                pstLista.setString(21, a20);                pstLista.setString(22, a21);                pstLista.setString(23, a22);                pstLista.setString(24, a23);                pstLista.setString(25, a24);                pstLista.setString(26, a25);                pstLista.setString(27, a26);                pstLista.setString(28, a27);                pstLista.setString(29, a28);                pstLista.setString(30, a29);
                
                pstLista.setString(31, a30);                pstLista.setString(32, a31);                pstLista.setString(33, a32);                pstLista.setString(34, a33);                pstLista.setString(35, a34);                pstLista.setString(36, a35);                pstLista.setString(37, a36);                pstLista.setString(38, a37);                pstLista.setString(39, a38);                pstLista.setString(40, a39);
                
                pstLista.setString(41, a40);                pstLista.setString(42, a41);                pstLista.setString(43, a42);                pstLista.setString(44, a43);                pstLista.setString(45, a44);                pstLista.setString(46, a45);                pstLista.setString(47, a46);                pstLista.setString(48, a47);                pstLista.setString(49, a48);                pstLista.setString(50, a49);
                
                pstLista.setString(51, a50);                pstLista.setString(52, a51);                pstLista.setString(53, a52);                pstLista.setString(54, a53);                pstLista.setString(55, a54);                pstLista.setString(56, a55);                pstLista.setString(57, a56);                pstLista.setString(58, a57);                pstLista.setString(59, a58);                pstLista.setString(60, a59);
                
                pstLista.setString(61, a60);                pstLista.setString(62, a61);                pstLista.setString(63, a62);                pstLista.setString(64, a63);                pstLista.setString(65, a64);                pstLista.setString(66, a65);                pstLista.setString(67, a66);                pstLista.setString(68, a67);                pstLista.setString(69, a68);                pstLista.setString(70, a69);
                
                pstLista.setString(71, a70);                pstLista.setString(72, a71);                pstLista.setString(73, a72);                pstLista.setString(74, a73);                pstLista.setString(75, a74);                pstLista.setString(76, a75);                pstLista.setString(77, a76);                pstLista.setString(78, a77);                pstLista.setString(79, a78);                pstLista.setString(80, a79);
                
                pstLista.setString(81, a80);                pstLista.setString(82, a81);                pstLista.setString(83, a82);                pstLista.setString(84, a83);                pstLista.setString(85, a84);                pstLista.setString(86, a85);                pstLista.setString(87, a86);                pstLista.setString(88, a87);                pstLista.setString(89, a88);                pstLista.setString(90, a89);
                
                pstLista.setString(91, a90);                pstLista.setString(92, a91);                pstLista.setString(93, a92);                pstLista.setString(94, a93);                pstLista.setString(95, a94);                pstLista.setString(96, a95);                pstLista.setString(97, a96);                pstLista.setString(98, a97);                pstLista.setString(99, a98);                pstLista.setString(100, a99);
                
                pstLista.setString(101,""+this.Fecha.getYear()+"-"+(this.Fecha.getMonth()+1)+"-"+this.Fecha.getDate());
                pstLista.setString(102,""+this.FechaFin.getYear()+"-"+(this.FechaFin.getMonth()+1)+"-"+this.FechaFin.getDate());
                //**************************************************************
                
                rs=pstLista.executeQuery();
                while (rs.next()) {
                    System.out.println(""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+ rs.getDate(4));
                    MiBuscadorBE = new MiBuscadorBE(0, rs.getInt(1), rs.getString(2), rs.getString(3),  rs.getDate(4),new Date());
                    aMiBuscadorBE.add(MiBuscadorBE);
                }
                this.ReturnVal=0;
            }
            if (this.Accion == 3){
                pstLista=con.prepareStatement("SELECT * FROM MiBuscador WHERE "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "(Fecha BETWEEN ? AND ?)"
                );
                
                pstLista.setString(1, b0);                pstLista.setString(2, b1);                pstLista.setString(3, b2);                pstLista.setString(4, b3);                pstLista.setString(5, b4);                pstLista.setString(6, b5);                pstLista.setString(7, b6);                pstLista.setString(8, b7);                pstLista.setString(9, b8);                pstLista.setString(10, b9);
                
                pstLista.setString(11, b10);                pstLista.setString(12, b11);                pstLista.setString(13, b12);                pstLista.setString(14, b13);                pstLista.setString(15, b14);                pstLista.setString(16, b15);                pstLista.setString(17, b16);                pstLista.setString(18, b17);                pstLista.setString(19, b18);                pstLista.setString(20, b19);
                
                pstLista.setString(21, b20);                pstLista.setString(22, b21);                pstLista.setString(23, b22);                pstLista.setString(24, b23);                pstLista.setString(25, b24);                pstLista.setString(26, b25);                pstLista.setString(27, b26);                pstLista.setString(28, b27);                pstLista.setString(29, b28);                pstLista.setString(30, b29);
                
                pstLista.setString(31, b30);                pstLista.setString(32, b31);                pstLista.setString(33, b32);                pstLista.setString(34, b33);                pstLista.setString(35, b34);                pstLista.setString(36, b35);                pstLista.setString(37, b36);                pstLista.setString(38, b37);                pstLista.setString(39, b38);                pstLista.setString(40, b39);
                
                pstLista.setString(41, b40);                pstLista.setString(42, b41);                pstLista.setString(43, b42);                pstLista.setString(44, b43);                pstLista.setString(45, b44);                pstLista.setString(46, b45);                pstLista.setString(47, b46);                pstLista.setString(48, b47);                pstLista.setString(49, b48);                pstLista.setString(50, b49);
                
                pstLista.setString(51, b50);                pstLista.setString(52, b51);                pstLista.setString(53, b52);                pstLista.setString(54, b53);                pstLista.setString(55, b54);                pstLista.setString(56, b55);                pstLista.setString(57, b56);                pstLista.setString(58, b57);                pstLista.setString(59, b58);                pstLista.setString(60, b59);
                
                pstLista.setString(61, b60);                pstLista.setString(62, b61);                pstLista.setString(63, b62);                pstLista.setString(64, b63);                pstLista.setString(65, b64);                pstLista.setString(66, b65);                pstLista.setString(67, b66);                pstLista.setString(68, b67);                pstLista.setString(69, b68);                pstLista.setString(70, b69);
                
                pstLista.setString(71, b70);                pstLista.setString(72, b71);                pstLista.setString(73, b72);                pstLista.setString(74, b73);                pstLista.setString(75, b74);                pstLista.setString(76, b75);                pstLista.setString(77, b76);                pstLista.setString(78, b77);                pstLista.setString(79, b78);                pstLista.setString(80, b79);
                
                pstLista.setString(81, b80);                pstLista.setString(82, b81);                pstLista.setString(83, b82);                pstLista.setString(84, b83);                pstLista.setString(85, b84);                pstLista.setString(86, b85);                pstLista.setString(87, b86);                pstLista.setString(88, b87);                pstLista.setString(89, b88);                pstLista.setString(90, b89);
                
                pstLista.setString(91, b90);                pstLista.setString(92, b91);                pstLista.setString(93, b92);                pstLista.setString(94, b93);                pstLista.setString(95, b94);                pstLista.setString(96, b95);                pstLista.setString(97, b96);                pstLista.setString(98, b97);                pstLista.setString(99, b98);                pstLista.setString(100, b99);
                
                pstLista.setString(101,""+this.Fecha.getYear()+"-"+(this.Fecha.getMonth()+1)+"-"+this.Fecha.getDate());
                pstLista.setString(102,""+this.FechaFin.getYear()+"-"+(this.FechaFin.getMonth()+1)+"-"+this.FechaFin.getDate());
                //**************************************************************
                
                rs=pstLista.executeQuery();
                while (rs.next()) {
                    System.out.println(""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+ rs.getDate(4));
                    MiBuscadorBE = new MiBuscadorBE(0, rs.getInt(1), rs.getString(2), rs.getString(3),  rs.getDate(4),new Date());
                    aMiBuscadorBE.add(MiBuscadorBE);
                }
                this.ReturnVal=0;
            }
            if (this.Accion == 4){
                pstLista=con.prepareStatement("SELECT * FROM MiBuscador WHERE "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%'"
                );
                
                pstLista.setString(1, a0);                pstLista.setString(2, a1);                pstLista.setString(3, a2);                pstLista.setString(4, a3);                pstLista.setString(5, a4);                pstLista.setString(6, a5);                pstLista.setString(7, a6);                pstLista.setString(8, a7);                pstLista.setString(9, a8);                pstLista.setString(10, a9);
                
                pstLista.setString(11, a10);                pstLista.setString(12, a11);                pstLista.setString(13, a12);                pstLista.setString(14, a13);                pstLista.setString(15, a14);                pstLista.setString(16, a15);                pstLista.setString(17, a16);                pstLista.setString(18, a17);                pstLista.setString(19, a18);                pstLista.setString(20, a19);
                
                pstLista.setString(21, a20);                pstLista.setString(22, a21);                pstLista.setString(23, a22);                pstLista.setString(24, a23);                pstLista.setString(25, a24);                pstLista.setString(26, a25);                pstLista.setString(27, a26);                pstLista.setString(28, a27);                pstLista.setString(29, a28);                pstLista.setString(30, a29);
                
                pstLista.setString(31, a30);                pstLista.setString(32, a31);                pstLista.setString(33, a32);                pstLista.setString(34, a33);                pstLista.setString(35, a34);                pstLista.setString(36, a35);                pstLista.setString(37, a36);                pstLista.setString(38, a37);                pstLista.setString(39, a38);                pstLista.setString(40, a39);
                
                pstLista.setString(41, a40);                pstLista.setString(42, a41);                pstLista.setString(43, a42);                pstLista.setString(44, a43);                pstLista.setString(45, a44);                pstLista.setString(46, a45);                pstLista.setString(47, a46);                pstLista.setString(48, a47);                pstLista.setString(49, a48);                pstLista.setString(50, a49);
                
                pstLista.setString(51, a50);                pstLista.setString(52, a51);                pstLista.setString(53, a52);                pstLista.setString(54, a53);                pstLista.setString(55, a54);                pstLista.setString(56, a55);                pstLista.setString(57, a56);                pstLista.setString(58, a57);                pstLista.setString(59, a58);                pstLista.setString(60, a59);
                
                pstLista.setString(61, a60);                pstLista.setString(62, a61);                pstLista.setString(63, a62);                pstLista.setString(64, a63);                pstLista.setString(65, a64);                pstLista.setString(66, a65);                pstLista.setString(67, a66);                pstLista.setString(68, a67);                pstLista.setString(69, a68);                pstLista.setString(70, a69);
                
                pstLista.setString(71, a70);                pstLista.setString(72, a71);                pstLista.setString(73, a72);                pstLista.setString(74, a73);                pstLista.setString(75, a74);                pstLista.setString(76, a75);                pstLista.setString(77, a76);                pstLista.setString(78, a77);                pstLista.setString(79, a78);                pstLista.setString(80, a79);
                
                pstLista.setString(81, a80);                pstLista.setString(82, a81);                pstLista.setString(83, a82);                pstLista.setString(84, a83);                pstLista.setString(85, a84);                pstLista.setString(86, a85);                pstLista.setString(87, a86);                pstLista.setString(88, a87);                pstLista.setString(89, a88);                pstLista.setString(90, a89);
                
                pstLista.setString(91, a90);                pstLista.setString(92, a91);                pstLista.setString(93, a92);                pstLista.setString(94, a93);                pstLista.setString(95, a94);                pstLista.setString(96, a95);                pstLista.setString(97, a96);                pstLista.setString(98, a97);                pstLista.setString(99, a98);                pstLista.setString(100, a99);
                                
                //**************************************************************
                
                rs=pstLista.executeQuery();
                while (rs.next()) {
                    System.out.println(""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+ rs.getDate(4));
                    MiBuscadorBE = new MiBuscadorBE(0, rs.getInt(1), rs.getString(2), rs.getString(3),  rs.getDate(4),new Date());
                    aMiBuscadorBE.add(MiBuscadorBE);
                }
                this.ReturnVal=0;
            }
            if (this.Accion == 5){
                pstLista=con.prepareStatement("SELECT * FROM MiBuscador WHERE "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%'"                        
                );
                
                pstLista.setString(1, b0);                pstLista.setString(2, b1);                pstLista.setString(3, b2);                pstLista.setString(4, b3);                pstLista.setString(5, b4);                pstLista.setString(6, b5);                pstLista.setString(7, b6);                pstLista.setString(8, b7);                pstLista.setString(9, b8);                pstLista.setString(10, b9);
                
                pstLista.setString(11, b10);                pstLista.setString(12, b11);                pstLista.setString(13, b12);                pstLista.setString(14, b13);                pstLista.setString(15, b14);                pstLista.setString(16, b15);                pstLista.setString(17, b16);                pstLista.setString(18, b17);                pstLista.setString(19, b18);                pstLista.setString(20, b19);
                
                pstLista.setString(21, b20);                pstLista.setString(22, b21);                pstLista.setString(23, b22);                pstLista.setString(24, b23);                pstLista.setString(25, b24);                pstLista.setString(26, b25);                pstLista.setString(27, b26);                pstLista.setString(28, b27);                pstLista.setString(29, b28);                pstLista.setString(30, b29);
                
                pstLista.setString(31, b30);                pstLista.setString(32, b31);                pstLista.setString(33, b32);                pstLista.setString(34, b33);                pstLista.setString(35, b34);                pstLista.setString(36, b35);                pstLista.setString(37, b36);                pstLista.setString(38, b37);                pstLista.setString(39, b38);                pstLista.setString(40, b39);
                
                pstLista.setString(41, b40);                pstLista.setString(42, b41);                pstLista.setString(43, b42);                pstLista.setString(44, b43);                pstLista.setString(45, b44);                pstLista.setString(46, b45);                pstLista.setString(47, b46);                pstLista.setString(48, b47);                pstLista.setString(49, b48);                pstLista.setString(50, b49);
                
                pstLista.setString(51, b50);                pstLista.setString(52, b51);                pstLista.setString(53, b52);                pstLista.setString(54, b53);                pstLista.setString(55, b54);                pstLista.setString(56, b55);                pstLista.setString(57, b56);                pstLista.setString(58, b57);                pstLista.setString(59, b58);                pstLista.setString(60, b59);
                
                pstLista.setString(61, b60);                pstLista.setString(62, b61);                pstLista.setString(63, b62);                pstLista.setString(64, b63);                pstLista.setString(65, b64);                pstLista.setString(66, b65);                pstLista.setString(67, b66);                pstLista.setString(68, b67);                pstLista.setString(69, b68);                pstLista.setString(70, b69);
                
                pstLista.setString(71, b70);                pstLista.setString(72, b71);                pstLista.setString(73, b72);                pstLista.setString(74, b73);                pstLista.setString(75, b74);                pstLista.setString(76, b75);                pstLista.setString(77, b76);                pstLista.setString(78, b77);                pstLista.setString(79, b78);                pstLista.setString(80, b79);
                
                pstLista.setString(81, b80);                pstLista.setString(82, b81);                pstLista.setString(83, b82);                pstLista.setString(84, b83);                pstLista.setString(85, b84);                pstLista.setString(86, b85);                pstLista.setString(87, b86);                pstLista.setString(88, b87);                pstLista.setString(89, b88);                pstLista.setString(90, b89);
                
                pstLista.setString(91, b90);                pstLista.setString(92, b91);                pstLista.setString(93, b92);                pstLista.setString(94, b93);                pstLista.setString(95, b94);                pstLista.setString(96, b95);                pstLista.setString(97, b96);                pstLista.setString(98, b97);                pstLista.setString(99, b98);                pstLista.setString(100, b99);
                
                //**************************************************************
                
                rs=pstLista.executeQuery();
                while (rs.next()) {
                    System.out.println(""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+ rs.getDate(4));
                    MiBuscadorBE = new MiBuscadorBE(0, rs.getInt(1), rs.getString(2), rs.getString(3),  rs.getDate(4),new Date());
                    aMiBuscadorBE.add(MiBuscadorBE);
                }
                this.ReturnVal=0;
            }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       
            if (this.Accion == 6){
                pstLista=con.prepareStatement("SELECT * FROM MiBuscador WHERE "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        
                        + "(Fecha BETWEEN ? AND ?)"
                );
                
                pstLista.setString(1, a0);                pstLista.setString(2, a1);                pstLista.setString(3, a2);                pstLista.setString(4, a3);                pstLista.setString(5, a4);                pstLista.setString(6, a5);                pstLista.setString(7, a6);                pstLista.setString(8, a7);                pstLista.setString(9, a8);                pstLista.setString(10, a9);
                
                pstLista.setString(11, a10);                pstLista.setString(12, a11);                pstLista.setString(13, a12);                pstLista.setString(14, a13);                pstLista.setString(15, a14);                pstLista.setString(16, a15);                pstLista.setString(17, a16);                pstLista.setString(18, a17);                pstLista.setString(19, a18);                pstLista.setString(20, a19);
                
                pstLista.setString(21, a20);                pstLista.setString(22, a21);                pstLista.setString(23, a22);                pstLista.setString(24, a23);                pstLista.setString(25, a24);                pstLista.setString(26, a25);                pstLista.setString(27, a26);                pstLista.setString(28, a27);                pstLista.setString(29, a28);                pstLista.setString(30, a29);
                
                pstLista.setString(31, a30);                pstLista.setString(32, a31);                pstLista.setString(33, a32);                pstLista.setString(34, a33);                pstLista.setString(35, a34);                pstLista.setString(36, a35);                pstLista.setString(37, a36);                pstLista.setString(38, a37);                pstLista.setString(39, a38);                pstLista.setString(40, a39);
                
                pstLista.setString(41, a40);                pstLista.setString(42, a41);                pstLista.setString(43, a42);                pstLista.setString(44, a43);                pstLista.setString(45, a44);                pstLista.setString(46, a45);                pstLista.setString(47, a46);                pstLista.setString(48, a47);                pstLista.setString(49, a48);                pstLista.setString(50, a49);
                
                pstLista.setString(51, a50);                pstLista.setString(52, a51);                pstLista.setString(53, a52);                pstLista.setString(54, a53);                pstLista.setString(55, a54);                pstLista.setString(56, a55);                pstLista.setString(57, a56);                pstLista.setString(58, a57);                pstLista.setString(59, a58);                pstLista.setString(60, a59);
                
                pstLista.setString(61, a60);                pstLista.setString(62, a61);                pstLista.setString(63, a62);                pstLista.setString(64, a63);                pstLista.setString(65, a64);                pstLista.setString(66, a65);                pstLista.setString(67, a66);                pstLista.setString(68, a67);                pstLista.setString(69, a68);                pstLista.setString(70, a69);
                
                pstLista.setString(71, a70);                pstLista.setString(72, a71);                pstLista.setString(73, a72);                pstLista.setString(74, a73);                pstLista.setString(75, a74);                pstLista.setString(76, a75);                pstLista.setString(77, a76);                pstLista.setString(78, a77);                pstLista.setString(79, a78);                pstLista.setString(80, a79);
                
                pstLista.setString(81, a80);                pstLista.setString(82, a81);                pstLista.setString(83, a82);                pstLista.setString(84, a83);                pstLista.setString(85, a84);                pstLista.setString(86, a85);                pstLista.setString(87, a86);                pstLista.setString(88, a87);                pstLista.setString(89, a88);                pstLista.setString(90, a89);
                
                pstLista.setString(91, a90);                pstLista.setString(92, a91);                pstLista.setString(93, a92);                pstLista.setString(94, a93);                pstLista.setString(95, a94);                pstLista.setString(96, a95);                pstLista.setString(97, a96);                pstLista.setString(98, a97);                pstLista.setString(99, a98);                pstLista.setString(100, a99);
                //&&&&
                pstLista.setString(101, b0);                pstLista.setString(102, b1);                pstLista.setString(103, b2);                pstLista.setString(104, b3);                pstLista.setString(105, b4);                pstLista.setString(106, b5);                pstLista.setString(107, b6);                pstLista.setString(108, b7);                pstLista.setString(109, b8);                pstLista.setString(110, b9);
                
                pstLista.setString(111, b10);                pstLista.setString(112, b11);                pstLista.setString(113, b12);                pstLista.setString(114, b13);                pstLista.setString(115, b14);                pstLista.setString(116, b15);                pstLista.setString(117, b16);                pstLista.setString(118, b17);                pstLista.setString(119, b18);                pstLista.setString(120, b19);
                
                pstLista.setString(121, b20);                pstLista.setString(122, b21);                pstLista.setString(123, b22);                pstLista.setString(124, b23);                pstLista.setString(125, b24);                pstLista.setString(126, b25);                pstLista.setString(127, b26);                pstLista.setString(128, b27);                pstLista.setString(129, b28);                pstLista.setString(130, b29);
                
                pstLista.setString(131, b30);                pstLista.setString(132, b31);                pstLista.setString(133, b32);                pstLista.setString(134, b33);                pstLista.setString(135, b34);                pstLista.setString(136, b35);                pstLista.setString(137, b36);                pstLista.setString(138, b37);                pstLista.setString(139, b38);                pstLista.setString(140, b39);
                
                pstLista.setString(141, b40);                pstLista.setString(142, b41);                pstLista.setString(143, b42);                pstLista.setString(144, b43);                pstLista.setString(145, b44);                pstLista.setString(146, b45);                pstLista.setString(147, b46);                pstLista.setString(148, b47);                pstLista.setString(149, b48);                pstLista.setString(150, b49);
                
                pstLista.setString(151, b50);                pstLista.setString(152, b51);                pstLista.setString(153, b52);                pstLista.setString(154, b53);                pstLista.setString(155, b54);                pstLista.setString(156, b55);                pstLista.setString(157, b56);                pstLista.setString(158, b57);                pstLista.setString(159, b58);                pstLista.setString(160, b59);
                
                pstLista.setString(161, b60);                pstLista.setString(162, b61);                pstLista.setString(163, b62);                pstLista.setString(164, b63);                pstLista.setString(165, b64);                pstLista.setString(166, b65);                pstLista.setString(167, b66);                pstLista.setString(168, b67);                pstLista.setString(169, b68);                pstLista.setString(170, b69);
                
                pstLista.setString(171, b70);                pstLista.setString(172, b71);                pstLista.setString(173, b72);                pstLista.setString(174, b73);                pstLista.setString(175, b74);                pstLista.setString(176, b75);                pstLista.setString(177, b76);                pstLista.setString(178, b77);                pstLista.setString(179, b78);                pstLista.setString(180, b79);
                
                pstLista.setString(181, b80);                pstLista.setString(182, b81);                pstLista.setString(183, b82);                pstLista.setString(184, b83);                pstLista.setString(185, b84);                pstLista.setString(186, b85);                pstLista.setString(187, b86);                pstLista.setString(188, b87);                pstLista.setString(189, b88);                pstLista.setString(190, b89);
                
                pstLista.setString(191, b90);                pstLista.setString(192, b91);                pstLista.setString(193, b92);                pstLista.setString(194, b93);                pstLista.setString(195, b94);                pstLista.setString(196, b95);                pstLista.setString(197, b96);                pstLista.setString(198, b97);                pstLista.setString(199, b98);                pstLista.setString(200, b99);
                
                pstLista.setString(201,""+this.Fecha.getYear()+"-"+(this.Fecha.getMonth()+1)+"-"+this.Fecha.getDate());
                pstLista.setString(202,""+this.FechaFin.getYear()+"-"+(this.FechaFin.getMonth()+1)+"-"+this.FechaFin.getDate());
                //**************************************************************
                
                rs=pstLista.executeQuery();
                while (rs.next()) {
                    System.out.println(""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+ rs.getDate(4));
                    MiBuscadorBE = new MiBuscadorBE(0, rs.getInt(1), rs.getString(2), rs.getString(3),  rs.getDate(4),new Date());
                    aMiBuscadorBE.add(MiBuscadorBE);
                }
                this.ReturnVal=0;
            }
//TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
            
            if (this.Accion == 7){
                pstLista=con.prepareStatement("SELECT * FROM MiBuscador WHERE "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        + "IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND IndiceCodigo LIKE '%'||?||'%' AND "
                        
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND "
                        + "IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%' AND IndiceDescripcion LIKE '%'||?||'%'"                                                
                );
                
                pstLista.setString(1, a0);                pstLista.setString(2, a1);                pstLista.setString(3, a2);                pstLista.setString(4, a3);                pstLista.setString(5, a4);                pstLista.setString(6, a5);                pstLista.setString(7, a6);                pstLista.setString(8, a7);                pstLista.setString(9, a8);                pstLista.setString(10, a9);
                
                pstLista.setString(11, a10);                pstLista.setString(12, a11);                pstLista.setString(13, a12);                pstLista.setString(14, a13);                pstLista.setString(15, a14);                pstLista.setString(16, a15);                pstLista.setString(17, a16);                pstLista.setString(18, a17);                pstLista.setString(19, a18);                pstLista.setString(20, a19);
                
                pstLista.setString(21, a20);                pstLista.setString(22, a21);                pstLista.setString(23, a22);                pstLista.setString(24, a23);                pstLista.setString(25, a24);                pstLista.setString(26, a25);                pstLista.setString(27, a26);                pstLista.setString(28, a27);                pstLista.setString(29, a28);                pstLista.setString(30, a29);
                
                pstLista.setString(31, a30);                pstLista.setString(32, a31);                pstLista.setString(33, a32);                pstLista.setString(34, a33);                pstLista.setString(35, a34);                pstLista.setString(36, a35);                pstLista.setString(37, a36);                pstLista.setString(38, a37);                pstLista.setString(39, a38);                pstLista.setString(40, a39);
                
                pstLista.setString(41, a40);                pstLista.setString(42, a41);                pstLista.setString(43, a42);                pstLista.setString(44, a43);                pstLista.setString(45, a44);                pstLista.setString(46, a45);                pstLista.setString(47, a46);                pstLista.setString(48, a47);                pstLista.setString(49, a48);                pstLista.setString(50, a49);
                
                pstLista.setString(51, a50);                pstLista.setString(52, a51);                pstLista.setString(53, a52);                pstLista.setString(54, a53);                pstLista.setString(55, a54);                pstLista.setString(56, a55);                pstLista.setString(57, a56);                pstLista.setString(58, a57);                pstLista.setString(59, a58);                pstLista.setString(60, a59);
                
                pstLista.setString(61, a60);                pstLista.setString(62, a61);                pstLista.setString(63, a62);                pstLista.setString(64, a63);                pstLista.setString(65, a64);                pstLista.setString(66, a65);                pstLista.setString(67, a66);                pstLista.setString(68, a67);                pstLista.setString(69, a68);                pstLista.setString(70, a69);
                
                pstLista.setString(71, a70);                pstLista.setString(72, a71);                pstLista.setString(73, a72);                pstLista.setString(74, a73);                pstLista.setString(75, a74);                pstLista.setString(76, a75);                pstLista.setString(77, a76);                pstLista.setString(78, a77);                pstLista.setString(79, a78);                pstLista.setString(80, a79);
                
                pstLista.setString(81, a80);                pstLista.setString(82, a81);                pstLista.setString(83, a82);                pstLista.setString(84, a83);                pstLista.setString(85, a84);                pstLista.setString(86, a85);                pstLista.setString(87, a86);                pstLista.setString(88, a87);                pstLista.setString(89, a88);                pstLista.setString(90, a89);
                
                pstLista.setString(91, a90);                pstLista.setString(92, a91);                pstLista.setString(93, a92);                pstLista.setString(94, a93);                pstLista.setString(95, a94);                pstLista.setString(96, a95);                pstLista.setString(97, a96);                pstLista.setString(98, a97);                pstLista.setString(99, a98);                pstLista.setString(100, a99);
                //&&&&
                pstLista.setString(101, b0);                pstLista.setString(102, b1);                pstLista.setString(103, b2);                pstLista.setString(104, b3);                pstLista.setString(105, b4);                pstLista.setString(106, b5);                pstLista.setString(107, b6);                pstLista.setString(108, b7);                pstLista.setString(109, b8);                pstLista.setString(110, b9);
                
                pstLista.setString(111, b10);                pstLista.setString(112, b11);                pstLista.setString(113, b12);                pstLista.setString(114, b13);                pstLista.setString(115, b14);                pstLista.setString(116, b15);                pstLista.setString(117, b16);                pstLista.setString(118, b17);                pstLista.setString(119, b18);                pstLista.setString(120, b19);
                
                pstLista.setString(121, b20);                pstLista.setString(122, b21);                pstLista.setString(123, b22);                pstLista.setString(124, b23);                pstLista.setString(125, b24);                pstLista.setString(126, b25);                pstLista.setString(127, b26);                pstLista.setString(128, b27);                pstLista.setString(129, b28);                pstLista.setString(130, b29);
                
                pstLista.setString(131, b30);                pstLista.setString(132, b31);                pstLista.setString(133, b32);                pstLista.setString(134, b33);                pstLista.setString(135, b34);                pstLista.setString(136, b35);                pstLista.setString(137, b36);                pstLista.setString(138, b37);                pstLista.setString(139, b38);                pstLista.setString(140, b39);
                
                pstLista.setString(141, b40);                pstLista.setString(142, b41);                pstLista.setString(143, b42);                pstLista.setString(144, b43);                pstLista.setString(145, b44);                pstLista.setString(146, b45);                pstLista.setString(147, b46);                pstLista.setString(148, b47);                pstLista.setString(149, b48);                pstLista.setString(150, b49);
                
                pstLista.setString(151, b50);                pstLista.setString(152, b51);                pstLista.setString(153, b52);                pstLista.setString(154, b53);                pstLista.setString(155, b54);                pstLista.setString(156, b55);                pstLista.setString(157, b56);                pstLista.setString(158, b57);                pstLista.setString(159, b58);                pstLista.setString(160, b59);
                
                pstLista.setString(161, b60);                pstLista.setString(162, b61);                pstLista.setString(163, b62);                pstLista.setString(164, b63);                pstLista.setString(165, b64);                pstLista.setString(166, b65);                pstLista.setString(167, b66);                pstLista.setString(168, b67);                pstLista.setString(169, b68);                pstLista.setString(170, b69);
                
                pstLista.setString(171, b70);                pstLista.setString(172, b71);                pstLista.setString(173, b72);                pstLista.setString(174, b73);                pstLista.setString(175, b74);                pstLista.setString(176, b75);                pstLista.setString(177, b76);                pstLista.setString(178, b77);                pstLista.setString(179, b78);                pstLista.setString(180, b79);
                
                pstLista.setString(181, b80);                pstLista.setString(182, b81);                pstLista.setString(183, b82);                pstLista.setString(184, b83);                pstLista.setString(185, b84);                pstLista.setString(186, b85);                pstLista.setString(187, b86);                pstLista.setString(188, b87);                pstLista.setString(189, b88);                pstLista.setString(190, b89);
                
                pstLista.setString(191, b90);                pstLista.setString(192, b91);                pstLista.setString(193, b92);                pstLista.setString(194, b93);                pstLista.setString(195, b94);                pstLista.setString(196, b95);                pstLista.setString(197, b96);                pstLista.setString(198, b97);                pstLista.setString(199, b98);                pstLista.setString(200, b99);
                                
                //**************************************************************
                
                rs=pstLista.executeQuery();
                while (rs.next()) {
                    System.out.println(""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+ rs.getDate(4));
                    MiBuscadorBE = new MiBuscadorBE(0, rs.getInt(1), rs.getString(2), rs.getString(3),  rs.getDate(4),new Date());
                    aMiBuscadorBE.add(MiBuscadorBE);
                }
                this.ReturnVal=0;
            }
            con.commit();
            con.setAutoCommit(true);
//            pstOperacion.close();
            pstLista.close();
        } catch (Exception e) {
            System.out.println(e);
            con.rollback();
            con.setAutoCommit(true);
//            pstOperacion.close();
            pstLista.close();
            
            this.ReturnVal=-1;
        } 
    }
    public p_MiBuscador_sel(Connection strCn,MiBuscadorBE objMiBuscadorBE) {
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



    public List<MiBuscadorBE> getaMiBuscadorBE() {
        return aMiBuscadorBE;
    }

    public void setaMiBuscadorBE(List<MiBuscadorBE> aMiBuscadorBE) {
        this.aMiBuscadorBE = aMiBuscadorBE;
    }
    
}