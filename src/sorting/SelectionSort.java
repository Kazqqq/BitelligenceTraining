package sorting;

public class SelectionSort {
    public static int[] selectionSort(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int abc = i;
            for (int o = i + 1; o < numbers.length; o++) {
                if (numbers[o] < numbers[abc])
                    abc = o;

                int smallNumber = numbers[abc];
                numbers[abc] = numbers[i];
                numbers[i] = smallNumber;
            }

        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1};
        int[] sortedNumbers = selectionSort(numbers);
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " ");
        }
    }
}
