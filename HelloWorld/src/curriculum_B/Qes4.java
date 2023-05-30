package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
//		この行は、変数"i"を1から9まで（含む）イテレートするforループを開始します。これは、掛け算の表の行を生成するためのものです。
		for (int i = 1; i <= 9; i++) {
//			この行は、前のループの内側に入れ子になった別のforループを開始します。
//			変数"j"を1から9まで（含む）イテレートします。これは、掛け算の表の列を生成します。
            for (int j = 1; j <= 9; j++) {
//            	現在の"i"と"j"の値の積を計算し、その結果を変数"result"に代入します。
                int result = i * j;
//              "%02d"のフォーマット指定子は、各エントリを2桁に揃えるために先頭にゼロを付けるために使用
                System.out.printf("%02d * %02d = %02d || ", i, j, result);
            }
            System.out.println();

	}
	}
}
