// LABSHEET 12 - A - SELECTION SORT

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        selectionSort(array);

        System.out.println("\nSorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
