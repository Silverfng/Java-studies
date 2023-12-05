package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double altTotal;
        int menorIdade;
        Pessoa[] vect = new Pessoa[n];

        //clear buffer
        sc.nextLine();

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %d pessoa\n", i+1);
            System.out.print("Nome ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int ida = sc.nextInt();
            System.out.print("Altura: ");
            double alt = sc.nextDouble();
            vect[i] = new Pessoa(name, ida, alt);
            sc.nextLine();
        }


        altTotal = 0.0;
        for (int i =0; i<n; i++) {
            altTotal += vect[i].getAltura();
        }

        double altAvg = altTotal / n;

        System.out.printf("\nAltura média: %.2f", altAvg);


        menorIdade = 0;
        for (int i=0; i<n; i++) {
            if (vect[i].getIdade() < 16) {
                menorIdade ++;
            }
        }
        double percen = ((double)menorIdade / n) * 100.0;
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", percen);

        for (int i=0; i<n; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }


        sc.close();
    }
}
