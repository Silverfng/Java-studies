package condicionais;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int x = 15;

        System.out.println("Bom dia");

        if (x < 7) {
            System.out.println("Boa tarde");
        }


        //Expressão condicional ternaria
        //(expressao) ? resultado 1: resultado 2;

        double desconto, preco = 34.5;
        desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.printf("O desconto é: %.2f", desconto);*/

        //Exercicio While

        /*Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();*/



        //Exemplo For

        Scanner sc = new Scanner(System.in);

        int qtd =sc.nextInt(); 
        int soma = 0;


        for ( int i = 0; i < qtd ; i++) {
            int x =sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);


    }

}
