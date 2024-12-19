public class BankAccount {
    
    //Data Members
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private Double balance;

    //constructor for initial data
    public BankAccount(String depositorName, String accountNumber, String accountType, double initialBalance){
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid input amount");
        }    
    }
    
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        } else if (amount > balance){
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid input amount");
        }
    }

    public void displayDetails() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }
    
        public static void main(String[] args) {
            // Create a new bank account
            BankAccount account = new BankAccount("John Doe", "123456789", "Savings", 5000.0);
    
            // Display initial details
            account.displayDetails();
    
            // Deposit some money
            account.deposit(2000);
    
            // Withdraw some money
            account.withdraw(1000);
    
            // Try withdrawing more than the balance
            account.withdraw(7000);
    
            // Display updated details
            account.displayDetails();
        }
}
