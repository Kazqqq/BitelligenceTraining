package isDivisibleByTwo;
public class DivisibilityChecker {

    public static boolean isDivisibleByTwo(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 6;
        boolean isDivisible = isDivisibleByTwo(number);
        System.out.println("Is " + number + " divisible by 2? " + isDivisible);
    }
}


