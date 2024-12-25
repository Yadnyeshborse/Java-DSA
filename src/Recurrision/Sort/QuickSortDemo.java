package Recurrision.Sort;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr={8,4,3,6,1};
        int ans[]=quicksorto(arr,0,arr.length-1);
        for (int i:ans){
            System.out.print(i+" ");
        }
    }

    private static int[] quicksorto(int[] arr, int start, int end) {
        if (end<=start){
            return arr;
        }
        int pivot=partitionP(arr,start,end);
        quicksorto(arr,start,pivot-1);
        quicksorto(arr,pivot+1,end);
        return arr;
    }

    private static int partitionP(int[] arr, int start, int end) {
        int pivot=arr[end];
        int i=start-1;
        for (int j=start;j<end;j++){
            if (arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }


        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;




    }
}
