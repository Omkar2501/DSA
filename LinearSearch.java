public class LinearSearch {
    public int search(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        LinearSearch l = new LinearSearch();
        int arr[] = { 100, 30, 28, 65, 93, 25, 0 };
        int target = 0;
        int result = l.search(arr, target);
        System.out.println("index of search element is : " + result);

    }
}
