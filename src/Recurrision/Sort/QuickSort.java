package Recurrision.Sort;

import java.util.Arrays;

public class QuickSort {

    // Function to perform Quick Sort using recursion
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);  // Sort the elements on the left of pivot
            quickSort(arr, pi + 1, high); // Sort the elements on the right of pivot
        }
    }

    // Function to partition the array based on pivot
    static int partition(int[] arr, int low, int high) {
        // Pivot element (choosing the last element as pivot)
        int pivot = arr[high];

        int i = low - 1;  // Pointer for the greater element

        // Traverse through all elements and compare with the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap elements at i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return the partition index
    }

    // Helper function to print the array
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;

        System.out.println("Unsorted array:");
        printArray(arr);

        // Call recursive quick sort on the entire array
        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

