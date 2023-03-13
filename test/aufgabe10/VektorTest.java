package aufgabe10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VektorTest {

    @Test
    void addieren() {
        Vektor v1 = new Vektor(1, 2, 3);
        Vektor v2 = new Vektor(4, 5, 6);
        Vektor expected = new Vektor(5, 7, 9);
        Vektor result = v1.addieren(v2);
        assertEquals(expected.getX(), result.getX(), 0.001);
        assertEquals(expected.getY(), result.getY(), 0.001);
    }

    @Test
    public void subtrahieren() {
        Vektor v1 = new Vektor(4, 5, 6);
        Vektor v2 = new Vektor(1, 2, 3);
        Vektor expected = new Vektor(3, 3, 3);
        Vektor result = v1.subtrahieren(v2);
        assertEquals(expected.getX(), result.getX(), 0.001);
        assertEquals(expected.getY(), result.getY(), 0.001);
    }

    @Test
    void dividieren() {
        Vektor v = new Vektor(3, 6, 9);
        double d = 3;
        Vektor expected = new Vektor(1, 2, 3);
        Vektor result = v.dividieren(d);
        assertEquals(expected.getX(), result.getX(), 0.001);
        assertEquals(expected.getY(), result.getY(), 0.001);
    }

    @Test
    void skalarMultiply() {
        Vektor v = new Vektor(2, 3, 4);
        double d = 2;
        Vektor expected = new Vektor(4, 6, 8);
        Vektor result = v.skalarMultiply(d);
        assertEquals(expected.getX(), result.getX(), 0.001);
        assertEquals(expected.getY(), result.getY(), 0.001);
    }

    @Test
    void skalarProdukt() {
        Vektor v1 = new Vektor(2, 3, 4);
        Vektor v2 = new Vektor(5, 6, 7);
        Vektor expected = new Vektor(10, 18, 28);
        Vektor result = v1.skalarProdukt(v2);
        assertEquals(expected.getX(), result.getX(), 0.001);
        assertEquals(expected.getY(), result.getY(), 0.001);
        assertEquals(expected.getZ(), result.getZ(), 0.001);
    }

    @Test
    void kreuzProdukt() {
        Vektor v1 = new Vektor(1, 2, 3);
        Vektor v2 = new Vektor(4, 5, 6);
        Vektor expected = new Vektor(-3, 6, -3);
        Vektor result = v1.kreuzProdukt(v2);
        assertEquals(expected.getX(), result.getX(), 0.001);
        assertEquals(expected.getY(), result.getY(), 0.001);
    }
}
