package pku2454;

import java.util.Scanner;

public class Test {

	static int a[];
	static int c[];
	static boolean flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		a = new int[4];
		c = new int[4];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			c[i] = 0;
		}

		answer(1, a[0]);

	}

	static void answer(int i, int sum) {
		// System.out.println("i = " + i + ", sum = " + sum);

		if (i == 4) {
			if (sum == 10) {
				System.out.println(sum);
				for (int j = 1; j < c.length; j++) {
					if (c[j] == 0) {
						System.out.println("+");
					} else if (c[j] == 1) {
						System.out.println("-");
					} else if (c[j] == 2) {
						System.out.println("*");
					} else if (c[j] == 3) {
						System.out.println("/");
					}
				}
				System.out.println();
				return;
			}
			sum = 0;
			return;
		}

		c[i] = 0;
		answer(i + 1, sum += a[i]);

		c[i] = 1;
		answer(i + 1, sum -= a[i]);

		c[i] = 2;
		answer(i + 1, sum *= a[i]);

		c[i] = 3;
		answer(i + 1, sum /= a[i]);

		return;
	}
}
