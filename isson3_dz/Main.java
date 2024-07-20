/**
 * 1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
 *    представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
 * 2. Опишите класс руководителя, наследник от сотрудника.
 *    Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
 *    чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя
 *    и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите,
 *    чтобы зарплата руководителя не повысилась.
 */
package isson3_dz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Egor", 55000.0, "1995-08-05");
        Employee employee2 = new Employee("Stanislav", 54000.0, "1995-08-05");
        System.out.println(Employee.compare(employee1.getDate(), employee2.getDate()));


        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Ivan", 65000.0, "1990-01-21");
        employees[1] = new Employee("Pavel", 45000.0, "1992-03-14");
        employees[2] = new Supervisor("Andrey", 92000.0, "1987-02-28");
        System.out.println(Arrays.toString(employees));

        Supervisor.salaryIncrease(employees, 7000);
        System.out.println(Arrays.toString(employees));

    }
}
