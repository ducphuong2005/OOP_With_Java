public class Account {
    private String accountNo;
    private String ownerName;
    protected double amount; // Allow child classes to access amount
    private String accountType;

    // Constructor
    public Account(String accountNo, String ownerName, double amount, String accountType) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.amount = amount;
        this.accountType = accountType;
    }

    // Getters and Setters
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        this.amount += amount;
        System.out.println("Deposited " + amount + " successfully.");
    }

    public void withdraw(double amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println("Withdrawn " + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
