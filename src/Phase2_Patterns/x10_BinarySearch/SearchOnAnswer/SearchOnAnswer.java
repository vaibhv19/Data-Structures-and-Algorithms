package Phase2_Patterns.x10_BinarySearch.SearchOnAnswer;

public class SearchOnAnswer {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println("Minimum eating speed: " + minEatingSpeed(piles, h));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1000000000;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, mid, h)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    static boolean canFinish(int[] piles, int speed, int h) {
        int hours = 0;
        for (int pile : piles) hours += (pile + speed - 1) / speed;
        return hours <= h;
    }
}
