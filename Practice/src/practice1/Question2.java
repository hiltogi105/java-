package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//2.13 配列①
		//配列の概念
		int[] scores = {80,90,85,70,95};
		
		//配列の宣言、作成
		int[] numbers;
		numbers = new int[5];
		int[] numbers2 = new int[5]; //5個の要素を持つ配列を作成
		int[] scores2 = {80,90,85,70,95};
		
		//配列の要素の上書き
		int[] numbers3 = {10, 20, 30, 40,50};
		numbers3[1] = 99; // 2番目の要素（インデックス１)を変更 20→99
		System.out.println(numbers3[1]); //出力：99
		
		//配列要素数取得
		int[] scores3 = {80,90,85,70,95};
		System.out.println("配列の要素数：" + scores3.length); //出力：配列の要素数：5
		
		//複数の配列同士の結合
		//①Arrays.copyOf() を使う場合
		int[] array1 = {1,2,3};
		int[] array2 = {4,5,6};
		//array1文の要素とarray1の長さとarray2の長さの合計6つ分の要素を確保
		int[] mergedArray = Arrays.copyOf(array1,array1.length + array2.length); 
		// array2の要素をmergedArrayに追加
		System.arraycopy(array2,0,mergedArray,array1.length,array2.length); //既に1~3入ってる野に加えてarray2文の要素を追加
		System.out.println(Arrays.toString(mergedArray)); // 出力：[1,2,3,4,5,6]
		
		//②Stream を使う（Java 8 以上）場合
		int[] mergedArray2 = IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray();
		System.out.println(Arrays.toString(mergedArray2));
		
		//mapとlist
		//Map
		Map<String,Integer> scores4 = new HashMap<>(); // Mapの作成
		// データの追加(キー, 値)
		scores4.put("Alice", 85);
		scores4.put("Bob",90);
		scores4.put("Charlie",78);
		// キーを使って値を取得
		System.out.println(scores4.get("Alice")); //85
		// キーの存在を確認
		System.out.println(scores4.containsKey("Bob")); //true
		// 要素の削除
		scores4.remove("Charlie");
		// Mapのサイズ
		System.out.println(scores4.size()); //2
		// Mapの全要素を表示
		for(String key : scores4.keySet()) {
			System.out.println(key + ": " + scores4.get(key));
		}
		
		//List
		List<String> names = new ArrayList<>(); // Listの作成
		//要素の追加
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		//要素の取得
		System.out.println(names.get(0)); //Alice
		//要素の削除
		names.remove(1); // Bobを削除
		//リストのサイズ
		System.out.println(names.size()); //2;
		//リストの全体要素を表示
		for(String name : names) {
			System.out.println(name);
		}
	}
}
