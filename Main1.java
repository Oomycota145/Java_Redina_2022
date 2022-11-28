package Matrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 6},
                {3, 2, 0},
                {1, 3, 5}
        };

        show(matrix);
        changePlaceOfMinElement(matrix, 2, 2);
        System.out.println("Changed!");
        show(matrix);

    }

    private static int findMinElement(int[][] matrix){
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (minElement > matrix[i][j]) {
                    minElement = matrix[i][j];
                }
            }
        }

        return minElement;
    }

    private static void changePlaceOfMinElement(int[][] matrix, int row, int column){
        int minElement = findMinElement(matrix);
        int rowOfMinElement = 0;
        int columnOfMinElement = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (minElement == matrix[i][j]) {
                    rowOfMinElement = i;
                    columnOfMinElement = j;
                }
            }
        }

        int temp = matrix[row - 1][column - 1];
        matrix[row - 1][column - 1] = minElement;
        matrix[rowOfMinElement][columnOfMinElement] = temp;
    }

    private static void show(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}