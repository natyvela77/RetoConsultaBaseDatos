package codigo.Modelo.VO;
import java.sql.ResultSet;
import java.util.ArrayList;

import codigo.Modelo.DAO.*;

public class Consulta1VO {
    public static ArrayList<String[]> valores() {
        
        ArrayList<String[]> salida_vo=new ArrayList<String[]>();

        try {
            ResultSet rs=Consulta1.Consulta();
            
            while(rs.next()){
                
                String ID=rs.getInt("ID_Lider")+"";
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Primer_Apellido");
                String ciudad=rs.getString("Ciudad_Residencia");
                salida_vo.add(new String[]{ID+"",nombre,apellido,ciudad});

            }
            
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return salida_vo;
        
        
    }
}
