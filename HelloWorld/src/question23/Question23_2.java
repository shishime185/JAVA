package question23;

public class Question23_2 {

	// インスタンスの生成
	private String name;

	private double length;

	private double speed;

	// コンストラクター生成
	public Question23_2() {}

	
	// name,length,speedをセットするメソッド
	
	public void setName(String name) { // name
	
	this.name = name; // フィールドの値を受け取りインスタンス変数にセット
	}
	public void setLength(double length) { // length
	
	this.length = length; // フィールドの値を受け取りインスタンス変数にセット
	}
	public void setSpeed(double speed) { // speed
	
	this.speed = speed; // フィールドの値を受け取りインスタンス変数にセット
	}

	
	// name,length,speedを取得するメソッド
	
	public String getName() { // name

	return this.name; // nameの値を返す
	
	}

	public double getLength() { // length

	return this.length; // lengthの値を返す
	
	}

	public double getSpeed() {// speed

	return this.speed; // speedの値を返す

	}
}