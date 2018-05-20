/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindhunter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Saira Fatima
 */
public class StartButton extends MainMenue{
    private static Icon icon3 = new ImageIcon("level1.JPG");
    private static Icon icon4 = new ImageIcon("level2.JPG");
     private static Icon icon5 = new ImageIcon("lbl.PNG");
    public void action(){
   
   
   JLabel label1=new JLabel(icon5);
   JFrame frame=new JFrame();
   JButton level1=new JButton(icon3);
   level1.setBorder(BorderFactory.createLineBorder(Color.black));
    level1.addActionListener(new ActionListener( ) {

     public  void actionPerformed(ActionEvent ev) {
        
         level1intro st=new level1intro();
         st.button();
          
        frame.setVisible(false);
           }
     });
      JButton level2=new JButton(icon4);
   level2.setBorder(BorderFactory.createLineBorder(Color.black));
   level2.setBorder(BorderFactory.createLineBorder(Color.black));
   level2.addActionListener(new ActionListener( ) {
 
     public  void actionPerformed(ActionEvent ev) {
        
         instructions lo=new instructions();
         lo.action1();
          
        frame.setVisible(false);
           }
     });
   frame.setLayout(null);
   frame.setBounds(0,0,1000,1000);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   JPanel panel=new JPanel();
   panel.setBounds(100,100,100,100);//settings of bounds of Panel
   panel.setBackground(Color.black);
   panel.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //colour of panael
   panel.add(level1);
   panel.add(label1);
   panel.add(level2);
             
   frame.setContentPane(panel);
   frame.pack( );   
   frame.setVisible(true);
 }
}