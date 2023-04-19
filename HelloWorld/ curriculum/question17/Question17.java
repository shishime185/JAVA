package question17;

import java.util.Random;

class Question17 {

	public static void main(String[] args) {
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
		helloJava();
		// Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
		int num = 5;
  int result = addOne(num);
  System.out.println("Result of addOne(" + num + "): " + result);
 
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		int x = 3;
  int y = 4;
  int product = multiply(x, y);
  System.out.println("Result of multiply(" + x + ", " + y + "): " + product);
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		double a = 2.5;
  double b = 1.5;
  double product2 = multiply(a, b);
  System.out.println("Result of multiply(" + a + ", " + b + "): " + product2);
  
		
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）
		//     を呼び出して、ループ文を用いてそれぞれの数をコンソールに出力してください。
		int count = 5;
  int[] numbers = getRandomNumbers(count);
  for (int i = 0; i < numbers.length; i++) {
   System.out.println("Number " + (i+1) + ": " + numbers[i]);
  }
  
		
		// Q6：Q5で作成した関数を用いて、配列の要素の平均値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		double average = getAverageRandomNumbers(count);
  System.out.println("Average of " + count + " random numbers: " + average);
 }

	
	
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void helloJava() {
		System.out.println("Hello Java");
	 }
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	public static int addOne(int num) {
		return num + 1;
	}
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	public static int multiply(int x, int y) {
		return x * y;
	 }
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	public static double multiply(double a, double b) {
		return a * b;
	 }
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	public static int[] getRandomNumbers(int count) {
		Random rand = new Random();
		int[] numbers = new int[count];
		for (int i = 0; i < count; i++) {
		 numbers[i] = rand.nextInt(100) + 1;
		}
		return numbers;
	 }
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
	public static double getAverageRandomNumbers(int count) {
		int[] numbers = getRandomNumbers(count);
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
		 sum += numbers[i];
		}
		return (double) sum / count;

	}

}
