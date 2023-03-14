package aufgabe11;

public abstract class GeometrischesObjekt {
    private double flaeche;
    private double umfang;

    public GeometrischesObjekt() {
    }

    public abstract double berechneUmfang();

    public abstract double berechneFlaeche();

    public double getFlaeche() {
        return flaeche;
    }

    public double getUmfang() {
        return umfang;
    }
}


