package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));


        //Interface implementation example
        /*list.forEach(new PriceUpdate());
        list.forEach(System.out::println);*/

        //Static Reference method
        /*list.forEach(Product::staticPriceUpdate);
        list.forEach(System.out::println);*/

        //Non static reference method
        /*list.forEach(Product::nonStaticPriceUpdate);
        list.forEach(System.out::println);*/

        double factor = 1.1;

        //Declared Lambda expression
        /*Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };*/
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);

        /*inline lambda expression
        list.forEach(p -> p.setPrice(p.getPrice() * factor));*/


        list.forEach(cons);
        list.forEach(System.out::println);

    }

}
