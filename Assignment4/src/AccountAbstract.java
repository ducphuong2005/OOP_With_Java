public abstract class AccountAbstract {
    private String accountNo;
    private String ownerName;
    protected double amount;

    // Constructor
    public AccountAbstract(String accountNo, String ownerName, double amount) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.amount = amount;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Getters
    public String getAccountNo() {
        return accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getAmount() {
        return amount;
    }
}

