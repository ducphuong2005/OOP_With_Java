public class Account {
    private String accountNo;
    private String ownerName;
    private double amount;
    private String accountType;

    // Constructors
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

    // Deposit method
    public void deposit(double amount) {
        this.amount += amount;
        System.out.println("Successfully deposited: " + amount);
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println("Successfully withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
}
