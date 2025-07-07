package String;

public class FindCountOfLetters {
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        String  words[]=string.split(" ");

        int count=0;
        for (int i = 0; i < words.length; i++) {
            count+= words[i].length();;
        }
        System.out.println(count);

    }
}
