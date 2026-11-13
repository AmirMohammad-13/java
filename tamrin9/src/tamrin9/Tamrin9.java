package tamrin9;

import java.util.Scanner;

public class Tamrin9 {

    
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.println("tedad olgoha ra vared konid: ");
        int n = input.nextInt();

        fibonachi(n, 1, 1);
    }

    public static void fibonachi(int n, int a, int b) {

        if (n <= 0) {
            return;
        }

        System.out.print(a + " ");

        fibonachi(n - 1, b, a + b);
    }
}