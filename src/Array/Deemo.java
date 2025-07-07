package Array;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Deemo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 3, 5, 1};
        int n = arr.length;

        System.out.print("Unique elements: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}