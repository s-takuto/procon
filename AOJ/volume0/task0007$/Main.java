package task0007$;

import java.util.Scanner;

public class Main {

	int range = 1000;

	// 1000未満なら切り上げ
	// 1000で割った余りrが0じゃなければ1000-rを足す
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = 100000;

		for (int i = 0; i < n; i++) {
			m += m * 5 / 100;

			int r = m % range;
			if (r != 0) {
				m += range - r;
			}
		}

		System.out.println(m);

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
