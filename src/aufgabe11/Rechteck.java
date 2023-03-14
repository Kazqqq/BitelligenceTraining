package aufgabe11;

import aufgabe9.Punkt2d;

public class Rechteck implements GeometrischesObjekt {
    private Punkt2d a;
    private Punkt2d b;
    private Punkt2d c;

    public Rechteck(Punkt2d a, Punkt2d b, Punkt2d c, Punkt2d d) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSeiteA() {
        return a.distance(b);
    }

    public double getSeiteB() {
        return b.distance(c);
    }


    // Formeln
    @Override
    public double berechneUmfang() {
        return 2 * (getSeiteA() + getSeiteB());
    }

    @Override
    public double berechneFlaeche() {
        return getSeiteA() * getSeiteB();
    }
}
