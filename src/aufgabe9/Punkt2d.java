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
    public void addieren(Punkt2d punkt2d) {
        this.x += punkt2d.getX();
        this.y += punkt2d.getY();
    }

    // Subtrahieren
    public void subtrahieren(Punkt2d punkt2d) {
        this.x -= punkt2d.getX();
        this.y -= punkt2d.getY();
    }

    // Dividieren
    public void dividieren(Punkt2d punkt2d) {
        this.x /= punkt2d.getX();
        this.y /= punkt2d.getY();
    }

    // Multiplizieren
    public void multiplizieren(Punkt2d punkt2d) {
        this.x *= punkt2d.getX();
        this.y *= punkt2d.getY();
    }

    // toString
    public String toString() {
        return "Unser Punkt liegt auf den Koordinaten: " + x + ("x, ") + y + " y.";
    }

}

