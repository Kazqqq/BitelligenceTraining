package sorting;

import java.util.Arrays;

public class MergeSort {

    // die sort methode teilt rekursiv den input array in der hälfte und merged sie
    public int[] sort(final int[] numbers) {

        // Falls die Länge des arrays größer als 1 ist, teilt er ihn in der Hälfte und sortiert jede Hälfte für sich
        if (numbers.length > 1) {
            int mid = numbers.length / 2;
            int[] left = Arrays.copyOfRange(numbers, 0, mid);
            int[] right = Arrays.copyOfRange(numbers, mid, numbers.length);
            sort(left);
            sort(right);
            merge(numbers, left, right);

            // Gibt den Array nach dem Merge aus für ein besseres Verständnis für mich :)
            System.out.print("After merge: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }

        // Returned den sortierten Array
        return numbers;
    }

    // Die Merge Methode kombiniert zwei sortierte Arrays
    private void merge(int[] numbers, int[] left, int[] right) {

        // Initialisierung von countern für den linken, rechten und kombinierten bzw. merged Array
        int i = 0, j = 0, k = 0;

        // Iteriert über beide Arrays und added das kleinste Element zum merged Array
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

        // Added die verbleibenden Elemente vom linken Array in den merged Array
        while (i < left.length) {
            numbers[k] = left[i];
            i++;
            k++;
        }

        // Added die übrigen Elemente vom rechten Array zum merged Array
        while (j < right.length) {
            numbers[k] = right[j];
            j++;
            k++;
        }
    }
}

