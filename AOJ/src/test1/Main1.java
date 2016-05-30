package test1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			int s = sc.nextInt();

			int max = 0;

			if (x == 0 && y == 0 && s == 0) {
				break;
			}

			for (int i = 1; i < s; i++) {
				for (int j = 1; j < s; j++) {

					int a = i * (100 + x) / 100;
					int b = j * (100 + x) / 100;

					if (a + b == s) {
						int c = i * (100 + y) / 100;
						int d = j * (100 + y) / 100;

						int sum = c + d;

						if (sum > max) {
							max = sum;
						}
					}
				}
			}

			System.out.println(max);
		}
	}
}
