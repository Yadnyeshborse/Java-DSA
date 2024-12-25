package Recurrision.Permutation;

public class Permutation {
    public static void main(String[] args) {
        int totalPermutation=permutationsExample("","abc");
        System.out.println("Count  =  "+totalPermutation);
    }

    private static int permutationsExample(String space, String letter) {
        if (letter.isEmpty()){
            System.out.print(space+" ");
            return 1;
        }

        int count=0;
        char ch=letter.charAt(0);
        for (int i=0;i<=space.length();i++){
            String startLetter=space.substring(0,i);
            String  ebdLetter=space.substring(i,space.length());
            count+=permutationsExample(startLetter+ch+ebdLetter,letter.substring(1));
        }
        return count;
    }
}
