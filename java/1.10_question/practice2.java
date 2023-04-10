/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
				*/
package practice_for.java;

public class practice2 {

	public static void main(String[] args) {

int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				int kuku = num[i] * num[j];
				System.out.println(num[i] + "X" + num[j] + "=" + kuku);
			}
		}

	}
}
