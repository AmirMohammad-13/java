package javaapplication30;

import java.util.Scanner;

public class JavaApplication30 {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       int tedad;
       
       do{
           System.out.print("tedad daneshjooha: ");
           tedad=input.nextInt();
       }while(tedad<=0);
       
       double nomre;
       double majmoo=0;
       double max=0;
       double min=20;
       
       int ghabol=0;
       int momtaz=0;
       int oftade=0;
       
       for (int i =1; i<=tedad; i++){
           do{
               System.out.print("nomre daneshjooye "+i+": ");
               nomre=input.nextDouble();
           }while(nomre<0 || nomre>20);
           
           majmoo=majmoo+nomre;
           
           if(nomre>max){
               max=nomre;
           }
           if(nomre<min){
               min=nomre;
           }
           if(nomre>=10){
               ghabol++;
           }
           if(nomre>=18){
               momtaz++;
           }
       }

       double avg=majmoo/tedad;
       
       for(int i=1; i<=tedad; i++) {
           break;}
          
       
       double darsad=(ghabol*100.00)/tedad;
       
        System.out.println("miyangin: "+avg);
        System.out.println("max nomre: "+max);
        System.out.println("tedad ghaboolyha: "+ghabol);
        System.out.println("tedad momtaz: "+momtaz);
        System.out.println("darsade ghaboli: "+darsad+" darsad");
    }    
    }
