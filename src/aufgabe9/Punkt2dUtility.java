package aufgabe9;

public class Punkt2dUtility {

    public static Punkt2d addPoints(Punkt2d p1, Punkt2d p2) {
        Punkt2d p3 = new Punkt2d();
        p3.setX(p1.getX() + p2.getX());
        p3.setY(p1.getY() + p2.getY());
        return p3;
    }
}
