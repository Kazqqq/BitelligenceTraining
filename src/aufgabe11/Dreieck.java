package aufgabe11;

import aufgabe9.Punkt2d;

public class Dreieck extends GeometrischesObjekt {

    private Punkt2d a;
    private Punkt2d b;
    private Punkt2d c;

    public Dreieck(Punkt2d a, Punkt2d b, Punkt2d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    // Formel für Berechnung Umfang
    @Override
    public double berechneUmfang() {
        double seiteA = a.distance(b);
        double seiteB = b.distance(c);
        double seiteC = c.distance(a);
        return seiteA + seiteB + seiteC;
    }

    // Formel für Berechnung Fläche
    @Override
    public double berechneFlaeche() {
        double seiteA = a.distance(b);
        double seiteB = b.distance(c);
        double seiteC = c.distance(a);
        double s = (seiteA + seiteB + seiteC) / 2;
        return Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC));
    }

    // Formel für Berechnung Höhe
    public double berechneHoehe() {
        double seiteB = b.distance(c);
        double flaeche = berechneFlaeche();
        return 2 * flaeche / seiteB;
    }

}
