package LinearSearch;

public class Demo {
    public int findno(){
        int num[]={12,123,1,1234};
        int count =0;
        for(int nums:num){
            if(evenno(nums)){
                count++;
            }
        }
        return  count;
    }

    private boolean evenno(int nums) {
        int result=checknoCount(nums);
        return result%2==0;
    }

    private int checknoCount(int nums) {
        int count=0;
        while ((nums > 0)) {
            nums/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Demo");
        Demo fo=new Demo();
        int result=fo.findno();
        System.out.println(result);
    }
}
