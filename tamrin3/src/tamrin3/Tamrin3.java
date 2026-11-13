package tamrin3;

import java.util.Scanner;

public class Tamrin3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a kalame: ");
        String a=input.nextLine();
        
        System.out.println("enter x: ");
        int x=input.nextInt();
        
        System.out.println("enter y: ");
        int y=input.nextInt();
        
        String kalame="";
        
        if (x>=0 && y>=0 && x<=a.length() && y<=a.length() && x<=y)
            kalame=a.substring(x,y);
    
       System.out.print("kalame: "+kalame);
    }
}
    

