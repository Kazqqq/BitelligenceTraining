package testing;

public class Continue {
    public static void main(String[] args) {
        int i = 0;
        for(i = 0; i < 10; i++) {
            if(i == 3) {
                continue;
            } else System.out.println(i);
        }
    }
}
