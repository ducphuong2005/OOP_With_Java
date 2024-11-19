public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Create sample accounts
        Account acc1 = new Account("123456", "Alice", 5000, "Saving");
        Account acc2 = new Account("789101", "Bob", 3000, "Checking");

        ATM atm = new ATM();
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. View Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.viewAmount(acc1);
                    break;
                case 2:
                    atm.deposit(acc1);
                    break;
                case 3:
                    atm.withdraw(acc1);
                    break;
                case 4:
                    atm.transferMoney(acc1, acc2);
                    break;
                case 5:
                    System.out.println("Exiting ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}