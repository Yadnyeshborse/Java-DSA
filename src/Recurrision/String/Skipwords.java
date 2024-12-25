package Recurrision.String;

public class Skipwords {
    public static void main(String[] args) {
        System.out.println(SkipwordsString("ASAASSSSSKKKKK","KKK"));
    }

    private static String SkipwordsString(String letter, String wordtoskip) {
        if (letter.isEmpty()){
            return " ";
        }

        if (letter.startsWith(wordtoskip)){
            return SkipwordsString(letter.substring(wordtoskip.length()),wordtoskip);
        }else{
            return letter.charAt(0)+SkipwordsString(letter.substring(1),wordtoskip);
        }
    }

}
