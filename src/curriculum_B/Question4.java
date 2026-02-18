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
		
		int[][] array6 =  {{1, 2}, {3, 4}, {5, 6}}; 
		for(int i = 0; i < array6.length;i++) {
			for(int j = 0;j < array6[i].length;j++) {
				System.out.println(array6[i][j]);
			}
		}
		
		//Q8
		System.out.println(" Q8");
		
		int[][] array7 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; 
		int sum2 = 0;
		for(int i = 0; i < array7.length;i++) {
			for(int j = 0;j < array7[i].length;j++) {
				sum2+= array7[i][j];
			}
		}
		System.out.println(sum2);
		
		//Q9
		System.out.println(" Q9");
		
		int[][] array8 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		int max2 = array8[0][0];
		int min2 = array8[0][0];
		
		for(int i = 0; i < array8.length;i++) {
			for(int j = 0;j < array8[i].length;j++) {
				if(max2 < array8[i][j] ){
					max2 = array8[i][j];
				}
				if(min2 > array8[i][j]) {
					min2 = array8[i][j];
				}
			}
		}
		
		System.out.println("配列の最大値は" + max2);
		System.out.println("配列の最小値は" + min2);		
		
		//Q10
		System.out.println(" Q10");
		
		 int[][][] array9 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		 for(int i = 0; i < array9.length;i++) {
			for(int j = 0;j < array9[i].length;j++) {
				for(int k = 0;k < array9[i][j].length;k++) {
					System.out.println(array9[i][j][k]);
				}
			}
		}
		 
		 
		 
	}

}
