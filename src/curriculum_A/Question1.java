package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Java基礎問題_1
		
		// Q1 各型の変数を宣言し、初期値を設定してください。
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		char letter = '\u0000';
		String letters =null;
		boolean isBoolean = false;
		
		// Q2 Q1で宣言した各型の変数に指定された値を代入してください
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters ="ハロー";
		isBoolean = true;
		
		// Q3 Q2の値を代入した変数を用いて出力をしてください
		System.out.println(longNum + intNum + shortNum + byteNum);
		System.out.println(byteNum + byteNum);
		System.out.println(letter + " " + letters + " " + isBoolean);
		System.out.println(longNum + intNum + shortNum + byteNum + byteNum + byteNum);
		System.out.printf("%.0E%n",(double)longNum * intNum * byteNum * shortNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		
		 //改行用、見やすくするため
		System.out.println("");
		
		/* Q4 name という String型の変数 を宣言し
		 * その変数に "山田太郎" という値を代入してください。
		 * name変数を使用してコンソールに こんにちは、山田太郎さん! と出力してください。*/
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");
		
		//改行用、見やすくするため
		System.out.println(""); 
		
		/* Q5 age という int型の変数 を宣言し
		 * その変数に 25 を代入してください。
		 * age変数を使用してコンソールに 年齢: 25歳 という出力してください。*/
		int age = 25;
		System.out.println("年齢：" + age + "歳");
		
		//改行用、見やすくするため
		System.out.println(""); 
		
		/* Q6 num1 という int型の変数 を宣言し、10 を代入
		 * num2 という int型の変数 を宣言し、5 を代入
		 * num1 と num2 を足した結果を sum という変数に代入し、コンソールに出力してください。*/
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		
		//改行用、見やすくするため
		System.out.println(""); 
		
		/* Q7score という int型の変数 を宣言し、80 を代入
		 * score に 20 を加えて、更新する
		 * 最終スコア: 100 　をscoreを使用してコンソールに出力してください。 */
		int score = 80;
		score += 20;
		System.out.println("最終スコア：" + score);
		
		//改行用、見やすくするため
		System.out.println(""); 
		
		/* Q8 price という double型の変数 を宣言し、99.99 を代入
		 * price を int型 に変換し、整数価格: 99 とコンソールに出力してください。*/
		double price = 99.99;
		System.out.println("整数価格：" + (int)price);

		//改行用、見やすくするため
		System.out.println(""); 
		
		/* Q9 String 型の変数 numStr に "123" を代入
		 * numStr を int 型に変換し、
		 * 変換後の値: の後ろにnumStr + 10 した結果をコンソールに出力してください。*/
		String numStr = "123";
		System.out.println(Integer.valueOf(numStr) + 10);
		
		//改行用、見やすくするため
		System.out.println(""); 
		
		/* Q10 int 型の変数 num に 50 を代入
		 * num を String 型に変換し、"得点: 50点" の形で出力*/
		int num = 50;
		System.out.println("得点：" + Integer.toString(num) + "点");
		
		//改行用、見やすくするため
		System.out.println(""); 
		
		/* Q11 次の条件を満たすプログラムを条件演算子を使用して作成してください。
		 * int 型の変数 a に 10 を代入
		 * int 型の変数 b に 20 を代入
		 * a が b より小さいかどうかを boolean 変数 result に代入
		 * result の値を出力*/
		int a = 10;
		int b = 20;
		boolean result = a < b;
		System.out.println(result);

		//改行用、見やすくするため
		System.out.println(""); 
		
		/* Q12条件演算子（三項演算子）を使用してください。
		 * int 型の変数 x に 15 を代入 プログラムでは、「もし〇〇なら△△する」というような 条件によって処理を変えることがよくあります。
		 * x が 10 以上なら "OK"、そうでなければ "NG" を出力*/
		int x = 15;
		System.out.println((x>10)?"OK":"NG");
		
		//改行用、見やすくするため
		System.out.println(""); 
		
		/* Q13 String text = "私はJavaが好きです。Javaは楽しい!";という
		 * 文章の中にある 「Java」 を 「Python」 に置き換えて出力させてください。*/
		String text = "私はJavaが好きです。Javaは楽しい！";
		System.out.println(text.replace("Java","Python"));
	}

}
