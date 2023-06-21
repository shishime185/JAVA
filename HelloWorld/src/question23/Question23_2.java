package question23;


public class Question23_2 {

    // インスタンスの生成
    private String name;
    
    private Double length;
    
    private Double speed;

    // コンストラクター生成
    public Question23_2() {
    	
    }

    // 変数をセットするメソッド
    public void setName(String name) {
    	
        // フィールドの値を受け取りインスタンス変数にセット
        this.name = name;
        
    }

    public void setLength(double length) {
    	
        // フィールドの値を受け取りインスタンス変数にセット
        this.length = length;
        
    }

    public void setSpeed(double speed) {
    	
        // フィールドの値を受け取りインスタンス変数にセット
        this.speed = speed;
        
    }

    // 変数の値を取得するメソッド
    public String getName() {
    	
        // 変数の値を返す
        return this.name;
        
    }

    public Double getLength() {
    	
        // 変数の値を返す
        return this.length;
        
    }

    public Double getSpeed() {
    	
        // 変数の値を返す
        return this.speed;
        
    }
}