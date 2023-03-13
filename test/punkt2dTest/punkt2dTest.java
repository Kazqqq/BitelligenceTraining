package punkt2dTest;

public class punkt2dTest {

    public static void main(String[] args) {
        aufgabe9.Punkt2d punktA = new aufgabe9.Punkt2d(7.0, 4.0);
        aufgabe9.Punkt2d punktB = new aufgabe9.Punkt2d(9.0, 13.0);

        System.out.println("Punkt A: " + punktA);
        System.out.println("Punkt B: " + punktB);

        punktA.addieren(punktB);
        System.out.println("Addiert: " + punktA);
        punktA.subtrahieren(punktB);
        System.out.println("Subtrahiert: " + punktA);
        punktA.dividieren(punktB);
        System.out.println("Dividiert: " + punktA);
        punktA.multiplizieren(punktB);
        System.out.println("Multipliziert: " + punktA);
    }
}



