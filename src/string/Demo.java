package string;


public class Demo {
    public static void main(String[] args) {
        String str = "Great Power?>";
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isUpperCase(str.charAt(i))){
                builder.append(Character.toLowerCase(str.charAt(i)));
            } else if (Character.isLowerCase(str.charAt(i))) {
                builder.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(builder);

        
    }
}
