package pku3100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int b = sc.nextInt();
			int n = sc.nextInt();

			if (b == 0 && n == 0) {
				break;
			}

			for (int i = 1; i <= b; i++) {
				int a = (int) Math.pow(i, n);
				if (b <= a) {
					int cur = Math.abs(b - a);
					int pre = (int) Math.pow(i - 1, n);
					pre = Math.abs(pre - b);
					int ans = Math.min(cur, pre);
					if (ans == cur) {
						System.out.println(i);
					} else {
						System.out.println(i - 1);
					}
					break;
				}
			}
		}

	}

}
