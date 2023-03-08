package sorting;

public class SelectionSort {
    public static int[] intArray = {3, 1, 6, 4, 5, 7, 9, 8, 2};

    {

        public static int[] selectionSort() {
        int x, y;
        for (int w = intArray.length - 1; w >= 1; w--) {
            x = 0;
            for (int j = 1; j <= w; j++) {
                if (intArray[j] > intArray[x]) {
                    w = j;
                }
            }
            y = intArray[x];
            intArray[x] = intArray[w];
            intArray[w] = y;
        }
        public static void main(String[]) {
        int[] ausgabe = selectionSort();
            for (int j = 0; j < intArray.length; j++) {
                System.out.println(j + 1 + "= " + ausgabe[j]);
            }
        }
    }
    }
}
