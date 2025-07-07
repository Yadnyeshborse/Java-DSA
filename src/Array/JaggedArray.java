package Array;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = {
                {1, 2, 3},   // first row has three columns
                {4, 5},      // second row has two columns
                {6, 7, 8, 9}   };

        for (int i=0;i<jaggedArray.length;i++){
            for (int j=0;j<jaggedArray[i].length;j++){
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
