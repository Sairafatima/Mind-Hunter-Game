/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindhunter;

import java.util.Random;

/**
 *
 * @author Saira Fatima
 */
public class Level1 implements Levels{

    @Override
    public void levelimplementation() {
        Random random=new Random();
          int  a=0+random.nextInt(9);
          
          if (a==1){
          MindHunter mn=new MindHunter();
          mn.buttonone();
          }
          if (a==2){
              NumberPanel8 n2=new  NumberPanel8();
             n2.buttonone();
          }
          if (a==3){
              NumberPanel6 n2=new  NumberPanel6();
             n2.buttonone();
          }
          if (a==4){
              NumberPanel5 n2=new  NumberPanel5();
             n2.buttonone();
          }
          if (a==5){
              NumberPanel4 n2=new  NumberPanel4();
             n2.buttonone();
          }
          if (a==6){
              NumberPanel3 n2=new  NumberPanel3();
             n2.buttonone();
          }
          if (a==7){
              NumberPanel2 n2=new  NumberPanel2();
             n2.buttonone();
          }
          if (a==8){
              NumberPanel1 n2=new  NumberPanel1();
             n2.buttonone();
          }
    }
    
}
