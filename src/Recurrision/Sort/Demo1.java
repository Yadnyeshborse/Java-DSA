package Recurrision.Sort;

public class Demo1 {
    public static void main(String[] args) {
        int arr[]={11,4,55,25,1};
        int n=arr.length-1;
        selectionSortO(arr,n,0);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void selectionSortO(int[] arr, int n, int index) {
        if (index==n-1){
            return;
        }
        int minIndex=index;
        for (int i=index+1;i<=n;i++){
            if (arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        int temp=arr[minIndex];
        arr[minIndex]=arr[index];
        arr[index]=temp;



        selectionSortO(arr,n,index+1);
    }
}
