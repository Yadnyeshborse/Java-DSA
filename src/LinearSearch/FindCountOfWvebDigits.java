package LinearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindCountOfWvebDigits {
    public int findno() {
        int num[] = {12, 1, 123, 1234};
        int count = 0;
        for (int nums : num) {
            if (even(nums)) {
                count++;
            }

        }
        return count;

    }


    private boolean even(int num) {
        int result=findcount(num);

        return result%2==0;

    }
    public int findcount(int num){
    int count=0;
    while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        FindCountOfWvebDigits fo=new FindCountOfWvebDigits();
        int result= fo.findno();
        System.out.println(result);
    }

    }


    //optimized solution
//    class Solution {
//        public int findNumbers(int[] num) {
//            int count = 0;
//            for (int nums : num) {
//                if (Integer.toString(nums).length() % 2 == 0) {  // Directly checking length
//                    count++;
//                }
//            }
//            return count;
//        }
//
//        public static void main(String[] args) {
//            Solution fo = new Solution();
//            int[] num = {12, 1, 123, 1234};  // Initialize with sample values
//            int result = fo.findNumbers(num);
//            System.out.println(result);  // Output the result
//        }
//    }



