// LABSHEET 12 -B - INSERTION SORT

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            
            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            // Place the key in its correct position
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        insertionSort(array);
        
        System.out.println("\nSorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
