package CollectionsQuestions.HashSetQuestions;

import java.util.HashSet;
import java.util.Set;

public class SubSetOfArray {
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        System.out.println(isSubset(arr1, arr2));
    }

    private static boolean isSubset(int[] arr1, int[] arr2) {
        Set<Integer> result=new HashSet<>();
        for (int a:arr1){
            result.add(a);
        }
        for (int b: arr2){
            if (!result.contains(b)){
                return false;
            }
        }
        return true;
    }
}
