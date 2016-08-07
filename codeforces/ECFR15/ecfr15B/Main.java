package ecfr15B;

import java.util.Arrays;
import java.util.Scanner;

//TLE
//計算量O(n^2) * 定数倍(30)
public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] judge = new int[30];
		int x = 1;
		for (int i = 0; i < 30; i++) {
			x *= 2;
			judge[i] = x;
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = a[i] + a[j];
				if (sum % 2 != 0) {
					continue;
				}
				for (Integer y : judge) {
					if (sum == y) {
						// System.out
						// .println("i:" + i + " j:" + j + " sum:" + sum);
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
