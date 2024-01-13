// LABSHEET 11 -A - LINEAR SEARCH 

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7 };
        int target = 9;
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
