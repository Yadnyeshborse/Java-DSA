package Array2D;

public class SubsTractTwoMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {5, 6, 7},
                {4, 3, 2},
                {9, 8, 1}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rows=matrix1.length;
        int columns=matrix1[0].length;
        int temp[][]=new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                temp[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        System.out.println("Resultant Matrix after Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();  // Move to the next row

        }
    }
}
