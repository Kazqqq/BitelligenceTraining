package aufgabe11;

import static org.junit.Assert.*;
import org.junit.Test;

public class KreisTest {

    @Test
    public void testBerechneUmfang() {
        Kreis k = new Kreis(5);
        double expected = 2 * Math.PI * 5;
        double actual = k.berechneUmfang();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testBerechneFlaeche() {
        Kreis k = new Kreis(5);
        double expected = Math.PI * 5 * 5;
        double actual = k.berechneFlaeche();
        assertEquals(expected, actual, 0.001);
    }
}
