package question10;

class Question10 {

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
