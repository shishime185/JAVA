package question19;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
//		Dogクラスのインスタンスを作成、そのインスタンスのgetNameメソッドを呼び出して犬の名前を取得し、コンソールに出力する
		Dog dog = new Dog();
		System.out.println(dog.getName());
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
//		DogクラスのgetAnimalCountメソッドを呼び出し、作成された犬の数を取得し、コンソールに出力する
		System.out.println(Dog.getAnimalCount());
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		java.util.Date date = new java.util.Date();
//		日時を変数に代入し、コンソールに出力しています。
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd H:m:s");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);
	}
}

class Dog {
	private static int animalCount = 0;
	private String name;
	
//	Dogクラスのコンストラクタでは、animalCountをインクリメントし、nameには"ワンワン"という値が設定されます。
	public Dog() {
		animalCount++;
		name = "ワンワン";
	}
//	getNameメソッドはnameの値を返す
	public String getName() {
		return name;
	}
//	getAnimalCountメソッドはanimalCountの値を返す
	public static int getAnimalCount() {
		return animalCount;
	}
}




