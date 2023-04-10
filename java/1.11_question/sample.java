/*
	問題．switch文を使用し、以下のプログラムを作成してください。
			変数に数値を代入
			
		①2の場合は、「（変数）月は28日です。」
			出力結果：2月は28日です。
			
		②4，6，9，11の場合は、「（変数）月は30日です。」
			出力例：4月は30日です。
			
		③その他の場合は、「（変数）月は31日です。」
			出力例：1月は31日です。
*/
package practice_switch.java;

public class sample {

	public static void main(String[] args) {

int month = 4;

switch (month) {

	case 2:
	System.out.println(month + "月は28日です。");
	break;

	case 4:
	case 6:
	case 9:
	case 11:
	System.out.println(month + "月は30日です。");
	break;

	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	System.out.println(month + "月は31日です。");
	break;
}

	}    
}