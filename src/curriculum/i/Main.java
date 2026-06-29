package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee("E001", "田中"));
		employees.add(new FullTimeEmployee("P001", "佐藤"));
		employees.add(new ContractEmployee("C001", "鈴木"));
		
		for(Employee employee : employees) {
			System.out.println(employee.name + " の給与: " + employee.calculateDailyWage(9) + "円");
		}
	}

}
