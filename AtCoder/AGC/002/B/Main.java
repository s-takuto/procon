package agc002B;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] x = new int[m];
		int[] y = new int[m];
		int[] num = new int[n];
		boolean[] red = new boolean[n];

		for (int i = 0; i < m; i++) {
			x[i] = sc.nextInt() - 1;
			y[i] = sc.nextInt() - 1;
		}

		for (int i = 0; i < n; i++) {
			num[i] = 1;
			red[i] = false;
		}
		red[0] = true;

		for (int i = 0; i < m; i++) {
			if (red[x[i]]) {
				red[y[i]] = true;
			}
			num[x[i]]--;
			num[y[i]]++;
			if (num[x[i]] == 0) {
				red[x[i]] = false;
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (red[i]) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
