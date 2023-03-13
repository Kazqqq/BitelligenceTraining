package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        Random random = new Random();
        int zufallsZahl = random.nextInt(100) + 1;
        System.out.println("Willkommen beim Zahlen raten, bereit zu spielen? Dann trage deine Zahl ein: ");
        int geraten = eingabe.nextInt();

        if (geraten == zufallsZahl) {
            System.out.println("Wow, dein Guess war korrekt - du hast gewonnen!");
        } else if (geraten > zufallsZahl) {
            System.out.println("Haha, leider daneben, deine Zahl ist größer");
        } else {
            System.out.println("Garnicht mal so schlecht für einen Verlierer, deine Zahl war kleiner als die Glückszahl");
        }
        System.out.println("Die Glückszahl war: " + zufallsZahl);
    }

}
