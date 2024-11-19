class TransactionAccount extends AccountAbstract {
    // Constructor
    public TransactionAccount(String accountNo, String ownerName, double amount) {
        super(accountNo, ownerName, amount);
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
        System.out.println("Deposited " + amount + " into Transaction Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println("Withdrawn " + amount + " from Transaction Account.");
        } else {
            System.out.println("Insufficient funds in Transaction Account.");
        }
    }
}