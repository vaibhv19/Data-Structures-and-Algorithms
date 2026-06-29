package Phase2_Patterns.x10_BinarySearch.LowerUpperBound;

public class LowerUpperBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        System.out.println("Lower bound of 2: " + lowerBound(arr, 2));
        System.out.println("Upper bound of 2: " + upperBound(arr, 2));
    }

    static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
