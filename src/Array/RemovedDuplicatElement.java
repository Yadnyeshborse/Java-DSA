package Array;

public class RemovedDuplicatElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 3, 5, 1};
        for (int i = 0; i <arr.length ; i++) {
            boolean visisted=false;
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]==arr[j]){
                    visisted=true;
                    break;
                }
            }
            if (!visisted){
                System.out.println(arr[i]);
            }

        }
    }
}
