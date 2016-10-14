package pku1658;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int n = 4;
		while (t-- > 0) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				System.out.print(a[i] + " ");
			}
			if (a[1] + a[3] == a[2] * 2) {
				// 等差数列
				System.out.println(a[3] + (a[3] - a[2]));
			} else if (a[1] * a[3] == a[2] * a[2]) {
				// 等比数列
				System.out.println(a[3] * (a[3] / a[2]));
			}
		}
	}

}
