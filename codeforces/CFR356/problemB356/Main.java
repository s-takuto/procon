package problemB356;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int pos = sc.nextInt() - 1;
		int[] city = new int[n];
		for (int i = 0; i < n; i++) {
			city[i] = sc.nextInt();
		}

		int s = 1;
		int sum = city[pos];
		int t = pos;
		int u = pos;

		while (0 <= u || t < n) {
			t = pos + s;
			u = pos - s;

			if (u < 0 && t < n) {
				sum += city[t];
				s++;
				continue;
			}
			if (0 <= u && n <= t) {
				sum += city[u];
				s++;
				continue;
			}
			if (u < 0 && n <= t) {
				break;
			}

			if (city[u] == city[t]) {
				sum += city[u];
				sum += city[t];
			}
			s++;
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
