package array.practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day1 {
    public static void main(String[] args) {

//        8. Write a program to sort string by frequency
//        input : apple a-1 p-2 l-1 e-1
//        output: ppale
//        String name="apple";

//        String name="apple";
//        String list = name.chars().mapToObj(i -> (char) i).
//                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream()
//                .sorted((e1,e2)->Long.compare(e2.getValue(),e1.getValue())).map(i -> String.valueOf(i.getKey()).repeat(i.getValue().intValue())).collect(Collectors.joining());
//        System.out.println(list);

        int arr[]={0,1,2,3,4,5,0,0};

        int j=0;
        for (int i = 0; i < arr.length; i++) {

                if (i!=j){
                    if (arr[i]==0){
                        arr[j]=arr[i];
                        arr[j]=0;
                        j++;
                    }

                }

        }
        System.out.println("___");
        System.out.println(Arrays.toString(arr));
//
//        select * from Empolyee e having grounp by name , count(name)>1;



    }
}
