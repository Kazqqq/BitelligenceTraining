package sorting;

import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] numbers) {
        if (numbers.length > 1) {
            int mid = numbers.length / 2;
            int[] left = Arrays.copyOfRange(numbers, 0, mid);
            int[] right = Arrays.copyOfRange(numbers, mid, numbers.length);
            sort(left);
            sort(right);
            merge(numbers, left, right);
            System.out.print("After merge: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
        return numbers;
    }

    private void merge(int[] numbers, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                numbers[k] = left[i];
                i++;
            } else {
                numbers[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            numbers[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            numbers[k] = right[j];
            j++;
            k++;
        }
    }
}

