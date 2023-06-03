package question19;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {

    public static void main(String[] args) {
        // Q1: Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog dog1 = new Dog("犬");

        // メソッドを呼び出す
        dog1.printAnimalName();

        // Q2: Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        Dog dog2 = new Dog(5);

        // メソッドを呼び出す
        dog2.printAnimalCount();

        // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください。
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");

        // 出力
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}