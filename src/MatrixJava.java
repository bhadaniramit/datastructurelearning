public class MatrixJava {

    //Print 2D array in Java:
    public void twoDArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }

    //Program to Print 3×3 Matrix:
    public void threeDArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }

    //Sum of matrix elements in Java:
    public void SumthreeDArray(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);
    }


    //Sum of Diagonal Elements of Matrix
    public void sumDiagonal(int[][][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for(int k=1;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k]);
                }
            }
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        MatrixJava matrixJava = new MatrixJava();
        int[][] TwoDmatrix = {{2, 1},
                {3, 4},
                {4, 5}};
//        matrixJava.twoDArray(TwoDmatrix);
        int[][] ThreeDMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        matrixJava.threeDArray(ThreeDMatrix);
//        matrixJava.SumthreeDArray(TwoDmatrix);
//        matrixJava.sumDiagonal(ThreeDMatrix);
    }

}
