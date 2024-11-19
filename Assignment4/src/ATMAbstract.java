public class ATMAbstract {
    public static void main(String[] args) {
        TransactionAccount transactionAccount = new TransactionAccount("789101", "Bob", 2000);
        transactionAccount.deposit(1000);
        transactionAccount.withdraw(1500);
        System.out.println("Final Balance: " + transactionAccount.getAmount());
    }
}
