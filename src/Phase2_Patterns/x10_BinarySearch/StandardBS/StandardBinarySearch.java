package Phase2_Patterns.x10_BinarySearch.StandardBS;

public class StandardBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println("Index of 5: " + search(arr, 5));
    }

    static int search(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}
