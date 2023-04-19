package question15;

class Question15 {

	public static void main(String[] args) {
		// int avg01 = sum01 / japanese.length;
		// int avg02 = sum02 / math.length;
		// int avg03 = sum03 / english.length;

		String name [] = {"生徒１:" ,"生徒２:" ,"生徒３:" ,"生徒４:"};
		int japanese [] = {64 , 58 , 86 , 72};
		int math [] = {73 , 81 , 68 , 55};
		int english [] = {69 , 75 , 79 , 80};

		System.out.println(name[0] + "国語" + japanese[0] + "点、" + "数学" + math[0] + "点、" + "英語" + english[0] + "点");
		System.out.println(name[1] + "国語" + japanese[1] + "点、" + "数学" + math[1] + "点、" + "英語" + english[1] + "点");
		System.out.println(name[2] + "国語" + japanese[2] + "点、" + "数学" + math[2] + "点、" + "英語" + english[2] + "点");
		System.out.println(name[3] + "国語" + japanese[3] + "点、" + "数学" + math[3] + "点、" + "英語" + english[3] + "点");

		int sum01 = 0; //集計結果
		for (int i = 0; i < japanese.length; i++) {
		sum01 += japanese[i]; //変数sumに合算
		}

		int sum02 = 0; //集計結果
		for (int i = 0; i < math.length; i++) {
		sum02 += math[i]; //変数sumに合算
		}
		int sum03 = 0; //集計結果
		for (int i = 0; i < english.length; i++) {
		sum03 += english[i]; //変数sumに合算
		}

		int avg01 = sum01 / japanese.length;
		System.out.println("国語の平均点は" + avg01 + "点です。");

		int avg02 = sum02 / math.length;
		System.out.println("数学の平均点は" + avg02 + "点です。");

		int avg03 = sum03 / english.length;
		System.out.println("英語の平均点は" + avg03 + "点です。");

	}

}
