package CollectionsQuestions.HashSetQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Union_of_Two_Sorted_Arrays {

    public static void main(String[] args) {
        int[] arr1={1,1,2,2,3,3,5,6};
        int[] arr2={5,5,6,7,9,9,10};
        int[] result=findSortedSumByHashSet(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findSortedSumByHashSet(int[] arr1, int[] arr2) {
        Set<Integer> union=new HashSet<>();

        for (int a:arr1){
            union.add(a);
        }
        for (int b:arr2){
            union.add(b);
        }
        int index=0;
        int[] arr=new int[union.size()];
        for (int c:union){
            arr[index]+=c;
            index++;
        }
        return arr;
    }
}
