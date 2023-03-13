package aufgabe11;

public abstract class Kreis implements GeometrischesObjekt {

    double radius;
    double pi;
    @Override
    public double berechneUmfang() {
        return 0;
    }

    @Override
    public double berechneFlaeche() {
        return pi * radius;
    }
}
