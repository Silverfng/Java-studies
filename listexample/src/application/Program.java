package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        //Declaração lista e instanciação
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");


        System.out.println(list.size());



        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------");

        //Removes --> Por objeto, index e predicado
        /*list.remove("Anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');*/



        //Filtrar na lista

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        /*Mesma operação da linha de cima, mas com sintaxe atualizada
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();*/

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("-----------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);



    }

}
