class BankAccount {

    // 1. Public: accessible from anywhere
    public String accountHolder;

    // 2. Private: accessible only within this class
    private double balance;

    // 3. Protected: accessible within the package and in subclasses
    protected String accountType;

    // 4. Default (package-private): accessible within the same package
    String bankName;

    // Constructor
    public BankAccount(String accountHolder, double balance,
            String accountType, String bankName) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
        this.bankName = bankName;
    }

    // Public method to access private balance
    public double getBalance() {
        return balance;
    }

    // Public method to update private balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Balance: " + balance);
    }
}

public class AccessSpecifiersExample {
    public static void main(String[] args) {

        // Create a BankAccount object
        BankAccount account = new BankAccount(
                "Amit", 5000, "Savings", "ABC Bank");

        // Accessing the public attribute
        System.out.println("Account Holder: " + account.accountHolder);

        // Accessing the protected attribute
        // Allowed here because both classes are in the same package
        System.out.println("Account Type: " + account.accountType);

        // Accessing the default attribute
        // Allowed here because both classes are in the same package
        System.out.println("Bank Name: " + account.bankName);

        // Accessing the private attribute through a public method
        System.out.println("Current Balance: " + account.getBalance());

        // Updating balance through a public method
        account.deposit(1500);

        // Displaying all account details
        System.out.println("\nUpdated Account Details:");
        account.displayDetails();

        // This would cause a compilation error:
        // System.out.println(account.balance);
    }
}
