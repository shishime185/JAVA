/*
	①配列aを作成し、1～5を格納してください。
	
	②参照型配列bを作成し、3を表示してください。
		出力結果：3
		
	③配列a[3]を10で上書きし表示してください。
		出力結果：10
		
	④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
		出力結果：配列aの要素数は、５です。
*/

package question13;

public class question13_2 {

	public static void main(String[] args) {
//		1から5までの値を代入
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = a;
//		b[0]を3に変更すると、a[0]も3に変更される
		b[0] = 3;
		System.out.println(a[0]);
//		a[2]を10に変更
		a[2] = 10;
		System.out.println(a[2]);

		System.out.println("配列aの要素数は、" + a[4] + "です。");
	}

}
