import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    static int[] array = new int[10];

    // Fill data into array
    public static void fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    // Print all elements
    public static void printArray() {
        System.out.println("Array elements: " + Arrays.toString(array));
    }

    // Search for a value
    public static void searchValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int value = scanner.nextInt();
        boolean found = false;
        for (int num : array) {
            if (num == value) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Value exists in array." : "Value not found.");
    }

    // Find maximum value
    public static void findMax() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }

    // Calculate sum of all elements
    public static void calculateSum() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);
    }

    // Sort array in descending order
    public static void sortDescending() {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Array sorted in descending order: " + Arrays.toString(array));
    }

    // Menu for user selection
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print Array");
            System.out.println("2. Search a Value");
            System.out.println("3. Find Maximum Value");
            System.out.println("4. Calculate Sum");
            System.out.println("5. Sort Descending");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> printArray();
                case 2 -> searchValue();
                case 3 -> findMax();
                case 4 -> calculateSum();
                case 5 -> sortDescending();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        fillArray();
        menu();
    }
}
