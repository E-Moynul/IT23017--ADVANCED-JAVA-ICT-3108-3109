//it23017
import java.util.Scanner;

class BankAccount {
    
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }
}

public class ATMSystem {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();
            double amount;

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    if (account.deposit(amount)) {
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    System.out.println("New Balance: $" + account.getBalance());
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    if (account.withdraw(amount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
                    }
                    System.out.println("New Balance: $" + account.getBalance());
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        scanner.close();
    }
}
