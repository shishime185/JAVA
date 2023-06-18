package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("生徒の人数を入力してください（２以上）：");
		
		// 生徒の人数をユーザーから読み取る
        int numStudents = scanner.nextInt();
        
		int[][] scores = new int[numStudents][4];
		
		for(int i = 0; i < numStudents; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print((i + 1) + "人目の『");
				
				// 教科ごとに表示する科目を切り替える
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
                // 各生徒の各教科の点数を読み取る
                scores[i][j] = scanner.nextInt();
            }
			
            System.out.println();
        }

        for (int i = 0; i < numStudents; i++) {
            // 各生徒の平均点を計算する
            double average = calculateAverage(scores[i]);
            // 各生徒の平均点を表示する
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), average);
        }

        // 各教科の平均点を計算する
        double[] subjectAverages = calculateSubjectAverages(scores);

        System.out.println();
        System.out.printf("英語の平均点は%.2f点です。\n", subjectAverages[0]);
        System.out.printf("数学の平均点は%.2f点です。\n", subjectAverages[1]);
        System.out.printf("理科の平均点は%.2f点です。\n", subjectAverages[2]);
        System.out.printf("社会の平均点は%.2f点です。\n", subjectAverages[3]);

        // 全体の平均点を計算する
        double overallAverage = calculateOverallAverage(scores);
        // 全体の平均点を表示する
        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);

        // Scannerを閉じる
        scanner.close();
    }
    

    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            // 点数の合計を求める
            sum += score;
        }
        // 平均点を計算する
        return (double) sum / scores.length;
    }

    public static double[] calculateSubjectAverages(int[][] scores) {
        // 教科の数を取得する
        int numSubjects = scores[0].length;
        // 各教科の平均点を格納する配列
        double[] averages = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            int sum = 0;
            for (int[] studentScores : scores) {
                // 各教科の点数を合計する
                sum += studentScores[i];
            }
            // 平均点を計算して配列に代入する
            averages[i] = (double) sum / scores.length;
        }
        // 平均点の配列を返す
        return averages;
    }

    public static double calculateOverallAverage(int[][] scores) {
    	int totalSum = 0;
        int numElements = scores.length * scores[0].length;
        
        // 各生徒の各教科の点数を合計する
        for (int[] studentScores : scores) {
            for (int score : studentScores) {
                // 点数の合計を計算する
                totalSum += score;
            }
        }
        // 全体の平均点を計算して返す
        return (double) totalSum / numElements;
    
	}
}