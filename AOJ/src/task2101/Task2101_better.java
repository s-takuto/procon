package task2101;

import java.util.Scanner;

public class Task2101_better {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();

			if (n == 0)
				break;

			if (n == 1)
				System.out.println("deficient number");
			else if(n > 1) {
				int sum = 1;
				for (int i = 2; i * i <= n; i++) {
					if (n % i == 0) {
						if (n / i == i) {
							sum += i;
						} else {
							sum += i + n/i;
						}
					}
				}
				
				if (n == sum) {
					System.out.println("perfect number");
					// System.out.println("N " + N + " sum " + sum);
				} else if (n > sum) {
					System.out.println("deficient number");
					// System.out.println("N " + N + " sum " + sum);
				} else {
					System.out.println("abundant number");
					// System.out.println("N " + N + " sum " + sum);
				}
			}
		}
	}
}
