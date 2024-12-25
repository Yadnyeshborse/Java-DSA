package Recurrision.Subsequence;

public class SubSequenec {
    public static void main(String[] args) {
        subsequence("","ABC");
    }

    private static void subsequence(String space, String letter) {
        if (letter.isEmpty()){
            System.out.println(space);
            return ;
        }

        char ch=letter.charAt(0);
        subsequence(space+ch,letter.substring(1));
        subsequence(space,letter.substring(1));
    }
}
