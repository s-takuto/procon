package D;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	private static final int MOD = 1_000_000_000 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] count = new int[n + 1];
		int tar = 0;
		for(int i = 0; i < n + 1; i++) {
			a[i] = sc.nextInt();
			count[a[i]]++;
			if(count[a[i]] == 2) {
				tar = i + 1;
			}
		}
		System.out.println(tar);

		long[] fact = new long[n + 2];
		fact[0] = 1;
		fact[1] = 1;
		for(int i = 2; i <= n + 1; i++) {
			fact[i] = fact[i - 1] * i;
			fact[i] %= MOD;
		}

		System.out.println(Arrays.toString(fact));

		for(int k = 1; k <= 1; k++) {
			long tmp = (fact[n + 1 - k] * fact[k]) % MOD;
			long comb1 = (fact[n + 1] / tmp) % MOD;
			comb1 %= MOD;
			System.out.println(comb1);
			long comb2 = 0;
			if(n + 1 - tar >= k - 1) {
				tmp = (fact[n - tar - k + 2] * fact[k - 1]) % MOD;
				comb2 = fact[n + 1 - tar] / tmp;
				comb2 %= MOD;
			}
			//	System.out.print("comb1:" + comb1);
			//	System.out.println(", comb2:" + comb2);
			System.out.println((comb1 - comb2) % MOD);
		}
	}
}
