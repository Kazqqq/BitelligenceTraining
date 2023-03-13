package codewars.sheep;

public class SheepCounter {
    public static int countSheep(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null) {
            return 0;
        }
        int count = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null && sheep) {
                count++;
            }
        }
        return count;
    }

}

