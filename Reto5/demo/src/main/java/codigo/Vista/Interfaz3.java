package codigo.Vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import codigo.Modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz3 extends JFrame{
    JPanel panelg;
    JScrollPane scpanel01;
    JTable tabla01;
    DefaultTableModel modelo01;

    public Interfaz3() {
        setTitle("Consulta 3");
        setSize(500,400);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setResizable(false);
        panelg=new JPanel();
        Color fondo=new Color(62,160,159);
        panelg.setBackground(fondo);
        
        String[] columnas={"ID","Cosntructora","Banco"};
        
        ArrayList<String[]> d=Consulta3VO.valores();

        String[][] datos=new String[d.size()][3];
        
        for (int i = 0; i < d.size(); i++) {
            int j=0;
            for (String s : d.get(i)) {
                datos[i][j]=s;
                j++;
            }
        }
            
            
        modelo01=new DefaultTableModel(datos,columnas);
        tabla01=new JTable(modelo01);
        scpanel01=new JScrollPane(tabla01);
        scpanel01.setBounds(20,20,420,320);
        add(scpanel01);

        add(panelg);
        setVisible(true);
    }
}
