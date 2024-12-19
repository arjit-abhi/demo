public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        // Resultant matrix will have rows from matrix1 and columns from matrix2
        int[][] result = multiplyMatrices(matrix1, matrix2);
        
        // Display the result
        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        // Check if multiplication is possible (columns of matrix1 should match rows of matrix2)
        if (cols1 != matrix2.length) {
            throw new IllegalArgumentException("Matrix multiplication not possible.");
        }

        // Resultant matrix
        int[][] result = new int[rows1][cols2];

        // Multiply matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}
