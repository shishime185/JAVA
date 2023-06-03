package question19;

public class Dog {

    // Q1: フィールドに動物の名前の変数を定義してください。
	// 動物の名前の変数を定義
    String animalName;

    // Q2: フィールドに動物の数の変数を定義してください。
    // 動物の数の変数を定義
    int animalCount;

    // Q3: Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
    // コンストラクタ生成
    Dog(String name) {

        // nameをanimalNameに代入
        animalName = name;
    }

    // メソッド名
    void printAnimalName() {

        // コンソールに出力
        System.out.println(animalName);
    }

    // Q4: Q2で作成した変数に引数を代入するコンストラクタを作成してください。
    // コンストラクタ生成
    Dog(int count) {

        // countをanimalCountに代入
        animalCount = count;
    }

    // メソッド名
    void printAnimalCount() {

        // コンソールに出力
        System.out.println(animalCount);
    }
}