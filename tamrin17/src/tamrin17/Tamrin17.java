package tamrin17;

import java.util.Scanner;

public class Tamrin17 {

   
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

        System.out.println("Enter name to search:");
        String target = input.nextLine();

        int result = countName(students, target);

        System.out.println("Count: " + result);
    }

    public static int countName(String[] students, String target) {

        int count = 0;

        for (int i = 0; i < students.length; i++) {

            if (students[i].equals(target)) {
                count++;
            }
        }

        return count;
    }
}