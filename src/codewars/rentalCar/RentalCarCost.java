package codewars.rentalCar;

public class RentalCarCost {
    public static int rentalCarCost(int d) {
        int total = d * 40;
        if (d < 3) {
            total -= 0;
        } else if (d < 7) {
            total -= 20;
        } else {
            total -= 50;
        }
        return total;
    }
}

