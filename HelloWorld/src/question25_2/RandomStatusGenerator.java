package question25_2;

import java.util.Random;

public class RandomStatusGenerator {

	public SubCharacter generateRandomStatus(String name) {

		// 乱数生成器
		Random random = new Random();

		// 1から1000までの範囲でランダムな値を生成
		int hp = random.nextInt(1000) + 1;

		int mp = random.nextInt(1000) + 1;

		int attack = random.nextInt(1000) + 1;

		int agility = random.nextInt(1000) + 1;

		int defense = random.nextInt(1000) + 1;

		// SubCharacterインスタンスを作成し、ステータスを設定
		SubCharacter subCharacter = new SubCharacter(name, hp, mp, attack, agility, defense);

		// 返す
		return subCharacter;
	}
}