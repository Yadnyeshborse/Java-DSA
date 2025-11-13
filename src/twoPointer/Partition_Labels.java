package twoPointer;

import java.util.*;
//https://leetcode.com/problems/partition-labels/description/
public class Partition_Labels {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> res = partitionLabels(s);
        System.out.println(res);  // Expected: [9, 7, 8]
    }

    private static List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            map.put(s.charAt(i),i);
        }

        int size=0;int end=0;
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            size++;
            end=Math.max(end,map.get(s.charAt(i)));
            if (i==end){
                result.add(size);
                size=0;
            }


        }
        return result;
    }
}