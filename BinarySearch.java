
/*return the index of the target element */
//for binary search we need sorted array
import java.util.*;

public class BinarySearch {
    public int search(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int arr[] = { 3, 6, 19, 30, 49, 68, 93, 99 };
        int target = 6;
        int result = b.search(arr, target);
        System.out.println("The index of targeted element is: " + result);

    }
}
