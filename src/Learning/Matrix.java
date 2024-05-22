package Learning;

public class Matrix {

    double [][] matrix;
    int a;
    int b;


    public Matrix(int a, int b){
        this.a = a;
        this.b = b;
        this.matrix = new double[a][b];
    }

    public double[][] sum (double[][] matrix2) {
        int length = matrix.length;
        int innerLen = matrix[0].length;
        double [][] sumOfMatrix = new double[length][innerLen];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
              sumOfMatrix[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        return sumOfMatrix;
    }

    public void multiply (int x){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] *= x;
            }
        }
    }



}
