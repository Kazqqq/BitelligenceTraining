package aufgabe11;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DreieckTest {

    @Test
    public void testDreieck() {
        Dreieck dreieck = new Dreieck(3, 4, 5);
        assertEquals(12, dreieck.berechneUmfang(), 0.001);
        assertEquals(6, dreieck.berechneFlaeche(), 0.001);
        assertEquals(4, dreieck.berechneHoehe(), 0.001);
    }
}



