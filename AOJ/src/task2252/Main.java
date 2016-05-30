package task2252;

import java.util.Scanner;

public class Main {

	char[] l = "qwertasdfgzxcvb".toCharArray();

	void run() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			char[] c = sc.next().toCharArray();

			if (c[0] == '#') {
				break;
			}

			int cnt = 0;

			for (int i = 0; i < c.length - 1; i++) {
				if (isLeft(c[i]) != isLeft(c[i + 1])) {
					cnt++;
				}
			}

			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public boolean isLeft(char c) {

		for (int i = 0; i < l.length; i++) {
			if (c == l[i]) {
				return true;
			}
		}

		return false;
	}

}
