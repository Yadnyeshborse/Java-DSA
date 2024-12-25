package Recurrision.Sort;

import java.util.Arrays;

public class MergeSortNormalWay {
    public static void main(String[] args) {
        // Initialize the array to be sorted
        int arr[] = {5, 4, 3, 2, 1};

        // Call merge sort and store the sorted array
        arr = mergeSortO(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Recursive method to perform merge sort on the given array.
     *
     * @param arr The input array to sort.
     * @return A sorted array.
     */
    private static int[] mergeSortO(int[] arr) {
        // Base case: if the array has only one element, it's already sorted.
        if (arr.length == 1) {
            return arr;
        }

        // Find the middle index to split the array
        int mid = arr.length / 2;

        // Recursively sort the left half of the array
        int[] left = mergeSortO(Arrays.copyOfRange(arr, 0, mid));

        // Recursively sort the right half of the array
        int[] right = mergeSortO(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the two sorted halves
        return mergeArray(left, right);
    }

    /**
     * Merges two sorted arrays into one sorted array.
     *
     * @param first The first sorted array.
     * @param last  The second sorted array.
     * @return A single sorted array containing all elements from the two input arrays.
     */
    private static int[] mergeArray(int[] first, int[] last) {
        // Create an array to hold the merged result
        int mix[] = new int[first.length + last.length];

        // Initialize pointers for traversing the input arrays
        int i = 0; // Pointer for the `first` array
        int j = 0; // Pointer for the `last` array
        int k = 0; // Pointer for the `mix` array

        // Compare elements from both arrays and add the smaller one to `mix`
        while (i < first.length && j < last.length) {
            if (first[i] < last[j]) {
                mix[k] = first[i];
                i++; // Move pointer in `first`
            } else {
                mix[k] = last[j];
                j++; // Move pointer in `last`
            }
            k++; // Move pointer in `mix`
        }

        // Add any remaining elements from `first` to `mix`
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Add any remaining elements from `last` to `mix`
        while (j < last.length) {
            mix[k] = last[j];
            j++;
            k++;
        }

        // Return the merged array
        return mix;
    }
}
