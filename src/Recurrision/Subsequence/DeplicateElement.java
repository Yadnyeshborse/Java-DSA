package Recurrision.Subsequence;

import java.util.ArrayList;

public class DeplicateElement {
        public static void main(String[] args) {
            System.out.println(sequenceNo("", "abc"));
        }

        private static ArrayList<String> sequenceNo(String p, String word) {
            if (word.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

            char ch = word.charAt(0);

            // Include the character once
            ArrayList<String> includeOnce = sequenceNo(p + ch, word.substring(1));

            // Include the character twice
            ArrayList<String> includeTwice = sequenceNo(p + ch + ch, word.substring(1));

            // Exclude the character
            ArrayList<String> exclude = sequenceNo(p, word.substring(1));

            // Combine all results
            includeOnce.addAll(includeTwice);
            includeOnce.addAll(exclude);

            return includeOnce;
        }
    }


