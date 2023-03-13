package aufgabe9;

public class Punkt2dUtility {

    public static Punkt2d addPoints(Punkt2d p1, Punkt2d p2) {
        double x = p1.x + p2.x;
        double y = p1.y + p2.y;
        return new Punkt2d(x, y);
    }
}
