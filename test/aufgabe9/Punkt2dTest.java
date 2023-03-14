package aufgabe9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Punkt2dTest {

    @Test
    void testAdd() {
        Punkt2d a = new Punkt2d(2.0, 3.0);
        Punkt2d b = new Punkt2d(4.0, 5.0);
        a.add(b);
        assertEquals(a.getX(), 6.0, 0.01);
        assertEquals(a.getY(), 8.0, 0.01);
    }

    @Test
    void testSubtract() {
        Punkt2d a = new Punkt2d(2.0, 3.0);
        Punkt2d b = new Punkt2d(4.0, 5.0);
        a.subtract(b);
        assertEquals(a.getX(), -2.0, 0.01);
        assertEquals(a.getY(), -2.0, 0.01);
    }

    @Test
    void testMultiply() {
        Punkt2d a = new Punkt2d(2.0, 3.0);
        a.multiply(2.0);
        assertEquals(a.getX(), 4.0, 0.01);
        assertEquals(a.getY(), 6.0, 0.01);
    }

    @Test
    void testDivide() {
        Punkt2d a = new Punkt2d(2.0, 3.0);
        a.divide(2.0);
        assertEquals(a.getX(), 1.0, 0.01);
        assertEquals(a.getY(), 1.5, 0.01);
    }

    @Test
    void testDistance() {
        Punkt2d a = new Punkt2d(1.0, 1.0);
        Punkt2d b = new Punkt2d(4.0, 5.0);
        double distance = a.distance(b);
        assertEquals(distance, 5.0, 0.01);
    }
}
