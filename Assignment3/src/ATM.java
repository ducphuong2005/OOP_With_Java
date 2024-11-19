public class ATM {
    public void withdraw(Account acc) {
        System.out.print("Enter amount to withdraw: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double amount = sc.nextDouble();
        acc.withdraw(amount);
    }

    // Deposit method
    public void deposit(Account acc) {
        System.out.print("Enter amount to deposit: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double amount = sc.nextDouble();
        acc.deposit(amount);
    }

    // View Account Details
    public void viewAmount(Account acc) {
        System.out.println("Account Details:");
        System.out.println("Account No: " + acc.getAccountNo());
        System.out.println("Owner Name: " + acc.getOwnerName());
        System.out.println("Balance: " + acc.getAmount());
        System.out.println("Account Type: " + acc.getAccountType());
    }

    // Transfer Money
    public void transferMoney(Account acc1, Account acc2) {
        System.out.print("Enter amount to transfer: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double amount = sc.nextDouble();
        if (acc1.withdraw(amount)) {
            acc2.deposit(amount);
            System.out.println("Successfully transferred " + amount + " from " + acc1.getOwnerName() + " to " + acc2.getOwnerName());
        }
    }
}
