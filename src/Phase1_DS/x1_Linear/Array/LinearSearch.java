package Phase1_DS.x1_Linear.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}
