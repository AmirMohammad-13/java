package tamrin5;

import java.util.Scanner;

public class Tamrin5 {

 
    public static void main(String[] args) {
      

        Scanner input = new Scanner(System.in);

        System.out.println("Enter shoaa: ");
        int r = input.nextInt();

        System.out.println("masahate dayere: " + area(r));

        System.out.println("Enter tole mostatil: ");
        int a = input.nextInt();

        System.out.println("Enter arze mostatil: ");
        int b = input.nextInt();

        System.out.println("Rectangle area: " + area(a, b));

        System.out.println("Enter ghaede: ");
        double base = input.nextDouble();

        System.out.println("Enter ertefa:");
        double height = input.nextDouble();

        System.out.println("Triangle area: " + area(base, height));
    }

    public static double area(int r) {
        return Math.PI * r * r;
    }

    public static int area(int a, int b) {
        return a * b;
    }

    public static double area(double base, double height) {
        return (base * height) / 2;
    }

    }
    
