package currencyprogram;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the Dollar price? ");
        double currency = sc.nextDouble();
        System.out.print("How many dollar will be bought? " );
        double dol = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = R$%.2f%n", CurrencyConverter.currencyConversion(dol, currency));


        sc.close();
    }
}
