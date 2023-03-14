package aufgabe11;

import aufgabe9.Punkt2d;
import aufgabe9.Punkt2dUtility;

public class Dreieck implements GeometrischesObjekt {

    private Punkt2d a;
    private Punkt2d b;
    private Punkt2d c;

    public Dreieck(Punkt2d a, Punkt2d b, Punkt2d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double berechneUmfang() {
        double seiteA = a.distance(b);
        double seiteB = b.distance(c);
        double seiteC = c.distance(a);
        return seiteA + seiteB + seiteC;
    }

    @Override
    public double berechneFlaeche() {
        double seiteA = a.distance(b);
        double seiteB = b.distance(c);
        double seiteC = c.distance(a);
        double s = (seiteA + seiteB + seiteC) / 2;
        return Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC));
    }

    public double berechneHoehe() {
        double seiteB = b.distance(c);
        double flaeche = berechneFlaeche();
        return 2 * flaeche / seiteB;
    }

}
