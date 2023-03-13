package aufgabe11;

public class Dreieck implements GeometrischesObjekt {
    private double laenge;
    private double breite;

    private double hoehe;

    @Override
    public double berechneUmfang() {
        return 0;
    }

    @Override
    public double berechneFlaeche() {
        return 0.5 *(laenge * hoehe);
    }

    @Override
    public double berechneHoehe() {
        return 0;
    }
}
