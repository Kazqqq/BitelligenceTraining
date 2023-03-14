package aufgabe11;

public class Kreis implements GeometrischesObjekt {
    private final double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    // Formel für Berechnung Umfang
    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }


    // Formel für Berechnung Fläche
    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}
