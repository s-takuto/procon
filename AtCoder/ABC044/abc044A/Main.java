package abc044A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		long x = sc.nextLong();
		long y = sc.nextLong();

		long sum = 0;
		if (n > k) {
			sum += x * k;
			sum += y * (n - k);
		} else {
			sum += x * n;
		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
