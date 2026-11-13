package tamrin8;

import java.util.Scanner;

public class Tamrin8 {

   
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int adad = input.nextInt();

        System.out.println("Enter tavan:");
        int tavan = input.nextInt();

        System.out.println("Result: " + power(adad, tavan));
    }

    public static int power(int adad, int tavan) {

        if (tavan == 0) {
            return 1;
        }

        return adad * power(adad, tavan - 1);
    }
}
