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

/**
 *
 * @author Saira Fatima
 */
public class resultslevel1 {
   private String image;
    public resultslevel1(){
       
    }
  
    public  void result(){
    JFrame frame2=new JFrame();  
    
            frame2.setLayout(null);
            frame2.setBounds(0,0,1000,1000);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label2=new JLabel(image);
            JPanel panel2=new JPanel();
            JButton button=new JButton("mainmenue.JPG");
            button.addActionListener(new ActionListener( ) {
 
           public  void actionPerformed(ActionEvent ev) {
         
            MainMenue st=new MainMenue();
         st.mainmenue();
             frame2.setVisible(false);
          
         
           }
     });
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.blue);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 1000, 500, 500)); //colour of panael
             panel2.add(label2);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true); 
}}
