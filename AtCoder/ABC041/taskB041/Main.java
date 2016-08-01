package taskB041;

import java.util.Scanner;

public class Main {

	private long x = 1_000_000_000 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);

		long w = sc.nextLong();
		long h = sc.nextLong();
		long d = sc.nextLong();

		long ans = 0;

		ans = (w * h) % x;
		ans *= d;
		System.out.println(ans % x);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
