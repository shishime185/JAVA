package question25_2;

import java.util.Random;

public class Question25_2 {
	// ステータス
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int agility;
    private int defense;

    public Question25_2(String name) {
    	// コンストラクタで名前を設定
        this.name = name;
    }

    public String getName() {
    	// 名前ゲッターメソッド
        return name;
    }

    public int getHp() {
    	// 体力ゲッターメソッド
        return hp; 
    }

    public void setHp(int hp) {
    	// 体力セッターメソッド
        this.hp = hp;
    }

    public int getMp() {
    	// 魔力ゲッターメソッド
        return mp;
    }

    public void setMp(int mp) {
    	// 魔力セッターメソッド
        this.mp = mp;
    }

    public int getAttack() {
    	// 攻撃力ゲッターメソッド
        return attack;
    }

    public void setAttack(int attack) {
    	// 攻撃力セッターメソッド
        this.attack = attack;
    }

    public int getAgility() {
    	// 素早さゲッターメソッド
        return agility;
    }

    public void setAgility(int agility) {
    	// 素早さセッターメソッド
        this.agility = agility;
    }

    public int getDefense() {
    	// 防御力ゲッターメソッド
        return defense;
    }

    public void setDefense(int defense) {
    	// 防御力セッターメソッド
        this.defense = defense;
    }
    
    // ランダムステータス生成（メソッド）
    public void generateRandomStatus() {


    // 乱数生成器
    Random random = new Random();
        
    // 1から1000までの範囲でランダムな値を生成
    hp = random.nextInt(1000) + 1;
    mp = random.nextInt(1000) + 1;
    attack = random.nextInt(1000) + 1; 
    agility = random.nextInt(1000) + 1;
    defense = random.nextInt(1000) + 1;
    
   }
}