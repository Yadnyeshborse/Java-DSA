package Array;

public class FindLargestElement {
    public static void main(String[] args) {
        int arr[]={12,16,89,1,3,76};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){

            if (arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
