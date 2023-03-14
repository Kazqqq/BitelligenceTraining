package aufgabe11;

import aufgabe9.Punkt2d;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RechteckTest {

    @Test
    void testBerechneUmfang() {
        Punkt2d a = new Punkt2d(0, 0);
        Punkt2d b = new Punkt2d(0, 2);
        Punkt2d c = new Punkt2d(3, 2);
        Punkt2d d = new Punkt2d(3, 0);

        Rechteck rechteck = new Rechteck(a, b, c, d);

        assertEquals(10, rechteck.berechneUmfang(), 0.001);
    }

    @Test
    void testBerechneFlaeche() {
        Punkt2d a = new Punkt2d(0, 0);
        Punkt2d b = new Punkt2d(0, 2);
        Punkt2d c = new Punkt2d(3, 2);
        Punkt2d d = new Punkt2d(3, 0);

        Rechteck rechteck = new Rechteck(a, b, c, d);

        assertEquals(6, rechteck.berechneFlaeche(), 0.001);
    }

}
