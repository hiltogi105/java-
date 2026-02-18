package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Q1
		System.out.println(" Q1");
		for(int i =1;i <=10;i++) {
			System.out.println(i);
		}
		

		
		//Q2
		System.out.println(" Q2");		
		for(int i = 2;i <= 20;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		
		//Q3
		System.out.println(" Q3");
		for(int i =10;i >=1;i--) {
			System.out.println(i);
		}
		
		//Q4
		System.out.println(" Q4");		
		int sum = 0;
		for(int i =1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		//Q5
		System.out.println(" Q5");		
		for(int i = 1;i <=5;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
		//Q6
		System.out.println(" Q6");		
		int count = 1;
		while(count <=10) {
			System.out.println(count);
			count++;
		}
		
		//Q7
		System.out.println(" Q7");	
		count = 1;
		while(count <=20) {
			if(count % 2 == 0) {
				System.out.println(count);
			}
			count++;
		}
				
		//Q8
		System.out.println(" Q8");	
		count = 10;
		while(count >= 1) {
			System.out.println(count);
			count--;
		}
				
		//Q9
		System.out.println(" Q9");	
		count = 1;
		sum = 0;
		while(count <=100) {
			sum += count;
			count++;
		}
		System.out.println(sum);
						
		//Q10
		System.out.println(" Q10");			
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("数字を入力してください");
			if(sc.hasNextInt()) {
				int num = sc.nextInt();
				if(num == 0) {
					System.out.println("終了しました");
					break;
				}else {
					//System.out.println(num);
				}
			}else {
				System.out.println("数字以外が入力されました");
				sc.next();
			}
	
		}
		
		
		//Q11
		System.out.println(" Q11");			
		int total;
		for(int i = 1;i <=9;i++) {
			for(int j = 1;j <=9;j++) {
				total = i*j;
				System.out.printf("%02d * %02d = %02d",i,j,total);
				if(j !=9) {
					System.out.print(" || ");
				}
			}
			System.out.println();
			System.out.println();

		}
		
		//Q12
		System.out.println(" Q12");	
		System.out.println("商品を入力してください");
		Random rand = new Random();
		sc.nextLine();
		String input = sc.nextLine();
		
		
		String[] items = input.split("、");
		int tvStock = rand.nextInt(12); // 0~11
		
		for(String item:items) {
			switch(item) {
				case "テレビ":
				case "ディスプレイ":
					int stock = item.equals("テレビ")? tvStock:11 - tvStock;
					System.out.println(item + "の残りの台数は" + stock + "です");
					break;
				case "パソコン":case "冷蔵庫":case "扇風機":case "洗濯機":case "加湿器":
					int randomStock = rand.nextInt(12);
					System.out.println(item + "の残りの台数は" + randomStock + "です");
					break;
				default:
					System.out.println("『 " + item + " 』は指定の商品ではありません");
			}
		}
		sc.close();
	}

}
