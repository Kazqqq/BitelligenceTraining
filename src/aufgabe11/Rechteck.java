package aufgabe11;

public abstract class Rechteck implements GeometrischesObjekt {
    private double laenge;
    private double breite;

    @Override
    public double berechneUmfang() {
        return 2 * (laenge + breite);
    }

    @Override
    public double berechneFlaeche() {
        return laenge * breite;
    }
}
