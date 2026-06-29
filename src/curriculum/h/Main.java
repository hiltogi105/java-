package curriculum.h;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		FullTimeEmployee fullTime = new FullTimeEmployee("E001", "田中");
		
		PartTimeEmployee partTime = new PartTimeEmployee("P001", "佐藤");
		
		System.out.println("正社員の給与: " + fullTime.calculateDailyWage(9) + "円");
		System.out.println("パート社員の給与: " + partTime.calculateDailyWage(9) + "円");
	}

}
