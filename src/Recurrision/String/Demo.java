package Recurrision.String;

public class Demo {
    public static void main(String[] args) {
        System.out.println(SkipChar("aashhjbbyuuiowlll","hh"));
    }

    private static String SkipChar(String letter,String lettertoskip) {

        if (letter.isEmpty()){
            return " ";
        }

        if (letter.startsWith(lettertoskip)){
            return SkipChar(letter.substring(lettertoskip.length()),lettertoskip);
        }else {
            return letter.charAt(0)+SkipChar(letter.substring(1),lettertoskip);
        }
    }
}
