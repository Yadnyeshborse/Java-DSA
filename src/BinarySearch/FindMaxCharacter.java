package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//1.Same as ceiling problem
// 2.remove equal codition
//3. at end it is start=end+1 and start is qual to arr,length so while returning we are using remainder operator
public class FindMaxCharacter {  // Ensure this matches the file name and package
    public static void main(String[] args) {
        char letters[] = {'B', 'C', 'E', 'F'};
        char target = 'D';

        FindMaxCharacter.Solution solution = new FindMaxCharacter().new Solution();
        System.out.println(solution.findno(letters, target));
    }

    class Solution {
        public char findno(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            return letters[start % letters.length];
        }
    }
}
