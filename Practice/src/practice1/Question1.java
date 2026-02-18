package practice1;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//for文
		for (int i = 1; i < 10; i++){ // (初期化式; 条件式; 変化式)
			System.out.println(i); // iが10より小さい場合に繰り返し実行する処理
		}
		
		//反復処理の制御（break文とcontinue文）
		//break文
		String[] strArray = { "a", "i", "u", "e", "o", "a", "i" };
		String str = "a";
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(str)) {
			System.out.println(str + "のインデックス番号 = " + i); //0のみ
			break;
			}		
		}
		
		//continue文
		str = "a";
		for (int i = 0; i < strArray.length; i++) {
			if (!strArray[i].equals(str)) {
				continue;
			}
			System.out.println(str + "のインデックス番号 = " + i); //0,5
		}
		
		//拡張for文
		String name[] = {"A","B","C"};
		for (String str2: name) { //データ型 変数名: コレクション)
			System.out.println(str2);
		}
		
		//while文
		int num = 1;
		while(num < 5) { //(num < 1)とした場合、繰り返し処理は一回も行われない
			System.out.println(num);
			num++;
		}
		
		//無限ループ
		num = 1;
		while(true) {
			System.out.println("num = " + num);
			num *= 2;
			if(num > 10) {
				break;
			}
		}
		
		//do-while文
		num = 0;
		do {
			System.out.println(num);
			num--;
		}while(num > 0); //numの宣言が[int num = 0;]だったとしても１回は繰り返し処理が行われる。
	}

}
