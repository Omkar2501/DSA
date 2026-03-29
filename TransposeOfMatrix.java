public class TransposeOfMatrix {

    // Method 1: Using new array (works for all matrices)
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int ans[][] = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }

    // Method 2: In-place transpose (ONLY for square matrix)
    static void transposeinline(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;

        // Check for square matrix
        if (row != col) {
            System.out.println("In-place transpose only works for square matrix!");
            return;
        }

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("After In-place Transpose:");
        printArray(matrix);
    }

    // Print method
    static void printArray(int ans[][]) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        System.out.println("Original Matrix:");
        printArray(matrix);

        // Using new array (correct for rectangular matrix)
        int result[][] = transpose(matrix);
        System.out.println("After Transpose (New Array):");
        printArray(result);

        // In-place transpose (will show message since not square)
        transposeinline(matrix);
    }
}