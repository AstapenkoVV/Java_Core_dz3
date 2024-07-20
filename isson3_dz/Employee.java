package isson3_dz;


public class Employee {
    private String name;
    private Double salary;
    private String date;

    public String getDate() {
        return date;
    }

    public Employee(String name, Double salary, String date) {
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public Employee() {
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }

//    static void salaryIncrease (Employee[] employee, int amount){
//        for (int i = 0; i < employee.length; i++) {
//            employee[i].increaseSalary(amount);
//        }
//    }

    static int compare(String date1, String date2){
        String[] nums1 = date1.split("-");
        String[] nums2 = date2.split("-");

        int yyyy = Integer.parseInt(nums1[0]);
        int mm = Integer.parseInt(nums1[1]);
        int dd = Integer.parseInt(nums1[2]);

        int yBirth = Integer.parseInt(nums2[0]);
        int bMonth = Integer.parseInt(nums2[1]);
        int bDay = Integer.parseInt(nums2[2]);

        int empl = bDay + (bMonth << 6) + (yBirth << 11);
        int income = dd + (mm << 6) + (yyyy << 11);
        return empl - income;
    }


    @Override
    public String toString() {
        return "\nИмя сотрудника: " + name +
                ", зарплата: " + salary +
                ", дата рождения: " + date;
    }
}
