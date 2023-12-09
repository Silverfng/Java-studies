package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();



        //Reading Data
        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.printf("Employee #%d\n", i+1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            while(hasId(list, id)) {
                System.out.println("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }



        //Updating Salary
        System.out.print("\nEnter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null) {
            System.out.print("This id does not exist!\n\n");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }


        //Listing Employee
        System.out.print("List of Employees:\n");

        for(Employee obj: list) {
            System.out.println(obj);
        }

        sc.close();
    }

    private static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
