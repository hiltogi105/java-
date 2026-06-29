package selfIntroduction;

public class Person {
	  // インスタンスフィールドを定義
	
	static int count = 0;
	
	String name;
	int age;
	double height;
	double weight;
	
	  // コンストラクタを定義しインスタンスフィールドに値をセット
	  Person(){
	  }

	public Person(String name, int age, double height) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.age = age;
		this.height = height;
		count++;
	}
	
	double bmi() {
		double bmi = weight/height/height;
		bmi = Math.round(bmi * 10) / 10.0;
		return bmi;
	}
	
	void print() {
		System.out.println("合計人数は" + count + "人です");
	}
}
