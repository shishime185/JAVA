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


package question11;

class Question11 {

	public static void main(String[] args) {
		int month = 8;

		switch (month) {
//			case文で条件分岐を行う
			case 2:
			System.out.println(month + "月は28日です。");
			break;
//			monthの値が一致した場合case節に続く処理がされる
			case 4:
			case 6:
			case 9:
			case 11:
			System.out.println(month + "月は30日です。");
			break;
//			変数monthに8が代入されている場合、case文に従って、8月は31日です。という文字列が表示される
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
//		条件分岐の処理を終了するためbreak文を使う
	}

}
