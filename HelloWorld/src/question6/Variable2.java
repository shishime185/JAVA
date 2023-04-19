package question6;

import java.util.Random;

public class Variable2 {

	public static void main(String[] args) {
//		問１）
//		変数 x を宣言し、「3」を代入して下さい。
		int x = 3;
//		変数 x に自己代入を使って「20」を掛け算して下さい。
		x *= 20;
//		その後 x の値をコンソールに表示して下さい。
		 System.out.println("xの値は：" + x);

//		問２）
//		以下のプログラムを作成してください。
//		①int 型の変数 i に 100 を代入する。
		 int i = 100;
//		②インクリメント演算子を適用して数値を 1 増やす。
		 i++;
//		③コンソールに変数 i の値を表示する。
		 System.out.println("変数iの値は：" + i);
//		④デクリメント演算子を適用して数値を 1 減らす。
		 i--;
//		⑤コンソールに変数 i の値を表示する。
		 System.out.println("変数iの値は：" + i);
	        

//		問３）
//		下記の例のような文章をコンソールに出力して下さい。
//		但し、年齢の部分は乱数を使用し実行毎に結果が変わるようにして下さい。
//		※数字は0～100までの間で表示されるようにしてください。
//		例）
//		あなたの年齢を予想します。
//		あなたの年齢はおそらく〇〇歳ですね？
		 
		// 乱数生成器を作成する
	    Random random = new Random();

	    // 0~100の間の乱数を生成する
	    int age = random.nextInt(101);

	    // 生成した乱数を使って文章を作成する
	    String message = "あなたの年齢を予想します。\n" +
	                     "あなたの年齢はおそらく" + age + "歳ですね？";

	    // コンソールに文章を表示する
	    System.out.println(message);
	}

}
