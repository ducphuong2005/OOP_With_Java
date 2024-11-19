public class ATMInheritance {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("123456", "Alice", 1000, "Saving", 0.01, 2);
        savingAccount.deposit(500);
        savingAccount.withdraw(300);
        System.out.println("Final Balance: " + savingAccount.getAmount());
    }
}
