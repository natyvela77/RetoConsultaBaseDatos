package codigo.Modelo.VO;
import java.sql.*;
import java.util.ArrayList;

import codigo.Modelo.DAO.*;

public class Consulta3VO {
    public static ArrayList<String[]> valores() {
        
        ArrayList<String[]> salida_vo=new ArrayList<String[]>();

        try {
            ResultSet rs=Consulta3.Consulta();
            
            while(rs.next()){
                //ID_Compra, Constructora, Banco_Vinculado
                String ID=rs.getInt("ID_Compra")+"";
                String constructora=rs.getString("Constructora");
                String banco=rs.getString("Banco_Vinculado");
                salida_vo.add(new String[]{ID+"",constructora,banco});

            }
            
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return salida_vo;
        
        
    }    
}
