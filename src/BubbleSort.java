public class BubbleSort {

    public static int[] intArray = {88, 99, 564, 331, 3, 1, 4, 3, 2, 1, 2, 33, 1, 88, 77, 66, 54, 32, 123, 421};

    public static int[] bubbleSort() {
        int q;
        int l = intArray.length;
        for (int w = 0; w < l - 1; w++) {
            if (intArray[w] < intArray[w + 1]) {
                continue;
            }
            q = intArray[w];
            intArray[w] = intArray[w + 1];
            intArray[w + 1] = q;
            bubbleSort();
        }
        return intArray;
    }
}

