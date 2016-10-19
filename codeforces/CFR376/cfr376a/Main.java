package cfr376a;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();

		int sum = 0;
		char pos = 'a';
		for (int i = 0; i < c.length; i++) {
			int r = Math.abs(c[i] - pos);
			int l = 'z' - 'a' + 1 - r;
			int tmp = Math.min(r, l);
			sum += tmp;
			pos = c[i];
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
