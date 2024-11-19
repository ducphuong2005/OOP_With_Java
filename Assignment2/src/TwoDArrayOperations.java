import java.util.Scanner;

public class TwoDArrayOperations {
    static int[][] array;
    static int rows, columns;

    // Initialize the 2D array
    public static void initializeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        columns = scanner.nextInt();
        array = new int[rows][columns];
    }

    // Fill data into the 2D array
    public static void fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    // Print all elements of the array
    public static void printArray() {
        System.out.println("Array elements:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Calculate the sum of all elements
    public static void calculateSum() {
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }

    // Search for a value
    public static void searchValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int value = scanner.nextInt();
        boolean found = false;
        for (int[] row : array) {
            for (int num : row) {
                if (num == value) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found ? "Value exists in array." : "Value not found.");
    }

    // Sort elements in ascending order
    public static void sortArray() {
        int[] tempArray = new int[rows * columns];
        int index = 0;

        for (int[] row : array) {
            for (int num : row) {
                tempArray[index++] = num;
            }
        }

        java.util.Arrays.sort(tempArray);
        index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = tempArray[index++];
            }
        }

        System.out.println("Array sorted in ascending order:");
        printArray();
    }

    // Menu for user selection
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print Array");
            System.out.println("2. Calculate Sum");
            System.out.println("3. Search Value");
            System.out.println("4. Sort Array");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> printArray();
                case 2 -> calculateSum();
                case 3 -> searchValue();
                case 4 -> sortArray();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        initializeArray();
        fillArray();
        menu();
    }
}
