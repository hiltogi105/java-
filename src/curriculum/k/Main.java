package curriculum.k;

public class Main {

    public static void main(String[] args) {

        SalaryCalculator calculator = new SalaryCalculator();

        Employee emp1 = new FullTimeEmployee("田中", 8);
        Employee emp2 = new ContractEmployee("佐藤", 8);

        calculator.printSalary(emp1);
        calculator.printSalary(emp2);
    }
}