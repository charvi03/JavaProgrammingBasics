import java.util.Scanner;

public class atm_program {
    //initial balance
    private int balance = 10000;

    //function to withdraw amount
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    //function to deposit amount

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful. Your new balance is " + balance);
    }
    //function to check balance

    public int checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        atm_program atm = new atm_program();
        Scanner sc = new Scanner(System.in);
        //loop for printing the functionalities of ATM
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            //switch statement for the functionalities
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to withdraw: ");
                    int amount = sc.nextInt();
                    atm.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit: ");
                    amount = sc.nextInt();
                    atm.deposit(amount);
                    break;
                case 3:
                    System.out.println("Your balance is " + atm.checkBalance());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
