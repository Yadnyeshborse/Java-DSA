package CollectionsQuestions.HashSetQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDumplicate {


    public static void main(String[] args) {
       List<Integer> setA=Arrays.asList(1, 2, 3, 2, 1);
       List<Integer> setB=Arrays.asList(3, 2, 2, 3, 3, 2, 4);
       List<Integer> result=uniqueElement(setA,setB);
       System.out.println(result);
    }

      static List<Integer> uniqueElement(List<Integer> setA, List<Integer> setB) {
        Set<Integer> data=new HashSet<>(setA);
        return setB.stream().filter(o -> data.contains(o)).
                distinct().
                collect(Collectors.toList());
    }

}
