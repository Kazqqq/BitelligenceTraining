package aufgabe11;

public class Dreieck implements GeometrischesObjekt {
    private double seiteA;
    private double seiteB;
    private double seiteC;

    public Dreieck(double seiteA, double seiteB, double seiteC) {
        this.seiteA = seiteA;
        this.seiteB = seiteB;
        this.seiteC = seiteC;
    }

    public double getSeiteA() {
        return seiteA;
    }

    public double getSeiteB() {
        return seiteB;
    }

    public double getSeiteC() {
        return seiteC;
    }

    @Override
    public double berechneUmfang() {
        return seiteA + seiteB + seiteC;
    }

    @Override
    public double berechneFlaeche() {
        double s = (seiteA + seiteB + seiteC) / 2;
        return Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC));
    }
    public double berechneHoehe() {
        double s = (seiteA + seiteB + seiteC) / 2;
        return (2 * Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC))) / seiteB;
    }

}


