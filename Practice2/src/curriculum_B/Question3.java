package curriculum_B;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Q1
		for(int i =1;i <=10;i++) {
			System.out.println(i);
		}
		
		//見やすくするための改行
		System.out.println("");
		
		//Q2
		for(int i = 2;i <= 20;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//見やすくするための改行
		System.out.println("");
		
		//Q3
		for(int i =10;i >=1;i--) {
			System.out.println(i);
		}
		
		//見やすくするための改行
		System.out.println("");
		
		//Q4
		int sum = 0;
		for(int i =1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//見やすくするための改行
		System.out.println("");		
		
		//Q5
		for(int i = 1;i <=5;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		//見やすくするための改行
		System.out.println("");	
		
		//Q6
		int count = 1;
		while(count <=10) {
			System.out.println(count);
			count++;
		}
		
		//見やすくするための改行
		System.out.println("");	
		
		//Q7
		count = 1;
		while(count <=20) {
			if(count % 2 == 0) {
				System.out.println(count);
			}
			count++;
		}
		
		//見やすくするための改行
		System.out.println("");	
				
		//Q8
		count = 10;
		while(count >= 1) {
			System.out.println(count);
			count--;
		}
		
		//見やすくするための改行
		System.out.println("");	
				
		//Q9
		count = 1;
		sum = 0;
		while(count <=100) {
			sum += count;
			count++;
		}
		System.out.println(sum);
		
		//見やすくするための改行
		System.out.println("");	
						
		//Q10
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
		sc.close();
		
		//見やすくするための改行
		System.out.println("");	
		
		//Q11
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
			
			//見やすくするための改行
			System.out.println("");	


		}
		
	}

}
