package application;

import model.entities.Account;
import model.exceptions.NotEnoughBalanceException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initital Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();

            System.out.print("Enter the amount for withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.println(account);
        } catch (NotEnoughBalanceException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }


        sc.close();
    }

}
