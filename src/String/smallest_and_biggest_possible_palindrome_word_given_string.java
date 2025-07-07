package String;

public class smallest_and_biggest_possible_palindrome_word_given_string {
    public static void main(String[] args) {
        String sentence = "Madam Anna racecar civic rotor level noon wow refer deed peep kayak";
        String[] words = sentence.split(" ");
        String min = "";
        String max = "";
        for (String word : words) {
            String lower = word.toLowerCase();
            if (isPlindrome(lower)) {
                if (min.equals("") || word.length() < min.length()) {
                    min = word;
                }
                if (max.equals("")  || word.length() > max.length()) {
                    max = word;
                }
            }
        }
        System.out.println(min);
        System.out.println(max);

    }

    private static boolean isPlindrome(String name) {
        if (name.length() == 1) return true;
        int left = 0, right = name.length() - 1;
        while (left < right) {
            if (name.charAt(left++) != name.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
