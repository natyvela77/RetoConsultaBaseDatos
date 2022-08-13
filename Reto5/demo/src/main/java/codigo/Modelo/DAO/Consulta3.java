package codigo.Modelo.DAO;
import java.sql.*;
import codigo.Utilidades.*;

public class Consulta3 {
    public static ResultSet Consulta(){
        ResultSet rs=null;
        String csql="SELECT ID_Compra, Constructora, Banco_Vinculado from Compra  JOIN Proyecto USING(ID_Proyecto) WHERE Proveedor=='Homecenter' AND Ciudad=='Salento';";
        try {
            Connection conn=JDBCUtilities.conexion();
            Statement stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    return rs;
    }    
}
