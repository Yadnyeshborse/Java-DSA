package String;

public class RepeatedCharater {
    public static void main(String[] args) {
        String string=new String("BuilderPattern");
        int count=0;
        char[] ch=string.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println(ch[i]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
