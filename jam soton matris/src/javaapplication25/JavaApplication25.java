package javaapplication25;

import java.util.Scanner;

public class JavaApplication25 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[][]n=new int[2][3];
        for (int j=0;j<3;j++)
        {
            for (int i=0;i<2;i++)
        {
         System.out.println("enter number: ");
         n[i][j] = input.nextInt();
         sum = sum+n[i][j];
        }
            System.out.println(sum);
            sum=0;
            }
        
    }
    
}
