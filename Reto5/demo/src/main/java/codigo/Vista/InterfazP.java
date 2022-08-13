package codigo.Vista;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Color;
import java.awt.event.*;

public class InterfazP extends JFrame implements ActionListener{
    JPanel panel01;
    JButton btn01;
    JButton btn02;
    JButton btn03;

    public InterfazP(){
        setTitle("Principal");
        setSize(500,170);
        setBackground(Color.WHITE);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        
        btn01=new JButton("Consulta 1");
        btn01.setBounds(40,20,130,60);
        btn01.addActionListener(this);
        btn01.setBackground(Color.MAGENTA);
        add(btn01);

        btn02=new JButton("Consulta 2");
        btn02.setBounds(180,20,130,60);
        btn02.addActionListener(this);
        btn02.setBackground(Color.WHITE);
        add(btn02);

        btn03=new JButton("Consulta 3");
        btn03.setBounds(320,20,130,60);
        btn03.addActionListener(this);
        btn03.setBackground(Color.MAGENTA);
        add(btn03);
        
        panel01=new JPanel();
        panel01.setBackground(Color.PINK);
        add(panel01);
        
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==btn01){
            new Interfaz1();
        }
        else if(e.getSource()==btn02){
            new Interfaz2();
        }
        else if(e.getSource()==btn03){
            new Interfaz3();
        }
    }
}
