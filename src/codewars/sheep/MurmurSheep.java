package codewars.sheep;

public class MurmurSheep {
    public static String countSheep(int num) {
        StringBuilder murmur = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            murmur.append(i).append(" sheep...");
        }
        return murmur.toString();
    }
}
