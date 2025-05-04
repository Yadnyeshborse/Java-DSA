package CollectionsQuestions.HashSetQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDistinct {
    public static void main(String[] args) {
        int[] arr = {12,12,12,12, 10, 9, 45, 2, 10, 10, 45};
        List<Integer> result=findDistinct(arr);
        result.forEach(i->System.out.println(i));
    }

    private static List<Integer> findDistinct(int[] arr) {
        Set<Integer> data=new HashSet<>();

        for (int a:arr){
            data.add(a);
        }
        return new ArrayList<>(data);
    }
}
