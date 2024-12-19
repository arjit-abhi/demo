public class MergeSort {

    // Merge two sorted subarrays array[left..mid] and array[mid+1..right]
    public static void merge(int[] array, int left, int mid, int right) {
        // Find the sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to hold the values
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy the data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        // Initial indexes of the temporary arrays
        int i = 0, j = 0;

        // Initial index of the merged array
        int k = left;

        // Merge the two subarrays back into the original array
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[], if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Sorts the array[left..right] using merge sort
    public static void merge_sort_left_to_right(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point to divide the array into two halves
            int mid = left + (right - left) / 2;

            // Recursively sort the two halves
            merge_sort_left_to_right(array, left, mid);
            merge_sort_left_to_right(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Utility function to print an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main function to test the merge sort algorithm
    public static void main(String[] args) {
        // Example array to be sorted
        int[] array = { 38, 27, 43, 24, 9, 82, 10 };

        // Display the original array
        System.out.println("Original array:");
        printArray(array);

        // Call mergeSort on the array
        merge_sort_left_to_right(array, 0, array.length - 1);

        // Display the sorted array
        System.out.println("Sorted array:");
        printArray(array);
    }
}

