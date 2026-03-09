package curriculum_B;

public class Question5 {
	
	//Q1
	public static void helloWorld() {
		System.out.println("Hello,World!");
	}
	
	//Q2
	public static int doubleValue(int num) {
		int value = num *2;
		return value;
	}
	
	//Q3
	public static boolean isEven(int num) {
		boolean flag = true;
		if(num %2 == 0) {
			
		}else {
			flag = false;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		helloWorld();
		
		System.out.println(doubleValue(10));
		
		int num1 = 7;
		if(isEven(num1)) {
			System.out.println(num1 + " は偶数です。");
		} else {
			System.out.println(num1 + " は奇数です。");
		}
		int num2 = 10;
		if(isEven(num2)) {
			System.out.println(num2 + " は偶数です。");
		} else {
			System.out.println(num2 + " は奇数です。");
		}
		
		//Q4
		Greeting greet = new Greeting();
		greet.sayHello();
		
		//Q5
		Animal animal = new Animal();
		
		// 値を設定
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);
		
		// 出力
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}
	
	

}
