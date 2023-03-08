package isDivisibleByTwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibilityCheckerTest {

    @Test
    public void testIsDivisibleByTwo() {
        // Test with a number that is divisible by 2
        int evenNumber = 10;
        boolean isDivisible = DivisibilityChecker.isDivisibleByTwo(evenNumber);
        Assertions.assertTrue(isDivisible, evenNumber + " should be divisible by 2.");

        // Test with a number that is not divisible by 2
        int oddNumber = 7;
        isDivisible = DivisibilityChecker.isDivisibleByTwo(oddNumber);
        Assertions.assertFalse(isDivisible, oddNumber + " should not be divisible by 2.");
    }
}

