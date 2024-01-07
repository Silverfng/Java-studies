package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,10,7);

        //Stream a partir de uma lista
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        //Stream a partir de Stream.of
        Stream<String> st2 = Stream.of("Maria","Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //Stream iterate + limit(short-circuit)
        Stream<Integer> st3 = Stream.iterate(0,x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //Fibonacci
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

        //Pipeline

        List<Integer> list2 = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st5 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st5.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));

    }

}
