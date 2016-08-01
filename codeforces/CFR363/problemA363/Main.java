package problemA363;

import java.util.Scanner;

public class Main {

	int[] dx = { -1, 1 };

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[] c = sc.next().toCharArray();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (i + 1 == n) {
				break;
			}
			if (c[i] == 'R' && c[i + 1] == 'L') {
				int tmp = (p[i + 1] + p[i]) / 2;
				tmp = tmp - p[i];
				ans = Math.min(ans, tmp);
			}
		}

		if (ans == Integer.MAX_VALUE) {
			System.out.println("-1");
		} else {
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
