public class MultiplicationOfMatrices {
    public static void multi(int[][] a, int[][] b) {
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;
        if (c1 != r2) {
            System.out.println("multiplication is not possible!");
            return;
        }
        int[][] mult = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mult[i][j] += a[i][k] + b[k][j];
                }
            }
        }
        printArray(mult);
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int[][] b = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
        multi(a, b);
    }
}
