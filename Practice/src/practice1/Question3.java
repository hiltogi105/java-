package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//6.配列
		//配列
		int[] result = new int[3];
		result[0] = 12;
		result[1] = 23;
		result[2] = 35;
		for(int i = 0; i < 3 ; i++) {
			System.out.println(result[i]);
		}
		
		//要素の上書き
		String[] colors = {"A","B","C","D","E"};
		colors[2] = "X"; // C　→　X
		
		//要素数の取得
		System.out.println(colors.length) ;//5
		
		//配列の結合
		int[] src1 = {1, 2, 3, 4};
		int[] src2 = {5, 6, 7};
		int[] src3 = new int[src1.length + src2.length];
		System.arraycopy(src1,0,src3, 0,src1.length); //src1の0からをsrc3の0から,要素数文追加する
		System.arraycopy(src2,0,src3,src1.length,src2.length); //src2の0からをsrc3の要素数のあとからsrc2の要素数分追加する
		
		//配列とList
		//List
		List<String> A_list = new ArrayList<String>();
		A_list.add("A");
		A_list.add("B"); //要素数が決まっていないため、いくらでも簡単に追加可能
		
		//配列の繰り返し処理
		int[] intArray = {1, 2, 3, 4};
		int sum = 0;
		for(int i = 0; i < intArray.length; i++) { //.lengthで配列の長さ分だけ繰り返す
			System.out.println("intArray[" + i + "]の値：" + intArray[i]);
			sum += intArray[i];
		}
		System.out.println("配列総和は" + sum); //配列要素内の数値の和
		
		//多次元配列
		//1次元配列
		int[] intArray2 = {1, 2, 3, 4};
		
		//2次元配列
		int[][] intArray3 = new int[2][3];
		intArray3[0][0] = 1; //0行0列に1を格納
		intArray3[1][2] = 2; //1行2列に2を格納(インデックス番号は[0]スタートなので注意)
		
		char[][] arr = {{'a','b','c'},{'a','b','c','d'},{'a','b','c','d','e'}};
		
		//3次元配列
		char[][][] arr2 = new char[2][3][4]; // 要素の代入
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j<3; j++) {
				for(int k = 0;k<4;k++) {
					arr2[i][j][k] = (char)('1' + k);
				}
			}
		}
		System.out.println(Arrays.deepToString(arr)); //[[[1,2,3,4,],[1,2,3,4,],[1,2,3,4,]],[[1,2,3,4,],[1,2,3,4,].[1,2,3,4,]]
		System.out.println("3次元の配列の長さ：" + arr2.length); //3次元の長さ:2
		System.out.println("2次元の配列の長さ：" + arr2.length); //3次元の長さ:3
		System.out.println("1次元の配列の長さ：" + arr2.length); //3次元の長さ:4
		
	}

}
