package bmi;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    /**
     * Method to calculate the Body Mass Index.
     * Formula: weight (kg) / (height (meters) * height (meters))
     *
     * @param heightInCentimeters - height in centimeters
     * @param weightInKilograms   - weight in kilograms
     * @return Body Mass Index
     */
    public static double calculateBmi(int heightInCentimeters, int weightInKilograms) {
        // convert height from centimeters to meters
        double heightInMeters = heightInCentimeters / 100.0;

        // calculate BMI using formula
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        return bmi;
    }

    /**
     * Method to classify BMI based on predefined ranges.
     *
     * @param bmi - Body Mass Index
     * @return BMI classification as a String
     */
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

    // Example usage
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter height and weight
        System.out.print("Geben Sie Ihre Größe in cm an: ");
        int height = scanner.nextInt();

        System.out.print("Geben Sie Ihr Gewicht in kg an: ");
        int weight = scanner.nextInt();

        double bmi = calculateBmi(height, weight);
        String bmiClass = classifyBmi(bmi);

        // output BMI result and classification
        System.out.printf("Ihr BMI beträgt %.2f, dies gilt als %s\n", bmi, bmiClass);
    }
}
