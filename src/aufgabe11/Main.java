package aufgabe11;


import aufgabe9.Punkt2d;

public class Main {

    private static Punkt2d a = new Punkt2d(1,2);
    private static Punkt2d b = new Punkt2d(6,2);
    private static Punkt2d c = new Punkt2d(6,4);
    private static Punkt2d d = new Punkt2d(4,2);

    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(a, b, c, d);
        System.out.println("Seite A: " + rechteck.getSeiteA());
        System.out.println("Seite B: " + rechteck.getSeiteB());
        System.out.println("Umfang: " + rechteck.berechneUmfang());
        System.out.println("Fläche: " + rechteck.berechneFlaeche());

    }
}
