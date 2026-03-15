public class selection {

    public void sort(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    public void printArray(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        selection s = new selection();
        int arr[] = { 100, 24, 12, 15, 18, 90 };
        s.printArray(arr);
        s.sort(arr);
        s.printArray(arr);

    }
}
