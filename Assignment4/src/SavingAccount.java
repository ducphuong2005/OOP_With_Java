public class SavingAccount extends Account {
    private double interest; // Interest per term (e.g., 0.01 for 1%)
    private int term; // Number of terms (e.g., months)

    // Constructor
    public SavingAccount(String accountNo, String ownerName, double amount, String accountType, double interest, int term) {
        super(accountNo, ownerName, amount, accountType);
        this.interest = interest;
        this.term = term;
    }

    // Getters and Setters
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    // Calculate Interest and Update Amount
    public void calculateInterest() {
        double interestAmount = getAmount() * interest * term;
        setAmount(getAmount() + interestAmount);
        System.out.println("Interest calculated and added: " + interestAmount);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        calculateInterest(); // Calculate interest after deposit
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        calculateInterest(); // Calculate interest after withdrawal
    }
}
