package curriculum_B;

public class Qes5 {

    public static void main(String[] args) {
        System.out.println("課題５");
        // 改行
        System.out.println();

        // 外のループiを反復
        for (int i = 1; i <= 9; i++) {

            	// 内側のループjを反復
                for (int j = 1; j <= 20; j++) {
                    // 乗算とフォーマットを同時に行う
                    System.out.printf("%03d * %03d = %03d%s", j, i, (i * j), (j != 20) ? " || " : "");
                }

                // 改行
                System.out.println();
            }
        }
    }