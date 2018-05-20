
package mindhunter;
import java.util.*;
import java.awt.*;

import javax.swing.*;
public class GAME {
    private String a;
    public GAME(){}
    public  void buttonone(){
      
       JFrame frame2=new JFrame();   
    
            frame2.setLayout(null);
            frame2.setBounds(0,0,1000,1000);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label2=new JLabel(a);
            JPanel panel2=new JPanel();
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.blue);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 1000, 500, 500)); //colour of panael
             panel2.add(label2);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);       
    }
    
    
}
