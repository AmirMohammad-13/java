package tamrin16;

import java.util.Scanner;

public class Tamrin16 {

    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = input.nextInt();
        input.nextLine();

        String[] students = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            students[i] = input.nextLine();
        }

        printaksNames(students);
    }

    public static void printaksNames(String[] students) {

        for (int i = 0; i < students.length; i++) {

            String reversed = "";

            for (int j = students[i].length() - 1; j >= 0; j--) {
                reversed = reversed + students[i].charAt(j);
            }

            System.out.println(reversed);
        }
    }
}
