package question25_2;

public class SubCharacter {

	// フィールドを宣言
	private String name;

	private int hp;

	private int mp;

	private int attack;

	private int agility;

	private int defense;

	// コンストラクタの定義
	public SubCharacter(String name, int hp, int mp, int attack, int agility, int defense) {

		this.name = name;

		this.hp = hp;

		this.mp = mp;

		this.attack = attack;

		this.agility = agility;

		this.defense = defense;
	}

	// ゲッターとセッターの定義

	// 名前を取得するゲッターメソッド
	public String getName() {

		return name;

	}

	// 名前を設定するセッターメソッド
	public void setName(String name) {

		this.name = name;

	}

	// HPを取得するゲッターメソッド
	public int getHp() {

		return hp;

	}

	// HPを設定するセッターメソッド
	public void setHp(int hp) {

		this.hp = hp;

	}

	// MPを取得するゲッターメソッド
	public int getMp() {

		return mp;

	}

	// MPを設定するセッターメソッド
	public void setMp(int mp) {

		this.mp = mp;

	}

	// 攻撃力を取得するゲッターメソッド
	public int getAttack() {
		return attack;
	}

	// 攻撃力を設定するセッターメソッド
	public void setAttack(int attack) {

		this.attack = attack;

	}

	// 敏捷性を取得するゲッターメソッド
	public int getAgility() {

		return agility;

	}

	// 敏捷性を設定するセッターメソッド
	public void setAgility(int agility) {

		this.agility = agility;

	}

	// 防御力を取得するゲッターメソッド
	public int getDefense() {

		return defense;

	}

	// 防御力を設定するセッターメソッド
	public void setDefense(int defense) {

		this.defense = defense;

	}
}