public class IterFibonacci {
    public static void main(String[] args) {
        int n = 7;
        int result = fibIterative(n);
        System.out.println(n + " = " + result);
    }
    public static int fibIterative(int n) {
        if (n <=1) {
            return n;
        }
        int orig = 0;
        int updated = 1;
        for (int i = 2; i <= n; i++) {
            int next = orig + updated;
            orig = updated;
            updated = next;
        }
        return updated;
    }
}
