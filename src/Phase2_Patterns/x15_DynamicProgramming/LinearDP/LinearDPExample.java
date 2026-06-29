package Phase2_Patterns.x15_DynamicProgramming.LinearDP;

public class LinearDPExample {
    public static void main(String[] args) {
        System.out.println("Fibonacci of 10: " + fibonacci(10));
    }
    static int fibonacci(int n) {
        if (n <= 1) return n;
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
