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
            	
                System.out.println("ユーザー名「" + userName + "」を登録しました\n");
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
            System.out.println(userName + "の手は「" + HANDS[userHand] + "」");

            // コンピュータの手をランダムに選択
            int computerHand = random.nextInt(3);
            System.out.println("相手の手は「" + HANDS[computerHand] + "」\n");
            // 総回数をインクリメント
            totalRounds++;


            if ((userHand == 1 && computerHand == 0) || (userHand == 2 && computerHand == 1)
            	    || (userHand == 0 && computerHand == 2)) {
            	
            	    // ユーザーが負けの場合
            	    System.out.println("俺の勝ち！");
            	    
            	    if (userHand == 0 && computerHand == 2) {
            	    	
            	        System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
            	        
            	    } else if (userHand == 1 && computerHand == 0) {
            	    	
            	        System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！\n");
            	        
            	    } else {
            	    	
            	        System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");
            	        
            	    }
            	    
            	} else if (userHand == computerHand) {
            		
            	    // 引き分けの場合
            		
            	    System.out.println("DRAW あいこ もう一回しましょう！\n");
            	    
            	} else {
            		
            	    // ユーザーが勝ちの場合
            		
            	    System.out.println("やるやん。");
            	    
            	    System.out.println("次は俺にリベンジさせて\n");
            	    
            	    // ゲーム終了フラグをセット
            	    continueGame = false;
            	    
            	}
            
            // ゲーム継続フラグが true の場合は繰り返し
        } while (continueGame);

        // 出力
        System.out.println("勝つまでにかかった合計回数は" + totalRounds + "回です");
    }
}