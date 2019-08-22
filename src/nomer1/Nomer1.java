/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1;

import java.util.Random;

/**
 *
 * @author Praktikan
 */
public class Nomer1 implements Runnable {
       private String nama;
       private Thread thread;
       private boolean cek;
       private int healtyAlex=25;
       private int healtypopon=25;
    @Override
    public void run() {
      try {
         do{
                 
           Random rand = new Random ();
           int random1 = rand.nextInt(3)+1;
           int random2 = rand.nextInt(3)+1;
            System.out.print("Alex terkena serangan "+random1);
            healtyAlex-=random1;
            System.out.println("| healty"+healtyAlex);
            System.out.print("Popon terkena serngan"+random2);
            healtypopon-=random2;
            System.out.println("| healty"+healtypopon);
           
       }while(healtyAlex!=0 && healtypopon!=0);
          if(healtyAlex==0){
                System.out.println("popon menang");
            }
            else{
                System.out.println("Alex menang");
            }
      }
      catch(Exception e){
         System.out.println("data terkena enception");
      }
    }
    public void stun(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Nomer1 hasil = new Nomer1();
      Thread t = new Thread(hasil);
      t.start();
    }
}   

