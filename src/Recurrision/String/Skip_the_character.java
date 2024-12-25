package Recurrision.String;

public class Skip_the_character {
    public static void main(String[] args) {
        System.out.println(skipA("bacapplcdah"));

    }

    private static String skipA(String letter) {
        if (letter.isEmpty()){
            return " ";
        }
        char ch=letter.charAt(0);
        if (ch=='a'){
            return skipA(letter.substring(1));
        }else {
            return ch+skipA(letter.substring(1));
        }


    }


}
