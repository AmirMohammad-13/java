package tamrin7;

import java.util.Scanner;

public class Tamrin7 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number:");
        int n = input.nextInt();

        chapnozoli(n);
    }

    public static void chapnozoli(int n) {

        if (n < 1) {
            return;
        }

        System.out.println(n);

        chapnozoli(n - 1);
    }
}