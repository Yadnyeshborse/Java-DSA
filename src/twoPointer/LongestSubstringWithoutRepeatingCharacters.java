package twoPointer;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int left=0;
        int right=0;
        int maxLen=0;
        Set<Character> set=new HashSet<>();
        while (right<s.length()) {
            char ch=s.charAt(right);
            while (set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        System.out.println(maxLen);

    }
}
