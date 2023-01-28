
import java.util.Scanner;

public class ATM {
    public static void main(String args[]) {

        int balance = 500000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ATM  ( Automated Teller Machine ) ");
            System.out.println("Choose 1 to Withdraw cash");
            System.out.println("Choose 2 to Deposit");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to EXIT");
            System.out.print("Please Choose the operation you want to perform: ");

            int choice = sc.nextInt();
            if (choice == 1) {

                System.out.print("Enter money to be withdrawn:");

                withdraw = sc.nextInt();

                if (balance >= withdraw) {

                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                } else {

                    System.out.println("Insufficient Balance");
                }
            }
            System.out.println("");

            if (choice == 2) {

                System.out.print("Enter money to be deposited:");

                deposit = sc.nextInt();

                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");

            }

            if (choice == 3) {

                System.out.println("Balance : " + balance);
                System.out.println("");
            }

            if (choice == 4) {

                System.exit(0);
            }
        }

        }
}