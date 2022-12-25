package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.calculateSalary(30000);
    }

    public void calculateSalary(int salary) {
        double salaryAfterTax = 0;

        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        } else if (salary <= 10000) {
            salaryAfterTax = salary * (1 - 0.15);
        } else if (10000 < salary && salary <= 20000) {
            salaryAfterTax = salary * (1 - 0.18);
        } else if (salary > 20000) {
            salaryAfterTax = salary * (1 - 0.2);
        }
        System.out.println(salaryAfterTax);
    }
}
