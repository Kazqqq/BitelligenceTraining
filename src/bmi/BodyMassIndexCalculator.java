package bmi;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static double calculateBmi(int heightInCentimeters, int weightInKilograms) {

        double heightInMeters = heightInCentimeters / 100.0;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        return bmi;
    }

//    public enum BmiClassification {
//        UNTERGEWICHTIG("Untergewichtig"),
//        NORMALGEWICHT,
//        UEBERGEWICHT,
//        SCHWERES_UEBERGEWICHT;
//
//        private final String gewichtKlasse;
//
//        BmiClassification(String gewichtKlasse) {
//            this.
//        }
//    }

    public static String classifyBmi(double bmi) {
        if (bmi < 18.5) {
            return "Untergewichtig";
        } else if (bmi < 25.0) {
            return "Normalgewichtig";
        } else if (bmi < 30.0) {
            return "Übergewichtig";
        } else {
            return "Schweres Übergewicht";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie Ihre Größe in cm an: ");
        int height = scanner.nextInt();

        System.out.print("Geben Sie Ihr Gewicht in kg an: ");
        int weight = scanner.nextInt();

        double bmi = calculateBmi(height, weight);
        String bmiClass = classifyBmi(bmi);

        System.out.printf("Ihr BMI beträgt %.2f, dies gilt als %s\n", bmi, bmiClass);
    }
}
