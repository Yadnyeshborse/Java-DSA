package String;

public class CountTotalnoOfVowels {
    public static void main(String[] args) {
        String str = "This is a really simple sentence";
        int count=0,consonants=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.toLowerCase().charAt(i)=='a'||
                    str.toLowerCase().charAt(i)=='e'||str.toLowerCase().charAt(i)=='i'||
                    str.toLowerCase().charAt(i)=='o'||str.toLowerCase().charAt(i)=='u') {
                count++;
            } else if (str.toLowerCase().charAt(i)>='a'&& str.toLowerCase().charAt(i)<='z') {
                consonants++;
            }
        }
        System.out.println(count);
        System.out.println(consonants);
    }
}
