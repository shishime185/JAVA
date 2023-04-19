package question14;

class Question14 {

	public static void main(String[] args) {
		        // string型の配列を作成し、アルファベットa～jまでを格納
		        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

		        // brake文を使用し、a～dまで表示
		        for (int i = 0; i < alphabet.length; i++) {
		            System.out.println(alphabet[i]);
		            if (alphabet[i].equals("d")) {
		                break;
		            }
		        }

		        // cotinue文を使用し、i以外を表示
		        for (int i = 0; i < alphabet.length; i++) {
		            if (alphabet[i].equals("i")) {
		                continue;
		            }
		            System.out.println(alphabet[i]);
		        }

	}

}
