public class AddtionOf2Matrix {
    public static void add(int[][] a, int[][] b) {
        int row = a.length;
        int col = a[0].length;
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(sum);
    }

    public static void printArray(int[][] sum) {
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + "   ");

            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[][] A = { { 1, 2, 0, 5 }, { 3, 4, 10, 12 } };
        int[][] B = { { 5, 6, 0, 5 }, { 7, 8, 10, 12 } };
        add(A, B);
        /*
         * (5+1)=6 (2+6)=8 (0+0)=0 (5+5)=10
         * ((3+7)=10 (4+8)=12 (10+10)=20 (12+12)=24
         */
    }
}
