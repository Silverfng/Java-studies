package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Account account;

        System.out.print("Enter account number: ");
        int nb= sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String hld = sc.nextLine();

        System.out.print("Is there an initial deposit? (y/n) ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double dep = sc.nextDouble();
            account = new Account(nb, hld, dep);
        }else {
            account = new Account(nb, hld);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.print(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double dep = sc.nextDouble();
        account.deposit(dep);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.print(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double wdt = sc.nextDouble();
        account.withdraw(wdt);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.print(account);



        sc.close();
    }

}
