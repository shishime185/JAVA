package datetype_change7;

class Datetype_change7 {

	public static void main(String[] args) {
		// 問１）
		// 以下のプログラムを作成してください。
		// ①int型変数 i に 3 を代入する。
		// ②double型変数 d に i を代入する。
		// ③変数 i と変数 d の値をそれぞれコンソールに表示する。
		int i = 3;
		double d = i;
		System.out.println("i = " + i);
		System.out.println("d = " + d);

		// 問２）
		// 以下のプログラムを作成してください。
		// ①double型変数 pi に数値「3.14」を代入して下さい。
		double pi = 3.14;
		// ②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
		System.out.println("pi * 3 = " + (pi * 3));
		// ④int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。
		int integer = (int) pi;
		System.out.println("integer = " + integer);

		// 問３）
		// ①double型の変数を定義し、「2 + 6.0」を代入して下さい。
		double a = 2 + 6.0;
		// double型の変数をコンソールに出力して下さい。
		System.out.println("a = " + a);
		// ②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
		// int型の変数をコンソールに出力して下さい。
		int b = (int) a;
		System.out.println("b = " + b);
		// ③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
		// String型の変数をコンソールに出力して下さい。
//		String.valueOf() メソッドは、様々なデータ型の変数を文字列に変換する際に便利なメソッド
		String str = String.valueOf(b);
		System.out.println("str = " + str);
		// ④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
		// int型の変数をコンソールに出力して下さい。
		//Integer.parseInt() メソッドは、文字列を整数値に変換する際に便利なメソッド
		//同様のメソッドとして、Double.parseDouble() や Long.parseLong() など、浮動小数点数や長整数などのデータ型に変換するためのメソッドも存在する。
		int c = Integer.parseInt(str);
		System.out.println("c = " + c);

	}

}
