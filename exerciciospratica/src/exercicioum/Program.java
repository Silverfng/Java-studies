package exercicioum;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        rect.Area();
        rect.Perimeter();
        rect.Diagonal();

        System.out.println("AREA = " + rect.Area());
        System.out.println("PERIMETER = " + rect.Perimeter());
        System.out.println("DIAGONAL = " + rect.Diagonal());

        sc.close();

    }
}
