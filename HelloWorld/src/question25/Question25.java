/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください
 
	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */

/*
名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
		サブクラスを使用してください
		スーパークラスを使用してください
		getterとsetterを使用してください
		packageを2つ作ってメインと処理を分けてください
		命名する場合は規則にのっとってください
		コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
*/

package question25;

import java.util.Scanner;

import question25_2.RandomStatusGenerator;
import question25_2.SubCharacter;

public class Question25 {

	public static void main(String[] args) {

		// ユーザーに名前の入力を求める
		Scanner scanner = new Scanner(System.in);

		System.out.print("名前を入力してください: ");

		String name = scanner.nextLine();

		// RandomStatusGeneratorクラスのインスタンスを作成し、ステータスを生成
		RandomStatusGenerator generator = new RandomStatusGenerator();

		SubCharacter subCharacter = generator.generateRandomStatus(name);

		// 挨拶とステータス出力

		// nullチェック
		if (subCharacter != null) {

			System.out.println("こんにちは、" + subCharacter.getName() + "さん");

			System.out.println("ステータス");

			System.out.println("HP: " + subCharacter.getHp());

			System.out.println("MP: " + subCharacter.getMp());

			System.out.println("攻撃力: " + subCharacter.getAttack());

			System.out.println("素早さ: " + subCharacter.getAgility());

			System.out.println("防御力: " + subCharacter.getDefense());

		}

		// 出力
		System.out.println("さあ冒険に出かけよう！");

		// Scannerを閉じる
		scanner.close();
	}
}