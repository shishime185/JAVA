package curriculum_B;

import java.util.Random;
import java.util.Scanner;

class Qes1_3 {
    // Stringに手を格納
    private static final String[] HANDS = {"グー", "チョキ", "パー"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = "";

        // ユーザー名入力
        boolean validName = false;
        while (!validName) {
            userName = scanner.nextLine();

            // 入力ミスの時
            if (userName == null || userName.length() <= 0) {
                System.out.println("名前を入力してください");
                
            } else if (userName.length() > 10) {
                System.out.println("名前を10文字以内にしてください");
                
            } else if (!userName.matches("[a-zA-Z0-9]+")) {
                System.out.println("半角英数字のみで名前を入力してください");
                
            } else {
                System.out.printf("ユーザー名「%s」を登録しました\n\n", userName);
                startRockPaperScissors(userName, scanner);
                validName = true;
            }
        }

        // Scannerオブジェクトを閉じる
        scanner.close();
    }

    private static void startRockPaperScissors(String userName, Scanner scanner) {
    	
        // 総回数の変数を初期化
        int totalRounds = 0;
        Random random = new Random();
        // ゲーム継続フラグを初期化
        boolean continueGame = true;

        do {
            // ユーザーの手をランダムに選択
            int userHand = random.nextInt(3);
            System.out.printf("%sの手は「%s」\n", userName, HANDS[userHand]);

            // コンピュータの手をランダムに選択
            int computerHand = random.nextInt(3);
            System.out.printf("相手の手は「%s」\n\n", HANDS[computerHand]);

            // 総回数をインクリメント
            totalRounds++;

            // 引き分けの場合
            if (userHand == computerHand) {
                System.out.println("DRAW あいこ もう一回しましょう！\n");
            } else {
                // 勝利条件を判定
                boolean isWin = (userHand == 0 && computerHand == 1) ||
                                (userHand == 1 && computerHand == 2) ||
                                (userHand == 2 && computerHand == 0);

                if (isWin) {
                    System.out.println("やるやん。");
                    System.out.println("次は俺にリベンジさせて\n");
                    continueGame = false;
                    
                } else {
                    System.out.println("俺の勝ち！");
                    if (userHand == 0 && computerHand == 2) {
                        System.out.println("なんで負けたか、明日まで考えといてください。");
                        System.out.println("そしたら何かが見えてくるはずです\n");
                        
                    } else if (userHand == 1 && computerHand == 0) {
                        System.out.println("負けは次につながるチャンスです！");
                        System.out.println("ネバーギブアップ！\n");
                        
                    } else {
                        System.out.println("たかがじゃんけん、そう思ってないですか？");
                        System.out.println("それやったら次も、俺が勝ちますよ\n");
                    }
                }
            }
        } while (continueGame);

        // 出力
        System.out.printf("勝つまでにかかった合計回数は%d回です\n", totalRounds);
    }
}