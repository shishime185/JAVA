package curriculum_B;
//必要なクラスとインターフェースをインポート
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
public class Qes6 {

	public static void main(String[] args) {
		// 商品の残り台数を管理するマップ
//		商品名と残りの台数を関連付ける
		Map<String, Integer> stock = new HashMap<>();
        stock.put("パソコン", getRandomStock());
        stock.put("冷蔵庫", getRandomStock());
        stock.put("扇風機", getRandomStock());
        stock.put("洗濯機", getRandomStock());
        stock.put("加湿器", getRandomStock());
        stock.put("テレビ", getRandomStock());
        stock.put("ディスプレイ", getRandomStock());
        
//      商品名を入力するように促し、入力された文字列をカンマで区切って商品名の配列に分割
        Scanner scanner = new Scanner(System.in);
        System.out.println("商品名を入力してください（複数の商品はカンマで区切って入力）:");
        String input = scanner.nextLine();
        String[] products = input.split("、");
        
//      入力された商品名の配列を反復処理します。
        for (String product : products) {
//        	stockマップから指定された商品名に対応する残りの台数を取得
            int remainingStock = stock.getOrDefault(product, -1);
//          remainingStockが0未満の場合、指定された商品名を含むエラーメッセージをoutput変数に格納
            String output = remainingStock >= 0 ? product + "の残り台数は" + remainingStock + "台です" : "『" + product + "』は指定の商品ではありません";
            System.out.println(output);
        }
    }
//	getRandomStockという名前のプライベートメソッドを定義
//	このメソッドは、0から11までのランダムな整数を返す
    private static int getRandomStock() {
        Random random = new Random();
//      0から11までのランダムな整数を生成
        return random.nextInt(12);
	}

}
