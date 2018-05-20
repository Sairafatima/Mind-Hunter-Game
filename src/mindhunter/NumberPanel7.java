
package mindhunter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class NumberPanel7 extends GAME{
    public  Icon icon2 = new ImageIcon("NumberPanel7.JPG");
     public  Icon icon = new ImageIcon("showbtn.PNG");
    public NumberPanel7(){
        
    }
    @Override
    public  void buttonone(){
    JFrame frame2=new JFrame();  
    
            frame2.setLayout(null);
            frame2.setBounds(0,0,1000,1000);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label2=new JLabel(icon2);
            JButton button=new JButton(icon);
                   button.setBorder(BorderFactory.createLineBorder(Color.black));
             button.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             result7 st=new result7();
             st.result();
             frame2.setVisible(false);
         
           }
     });
            JPanel panel2=new JPanel();
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.black);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //colour of panael
             panel2.add(label2);
             panel2.add(button);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);
    }
    
}
