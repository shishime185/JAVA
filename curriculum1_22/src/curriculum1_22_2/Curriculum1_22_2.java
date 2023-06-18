package curriculum1_22_2;

//SimpleDateFormatをインポート
import java.text.SimpleDateFormat;
//Calendarクラスをインポート
import java.util.Calendar;

public class Curriculum1_22_2 {

	// 1行目の変数
	private String greeting;

	// 2行目の変数
	private String sushi;

	// 3行目の変数
	private String cuisine;

	// コンストラクターの定義
	public Curriculum1_22_2() {

		// 1行目の初期値の設定
		this.greeting = "こんにちは！ここは日本です！";

		// 2行目の初期値の設定
		this.sushi = "この寿司はうまい";

		// 3行目の初期値の設定
		this.cuisine = "寿司は和食です";

		// 出力
		System.out.println(this.greeting);

		// 出力
		System.out.println(this.sushi);

		// 出力
		System.out.println(this.cuisine);

		// カレンダーオブジェクトの生成
		Calendar calendar = Calendar.getInstance();

		// フォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("今の現在日時はyyyy/MM/dd H:m:s");

		// 出力
		System.out.println(sdf.format(calendar.getTime()));

	}

}
