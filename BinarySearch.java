public class BinarySearch {

    // Binary Search method
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // to avoid overflow

            // Check if key is at mid
            if (array[mid] == key) {
                return mid;
            }

            // If key is greater, ignore the left half
            if (array[mid] < key) {
                low = mid + 1;
            }

            // If key is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // Return -1 if key is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // Sorted array
        int key = 18;  // Element to search for

        // Apply binary search
        int result = binarySearch(array, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}




