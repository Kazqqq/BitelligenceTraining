package kgv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KGVTest {

    @Test
    public void testKGV() {
        int a = 15;
        int b = 9;
        int expectedKGV = 45;
        int actualKGV = KGV.kgv(a, b);
        assertEquals(expectedKGV, actualKGV);
    }
}



