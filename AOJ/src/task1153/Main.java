package task1153;

import java.util.Scanner;

public class Main {

	void run() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int tsum = 0;
			int hsum = 0;

			int anst = 0;
			int ansh = 0;

			int min = 200;

			if ((n | m) == 0) {
				break;
			}

			// taro
			int[] t = new int[n];
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				tsum += t[i];
			}

			// hanako
			int[] h = new int[m];
			for (int i = 0; i < m; i++) {
				h[i] = sc.nextInt();
				hsum += h[i];
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (tsum - t[i] + h[j] == hsum - h[j] + t[i]) {
						if (min > t[i] + h[j]) {
							min = t[i] + h[j];
							anst = t[i];
							ansh = h[j];
						}
					}
				}
			}

			if ((anst | ansh) == 0) {
				System.out.println(-1);
			} else {
				System.out.println(anst + " " + ansh);
			}

		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
