package Array;

public class SmallestNo {
    public static void main(String[] args) {
        int[] arr={12,65,23,89,43,4};

        int min=arr[0];
        for(int i=0;i<arr.length;i++){

            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
