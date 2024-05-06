// 31.Write a Java program to add two matrices of the same size.

public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int r = matrix1.length;
        int c = matrix1[0].length;
        int[][] result = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
