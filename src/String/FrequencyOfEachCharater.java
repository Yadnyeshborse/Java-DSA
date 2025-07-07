package String;

public class FrequencyOfEachCharater {
    public static void main(String[] args) {
        String str="ASNAAJDOKOPP;" ;
        char ch[]=str.toCharArray();
        int temp[]=new int[ch.length];
        int visisted=-1;
        for (int i=0;i<ch.length;i++){
            if (temp[i]==visisted){
                continue;
            }
            int count=1;
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    temp[j]=visisted;
                    count++;
                }
            }
            temp[i]=count;
        }
        for (int i=0;i<temp.length;i++){
            if (temp[i]>=1){
                System.out.println(ch[i]+" "+temp[i]);
            }
        }
    }
}
