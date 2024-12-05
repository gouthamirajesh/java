
//Create a class BankAccount that will encapsulate the details of a bank account.
//
//        It should have private fields for:
//
//        accountNumber (String)
//        accountHolderName (String)
//        balance (double)
//        Create public methods to:
//
//        Get account details: Provide getters to access the account number and account holder name.
//        Deposit money: Create a method deposit(double amount) to allow deposits to the balance. Ensure the deposit amount is positive.
//        Withdraw money: Create a method withdraw(double amount) that subtracts from the balance if sufficient funds exist. Ensure the amount withdrawn is positive and doesn't exceed the balance.
//        Check balance: Provide a getter for balance, but the balance should not be directly modifiable from outside the class.
//        Add a constructor to initialize the account number, account holder name, and an initial balance.


package oops;

public class BankAccount {
    // Private fields (Encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for balance (no setter to ensure encapsulation)
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Create a new BankAccount
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.00);

        // Test the functionality
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Deposit money
        account.deposit(500.00);
        System.out.println("Updated Balance: $" + account.getBalance());

        // Withdraw money
        account.withdraw(300.00);
        System.out.println("Updated Balance: $" + account.getBalance());

        // Attempt to withdraw too much money
        account.withdraw(1500.00);
    }
}
