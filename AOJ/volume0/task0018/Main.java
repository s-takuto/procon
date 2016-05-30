package task0018;

import java.util.Scanner;

//char→intへの変換がよく分かってない。
//全体的に文字列の扱いがよく分かってない。
public class Main {

	//アルファベットを数値化
	int[] a = new int['z' - 'a' + 1];

	void run() {
		Scanner sc = new Scanner(System.in);

		// 入力
		char[] c = sc.next().toCharArray();

		char[] data = new char[c.length];
		int[] data1 = new int[c.length];

		for(int i = 0; i < c.length; i++) {
			data1[i] = Character.getNumericValue(c[i]) + 1;
		}

		String str = String.valueOf(data1[0]);

		System.out.println(str);
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
