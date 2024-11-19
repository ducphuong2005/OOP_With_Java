import java.util.Scanner;
public class LinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        } else {
            System.out.println("No solution (a cannot be zero).");
        }
    }
}
