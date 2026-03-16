/* given an m x n integer matrix matrix and Each row is sorted in non-decreasing order. */

public class SearchIn2DArray {

    public static int search(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 33, 60 } };
        int target = 60;
        int result = search(matrix, target);

        if (result == 1) {
            System.out.println("target is found in matrix");
        } else {
            System.out.println("target element is not present in matrix");
        }
    }
}
