package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        int[] unsortedArray = {5, 2, 8, 3, 1};
        int[] expectedArray = {1, 2, 3, 5, 8};
        int[] sortedArray = SelectionSort.selectionSort(unsortedArray);
        Assertions.assertArrayEquals(expectedArray, sortedArray);
    }
}

