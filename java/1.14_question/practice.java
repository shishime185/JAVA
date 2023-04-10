/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
package array2.java;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// char []alphabet = new char[26];
		// 	char c = 'a';
		// 	for(int i = 0; i < 26; i++){
		// 		alphabet[i] = c++;
		// 	}

		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
			
			for (int i = 0; i < alphabet.length; i++ ) {
				if (alphabet[3]) {
					break;
				}
				// System.out.println(alphabet);
			}
	}

}
