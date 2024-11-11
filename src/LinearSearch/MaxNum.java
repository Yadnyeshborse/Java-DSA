package LinearSearch;

public class MaxNum {
    public static void main(String[] args) {
        int arr[]= {3,7,3,2,1,5};
        int result=maxnum(arr);
        System.out.println(result);

    }

    public static int maxnum(int[] arr) {
        int PO=arr[0];
        int k=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<PO) {
                //arr[i]=PO;
                k=arr[i];

            }
        }
        return k;
    }
}
