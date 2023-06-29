package question27;

import java.util.Scanner;

class Question27 {

	public static void main(String[] args) {
		/*
		 
		コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
		ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
		
		コンソール出力結果
		
		コンソールに文字を入力してください
		動物名：ライオン
		体長：2.1m
		速度：80km/h
		学名：パンテラ レオ
		
		動物名：ゾウ
		体長：3.2m
		速度：40km/h
		学名：ロキソドンタ・サイクロティス
		
		動物名：パンダ
		体長：1.9m
		速度：30km/h
		学名：アイルロポダ・メラノレウカ
		
		動物名：チンパンジー
		体長：0.94m
		速度：25km/h
		学名：パン・トゥログロディテス
		
		動物名：シマウマ
		体長：2.4m
		速度：65km/h
		学名：チャップマンシマウマ
		
		動物名：インコ
		体長：0.1m
		速度：50km/h
		学名：不明
		
		
		*/

		// 出力
		System.out.print("コンソールに文字を入力してください");

        // Scannerオブジェクト作成
        Scanner scanner = new Scanner(System.in);

        // 入力を受け取り代入
        String input = scanner.nextLine();

        // Scannerを閉じる
        scanner.close();

        // カンマで区切って配列に格納
        String[] animals = input.split(",");

        // 配列の各要素を処理するための繰り返しを開始
        for (String animal : animals) {

            // 動物の情報をコロンで区切って配列に代入
            String[] animalInfo = animal.split(":");

            // 動物の名前を変数に代入
            String name = (animalInfo[0]);

            // 動物の体長を変数に代入
            String length = (animalInfo[1]) + "m";

            // 動物の速度を変数に代入
            String speed = (animalInfo[2]) + "km/h";

            // 学名の変数を宣言
            String scientificName = "";

            // 変数による条件分岐
            switch (name) {

                // ライオンの場合
                case "ライオン":

                    // パンテラ レオを代入
                    scientificName = "パンテラ レオ";

                    break;

                // ゾウの場合
                case "ゾウ":

                    // ロキソドンタ・サイクロティスを代入
                    scientificName = "ロキソドンタ・サイクロティス";

                    break;

                // パンダの場合
                case "パンダ":

                    // アイルロポダ・メラノレウカを代入
                    scientificName = "アイルロポダ・メラノレウカ";

                    break;

                // チンパンジーの場合
                case "チンパンジー":

                    // パン・トゥログロディテスを代入
                    scientificName = "パン・トゥログロディテス";

                    break;

                // シマウマの場合
                case "シマウマ":

                    // チャップマンシマウマを代入
                    scientificName = "チャップマンシマウマ";

                    break;

                // インコの場合
                case "インコ":

                    // 不明を代入
                    scientificName = "不明";

                    break;
            }

            // Nullチェック
            if (name != null && length != null && speed != null && scientificName != null) {

                // 出力
                System.out.println("動物名：" + name);

                System.out.println("体長：" + length);

                System.out.println("速度：" + speed);

                System.out.println("学名：" + scientificName);

                System.out.println();
			} 
		}
	}
}