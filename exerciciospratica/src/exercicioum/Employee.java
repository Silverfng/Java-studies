package exercicioum;

public class Employee {

    //attributes

    public String name;
    public double grossSalary;
    public double tax;


    //methods

    public double netSalary() {
        return grossSalary - tax;
    }


    public double increaseSalary(double percentage) {
        return grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {

        return name
                + ", $ "
                + netSalary();
    }


}
