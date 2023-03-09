package kgv;

import java.util.Scanner;

public class KGV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Gib die erste Zahl ein: ");
        int n1 = input.nextInt();

        System.out.print("Gib die zweite Zahl ein: ");
        int n2 = input.nextInt();

        int ggt = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i) {
            // Überprüft ob i ein Faktor von n1 UND n2 ist
            if(n1 % i == 0 && n2 % i == 0)
                ggt = i;
        }

        int kgv = (n1 * n2) / ggt;
        System.out.printf("Das kleinste gemeinsame Vielfache von %d und %d ist %d.", n1, n2, kgv);

        input.close();
    }
}

