package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
//		変数iを1から20までインクリメントしながら繰り返す
		for (int i = 1; i <= 20; i++) {
//			jを1から9までインクリメントしながら繰り返す
            for (int j = 1; j <= 9; j++) {
//            	resultにiとjの積を代入
                int result = i * j;
//              %03dは3桁の整数としてフォーマットすること
//              %02dは2桁の整数としてフォーマットすること
                System.out.printf("%03d * %02d = %03d || ", j, i, result);
            }
            System.out.println();
		}
	}

}
