package Array;

import java.util.Arrays;

public class Merged_array {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] merged = mergeSorted(a, b);
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }

    public static int[] mergeSorted(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            merged[k++] = a[i] < b[j] ? a[i++] : b[j++];
        }

        while (i < a.length) {
            merged[k++] = a[i++];
        }

        while (j < b.length) {
            merged[k++] = b[j++];
        }

        return merged;
    }
}
