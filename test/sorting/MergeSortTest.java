package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    public void testSort() {
        MergeSort mergeSort = new MergeSort();

        // Test with an unsorted array
        int[] unsortedArray = {5, 1, 9, 3, 7};
        mergeSort.sort(unsortedArray);
        int[] expectedArray = {1, 3, 5, 7, 9};
        Assertions.assertArrayEquals(expectedArray, unsortedArray);

        // Test with an already sorted array
        int[] sortedArray2 = {1, 2, 3, 4, 5};
        int[] expectedArray2 = mergeSort.sort(sortedArray2);
        Assertions.assertArrayEquals(expectedArray2, sortedArray2);

        // Test with an array containing duplicate values
        int[] unsortedArray3 = {5, 2, 3, 2, 1};
        int[] sortedArray3 = mergeSort.sort(unsortedArray3);
        int[] expectedArray3 = {1, 2, 2, 3, 5};
        Assertions.assertArrayEquals(expectedArray3, sortedArray3);
    }
}

