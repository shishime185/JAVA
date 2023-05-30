package curriculum_New_1_18;

import java.util.Random;

class Curriculum_New_1_18 {

	
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
//	    与えられた文字列と整数を受け取り、それらを連結して出力
		public static void printHelloJavaSE11(String str, int num) {
        System.out.println(str + " " + num);
    }
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
//		multiplyメソッドは、2つの整数を受け取り、それらの積を計算して出力します。この場合、5と6の積を計算し、結果である30を出力
		public static void multiply(int num1, int num2) {
	        int result = num1 * num2;
	        System.out.println(result);
	    }
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
//		配列numbersには{1, 2, 3, 4, 5}が含まれており、それぞれの要素が順番に表示
		public static void printArrayElements(int[] arr) {
	        for (int num : arr) {
	            System.out.println(num);
	        }
	    }

		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
//		addメソッドは、2つの浮動小数点数を受け取る
		public static void add(float num1, float num2) {
//			1.5と2.8の合計を計算し、結果である4.3を出力
	        float result = num1 + num2;
	        System.out.println(result);
	    }
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
//		指定された数のランダムな整数の配列を生成
		 public static int[] generateRandomNumbers(int count) {
		        int[] numbers = new int[count];
		        Random random = new Random();
		        for (int i = 0; i < count; i++) {
//		        	count引数は生成する乱数の数を指定します。生成された乱数は1から100までの範囲であり、それぞれの乱数が表示
		            numbers[i] = random.nextInt(100) + 1;
		            System.out.println(numbers[i]);
		        }
		        return numbers;
		    }
		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
//		 整数の配列を受け取り、配列の要素の平均値を計算して表示
		 public static void calculateAverage(int[] arr) {
		        int sum = 0;
		        for (int num : arr) {
		            sum += num;
		        }
//		        配列の長さで割って平均値を求める。その平均値が表示
		        double average = (double) sum / arr.length;
		        System.out.println(average);
		    }
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
//		 配列の要素の平均値が50以上かどうかを判定する
		 public static boolean isAbove50(int[] arr) {
		        int sum = 0;
		        for (int num : arr) {
		            sum += num;
		        }
//		        配列の要素の合計を計算し、配列の長さで割って平均値を求める
		        double average = (double) sum / arr.length;
//		        平均値が50以上であればtrueを、そうでなければfalseを表示
		        boolean result = average >= 50;
		        System.out.println(result);
		        return result;
		    }
		 
//		mainメソッドでは、上記の各メソッドを適切な引数を指定して呼び出しています。
		public static void main(String[] args) {
	    // 作成したメソッドをここで呼び出してください
			
        // Q1
	    printHelloJavaSE11("Hello JavaSE", 11);

	    // Q2
	    multiply(5, 6);

	    // Q3
	    int[] numbers = { 1, 2, 3, 4, 5 };
	    printArrayElements(numbers);

	    // Q4
	    add(1.5f, 2.8f);

	    // Q5
	    int[] randomNumbers = generateRandomNumbers(5);

	    // Q6
	    calculateAverage(randomNumbers);

	    // Q7
	    isAbove50(randomNumbers);
	}

}
