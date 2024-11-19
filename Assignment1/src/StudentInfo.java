import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student code: ");
        String studentCode = scanner.nextLine();
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student sex: ");
        String studentSex = scanner.nextLine();

        System.out.println("Student Information:");
        System.out.println("Code: " + studentCode);
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Sex: " + studentSex);
    }
}
