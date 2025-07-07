package String;

public class DuplicateCharterInString {
    public static void main(String[] args) {
        String string1 = "Great responsibility";
        char charrr[]=string1.toCharArray();
        for (int i = 0; i < charrr.length; i++) {
            int count=1;
            for (int j = i+1; j <charrr.length ; j++) {
                if (charrr[i]==charrr[j]&& charrr[j]!=' '){
                    count++;
                    charrr[j]='O';
                }

            }
            if(count > 1 && charrr[i] != 'O')
                System.out.println(charrr[i]);

        }
    }
}
