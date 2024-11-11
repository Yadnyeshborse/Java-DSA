package Recurrision.Sort;

public class BubbleSort {

    // Function to perform Bubble Sort using recursion
    static void bubbleSort(int arr[], int n) {
        // Base case: if the array size is 1, return
        if (n == 1) {
            return;
        }

        // Perform one pass of Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            // Swap if elements are in the wrong order
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i + 1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Largest element is fixed, recur for remaining array
        bubbleSort(arr, n - 1);
    }

    // Helper function to print the array
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Print the unsorted array
        System.out.println("Unsorted array:");
        printArray(arr, n);

        // Call recursive bubble sort
        bubbleSort(arr, n);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr, n);
    }
}

