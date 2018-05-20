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

public class level21 {
        public  Icon icon = new ImageIcon("box1.JPG");
         public  Icon icon1 = new ImageIcon("box1yes.JPG");
          public  Icon icon2 = new ImageIcon("box1no.JPG");

    public level21() {
    }
          public void action1(){
              JFrame frame2=new JFrame();  
    
            frame2.setLayout(null);
            frame2.setBounds(0,0,800,800);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label2=new JLabel(icon);
            JButton button=new JButton(icon1);
            button.setBorder(BorderFactory.createLineBorder(Color.black));
            button.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             results6 st=new results6();
             st.result();
          
             frame2.setVisible(false);
           }
     });
            JButton button2=new JButton(icon2);
            button.setBorder(BorderFactory.createLineBorder(Color.black));
            JPanel panel2=new JPanel();
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.black);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //colour of panael
             panel2.add(label2);
             panel2.add(button);
             panel2.add(button2);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);
            }
         }

