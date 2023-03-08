package sorting;

public class InsertionSort {

    public int[] sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
            // Sysout für besseres Verständins von der Art und Weise wie der Insertion Sort funktioniert
            System.out.print("Iteration " + i + ": ");
            for (int k = 0; k < numbers.length; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.println();
        }
        return numbers;
    }
}


