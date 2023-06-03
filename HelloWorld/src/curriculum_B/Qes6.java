package curriculum_B;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>(); // 商品と在庫数を管理するHashMapの作成
        // 商品名とランダムな在庫数を追加
        stock.put("パソコン", getRandomStock());
        stock.put("冷蔵庫", getRandomStock());
        stock.put("扇風機", getRandomStock());
        stock.put("洗濯機", getRandomStock());
        stock.put("加湿器", getRandomStock());
        stock.put("テレビ", getRandomStock());
        stock.put("ディスプレイ", getRandomStock());

        Scanner scanner = new Scanner(System.in); // ユーザーの入力を受け取るScanner
        System.out.println("商品名を入力してください（複数の商品はカンマで区切って入力）:"); // ユーザーに商品名の入力を求める
        String input = scanner.nextLine(); // ユーザーの入力を受け取る
        String[] products = input.split("、"); // 入力された商品名をカンマで分割して配列に格納

        for (String product : products) { // 商品名の配列を順番に処理
            int remainingStock = stock.getOrDefault(product, -1);  // 在庫数を取得（商品が存在しない場合は-1を返す）
            String output;  // 出力するメッセージを格納する変数

            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    output = product + "の残り台数は" + remainingStock + "台です"; // 残り台数のメッセージを作成
                    break;
                case "テレビ":
                case "ディスプレイ":
                    output = product + "の残り台数は" + remainingStock + "台です";
                    break;
                default:
                    output = "『" + product + "』は指定の商品ではありません"; // 指定の商品でないメッセージを作成
                    break;
            }

            System.out.println(output); // メッセージを出力
        }

        scanner.close(); // Scannerを閉じる
    }

    private static int getRandomStock() {
        Random random = new Random(); // ランダムな数値を生成するRandomの作成
        return random.nextInt(12); // 0から11までのランダムな数値を返す
    }
}