package bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BodyMassIndexCalculatorTest {

    @Test
    public void testCalculateBmi() {
        // Test with values for a BMI of 22.22
        double expectedBmi = 22.22;
        double actualBmi = BodyMassIndexCalculator.berechneBmi(170, 65);
        assertEquals(expectedBmi, actualBmi, 0.01);

        // Test with values for a BMI of 29.58
        expectedBmi = 29.58;
        actualBmi = BodyMassIndexCalculator.berechneBmi(170, 90);
        assertEquals(expectedBmi, actualBmi, 0.01);

        // Test with values for a BMI of 18.6
        expectedBmi = 18.6;
        actualBmi = BodyMassIndexCalculator.berechneBmi(160, 45);
        assertEquals(expectedBmi, actualBmi, 0.01);
    }

    @Test
    public void testClassifyBmi() {
        // Test classification for BMI of 22.22
        String expectedClassification = "Normalgewichtig";
        String actualClassification = BodyMassIndexCalculator.classifyBmi(22.22);
        assertEquals(expectedClassification, actualClassification);

        // Test classification for BMI of 29.58
        expectedClassification = "Übergewichtig";
        actualClassification = BodyMassIndexCalculator.classifyBmi(29.58);
        assertEquals(expectedClassification, actualClassification);

        // Test classification for BMI of 18.6
        expectedClassification = "Untergewichtig";
        actualClassification = BodyMassIndexCalculator.classifyBmi(18.6);
        assertEquals(expectedClassification, actualClassification);
    }
}

