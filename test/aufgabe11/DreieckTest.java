package aufgabe11;
import aufgabe9.Punkt2d;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DreieckTest {

    @Test
    public void testDreieck() {
        // Erstelle die Eckpunkte des Dreiecks
        Punkt2d a = new Punkt2d(0, 0);
        Punkt2d b = new Punkt2d(3, 0);
        Punkt2d c = new Punkt2d(0, 4);

        // Erstelle ein Dreieck-Objekt
        Dreieck dreieck = new Dreieck(a, b, c);

        // Überprüfe den Umfang
        assertEquals(12, dreieck.berechneUmfang(), 0.001);

        // Überprüfe die Fläche
        assertEquals(6, dreieck.berechneFlaeche(), 0.001);

        // Überprüfe die Höhe
        assertEquals(2.4, dreieck.berechneHoehe(), 0.001);
    }
}



