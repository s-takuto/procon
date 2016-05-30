package pku2363;

import java.util.Scanner;

public class Main {

	final int INF = 100000000;

	void run() {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		while (c != 0) {
			int n = sc.nextInt();

			System.out.println(search(n));

			c--;

		}
	}

	int search(int N) {
		int res = INF;
		for (int a = 0; a <= N; a++) {
			for (int b = 0; b <= N; b++) {
				for (int c = 0; c <= N; c++) {
					if (a * b * c == N) {
						res = Math.min(res, a * b * 2 + a * c * 2 + b * c * 2);
					}
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
