package bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexCalculatorTest {

    @Test
    void testCalculateBmi() {
        // Test case 1: Normal weight BMI
        double bmi = BodyMassIndexCalculator.berechneBmi(170, 70);
        assertEquals(24.22, bmi, 0.01); // expected BMI is 24.22 with a tolerance of 0.01

        // Test case 2: Underweight BMI
        bmi = BodyMassIndexCalculator.berechneBmi(165, 50);
        assertEquals(18.36, bmi, 0.01); // expected BMI is 18.36 with a tolerance of 0.01

        // Test case 3: Overweight BMI
        bmi = BodyMassIndexCalculator.berechneBmi(180, 90);
        assertEquals(27.78, bmi, 0.01); // expected BMI is 27.78 with a tolerance of 0.01

        // Test case 4: Obese BMI
        bmi = BodyMassIndexCalculator.berechneBmi(160, 90);
        assertEquals(35.16, bmi, 0.01); // expected BMI is 35.16 with a tolerance of 0.01
    }

    @Test
    void testClassifyBmi() {
        // Test case 1: Normal weight classification
        BodyMassIndexCalculator.BmiClassEnum bmiClass = BodyMassIndexCalculator.classifyBmi(24.22);
        assertEquals(BodyMassIndexCalculator.BmiClassEnum.NORMALGEWICHTIG, bmiClass);

        // Test case 2: Underweight classification
        bmiClass = BodyMassIndexCalculator.classifyBmi(18.36);
        assertEquals(BodyMassIndexCalculator.BmiClassEnum.UNTERGEWICHTIG, bmiClass);

        // Test case 3: Overweight classification
        bmiClass = BodyMassIndexCalculator.classifyBmi(27.78);
        assertEquals(BodyMassIndexCalculator.BmiClassEnum.ÜBERGEWICHTIG, bmiClass);

        // Test case 4: Obese classification
        bmiClass = BodyMassIndexCalculator.classifyBmi(35.16);
        assertEquals(BodyMassIndexCalculator.BmiClassEnum.SCHWER_ÜBERGEWICHTIG, bmiClass);
    }
}
