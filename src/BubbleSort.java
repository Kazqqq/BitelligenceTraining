public class BubbleSort {

    public static int[] intArray = {3,1,6,4,5,7,9,8,2};

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
    public static void main(String[] args) {
        int[] ausgabe = BubbleSort.bubbleSort();
        for (int w = 0; w < intArray.length; w++) {
            System.out.println(w + 1 + "= " + ausgabe[w]);
        }
    }
}

