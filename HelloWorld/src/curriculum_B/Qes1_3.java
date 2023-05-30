package curriculum_B;
//RandomとScannerクラスをインポートしています。
import java.util.Random;
import java.util.Scanner;
class Qes1_3 {
	
	public static void main(String[] args) {
//		Scannerクラスのインスタンスを作成し、キーボードからの入力を受け取るための準備をします。
	        Scanner scanner = new Scanner(System.in);
	        String userName = "";
//	        userNameという名前の空の文字列と、isValidという名前のboolean変数を宣言します。
	        boolean isValid = false;

//	        ユーザーに対して「ユーザー名を入力してください」と表示し、入力された文字列をuserName変数に代入します。
	        System.out.print("ユーザー名を入力してください: ");
	        userName = scanner.nextLine();
	        
//	        userNameがnullまたは長さが0以下である場合は、「名前を入力してください」と表示
	        if (userName == null || userName.length() <= 0) {
	            System.out.println("名前を入力してください");
//	        userNameの長さが10を超える場合は、「名前を10文字以内にしてください」と表示
	        } else if (userName.length() > 10) {
	            System.out.println("名前を10文字以内にしてください");
//	        userNameが半角英数字のみで構成されていない場合は、「半角英数字のみで名前を入力してください」と表示
	        } else if (!userName.matches("[a-zA-Z0-9]+")) {
	            System.out.println("半角英数字のみで名前を入力してください");
//	        条件を満たさない場合は、ユーザー名を登録し、「startRockPaperScissors」メソッドを呼び出してじゃんけんのシステムを起動
	        } else {
	            System.out.println("ユーザー名「" + userName + "」を登録しました");
	            startRockPaperScissors(userName); // じゃんけんのシステムを起動
	        }
	        }

	        private static void startRockPaperScissors(String userName) {
//	        	0で初期化します。これは、じゃんけんの合計ラウンド数を追跡するための変数
	            int totalRounds = 0;
//	            Randomクラスのインスタンスを作成し、ランダムな数値を生成するための準備
	            Random random = new Random();
//	            Scannerクラスのインスタンスを作成し、キーボードからの入力を受け取るための準備
	            Scanner scanner = new Scanner(System.in);

	            while (true) {
	                System.out.print(userName + "の手を選んでください（0:グー, 1:チョキ, 2:パー）: ");
	                int userHand = scanner.nextInt();
	                scanner.nextLine(); // 改行読み捨て
//	                0、1、2のいずれでもない場合は、「正しい手を選んでください」と表示
	                if (userHand < 0 || userHand > 2) {
	                    System.out.println("正しい手を選んでください");
	                    continue; // 正しい手が選ばれるまでループを継続
	                }

	                int computerHand = random.nextInt(3);
//	                random.nextInt(3)メソッドを使用して、0から2までのランダムな整数を生成し、computerHand変数に代入します。
//	                これは、コンピューターの手を表示
	                System.out.println(userName + "の手は「" + getHandString(userHand) + "」");
	                System.out.println("相手の手は「" + getHandString(computerHand) + "」");
	                totalRounds++;
	                
//	                ユーザーとコンピューターが同じ手を選んだ場合は、「DRAW あいこ もう一回しましょう！」と表示
	                if (userHand == computerHand) {
	                    System.out.println("DRAW あいこ もう一回しましょう！");
//	                ユーザーが勝った場合は、「やるやん。次は俺にリベンジさせて」と表示し、ループを終了します（break文）。
	                } else if ((userHand == 0 && computerHand == 1) || (userHand == 1 && computerHand == 2)
	                        || (userHand == 2 && computerHand == 0)) {
	                    System.out.println("やるやん。次は俺にリベンジさせて");
	                    break; // 勝利の場合はループを終了
	                    
//	                    最後に、ユーザーが負けた場合は、「俺の勝ち！」と表示します。
//	                    さらに、ユーザーがグー（0）を選んでコンピューターがパー（2）を選んだ場合は、「なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです」と表示します。
//	                    ユーザーがチョキ（1）を選んでコンピューターがグー（0）を選んだ場合は、「負けは次につながるチャンスです！ネバーギブアップ！」と表示します。
//	                    ユーザーがパー（2）を選んでコンピューターがチョキ（1）を選んだ場合は、「たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ」と表示します。
	                } else {
	                    System.out.println("俺の勝ち！");
	                    if (userHand == 0 && computerHand == 2) {
	                        System.out.println("なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
	                    } else if (userHand == 1 && computerHand == 0) {
	                        System.out.println("俺の勝ち！");
	                        System.out.println("負けは次につながるチャンスです！ネバーギブアップ！");
	                    } else if (userHand == 2 && computerHand == 1) {
	                        System.out.println("俺の勝ち！");
	                        System.out.println("たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");
	                    }
	        }
	        }
//	            ユーザーが勝つまでにかかった合計のラウンド数を表示
	            System.out.println("勝つまでにかかった合計回数は" + totalRounds + "回です");
	        }
//	        整数値に対応するじゃんけんの手を文字列として返すために使用されます。
//	        handという引数を受け取り、switch文を使用して対応する手の文字列を返す。
	        private static String getHandString(int hand) {
	            switch (hand) {
	                case 0:
	                    return "グー";
	                case 1:
	                    return "チョキ";
	                case 2:
	                    return "パー";
	                default:
	                    return "";
	            }
	        
	    }
	}
