package aufgabe9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Punkt2dTest {

    @Test
    void addieren() {
        Punkt2d testPoint1 = new Punkt2d(3.0, 4.5);
        Punkt2d testPoint2 = new Punkt2d(3.9, 8.5);
        Punkt2d addTestResult = testPoint1.addieren(testPoint2);

        assertEquals(addTestResult.getX(), 6.9, 0.01);
        assertEquals(addTestResult.getY(), 13,0.01);
    }

    @Test
    void subtrahieren() {
        Punkt2d testPoint3 = new Punkt2d(4.0, 9.5);
        Punkt2d testPoint4 = new Punkt2d(3.9, 8.5);
        Punkt2d subTestResult = testPoint3.subtrahieren(testPoint4);

        assertEquals(subTestResult.getX(), 0.1,0.01);
        assertEquals(subTestResult.getY(), 1,0.01);
    }

    @Test
    void dividieren() {
        Punkt2d testPoint5 = new Punkt2d(3.0, 9);
        Punkt2d testPoint6 = new Punkt2d(3.0, 2);
        Punkt2d divTestResult = testPoint5.dividieren(testPoint6);

        assertEquals(divTestResult.getX(), 1,0.01);
        assertEquals(divTestResult.getY(), 4.5,0.01);
    }

    @Test
    void multiplizieren() {
        Punkt2d testPoint7 = new Punkt2d(3.0, 9);
        Punkt2d testPoint8 = new Punkt2d(3.0, 2);
        Punkt2d multTestResult = testPoint7.multiplizieren(testPoint8);

        assertEquals(multTestResult.getX(), 9,0.01);
        assertEquals(multTestResult.getY(), 18,0.01);
    }

}
