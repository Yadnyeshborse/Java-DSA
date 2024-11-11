package Recurrision.Sort;

public class Selection_Sort {

    // Function to perform Selection Sort using recursion
    static void selectionSort(int arr[], int n, int index) {
        // Base case: if the index has reached the end of the array, return
        if (index == n) {
            return;
        }

        // Assume the current index is the minimum
        int minIndex = index;

        // Find the index of the minimum element in the remaining array
        for (int i = index + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap the found minimum element with the current index
        int temp = arr[minIndex];
        arr[minIndex] = arr[index];
        arr[index] = temp;

        // Recur for the remaining part of the array
        selectionSort(arr, n, index + 1);
    }

    // Helper function to print the array
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int n = arr.length;

        // Print the unsorted array
        System.out.println("Unsorted array:");
        printArray(arr, n);

        // Call recursive selection sort
        selectionSort(arr, n, 0);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr, n);
    }
}

