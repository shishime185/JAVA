package question13;

public class question13_2 {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = a;
		b[0] = 3;
		System.out.println(a[0]);

		a[2] = 10;
		System.out.println(a[2]);

		System.out.println("配列aの要素数は、" + a[4] + "です。");
	}

}
