package isson3_dz;

public class Supervisor extends Employee {

    public Supervisor(String name, Double salary, String date) {
        super(name, salary, date);
    }

    static void salaryIncrease (Employee[] employee, int amount){
        for (int i = 0; i < employee.length; i++) {
            if (!(employee[i] instanceof Supervisor)) employee[i].increaseSalary(amount);
        }
    }
}
