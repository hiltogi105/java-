package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q1
		System.out.println(" Q1");
		
		int[] array = {1,2,3,4,5};
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//Q2
		System.out.println(" Q2");
		
		int[] array2 = {10,20,30,40,50};
		for(int i = array2.length;i > 0;i--) {
			System.out.println(array2[i-1]);
		}
		
		//Q3
		System.out.println(" Q3");
		
		int[] number = {3, 5, 7, 9, 11};
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		System.out.println(sum);
		
		//Q4
		System.out.println(" Q4");
		
		int[] array3 = {12, 7, 9, 21, 5, 18};
		int max = array3[1];
		int min = array3[1];
		
		for(int i = 0; i < array3.length; i++) {
			if(max < array3[i]) {
				max = array3[i];
			}
			if(min > array3[i]) {
				min = array3[i];
			}
		}
		System.out.println("配列の最大値は" + max);
		System.out.println("配列の最小値は" + min);
		
		//Q5
		System.out.println(" Q5");
		
		int array4[] = {1,2,3,4,5};
		for(int i = 0;i < array4.length;i++) {
			array4[i] *= 2;
		}
		for(int num2:array4) {
			System.out.println(num2);
		}
		
		//Q6
		System.out.println(" Q6");
		
		int[] array5 = {4,7,10,15,20};
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください");
		if(sc.hasNextInt()) {
			int num = sc.nextInt();
			boolean found = false;
			for(int value : array5) {
				if(value == num) {
					found = true;
					break;
				}
			
			}
			if(found) {
				System.out.println(num + "は配列に含まれています");
			}else {
				System.out.println(num + "は配列に含まれていません");
			}
			
		}else {
			System.out.println("数字以外が入力されました");
			sc.next();
		}
		
		//Q7
		System.out.println(" Q7");
		
		
	}

}
