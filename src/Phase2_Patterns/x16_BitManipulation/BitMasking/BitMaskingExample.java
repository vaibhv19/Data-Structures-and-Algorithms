package Phase2_Patterns.x16_BitManipulation.BitMasking;

public class BitMaskingExample {
    public static void main(String[] args) {
        int mask = 5; // 101
        System.out.println("Mask bits: " + ((mask & 1) != 0));
    }
}
