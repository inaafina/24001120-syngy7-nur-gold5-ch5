package Q2A;

public class Main implements Main {
    public static void main(String[] args) {
        // Creating a new bank account
        BankAccount account = new BankAccount("123456789", 500.00, "John Doe", "john.doe@example.com", "123-456-7890");

        // Testing deposit method
        account.deposit(100.00);

        // Testing withdraw method
        account.withdraw(50.00);

        // Testing withdraw with insufficient balance
        account.withdraw(600.00);

        // Displaying account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Customer Email: " + account.getCustomerEmail());
        System.out.println("Customer Phone: " + account.getCustomerPhone());
        System.out.println("Account Balance: $" + account.getBalance());
    }
}
