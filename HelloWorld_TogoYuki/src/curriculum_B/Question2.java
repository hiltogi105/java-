package curriculum_B;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q1
		int score = 75;
		if(score >=60) {
			System.out.println("合格です！");
		}
		//Q2	
		int age = 25;
		if(age >=20 && age <= 30) {
			System.out.println("適正年齢です");
		}
		
		//Q3
		age = 18;
		if(age >= 20) {
			System.out.println("成人です");
		}else if(age >=13 && age<=19) {
			System.out.println("ティーンエイジャーです。");
		}else {
			System.out.println("子供です");
		}
		
		//Q4
		int x = 30;
		int y = 15;
		int z = 50;
		if(x >= y && x>= z ) {
			System.out.println(x);
		}else if(y >= x && y >= z){
			System.out.println(y);
		}else {
			System.out.println(z);
		}
		
		//Q5
		int num =0;
		if(num >0) {
			System.out.println("正の数です");
		}else if(num == 0) {
			System.out.println("0です");
		}else {
			System.out.println("負の数です");
		}
		
		//Q6
		int value = 1;
		if(value%2 == 0) {
			System.out.println("偶数");
		}else
			System.out.println("奇数");
		
		//Q7
		score = 0;
		String result = (score >= 90) ? "優" : (score >= 70) ? "良" : (score >= 50) ? "可" :"不可";
		System.out.println(result);
		
		//Q8
		result = "";
		result = (result == null || result == "") ? "入力が無効です":"";
		System.out.println(result);
		
		//Q9
		int day = 1;
		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な入力です");
		}
		
		//Q10
		int month = 1;
		switch (month) {
		case 1: case 2: case 12:
			System.out.println("冬");
		case 3: case 4: case 5:
			System.out.println("春");
		case 6: case 7: case 8:
			System.out.println("夏");
		case 9: case 10: case 11:
			System.out.println("秋");
		default:
			System.out.println("無効な月です");
		}
		
		
	}

}
