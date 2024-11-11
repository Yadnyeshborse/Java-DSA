package Array2D;

public class IdentityMatrix {
    public static void main(String[] args) {
        int arr[][]={
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int row=arr.length;
        int col=arr[0].length;
        boolean value =true;
        if (row!=col){
            System.out.println("IT is not identity Matrix");
        }else {
            for (int i=0;i<row;i++){
                for (int j=0;j<col;j++){
                    if (i==j && arr[i][j]!=1){
                      value=false;
                    }
                    if (i!=j&& arr[i][j]!=0){
                        value=false;
                    }
                }
            }
        }
        if(value){
            System.out.println("It is Identity Matrix");
        }else {
            System.out.println("It is not Identity Matrix");
        }

    }
}
