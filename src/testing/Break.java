package testing;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        for(i = 0; i < 10; i++) {
            if(i == 4) {
                break;
            } else System.out.println(i);
        }
    }
}
