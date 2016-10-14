package pku2656;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			boolean f = true;
			int[] x = new int[n];
			int[] y = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				int sum = x[i] + y[i];
				if (sum > 8) {
					f = false;
					System.out.println(i + 1);
					break;
				}
			}

			if (f) {
				System.out.println(0);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
