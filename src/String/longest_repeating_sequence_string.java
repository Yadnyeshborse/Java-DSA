package String;

public class longest_repeating_sequence_string {
    public static void main(String[] args) {
        String str = "acbdfghybdf";
        String longestRepeated=" ";
        for (int i = 0; i <str.length() ; i++) {
                for (int j = i+1; j <str.length() ; j++) {
                String  res=str.substring(i,j);
                if (str.indexOf(res,j)!=-1 && res.length()>longestRepeated.length()){
                    longestRepeated=res;
                }
            }
        }
        System.out.println(longestRepeated);
    }
}
