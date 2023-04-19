package question11;

class Question11 {

	public static void main(String[] args) {
		int month = 8;

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
