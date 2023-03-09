package kgv;

import java.util.Scanner;

public class KGV {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wie lautet die erste Zahl? ");
        int a = input.nextInt();

        System.out.print("Wie lautet die zweite Zahl? ");
        int b = input.nextInt();

        int kgv = 0;
        int i = a;

        do {
            if (i % b == 0) {
                kgv = i;
                break;
            }
            i += a;
        } while (i <= a * b);

        System.out.println("Das kleinste gemeinsame Vielfache deiner beiden Zahlen beträgt: " +kgv);

        input.close();
    }
}
