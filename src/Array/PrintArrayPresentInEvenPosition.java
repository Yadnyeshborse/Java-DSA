package Array;

public class PrintArrayPresentInEvenPosition {
    public static void main(String[] args) {
        int arr[]={12,13,14,15,16};
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
