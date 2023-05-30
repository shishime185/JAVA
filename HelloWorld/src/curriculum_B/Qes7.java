package curriculum_B;
import java.util.Scanner;
public class Qes7 {

	public static void main(String[] args) {
//		ユーザーの入力を読み取るために使用
		Scanner scanner = new Scanner(System.in);

//		生徒の人数を入力してください（2以上）: " というメッセージが表示
        System.out.print("生徒の人数を入力してください（2以上）: ");
        int numStudents = scanner.nextInt();

//      これは各生徒の 4 つの教科の点数を格納するための配列
        int[][] scores = new int[numStudents][4]; // 4つの教科の点数を格納する2次元配列
        
//      i は生徒の番号を表しており、i + 1 で表示する生徒番号を計算
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "人目の成績を入力してください：");
            for (int j = 0; j < 4; j++) {
                System.out.print((i + 1) + "人目の『");
                switch (j) {
                    case 0:
                        System.out.print("英語");
                        break;
                    case 1:
                        System.out.print("数学");
                        break;
                    case 2:
                        System.out.print("理科");
                        break;
                    case 3:
                        System.out.print("社会");
                        break;
                }
                System.out.print("』の点数を入力してください: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < numStudents; i++) {
//          calculateAverage メソッドを使用して、scores[i]（i番目の生徒の点数）の平均を計算
            double average = calculateAverage(scores[i]);
//          %d は整数を、%.2f は小数点以下2桁までの浮動小数点数を表示するフォーマット指定子
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), average);
        }
        
//      calculateSubjectAverages メソッドを使用して各教科の平均点を計算し、subjectAverages 配列に格納
//      calculateOverallAverage メソッドを使用して全体の平均点を計算します。
//      "全体の平均点は" というメッセージが表示されます。
//      計算された全体の平均点が表示されます。
        double[] subjectAverages = calculateSubjectAverages(scores);
        System.out.println();
        System.out.println("各教科の平均点は以下の通りです：");
        System.out.printf("英語の平均点は%.2f点です。\n", subjectAverages[0]);
        System.out.printf("数学の平均点は%.2f点です。\n", subjectAverages[1]);
        System.out.printf("理科の平均点は%.2f点です。\n", subjectAverages[2]);
        System.out.printf("社会の平均点は%.2f点です。\n", subjectAverages[3]);
        
//      "全体の平均点は" というメッセージが表示されます。
//      計算された全体の平均点が表示されます。
        double overallAverage = calculateOverallAverage(scores);
        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
    }

    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
//        	scores 配列の各要素を score として取り出し、それぞれの値を sum に加算
//        	sum を scores 配列の要素数で割り、平均値を計算
            sum += score;
        }
//      (double) はキャスト演算子であり、整数の割り算結果を浮動小数点数に変換
        return (double) sum / scores.length;
    }
//    calculateSubjectAverages メソッドは、与えられた2次元配列の各教科の平均値を計算し、結果を averages 配列として返す
    public static double[] calculateSubjectAverages(int[][] scores) {
//    	教科の数を取得
        int numSubjects = scores[0].length;
//      各教科の平均値を格納するための配列
        double[] averages = new double[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            int sum = 0;
            for (int[] studentScores : scores) {
//              studentScores[i] で取得し、sum に加算
                sum += studentScores[i];
            }
//          sum を生徒の人数で割り、平均値を計算
            averages[i] = (double) sum / scores.length;
        }
//      averages 配列の対応する要素に平均値を代入
        return averages;
    }

    public static double calculateOverallAverage(int[][] scores) {
        int totalSum = 0;
        int numElements = scores.length * scores[0].length;
//      scores 配列内の各生徒の点数を取得し、全体の合計値を計算
//      studentScores には scores 配列の各行が代入
        for (int[] studentScores : scores) {
//        	score には studentScores 内の各要素（各教科の点数）を代入
            for (int score : studentScores) {
//            	それぞれを totalSum に加算
            	totalSum += score;
            }
            }
//          totalSum を numElements（全体の要素数）で割り、全体の平均値を計算
//          (double) はキャスト演算子であり、整数の割り算結果を浮動小数点数に変換
            return (double) totalSum / numElements;
           
	}

}
