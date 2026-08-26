class BankAccount {
    String accountNo;
    String holderName;
    double balance;

    // Constructor
    BankAccount(String accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Display method
    void display() {
        System.out.println("Account No: " + accountNo + ", Holder: " + holderName + ", Balance: Rs" + balance);
    }
}