package String;



public class Determine_one_stringIsrotationOfOtherString {
    public static void main(String[] args) {
        String str1 = "abcde", str2 = "deabc";
        if (str1.length()==str2.length() && (str1+str2).contains(str2)){
            System.out.println("It satify condition");
        }else {
            System.out.println("It does not satisfy condition");
        }

        //Two strings are anagrams if they have the same characters with the same frequencies, but in any order.
        //Two strings are rotations of each other if one can be obtained by shifting characters in the other.
    }
}
