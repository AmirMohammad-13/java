package tamrin18;

import java.util.Scanner;
public class Tamrin18 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = input.nextInt();
        input.nextLine();

        String[] students = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter full name:");
            students[i] = input.nextLine();
        }

        printFirstNames(students);
    }

    public static void printFirstNames(String[] students) {

        for (int i = 0; i < students.length; i++) {

            String[] parts = students[i].trim().split("\\s+");

            if (parts.length > 0 && !parts[0].isEmpty()) {
                System.out.println(parts[0]);
            }
        }
    }
}