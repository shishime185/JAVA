package New_1_4_question_2023_04_02;

public class Curriculum_New_question {
	// Q1 下記9個をクラス変数として宣言のみしてください
    //		・バイト型・短整数型・整数型・長整数型
    // 	・単精度浮動小数点数型・倍精度浮動小数点数型
    //   	・文字型・文字列型
    //	 	・ブーリアン型 

	 //  バイト型 (byte)
	 static byte byteVal;
	 //  短整数型 (short)
	 static short shortVal;
	 //  整数型 (int)
	 static int intVal;
	 //  長整数型 (long)
	 static long longVal;
	 //  単精度浮動小数点数型 (float)
	 static float floatVal;
	 //  倍精度浮動小数点数型 (double)
	 static double doubleVal;
	 //  文字型 (char)
	 static char charVal;
	 //  文字列型 (String)
	 static String strVal;
  //  ブーリアン型 (boolean)
	 static boolean boolVal;

public static void main(String[] args) {
	 
	 
    // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
	  byteVal = 0;
   shortVal = 0;
   intVal = 0;
   longVal = 0L;
   floatVal = 0.0f;
   doubleVal = 0.0;
   charVal = '\u0000';
   strVal = "";
   boolVal = false;


    // Q3 初期化をしたそれぞれの変数に下記の値を代入してください

    // ・バイト型                 10
    // ・短整数型                 100
    // ・整数型                	 1000
    // ・長整数型                 10000
    // ・単精度浮動小数点数型   	 9.5
    // ・倍精度浮動小数点数型		 10.5
    // ・文字型                   a
    // ・文字列型              	 ハロー
    // ・ブーリアン型          	 true
		 byteVal = 10;
		 shortVal = 100;
		 intVal = 1000;
		 longVal = 10000L;
		 floatVal = 9.5f;
		 doubleVal = 10.5;
		 charVal = 'a';
		 strVal = "ハロー";
		 boolVal = true;


    // Q4 下記の通りにコンソール出力されるようにしてください
    // 必ず変数を使用すること

    // 11110
    // 20.0
    // a ハロー true
    // 11130.0                    数字を全て足す
    // 10000000000                小数点以外の数字を全てかける
    // 0.105                      10.5割る100をする
    // -90                        10引く100をする

	 // 11110になるように計算
		 System.out.println(byteVal + shortVal + intVal + longVal);

		 // 20.0になるように足し算
		 System.out.println(doubleVal + floatVal);

		 // a ハロー true
		 System.out.println(charVal + " " + strVal + " " + boolVal);

		 // 11130.0 数字を全て足す
		 System.out.println(byteVal + shortVal + intVal + longVal + floatVal + (float) doubleVal);

		 // 10000000000 小数点以外の数字を全てかける
		 System.out.println((long) byteVal * shortVal * intVal * longVal);

		 // 0.105 10.5割る100をする
		 System.out.println(doubleVal / 100.0);

		 // -90 10引く100をする
		 System.out.println(byteVal - shortVal);

		 
	// Q5 
	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
	  String num = "20";
   int num1 = 23;
			// 数値で表示させるためにInteger.parseIntをつける。
   System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
	 
}

}
