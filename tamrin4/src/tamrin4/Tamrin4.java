package tamrin4;

import java.util.Scanner;

public class Tamrin4 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.println("Enter first kalame: ");
        String a = input.nextLine();

        System.out.println("Enter second kalame: ");
        String b = input.nextLine();

        System.out.println("Enter number: ");
        int x = input.nextInt();

        if (x >= 0 && x <= a.length() && x <= b.length()) {

            String movaghat = a.substring(0, x);

            a = b.substring(0, x) + a.substring(x);
            b = movaghat + b.substring(x);

            System.out.println("New first kalame: " + a);
            System.out.println("New second kalame: " + b);
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
    
}
