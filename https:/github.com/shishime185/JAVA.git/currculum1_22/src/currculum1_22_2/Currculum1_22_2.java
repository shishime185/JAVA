package currculum1_22_2;

//SimpleDateFormatをインポート
import java.text.SimpleDateFormat;
//Calendarクラスをインポート
import java.util.Calendar;

public class Currculum1_22_2 {

	// 1行目の変数
	String greeting;

	// 2行目の変数
	String sushi;

	// 3行目の変数
	String cuisine;

	// コンストラクターの定義
	public Currculum1_22_2() {

		// 1行目の初期値の設定
		this.greeting = "こんにちは！ここは日本です！";

		// 2行目の初期値の設定
		this.sushi = "この寿司はうまい";

		// 3行目の初期値の設定
		this.cuisine = "寿司は和食です";

		// this.greetingを表示
		System.out.println(this.greeting);

		// this.sushiを表示
		System.out.println(this.sushi);

		// this.cuisineを表示
		System.out.println(this.cuisine);

		// カレンダーオブジェクトの生成
		Calendar calendar = Calendar.getInstance();

		// SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("今の現在日時はyyyy/MM/dd H:m:s");

		// 出力
		System.out.println(sdf.format(calendar.getTime()));

	}

}
