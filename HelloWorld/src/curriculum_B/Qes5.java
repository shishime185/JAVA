package curriculum_B;

public class Qes5 {

    public static void main(String[] args) {
    	System.out.printf("課題５");
    	System.out.println();
    	// 外のループiを反復
        for (int i = 1; i <= 20; i++) {

            // 内側のループjを反復
            for (int j = 1; j <= 20; j++) {
            	// 乗算
                int result = i * j;

                // 3桁のフォーマットを維持
                if (j == 20) {
                    System.out.printf("%03d * %02d = %03d", j, i, result);
                } else {
                    System.out.printf("%03d * %02d = %03d || ", j, i, result);
                }
            }
            // 改行
            System.out.println();
        }
    }
}
