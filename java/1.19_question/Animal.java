package basicClass;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		System.out.println(dog.getName());
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.println(Dog.getNumberOfAnimals());
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		java.time.LocalDateTime now = java.time.LocalDateTime.now();
		String formattedDateTime = now.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"));
		System.out.println(formattedDateTime);
	}
}

