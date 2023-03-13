package aufgabe11;

public class Kreis implements GeometrischesObjekt {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}
