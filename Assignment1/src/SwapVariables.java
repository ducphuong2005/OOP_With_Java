public class SwapVariables {
    public static void main(String[] args) {
        int a = 5, b = 10, c;
        c = a; // Temporary variable
        a = b;
        b = c;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
