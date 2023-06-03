package curriculum_B;
import java.util.Scanner;

public class Qes7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ユーザーの入力を読み取るためのScannerオブジェクトを作成

        System.out.print("生徒の人数を入力してください（2以上）: ");
        int numStudents = scanner.nextInt(); // 生徒の人数をユーザーから読み取る

        int[][] scores = new int[numStudents][4]; // 4つの教科の各生徒の点数を格納する2次元配列を作成

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
                scores[i][j] = scanner.nextInt(); // 各生徒の各教科の点数を読み取る
            }
        }

        System.out.println();

        for (int i = 0; i < numStudents; i++) {
            double average = calculateAverage(scores[i]); // 各生徒の平均点を計算する
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), average); // 各生徒の平均点を表示する
        }

        double[] subjectAverages = calculateSubjectAverages(scores); // 各教科の平均点を計算する
        System.out.println();
        System.out.println("各教科の平均点は以下の通りです：");
        System.out.printf("英語の平均点は%.2f点です。\n", subjectAverages[0]); // 英語の平均点を表示する
        System.out.printf("数学の平均点は%.2f点です。\n", subjectAverages[1]); // 数学の平均点を表示する
        System.out.printf("理科の平均点は%.2f点です。\n", subjectAverages[2]); // 理科の平均点を表示する
        System.out.printf("社会の平均点は%.2f点です。\n", subjectAverages[3]); // 社会の平均点を表示する

        double overallAverage = calculateOverallAverage(scores); // 全体の平均点を計算する
        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage); // 全体の平均点を表示する

        scanner.close(); // Scanner閉じる
    }

    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score; // 点数の合計を求める
        }
        return (double) sum / scores.length; // 平均点を計算する
    }

    public static double[] calculateSubjectAverages(int[][] scores) {
        int numSubjects = scores[0].length; // 教科の数を取得する
        double[] averages = new double[numSubjects]; // 各教科の平均点を格納する配列
        for (int i = 0; i < numSubjects; i++) {
            int sum = 0;
            for (int[] studentScores : scores) {
                sum += studentScores[i]; // 各教科の点数を合計する
            }
            averages[i] = (double) sum / scores.length; // 平均点を計算して配列に代入する
        }
        return averages; // 平均点の配列を返す
    }

    public static double calculateOverallAverage(int[][] scores) {
        int totalSum = 0;
        int numElements = scores.length * scores[0].length;
        for (int[] studentScores : scores) {
            for (int score : studentScores) {
                totalSum += score; // 点数の合計を計算する
            }
        }
        return (double) totalSum / numElements; // 全体の平均点を計算して返す
    }
}