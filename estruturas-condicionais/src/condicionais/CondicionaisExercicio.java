package condicionais;

import java.util.Scanner;

public class CondicionaisExercicio {

    public static void main(String[] args) {



        // Exercicio 05

        /*Scanner sc = new Scanner(System.in);

        int codigo;
        int qtd;
        double valor = 0.0;

        codigo = sc.nextInt();
        qtd = sc.nextInt();

        if (codigo == 1) {
            valor = 4.00 * qtd;
        }else if (codigo == 2) {
            valor = 4.50 * qtd;
        }else if (codigo == 3) {
            valor = 5.00 * qtd;
        }else if (codigo == 4) {
            valor = 2.00 * qtd;
        }else if (codigo == 5) {
            valor = 1.50 * qtd;
        } else {
            System.out.println("Valor digitado invalido!");
        }

        System.out.println("Total: R$ " + valor);
        */

        //Exercicio 01 --> while

        /*Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 2002) {
            System.out.println("Senha Invalida");
            x = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();*/


        Scanner sc = new Scanner(System.in);

        //Exercicio if

        /*int x = sc.nextInt();

        if(x < 0) {
            System.out.println("NEGATIVO");
        } else if (x >= 0) {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();*/


        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0) {
            if (x > 0 && y > 0)
                System.out.println("Primeiro");
            else if (x < 0  && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();

    }
}
