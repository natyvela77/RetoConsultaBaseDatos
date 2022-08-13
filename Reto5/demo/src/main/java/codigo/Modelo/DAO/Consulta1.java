package codigo.Modelo.DAO;

import java.sql.*;
import codigo.Utilidades.*;

public class Consulta1 {
    public static ResultSet Consulta(){
        ResultSet rs=null;
        String csql="SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia  FROM Lider ORDER BY Ciudad_Residencia;";
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
