import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        LinSearch();			
    }

    public static void LinSearch() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 

        System.out.print("Enter the element you want to find: ");
        int x = scanner.nextInt();

        int index = -1; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Index of " + x + " is: " + index);
        } else {
            System.out.println(x + " is not present in the array.");
        }

        scanner.close();
    }
}
