import java.util.Scanner;

public class PascalsTriangle {
    public static int[][] pasclas(int n) {
        // only intiliazing the row value
        int p[][] = new int[n][];

        for (int i = 0; i < n; i++) {

            // for creating ith 1d array in it
            p[i] = new int[i + 1];

            // FIRST AND LAST ELEMNT IS 1 IN THIS
            p[i][0] = p[i][i] = 1;

            for (int j = 1; j < i; j++) {
                p[i][j] = p[i - 1][j] + p[i - 1][j - 1];
            }
        }
        return p;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows for triangle : ");
        int n = sc.nextInt();

        int result[][] = pasclas(n);
        System.out.println("The Pasclas Triangle is:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
