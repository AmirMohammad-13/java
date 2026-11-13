package tamrin14;

import java.util.Scanner;

public class Tamrin14 {

    
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

        printFirstLetters(students);
    }

    public static void printFirstLetters(String[] students) {

        for (int i = 0; i < students.length; i++) {

            if (!students[i].isEmpty()) {
                System.out.println(students[i].charAt(0));
            }
        }
    }
}