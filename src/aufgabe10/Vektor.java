package aufgabe10;

public class Vektor {
    private double x, y, z;

    public double getX() {
        return x;
    }

    public Vektor setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Vektor setY(double y) {
        this.y = y;
        return this;
    }

    public double getZ() {
        return z;
    }

    public Vektor setZ(double z) {
        this.z = z;
        return this;
    }

    public Vektor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vektor() {

    }

    public Vektor addieren(Vektor vektor) {
        return new Vektor(x + vektor.x, y + vektor.y, z + vektor.z);
    }

    public Vektor subtrahieren(Vektor vektor) {
        return new Vektor(x - vektor.x, y - vektor.y, z - vektor.z);
    }

    public Vektor dividieren(double d) {
        return new Vektor(x/d,y/d,z/d);
    }

    public Vektor skalarMultiply(double s) {
        return new Vektor(s * x, s * y, s * z);
    }

    public Vektor skalarProdukt(Vektor vektor) {
        return new Vektor(x * vektor.x, y * vektor.y, z * vektor.z);
    }

    public Vektor kreuzProdukt(Vektor vektor) {
        return new Vektor(y * vektor.z - z * vektor.y, z * vektor.x - x * vektor.z, x * vektor.y - y * vektor.x);
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
