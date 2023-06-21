package curriculum1_22_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Processing {
	
	// 1行目の変数
	private String greeting;
	
	// 2行目の変数
	private String sushiuma;
	
	// 3行目の変数
	private String washoku;
	
	
	// コンストラクターの定義
	public Processing() {
		
		// 1行目の初期値の設定
	    this.greeting = "こんにちは！ここは日本です！";
	    
	    // 2行目の初期値の設定
	    this.sushiuma = "この寿司はうまい";
	    
	    // 3行目の初期値の設定
	    this.washoku = "寿司は和食です";
	    
	    // 出力
	    System.out.println(checkNull(this.greeting));
	    
	    System.out.println(checkNull(this.sushiuma));
	    
	    System.out.println(checkNull(this.washoku));
	    
	    
	    // カレンダーオブジェクトを取得
	    Calendar calendar = Calendar.getInstance();
	    
	    // 日時の書式を指定するフォーマットオブジェクトを作成
	    SimpleDateFormat sdf = new SimpleDateFormat("今の現在日時はyyyy/MM/dd H:m:s");
	    
	  // 現在の日時を指定したフォーマットで出力する
	    System.out.println(checkNull(sdf.format(calendar.getTime())));
	}

	// checkNullメソッド
	private String checkNull(String str) {
		
		// null チェックを行う
	    return str != null ? str : "";
	}

}
