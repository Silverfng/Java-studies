package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double soma, media;
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        soma = 0;

        for (int i=0; i<n; i++) {
            soma = soma + vect[i];
        }

        media = soma / vect.length;

        System.out.print("Valores = ");

        for(int i=0; i<n; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma );
        System.out.printf("MEDIA = %.2f", media );


        sc.close();
    }
}
