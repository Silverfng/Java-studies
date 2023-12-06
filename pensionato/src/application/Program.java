package application;

import entities.Pensionato;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 10;
        Pensionato[] pens = new Pensionato[n];


        System.out.print("How many rooms will be rented? ");
        int r = sc.nextInt();


        //cleaning buffer
        sc.nextLine();


        for(int i=0; i<r; i++) {
            System.out.printf("Rent #%d:\n", i+1);
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int nroom = sc.nextInt();
            pens[nroom -1] = new Pensionato(email, nome);
            sc.nextLine();
        }

        System.out.print("Busy rooms: \n");

        for (int i=0; i<n; i++) {
            if (pens[i] != null) {
                System.out.printf("%d: %s\n", i+1, pens[i].toString());
            }
        }


        sc.close();
    }

}
