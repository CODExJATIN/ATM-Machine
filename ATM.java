import java.util.Scanner;

public class ATM {
    private static int balance = 1000;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: $");
        int withdrawAmount = scanner.nextInt();
        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance. Please try again.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Please take your cash.");
            System.out.println("Your current balance is: $" + balance);
        }
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: $");
        int depositAmount = scanner.nextInt();
        balance += depositAmount;
        System.out.println("Your current balance is: $" + balance);
    }

    private static void exit() {
        System.out.println("Thank you for using our ATM. Have a good day!");
        System.exit(0);
    }
}
