package bmi;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static double berechneBmi(int heightInCentimeters, int weightInKilograms) {

        double heightInMeters = heightInCentimeters / 100.0;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        return bmi;
    }



    public static BmiClassEnum classifyBmi(double bmi) {
        if (bmi < 18.5) {
            return BmiClassEnum.UNTERGEWICHTIG;
        } else if (bmi < 25.0) {
            return BmiClassEnum.NORMALGEWICHTIG;
        } else if (bmi < 30.0) {
            return BmiClassEnum.ÜBERGEWICHTIG;
        } else {
            return BmiClassEnum.SCHWER_ÜBERGEWICHTIG;
        }
    }

    enum BmiClassEnum {
        UNTERGEWICHTIG(0, 18.5),
        NORMALGEWICHTIG(18.5, 25),
        ÜBERGEWICHTIG(25, 30),
        SCHWER_ÜBERGEWICHTIG(30, 99);

        double lower;
        double upper;

        BmiClassEnum(double lower, double upper) {
            this.lower = lower;
            this.upper = upper;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie Ihre Größe in cm an: ");
        int height = scanner.nextInt();

        System.out.print("Geben Sie Ihr Gewicht in kg an: ");
        int weight = scanner.nextInt();

        double bmi = berechneBmi(height, weight);
        BmiClassEnum bmiClassEnum = classifyBmi(bmi);

        System.out.printf("Ihr BMI beträgt %.2f, dies gilt als %s\n", bmi, bmiClassEnum);
    }
}
