/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindhunter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class level1intro {

    public  Icon icon2 = new ImageIcon("level11.JPG");
      public  Icon icon = new ImageIcon("next.JPG");
  
    public level1intro(){
        
    }
   
    public  void button(){
    JFrame frame2=new JFrame();  
    
            frame2.setLayout(null);
            frame2.setBounds(0,0,1000,1000);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
             JPanel panel2=new JPanel();
             JLabel title2   = new JLabel(icon2);             
              //set border colour of Lable
             JButton button=new JButton(icon);
             button.setBorder(BorderFactory.createLineBorder(Color.black));
             button.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             Level1 st=new Level1();
             st.levelimplementation();
             frame2.setVisible(false);
          
         
           }
     });
             panel2.setBounds(1000,1000,1000,1000);//settings of bounds of Panel
             panel2.setBackground(Color.black);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 700, 1000, 1000)); //colour of panael
             panel2.add(title2);
             
             panel2.add(button);
            frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);
    }
            
}
