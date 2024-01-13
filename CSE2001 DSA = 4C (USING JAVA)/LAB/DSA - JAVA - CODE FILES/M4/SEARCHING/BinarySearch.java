// LABSHEET 11 -B - BINARY SEARCH 

public class BinarySearch {
    // Function to perform binary search
    static void binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if the key is present at the middle
            if (array[mid] == key) {
                System.out.println("Element " + key + " found at index " + mid);
                return;
            }
            
            // If the key is greater, ignore the low half
            if (array[mid] < key) {
                low = mid + 1;
            } else { // If the key is smaller, ignore the high half
                high = mid - 1;
            }
        }
        
        System.out.println("Element " + key + " not found in the array");
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;

        // Perform binary search
        binarySearch(array, key);
    }
}
