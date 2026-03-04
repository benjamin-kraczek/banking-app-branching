import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("Rob");

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Amount: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Amount: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                System.out.println("Balance: " + account.getBalance());
            } else {
                break;
            }
        }
    }
}
