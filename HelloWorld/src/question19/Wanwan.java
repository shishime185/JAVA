package question19;

public class Wanwan {
	// Q1：フィールドに動物の名前の変数を定義してください。
	//	private修飾子が付けられているため、外部からは直接アクセスできないようになる
	private String name;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	//	静的変数はクラス自体に関連付けられるため、クラスのインスタンスごとに独立した値を持たない
	private static int animalCount;
	
	public static void main(String[] args) {
		// クラスのインスタンス化はここではなく、別の場所で行う必要があります。
		// 例えば、mainメソッド内で新しいWanwanオブジェクトを作成して操作することができます。
		Wanwan dog = new Wanwan();
		
		// Q1で定義したnameフィールドの値を出力します。
//		dog.nameを出力すると「犬」という文字列が表示されます。
		System.out.println(dog.name);
		
		// Q2で定義したanimalCountフィールドの値を出力します。
//		Wanwan.animalCountを出力すると1という値が表示されます。
		System.out.println(Wanwan.animalCount);
	}
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	//	インスタンスが作成されたときに自動的に呼び出される
	public Wanwan() {
		name = "犬";
		animalCount++;
	}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	//	新しいWanwanオブジェクトが作成される際に引数として渡された値をnameフィールドに代入
	public Wanwan(String newName) {
		name = newName;
		animalCount++;
	}
}
