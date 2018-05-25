package mindhunter;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class level21 {
        public  Icon icon = new ImageIcon("box1.JPG"); 
        public  Icon icon1 = new ImageIcon("box1yes.JPG"); //icon for YES BUTTON
        public  Icon icon2 = new ImageIcon("box1no.JPG"); //icon for NO BUTTON
              public  Icon icon3 = new ImageIcon("box2.JPG");
              public  Icon icon4 = new ImageIcon("box3.JPG");
                public  Icon iconu = new ImageIcon("box4.JPG");
                public  Icon icon5 = new ImageIcon("box5.JPG");
                    public  Icon icon6 = new ImageIcon("box6.JPG");
                      public  Icon button=new ImageIcon("mainmenue.JPG"); // return to MainMenu button icon
                                           
                    
                    
        
        private int box1[]={1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63};
        private int boxh[]= {0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62};
        private int box2[]={2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31,34,35,38,39,42,43,46,47,50,51,54,55,58,59,62,63};
        private int box3[]={4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31,36,37,38,39,44,45,46,47,52,53,54,55,60,61,62,63};
        private int box4[]={8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31,40,41,42,43,44,45,46,47,56,57,58,59,60,61,62,63};
        private int box5[]={16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63};
        private int box6[]={32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63};
        String a="";
        private int result[]=new int[32];
        public level21() { //level21 constructor
        }
        public void action1(){ //method 
         
        // components of box1 window
        JFrame frame2=new JFrame();  
        JLabel label2=new JLabel(icon);
        JButton YES=new JButton(icon1);
        JButton NO=new JButton(icon2);
        JPanel panel2=new JPanel(); // 
         frame2.setLayout(null); //frame Layout
            frame2.setBounds(0,0,800,800); //setting bounds
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.black);//colour of panael
            panel2.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); 
            YES.setBorder(BorderFactory.createLineBorder(Color.black)); //setting border color of button
            NO.setBorder(BorderFactory.createLineBorder(Color.black)); 
            //method of button action
            YES.addActionListener(new ActionListener( ) {

            public  void actionPerformed(ActionEvent ev) {
        
            
                action2();  // open frame of box 2
             mycalculation(box1); //initializing the array of elements that are in box 1
             System.out.println (Arrays.toString(mycalculation(box1))); //set for degugging
            
             setResult(box1);
              
             frame2.setVisible(false); //set current frame to false
           }
     });
            
            
        
             //butoon action
            NO.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             // open box2 wiindow
             action2();
             
             mycalculation(boxh); //initializing array with elements that are not in box1
             System.out.println(Arrays.toString(getResult()));
             frame2.setVisible(false);
           }
     });
                         panel2.add(label2);
             panel2.add(YES);
             panel2.add(NO);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);
            }
      
            
         

         
          public int[] mycalculation(int[] b){
        for (int i=0;i<32;i++){
            this.result[i]=b[i];
        }
        return this.result;
    }

     public int[] calultaions(int[] b){
       for (int i=0;i<32;i++){
       boolean r=false;
    for (int j=0;j<32;j++){
       
       	if (result[i] == b[j])
           r=true;
      
        }
    if (r==false){
        result[i]=0;
    }
    
    }
       setResult(result);
               
   
      return result;
     }
    public void setResult(int[] result) {
        result = result;
    }
    public int[] getResult() {
        return result;
    }

    
      
     
     public int[] miscalcultaions(int[] b){
           for (int i=0;i<32;i++){
            boolean r=true;
            for (int j=0;j<32;j++){
       
       	    if (result[i] == b[j])
              r=false;
               
        }
    if (r==false){
        result[i]=0;
    }
           }
       
    return result;
     }
     public void action2(){
        
        JFrame frame2=new JFrame(); 
        JLabel label2=new JLabel(icon3);
        JButton YES=new JButton(icon1);
        JButton NO=new JButton(icon2);
     
               
    
            frame2.setLayout(null);
            frame2.setBounds(0,0,800,800);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            YES.setBorder(BorderFactory.createLineBorder(Color.black));
            
            YES.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             
             action5();
             
             calultaions(box2);
              System.out.println(Arrays.toString(getResult()));
             frame2.setVisible(false);
           }
     });
            
            
             NO.setBorder(BorderFactory.createLineBorder(Color.black));
             NO.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             
             action5();
             miscalcultaions(box2);
            System.out.println(Arrays.toString(getResult()));
            
             frame2.setVisible(false);
           }
     });
            JPanel panel2=new JPanel();
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.black);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //colour of panael
             panel2.add(label2);
             panel2.add(YES);
             panel2.add(NO);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);
            }

     public void action5(){
              
      
        JFrame frame2=new JFrame(); 
        JLabel label2=new JLabel(icon4);
        JButton YES=new JButton(icon1);
        JButton NO=new JButton(icon2);
      
            frame2.setLayout(null);
            frame2.setBounds(0,0,800,800);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            YES.setBorder(BorderFactory.createLineBorder(Color.black));
            
            YES.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
            action6();
            calultaions(box3);
             System.out.println(Arrays.toString(getResult()));

             frame2.setVisible(false);
           }
     });
            
            
            NO.setBorder(BorderFactory.createLineBorder(Color.black));
             NO.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             
             action6();
             miscalcultaions(box3);
               System.out.println(Arrays.toString(getResult()));
             frame2.setVisible(false);
           }
     });
            JPanel panel2=new JPanel();
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.black);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //colour of panael
             panel2.add(label2);
             panel2.add(YES);
             panel2.add(NO);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);
            } 
      public void action6(){
          
         
            JFrame frame2=new JFrame(); 
            JLabel label2=new JLabel(iconu);
            JButton YES=new JButton(icon1);
            JButton NO=new JButton(icon2);
    
            frame2.setLayout(null);
            frame2.setBounds(0,0,800,800);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            YES.setBorder(BorderFactory.createLineBorder(Color.black));
            
            YES.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             
             action7();
              calultaions(box4);
               System.out.println(Arrays.toString(getResult()));
             frame2.setVisible(false);
           }
     });
            
            
            NO.setBorder(BorderFactory.createLineBorder(Color.black));
             NO.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             
             action7();
             miscalcultaions(box4);
              System.out.println(Arrays.toString(getResult()));
             frame2.setVisible(false);
           }
     });
            JPanel panel2=new JPanel();
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.black);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //colour of panael
             panel2.add(label2);
             panel2.add(YES);
             panel2.add(NO);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);
            }
      public void action7(){
          
               
   
      
        JFrame frame2=new JFrame(); 
        JLabel label2=new JLabel(icon5);
        JButton YES=new JButton(icon1);
        JButton NO=new JButton(icon2);
            frame2.setLayout(null);
            frame2.setBounds(0,0,800,800);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            YES.setBorder(BorderFactory.createLineBorder(Color.black));
            
            YES.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             
             action8();
             calultaions(box5);
              System.out.println(Arrays.toString(getResult()));
             frame2.setVisible(false);
           }
     });
            
            
            NO.setBorder(BorderFactory.createLineBorder(Color.black));
             NO.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             
             action8();
              miscalcultaions(box5);
              System.out.println(Arrays.toString(getResult()));
             frame2.setVisible(false);
           }
     });
            JPanel panel2=new JPanel();
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.black);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //colour of panael
             panel2.add(label2);
             panel2.add(YES);
             panel2.add(NO);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);
            }

      
      public void action8(){

       
        JFrame frame2=new JFrame(); 
        JLabel label2=new JLabel(icon6);
        JButton YES=new JButton(icon1);
        JButton NO=new JButton(icon2);
        JLabel label=new JLabel();

    
            frame2.setLayout(null);
            frame2.setBounds(0,0,800,800);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            YES.setBorder(BorderFactory.createLineBorder(Color.black));
            
            YES.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
             

            calultaions(box6);
             System.out.println(Arrays.toString(getResult()));
                       hash();
                        
          
            JPanel jp=new JPanel();
            JLabel intro=new JLabel();
            JButton start=new JButton(button);
    start.setBorder(BorderFactory.createLineBorder(Color.black));
   
    
    start.addActionListener(new ActionListener( ) {
 
     public  void actionPerformed(ActionEvent ev) {
        
           MainMenue st=new MainMenue();
         st.mainmenue();
             
             frame2.setVisible(false);
          
         
           }
     });
         JLabel jb;
        
         jb = new JLabel(a);
         jb.setForeground(Color.GREEN);
         jb.setFont(new Font("Algerian", Font.BOLD, 90));
          jb.setBorder(BorderFactory.createLineBorder(Color.BLACK)); //set border colour of Lable
        
          intro = new JLabel("YOUR NUMBER.....");
         intro.setForeground(Color.GREEN);
         intro.setFont(new Font("Algerian", Font.BOLD, 90));
          intro.setBorder(BorderFactory.createLineBorder(Color.BLACK)); //set border colour of Lable

           jp.add(intro);
          jp.add(jb); 
          jp.add(start);
         
            JFrame frame=new JFrame();
            frame.pack( );   
           
            frame.setLayout(null);
            frame.setBounds(0,0,1000,1000);//settings of bounds of Frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jp.setBounds(00,00,100,100);//settings of bounds of Panel
     jp.setBackground(Color.BLACK); //colour of panael
     jp.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //borders of 
    frame.setContentPane(jp);// Adds to CENTER
     frame.setVisible(true);
             frame2.setVisible(false);
           }
     });
            
            
            NO.setBorder(BorderFactory.createLineBorder(Color.black));
             NO.addActionListener(new ActionListener( ) {

             public  void actionPerformed(ActionEvent ev) {
        
       
             
             miscalcultaions(box6);
              System.out.println(Arrays.toString(getResult()));
                          frame2.setVisible(false);
                           JPanel jp=new JPanel();
                           hash();
                               
             JLabel jb;
             
             JLabel intro;
             JButton start=new JButton(button);
    start.setBorder(BorderFactory.createLineBorder(Color.black));
   
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
        
         MainMenue st=new MainMenue();
         st.mainmenue();
             frame2.setVisible(false);
          
         
           }
     });
             
             jb = new JLabel(a);
             jb.setForeground(Color.GREEN);
            jb.setFont(new Font("Algerian", Font.BOLD, 90));
             jb.setBorder(BorderFactory.createLineBorder(Color.BLACK)); //set border colour of Lable
           
            
             intro = new JLabel("YOUR NUMBER....");
             intro.setForeground(Color.GREEN);
            intro.setFont(new Font("Algerian", Font.BOLD, 90));
             
           
             intro.setBorder(BorderFactory.createLineBorder(Color.BLACK)); //set border colour of Lable
             jp.add(intro);
             jp.add(jb);
             jp.add(start);
             JFrame fram=new JFrame();
             fram.pack( );   
          
             fram.setLayout(null);
             fram.setBounds(0,0,1000,1000);//settings of bounds of Frame
             fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jp.setBounds(00,00,100,100);//settings of bounds of Panel
             jp.setBackground(Color.BLACK); //colour of panael
             jp.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //borders of 
            fram.setContentPane(jp);// Adds to CENTER
               fram.setVisible(true);

             }
        });
               JPanel panel2=new JPanel();
            panel2.setBounds(100,100,100,100);//settings of bounds of Panel
            panel2.setBackground(Color.black);
             panel2.setBorder(BorderFactory.createEmptyBorder(0, 500, 500, 500)); //colour of panael
             panel2.add(label2);
             panel2.add(YES);
             panel2.add(NO);
             frame2.setContentPane(panel2);
            frame2.pack( );   
            frame2.setVisible(true);
            
           
      }
      public void hash(){
     a="";
          for (int i=0;i<32;i++){
              if (result[i]!=0){
                  a+=result[i];
                  
              }
          }
          }
      }
