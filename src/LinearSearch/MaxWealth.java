package LinearSearch;
//https://leetcode.com/problems/richest-customer-wealth/submissions/1394144955/
public class MaxWealth {
    public int maximumWealth() {
        int[][] accounts={{1,2,3},{4,5,6},{7,8,9}};
        int min=Integer.MIN_VALUE;
        for (int[] acc:accounts){
            int sum=0;
            for(int a:acc){
                sum+=a;
            }
            if(sum>min){
                min=sum;
            }

        }
        return min;



    }
    public static void main(String[] args) {
        MaxWealth max=new MaxWealth();
        System.out.println(max.maximumWealth());

    }
}
