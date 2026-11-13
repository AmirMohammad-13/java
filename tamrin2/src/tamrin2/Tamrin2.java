package tamrin2;

import java.util.Scanner;

public class Tamrin2 {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      
        System.out.println("enter a kalame: ");
        String a=input.nextLine();
        
        System.out.println("enter a number: ");
        int x=input.nextInt();
        
        String khoroji="";
        
        if (x<=a.length()&& x>=0){
            khoroji=a.substring(0,x);
        }
        System.out.println("khoroji: "+khoroji);
    }
    
}
