package javaapplication27;

import java.util.Scanner;

public class JavaApplication27 {

   
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mojodi = 10000000;
        int entekhab;
        int mablagh;

        while (true) {

            System.out.println("1. Mojodi");
            System.out.println("2. Variz");
            System.out.println("3. Bardasht");
            System.out.println("4. Khoroj");
            System.out.println("Entekhab konid:");

            entekhab = input.nextInt();

            switch (entekhab) {

                case 1:
                    System.out.println("Mojodi: " + mojodi);
                    break;

                case 2:
                    System.out.println("Mablagh variz:");
                    mablagh = input.nextInt();

                    if (mablagh > 0) {
                        mojodi = mojodi + mablagh;
                        System.out.println("Mojodi jadid: " + mojodi);
                    } else {
                        System.out.println("Mablagh bayad mosbat bashad");
                    }
                    break;

                case 3:
                    System.out.println("Mablagh bardasht:");
                    mablagh = input.nextInt();

                    if (mablagh <= 0) {
                        System.out.println("Mablagh bayad mosbat bashad");
                    } else if (mablagh % 50000 != 0) {
                        System.out.println("Mablagh bayad zarbi az 50000 bashad");
                    } else if (mablagh > mojodi) {
                        System.out.println("Mojodi kafi nist");
                    } else {
                        mojodi = mojodi - mablagh;
                        System.out.println("Mojodi jadid: " + mojodi);
                    }
                    break;

                case 4:
                    System.out.println("Khoroj az barname");
                    return;

                default:
                    System.out.println("Entekhab namotabar ast");
            }
        }
    }
}
