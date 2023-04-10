package curriculum_New_question;

public class Curriculum_New_1_5 {

    public static void main(String[] args) {
    	
        // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        //  好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』

        // ↓↓format↓↓
        // 「初めまして○○です」
        // 「年齢は○○歳です」
        // 「身長は○○cmです」
        // 「体重は○○kgです」
        // 「好きな食べ物は○○です」

    	// Q1を下記に記載
				String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";
				// %s、%d、%.1f などのフォーマット指定子を用いて、変数の値を文字列に埋め込む
				// %s : 文字列型
				// %d : 整数型 (10進数)
				// %f : 浮動小数点型
				// %c : 文字型
				// %b : 真偽値型
        String introduction = String.format("初めまして%sです", name);
        String ageDescription = String.format("年齢は%d歳です", age);
        String heightDescription = String.format("身長は%.1fcmです", height);
        String weightDescription = String.format("体重は%.1fkgです", weight);
        String favoriteFoodDescription = String.format("好きな食べ物は%sです", favoriteFood);

        System.out.println(introduction);
        System.out.println(ageDescription);
        System.out.println(heightDescription);
        System.out.println(weightDescription);
        System.out.println(favoriteFoodDescription);
        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること

        // Q2を下記に記載
				double bmi = weight / Math.pow(height / 100, 2);
        String bmiDescription = String.format("BMIは%.1fです", bmi);
        System.out.println(bmiDescription);
        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です

        // Q3を下記に記載
				// 変数を再代入していく
				name = "鈴木一郎";
				age = 24;
				height = 168.5;
				weight = 64.2;
				favoriteFood = "オムライス";
				bmi = weight / ((height / 100.0) * (height / 100.0));
				
				System.out.println("初めまして" + name + "です");
				System.out.println("年齢は" + age + "歳です");
				System.out.println("身長" + height + "cmです");
				System.out.println("体重は" + weight + "kgです");
				System.out.println("好きな食べ物は" + favoriteFood + "です");
				System.out.println(String.format("BMIは%.1fです", bmi));
    	// ↓↓コンソール最終結果↓↓
    	
    	//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です
    	 
     }

}