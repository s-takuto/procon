package E;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		long count = 0;
		for(int i = 2; i <= n; i++) {
			if(a[i] > a[i - 1]) {
				sum += (a[i] - a[i - 1]):
			} else {
				sum += (m - a[i - 1] + a[i]);
			}
			sum += a[i];
		}

		for(int x = 1; x <= m; x++) {
			int count = 0;
			for(int i = 0; i < n - 1; i++) {
				int cur = a[i];
				int next = a[i + 1];

				if(x - cur > 0) {
					if(next - cur > x - cur) {
						count += (x - cur);
						count += (next - x);
					} else {
						count += (next - cur);
					}

				}
			}
		}
	}
}
