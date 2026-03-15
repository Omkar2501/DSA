public class InsertionSort {
    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // insert the big element
                j--;
            }
            arr[j + 1] = key; // insert the key value
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // InsertionSort i=new InsertionSort();
        int[] arr = { 8, 3, 10, 6, 3, 1 };
        printArray(arr);
        sort(arr);
        printArray(arr);
    }
}
