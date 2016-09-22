package cfr371A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		long l1 = sc.nextLong();
		long r1 = sc.nextLong();
		long l2 = sc.nextLong();
		long r2 = sc.nextLong();

		long k = sc.nextLong();

		long l = Math.max(l1, l2);
		long r = Math.min(r1, r2);

		long ans;
		if (l <= r) {
			ans = r - l + 1;
			if (l <= k && k <= r) {
				ans -= 1;
			}
		} else {
			ans = 0;
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
