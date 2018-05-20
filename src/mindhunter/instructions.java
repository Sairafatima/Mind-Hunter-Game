
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

public class instructions {
     private static Icon icon = new ImageIcon("leveli.JPG");
      private static Icon icon1 = new ImageIcon("leveliyes.JPG");
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
        
             level21 st=new level21();
             st.action1();
          
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
