package curriculum_B;

public class Qes4 {

    public static void main(String[] args) {
    	System.out.printf("課題４");
    	System.out.println();
        // 外側のループはiを反復
        for (int i = 1; i <= 9; i++) {

            // 内側のループはjを反復
            for (int j = 1; j <= 9; j++) {
                int result = i * j;

                // 2桁のフォーマットを維持
                if (j == 9) {
                    System.out.printf("%02d * %02d = %02d", i, j, result);
                } else {
                    System.out.printf("%02d * %02d = %02d || ", i, j, result);
                }
            }
            System.out.println(); // 改行
        }
    }
}
