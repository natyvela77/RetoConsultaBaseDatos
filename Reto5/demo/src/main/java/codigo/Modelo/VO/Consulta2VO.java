package codigo.Modelo.VO;
import java.sql.*;
import java.util.ArrayList;

import codigo.Modelo.DAO.*;

public class Consulta2VO {
    public static ArrayList<String[]> valores() {
        
        ArrayList<String[]> salida_vo=new ArrayList<String[]>();

        try {
            ResultSet rs=Consulta2.Consulta();
            
            while(rs.next()){
                //ID_Proyecto, Constructora, Numero_Habitaciones,Ciudad
                String ID=rs.getInt("ID_Proyecto")+"";
                String constructora=rs.getString("Constructora");
                String nh=rs.getString("Numero_Habitaciones");
                String ciudad=rs.getString("Ciudad");
                salida_vo.add(new String[]{ID+"",constructora,nh,ciudad});

            }
            
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return salida_vo;
        
        
    }  
}
