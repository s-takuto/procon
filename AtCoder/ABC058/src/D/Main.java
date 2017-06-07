package D;

import java.util.Scanner;

// 途中
public class Main {
	public static final long MOD = 1_000_000_000 + 7;

	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[m];

		for(int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
		}
		for(int i = 0; i < m; i++) {
			y[i] = sc.nextLong();
		}

		// process
		long sum = 0;

		long area = (x[n - 1] - x[0]) * (y[m - 1] - y[0]);
		area %= MOD;

		long times = (n - 1) * (m - 1);
		times %= MOD;

		for(int i = 0; i < times; i++) {
			sum += area;
			sum %= MOD;
		}

		//	for(int i = 0; i < n; i++) {
		//		for(int j = i + 1; j < n; j++) {
		//			for(int k = 0; k < m; k++) {
		//				for(int l = k + 1; l < m; l++) {
		//					long area = (x[j] - x[i]) * (y[l] - y[k]);
		//					area %= MOD;
		//					sum += area;
		//					sum %= MOD;
		//				}
		//			}
		//		}
		//	} 

		// output
		System.out.println(sum);
	}
}
