package aufgabe11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KreisTest {

    @Test
    public void testBerechneUmfang() {
        Kreis kreis = new KonkreterKreis(3.0);
        double expectedUmfang = 2 * Math.PI * 3.0;
        double actualUmfang = kreis.berechneUmfang();
        assertEquals(expectedUmfang, actualUmfang, 0.0001);
    }

    @Test
    public void testBerechneFlaeche() {
        Kreis kreis = new KonkreterKreis(3.0);
        double expectedFlaeche = Math.PI * 3.0 * 3.0;
        double actualFlaeche = kreis.berechneFlaeche();
        assertEquals(expectedFlaeche, actualFlaeche, 0.0001);
    }
}

class KonkreterKreis extends Kreis {
    public KonkreterKreis(double radius) {
        this.radius = radius;
        this.pi = Math.PI;
    }

    @Override
    public double berechneHoehe() {
        return 0;
    }
}

