package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Billable> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("E001", "田中"));
        employees.add(new ContractEmployee("E002", "佐藤"));
        employees.add(new FullTimeEmployee("E003", "鈴木"));

        int hoursWorked = 10;

        for (Billable employee : employees) {
            System.out.println("日給: " + employee.costForDay(hoursWorked) + "円");
        }
    }
}