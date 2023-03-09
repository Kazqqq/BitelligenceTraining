package sorting;

public class BubbleSort {

    public static int[] intArray = {3,1,6,4,5,7,9,8,2};

    public static int[] bubbleSort() {
        int q;
        for (int w = 0; w < intArray.length - 1; w++) {
            if (intArray[w] > intArray[w + 1]) {
                q = intArray[w];
                intArray[w] = intArray[w + 1];
                intArray[w + 1] = q;
            }
            bubbleSort();
        }
        return intArray;
    }
    public static void main(String[] args) {
        int[] liste = BubbleSort.bubbleSort();
        for (int w = 0; w < intArray.length; w++) {
            System.out.println(w + 1 + "= " + liste[w]);
        }
    }
}

