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
   	8
   	5
   	9
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
 

 package com.example;

public class Prefecture {
    private String name;
    private String capital;
    private double area;

    public Prefecture(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }
}



package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortPrefectures {
    public static void main(String[] args) {
        List<Prefecture> prefectures = new ArrayList<>();
        prefectures.add(new Prefecture("北海道", "札幌市", 83424));
        prefectures.add(new Prefecture("青森県", "青森市", 9646));
        prefectures.add(new Prefecture("岩手県", "盛岡市", 15275));
        prefectures.add(new Prefecture("宮城県", "仙台市", 7282));
        prefectures.add(new Prefecture("秋田県", "秋田市", 11638));
        prefectures.add(new Prefecture("山形県", "山形市", 9323));
        prefectures.add(new Prefecture("福島県", "福島市", 13784));
        prefectures.add(new Prefecture("茨城県", "水戸市", 6097));
        prefectures.add(new Prefecture("栃木県", "宇都宮市", 6408));
        prefectures.add(new Prefecture("群馬県", "前橋市", 6362));
        prefectures.add(new Prefecture("埼玉県", "さいたま市", 3798));

        Scanner scanner = new Scanner(System.in);

        // ユーザが複数の選択肢を選択できるようにするため、配列に数字を入力する
        System.out.println("コンソールに数字を入力してください");
        String input = scanner.nextLine();
        String[] choices = input.split(" ");

        // 選択肢に応じて、都道府県をソートする
        for (String choice : choices) {
            switch (choice) {
                case "0":
                    Collections.sort(prefectures, (p1, p2) -> p1.getName().compareTo(p2.getName()));
                    break;
                case "1":
                    Collections.sort(prefectures, (p1, p2) -> p2.getName().compareTo(p1.getName()));
                    break;
                case "2":
                    Collections.sort(prefectures, (p1, p2) -> Double.compare(p1.getArea(), p2.getArea()));
                    break;
                case "3":
                    Collections.sort(prefectures, (p1, p2) -> Double.compare(p2.getArea(), p1.getArea()));
                    break;
                default:
                    System.out.println("正しい数字を入力してください");
                    return;
            }
        }

        // ソートされた都道府県を出力する
        for (Prefecture prefecture : prefectures) {
            System.out.println("都道府県名：" + prefecture.getName());
            System.out

						