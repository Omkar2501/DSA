
/*
        For spiral matrix we want traverse like this
        1]. toprow
        2]. rightColumn
        3]. bottomRow
        4]. LeftColumn
 */
import java.util.*;

public class SprialMatrix {
    public static void spiral(int[][] matrix, int row, int column) {

        int toprow = 0, bottomrow = row - 1;
        int leftcol = 0, rightcol = column - 1;
        int totalElement = 0;
        while (totalElement < row * column) {
            // toprow -> leftcol to rightcol

            for (int i = leftcol; i <= rightcol && totalElement < row * column; i++) {
                System.out.print(matrix[toprow][i] + " ");
                totalElement++;

            }
            toprow++;

            // rightcol -> toprow to bottomrow

            for (int j = toprow; j <= bottomrow && totalElement < row * column; j++) {
                System.out.print(matrix[j][rightcol] + " ");
                totalElement++;
            }
            rightcol--;

            // bottomrow -> rightcol to leftcol

            for (int i = rightcol; i >= leftcol && totalElement < row * column; i--) {
                System.out.print(matrix[bottomrow][i] + " ");
                totalElement++;
            }
            bottomrow--;

            // leftcol -> bottomrow to toprow

            for (int j = bottomrow; j >= toprow && totalElement < row * column; j--) {
                System.out.print(matrix[j][leftcol] + " ");
                totalElement++;
            }
            leftcol++;
        }

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns : ");
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter Element At Position " + i + " ," + j + "== ");
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);
        spiral(matrix, r, c);
    }
}
