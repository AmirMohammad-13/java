package javaapplication29;

import java.util.Scanner;

public class JavaApplication29 {


    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("enter a number: ");
        
        int n=input.nextInt();
        
        int marahel=0;
        int max=n;
        int zoj=0;
        int fard=0;
        
        while (n!=1){
            
            System.out.println(n+" ");
            
            if(n%2==0){
            zoj++;
            n=n/2;
        }else{
            fard++;
            n=n*3+1;
        }
        
        if (n>max){
            max=n;
        }
        marahel++;
       }
       
    System.out.print(1);
    fard++;
    
    System.out.println();
    System.out.println("tedad marahel: "+marahel);
    System.out.println("max: "+max);
    System.out.println("zoj: "+zoj);
    System.out.println("fard: "+fard);
        

    }
}