package aufgabe9;

public class Punkt2d {
    protected double x, y;

    public Punkt2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public Punkt2d setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Punkt2d setY(double y) {
        this.y = y;
        return this;
    }

    // Addieren
    public Punkt2d addieren(Punkt2d punkt2d) {
        this.x += punkt2d.getX();
        this.y += punkt2d.getY();

        return this;
    }

    // Subtrahieren
    public Punkt2d subtrahieren(Punkt2d punkt2d) {
        this.x -= punkt2d.getX();
        this.y -= punkt2d.getY();
        return this;
    }

    // Dividieren
    public Punkt2d dividieren(Punkt2d punkt2d) {
        this.x /= punkt2d.getX();
        this.y /= punkt2d.getY();
        return this;
    }

    // Multiplizieren
    public Punkt2d multiplizieren(Punkt2d punkt2d) {
        this.x *= punkt2d.getX();
        this.y *= punkt2d.getY();
        return this;
    }

    // toString
    public String toString() {
        return "Unser Punkt liegt auf den Koordinaten: " + x + ("x, ") + y + " y.";
    }

}

