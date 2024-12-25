package Recurrision.String;

public class SkipAppNotApple {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("AppAppleKKJKJK"));
    }

    private static String skipAppNotApple(String letter) {
        if (letter.isEmpty()){
            return " ";
        }

        if (letter.startsWith("App") && !letter.startsWith("Apple")){
            return skipAppNotApple(letter.substring(3));
        }else{
            return letter.charAt(0)+skipAppNotApple(letter.substring(1));
        }
    }
}
