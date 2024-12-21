package Recurrision.Sort;

public class Demo {
    public static void main(String[] args) {
        int arr[]={11,22,5,2,77};
        int n=arr.length-1;
        selectionsort(arr,n,0);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void selectionsort(int[] arr, int n,int index) {
        if (index==n-1){
            return;
        }
        int minIndex=index;
        for (int i=index+1;i<n;i++){
            if (arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        int temp = arr[index];
        arr[index] = arr[minIndex];
        arr[minIndex] = temp;

        selectionsort(arr,n,index+1);
    }
}
