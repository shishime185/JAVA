package question25_2;

// 親クラスを継承するサブクラスの宣言
public class SubCharacter extends Question25_2 {
	// コンストラクタの定義
    public SubCharacter(String name) {
    	// 親クラスのコンストラクタ呼び出し引数を渡す。
        super(name); 
    }
}