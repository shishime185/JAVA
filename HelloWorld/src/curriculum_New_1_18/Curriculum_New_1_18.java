package curriculum_New_1_18;

import java.util.Random;

class Curriculum_New_1_18 {

	
    // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
    public static void printHelloJavaSE11(String str, int num) {
        System.out.println(str + " " + num); // 文字列と整数をコンソールに表示する
    }

    // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
    public static void multiply(int num1, int num2) {
        int result = num1 * num2; // num1とnum2を乗算
        System.out.println(result); // 乗算答え
    }

    // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
    public static void printArrayElements(int[] arr) {
        for (int num : arr) { // 要素を1つずつ取り出して表示
            System.out.println(num); // コンソールに表示
        }
    }

    // Q4：Q2をオーバーロードして引数を整数2つに変更し、引数同士を和算しコンソールに出力してください。
    public static void add(int num1, int num2) {
        int result = num1 + num2; // num1とnum2を足し算
        System.out.println(result); // コンソールに表示
    }

    // Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
    // 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
    // ※0は出力＆格納しないようにしてください。
    public static int[] generateRandomNumbers(int count) {
        int[] numbers = new int[count]; // ランダムな数値を格納する
        Random random = new Random(); // ランダムな数値を生成
        for (int i = 0; i < count; i++) { // count回ループを実行して、ランダムな数値を生成し配列に格納する
            numbers[i] = random.nextInt(100) + 1; // 1から100までの範囲のランダムな数値を生成
            System.out.println(numbers[i]);
        }
        return numbers; // numbers を戻り値として返し
    }

    // Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
    // ※小数点以下も表示されるようにしてください。
    public static void calculateAverage(int[] arr) {
        int sum = 0; // sum を初期化
        for (int num : arr) { // 配列の要素を合計してsumに加算する
            sum += num; 
        }
        double average = (double) sum / arr.length; // 平均値を計算
        System.out.println(average);
    }

    // Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値の平均値が50以上ならばtrue、それ以外はfalseを返しコンソールに出力してください
    public static boolean isAbove50(int[] arr) {
        int sum = 0; // sum を初期化
        for (int num : arr) { // 配列の要素を合計してsumに加算する
            sum += num;
        }
        double average = (double) sum / arr.length; // 平均値を計算
        boolean result = average >= 50; // 平均値が50以上かどうかを判定
        System.out.println(result); // 結果
        return result;
    }

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
        add(3, 4);

        // Q5
        int[] randomNumbers = generateRandomNumbers(5);

        // Q6
        calculateAverage(randomNumbers);

        // Q7 
        
        isAbove50(randomNumbers);
    }
}
