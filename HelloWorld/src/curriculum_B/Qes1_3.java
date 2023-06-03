package curriculum_B;
import java.util.Random;
import java.util.Scanner;

class Qes1_3 {
    //	Stringに手を格納
    private static final String[] HANDS = {"グー", "チョキ", "パー"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = "";

        // ユーザー名入力
        System.out.print("ユーザー名を入力してください: ");
        userName = scanner.nextLine();
        // 入力ミス
        if (userName == null || userName.length() <= 0) {
            System.out.println("名前を入力してください");
        } else if (userName.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        } else if (!userName.matches("[a-zA-Z0-9]+")) {
            System.out.println("半角英数字のみで名前を入力してください");
        } else {
            System.out.println("ユーザー名「" + userName + "」を登録しました");
            startRockPaperScissors(userName, scanner);
        }

        scanner.close(); // Scannerオブジェクトを閉じる
    }

    private static void startRockPaperScissors(String userName, Scanner scanner) {
        int totalRounds = 0; // 総回数の変数を初期化
        Random random = new Random();
        boolean continueGame = true; // ゲーム継続フラグを初期化

        do {
            // ユーザーの手の入力
            System.out.print(userName + "の手を選んでください（0:グー, 1:チョキ, 2:パー）: ");
            int userHand = scanner.nextInt(); // ユーザーの手を入力
            scanner.nextLine();

            if (userHand < 0 || userHand > 2) { // 入力値のエラーを防ぐためのチェック
                System.out.println("正しい手を選んでください");
                continue; // 入力が不正な場合は再度入力を促す
            }

            int computerHand = random.nextInt(3); // コンピュータの手をランダムに選択
            System.out.println(userName + "の手は「" + HANDS[userHand] + "」");
            System.out.println("相手の手は「" + HANDS[computerHand] + "」");
            totalRounds++; // 総回数をインクリメント

            if (userHand == computerHand) { // 引き分けの場合
                System.out.println("DRAW あいこ もう一回しましょう！");
            } else if ((userHand == 0 && computerHand == 1) || (userHand == 1 && computerHand == 2)
                    || (userHand == 2 && computerHand == 0)) { // ユーザーの勝ちの場合
                System.out.println("やるやん。次は俺にリベンジさせて");
                continueGame = false; // ゲーム終了フラグをセット
            } else { // ユーザーの負けの場合
                System.out.println("俺の勝ち！");
                if (userHand == 0 && computerHand == 2) {
                    System.out.println("なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
                } else if (userHand == 1 && computerHand == 0) {
                    System.out.println("負けは次につながるチャンスです！ネバーギブアップ！");
                } else {
                    System.out.println("たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");
                }
            }
        } while (continueGame); // ゲーム継続フラグが true の場合は繰り返し

        System.out.println("勝つまでにかかった合計回数は" + totalRounds + "回です");
    }
}