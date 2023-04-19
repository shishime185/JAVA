/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
 ※数値は毎回変わるように作ってください
 
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

import java.util.Random;
import java.util.Scanner;

class Question25 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("名前を入力してください: ");
	    String name = scanner.nextLine();
	    scanner.close();

	    Random rand = new Random();
	    int hp = rand.nextInt(1000) + 500;
	    int mp = rand.nextInt(1000) + 500;
	    int attack = rand.nextInt(500) + 250;
	    int agility = rand.nextInt(1000) + 500;
	    int defense = rand.nextInt(50) + 10;

	    System.out.println("こんにちは " + name + " さん");
	    System.out.println("ステータス");
	    System.out.println("HP：" + hp);
	    System.out.println("MP：" + mp);
	    System.out.println("攻撃力：" + attack);
	    System.out.println("素早さ：" + agility);
	    System.out.println("防御力：" + defense);
	    System.out.println("さあ冒険に出かけよう！");

	}

}
