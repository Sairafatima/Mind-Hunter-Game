
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
import javax.swing.UIManager;
public class MainMenue {
    public MainMenue(){}
    
    private static Icon icon = new ImageIcon("title.JPG");
    private static Icon icon1 = new ImageIcon("START.JPG");
    private static Icon icon2 = new ImageIcon("intro.JPG");
    private static Icon icon3 = new ImageIcon("exit.JPG");
    public void mainmenue(){
     //BUTTONS
 
    JButton EXIT=new JButton(icon3);
    EXIT.setBorder(BorderFactory.createLineBorder(Color.black));
    EXIT.addActionListener(new ActionListener( ) {
 
     public  void actionPerformed(ActionEvent ev) {
        
         System.exit(0);
          
         
           }
     });
     //Lable
    JLabel title2   =new JLabel(icon, SwingConstants.LEFT);//creating  new lable with name a
    title2.setBorder(BorderFactory.createLineBorder(Color.black)); //set border colour of Lable
    // image in Lable
    
    JFrame frame=new JFrame(); //creating a new frame
    JButton start=new JButton(icon1);
    start.setBorder(BorderFactory.createLineBorder(Color.black));
    start.setRolloverEnabled(true);
    start.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        start.setBackground(Color.GREEN);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        start.setBackground(UIManager.getColor("control"));
    }
});
    start.addActionListener(new ActionListener( ) {
 
     public  void actionPerformed(ActionEvent ev) {
        
         StartButton st=new StartButton();
         st.action();
             frame.setVisible(false);
          
         
           }
     });
    frame.setLayout(null);
    frame.setBounds(0,0,1000,1000);//settings of bounds of Frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    JPanel panel=new JPanel( ); //creating a panel 
   
    panel.setBounds(00,00,100,100);//settings of bounds of Panel
    panel.setBackground(Color.black); //colour of panael
    //adding label to panel
    panel.add(title2);
    panel.add(start);
   
    panel.add(EXIT);
    panel.setBorder(BorderFactory.createEmptyBorder(0, 00, 500, 500)); //borders of panel
    panel.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); 
    frame.setContentPane(panel);// Adds to CENTER
  
    frame.pack( );   
    frame.setVisible(true);
    }
    
    
    


}
