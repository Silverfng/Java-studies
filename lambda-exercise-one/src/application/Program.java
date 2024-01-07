package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);
                list.add(new Employee(name, email, salary));
                line = br.readLine();
            }

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x,y) -> x + y);


            List<String> higher = list.stream()
                    .filter(x -> x.getSalary() > sal)
                    .map(x -> x.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", sal));
            higher.forEach(System.out::println);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

}
