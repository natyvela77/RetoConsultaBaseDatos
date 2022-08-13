package codigo.Modelo.DAO;
import java.sql.*;
import codigo.Utilidades.*;

public class Consulta2 {
    public static ResultSet Consulta(){
        ResultSet rs=null;
        String csql="SELECT ID_Proyecto, Constructora, Numero_Habitaciones,Ciudad  FROM  Proyecto  WHERE Clasificacion=='Casa Campestre' AND Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla');";
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
