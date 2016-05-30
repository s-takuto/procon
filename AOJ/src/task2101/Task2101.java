package task2101;

import java.util.Scanner;

public class Task2101 {

	static int N;
	static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {
			N = sc.nextInt();

			if (N == 0) {
				break;
			}

			sum = 0;

			// 完全数判定
			for (int j = 1; j * j <= N; j++) {
				if (N % j == 0) {
					if (j == 1)
						sum += 1;
					else if (N / j == j) {
						sum += j;
					} else {
						int s = N / j;
						sum += j;
						sum += s;
					}
				}
			}

			if (N == sum && N != 1) {
				System.out.println("perfect number");
				// System.out.println("N " + N + " sum " + sum);
			} else if (N > sum || N == 1 || N == 2 || N == 3) {
				System.out.println("deficient number");
				// System.out.println("N " + N + " sum " + sum);
			} else {
				System.out.println("abundant number");
				// System.out.println("N " + N + " sum " + sum);
			}
		}
	}
}
