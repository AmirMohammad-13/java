package tamrin13;

import java.util.Scanner;


public class Tamrin13 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number:");
            numbers[i] = input.nextInt();
        }

        int[] result = removeDuplicates(numbers);

        System.out.println("Array without tekrar: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {

        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean exists = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                temp[count] = arr[i];
                count++;
            }
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}