
package javaapplication23;

import java.util.Scanner;
        
public class JavaApplication23 {

    public static void main(String[] args) {
      
        
        Scanner input = new Scanner(System.in);
     
        System.out.println("adad ra vared konid : ");
        int x = input.nextInt();
           
        if (x<=0)
        {
            System.out.println("adad mosbat vared konid");
        }
        else
        {
        int adad = x;
        int tedadargham=0;
        int jam=0;
        int zarb=1;
        int max=0;
        int min=9;
        int arghamzoj=0;
        int arghamfard=0;
        int makos=0;
        
        while(x>0)
        {
            int y = x % 10;
            tedadargham++;
            jam += y;
            if(y != 0)
            {
            zarb *= y;
            }
            if(y>max)
            {
                max = y;
            }
            if (y<min)
            {
                min = y;
            }
            if(y%2==0)
            {
                arghamzoj++;
            }
            else
            {
                arghamfard++;
            }
            makos = makos*10+y;
            x=x/10;
        }
            System.out.println("adad = "+adad);
            System.out.println("tedadargham = "+tedadargham);
            System.out.println("jam = "+jam);
            System.out.println("zarb = "+zarb);
            System.out.println("max = "+max);
            System.out.println("min = "+min);
            System.out.println("argham zoj = "+arghamzoj);
            System.out.println("argham fard = "+arghamfard);
            System.out.println("makos = "+makos);
            }
        input.close();
        }
        }
           
    

