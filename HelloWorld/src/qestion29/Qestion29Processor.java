/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

// 昇順

package qestion29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Qestion29Processor {

	public static void main(String[] args) {

		Qestion29Processor processor = new Qestion29Processor();

		processor.Execute();
	}

	public void Execute() {

		// 都道府県の情報を格納するリストを作成
		List<String> prefectures = new ArrayList<>();

		prefectures.add("北海道:札幌市:83424");

		prefectures.add("青森県:青森市:9646");

		prefectures.add("岩手県:盛岡市:15275");

		prefectures.add("宮城県:仙台市:7282");

		prefectures.add("秋田県:秋田市:11638");

		prefectures.add("山形県:山形市:9323");

		prefectures.add("福島県:福島市:13784");

		prefectures.add("茨城県:水戸市:6097");

		prefectures.add("栃木県:宇都宮市:6408");

		prefectures.add("群馬県:前橋市:6362");

		prefectures.add("埼玉県:さいたま市:3798");

		// コンソールから入力を受け取るためのScannerを作成
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		// 入力された数字をカンマで分割し、整数のリストに変換
		String[] indices = input.split(",");

		ArrayList<Integer> indexList = new ArrayList<>();

		for (String index : indices) {

			// Nullチェック
			if (index != null && !index.trim().isEmpty()) {

				// インデックスを整数に変換し、リストに追加
				indexList.add(Integer.parseInt(index.trim()));

			}
		}

		// リストを昇順にソート
		Collections.sort(indexList);

		// ソートされたインデックスを使って都道府県情報を表示
		for (int index : indexList) {

			if (index >= 0 && index < prefectures.size()) {

				// 都道府県情報をコロンで分割して必要な情報を取得
				String[] prefectureInfo = prefectures.get(index).split(":");

				if (prefectureInfo.length >= 3) {

					// 都道府県名を都道府県情報の1番目の要素に代入
					String prefectureName = prefectureInfo[0];

					// 県庁所在地を都道府県情報の2番目の要素に代入
					String capitalCity = prefectureInfo[1];

					// 面積を都道府県情報の3番目の要素に代入
					double area = Double.parseDouble(prefectureInfo[2]);

					// 出力
					System.out.println("\n都道府県名：" + prefectureName);

					System.out.println("県庁所在地：" + capitalCity);

					System.out.println("面積：" + area + "km2");
				}
			}
		}

		// Scannerを閉じる
		scanner.close();
	}
}