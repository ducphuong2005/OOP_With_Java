import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResizableCricle rc = new ResizableCricle();
        rc.intputData2();
        System.out.println("Nhap resize: ");
        rc.resizable(scanner.nextInt());

    }
}
