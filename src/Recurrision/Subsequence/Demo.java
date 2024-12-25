package Recurrision.Subsequence;

import java.util.ArrayList;


public class Demo {
    public static void main(String[] args) {
        System.out.println(sequenceNo("","abc"));
    }

    private static ArrayList<String> sequenceNo(String p, String word) {
        if (word.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=word.charAt(0);
        ArrayList<String> left =sequenceNo(p+ch,word.substring(1));
        ArrayList<String> right=sequenceNo(p,word.substring(1));
        left.addAll(right);
        return left;
    }
}
