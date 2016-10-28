package pku3475;

import java.util.Scanner;

public class Main {

	public static int solve(int a, int b, int c, int d) {
		int count = 0;
		while (a < c) {
			if (c % 2 != 0) {
				c /= 2;
				c += 1;
			} else {
				c /= 2;
			}
			count++;
		}
		while (b < d) {
			if (d % 2 != 0) {
				d /= 2;
				d += 1;
			} else {
				d /= 2;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// 封筒の縦a, 横b
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 紙の縦c, 横d
			int c = sc.nextInt();
			int d = sc.nextInt();

			int ans = solve(a, b, c, d);
			ans = Math.min(ans, solve(b, a, c, d));
			System.out.println(ans);
		}
		sc.close();
	}

}
