package task0064$;

import java.util.Scanner;

public class Main {

	// char型からint型への変換方法？
	// 10倍しながら足していく

	int sum = 0;

	void run() {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			//文字を入れることで数字のみでも対応できる。
			char[] c = (sc.next() + "a").toCharArray();

			int res = 0;

			for (int i = 0; i < c.length; i++) {
				//数字
				if ('0' <= c[i] && c[i] <= '9') {
					res = res * 10 + (c[i] - '0');
				}
				//文字
				else {
					sum += res;
					res = 0;
				}
			}
		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
