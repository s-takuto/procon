package pku2454;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JerseyPolitics {

	//クソ問だった（らしい）＼(^o^)／
	
	final static int N = 1000;
	static int ans[];
	static int x[];
	static boolean select[];
	static int K;
	static int n;
	static int count;
	static int lose;

	static boolean finish;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		K = sc.nextInt();
		n = 3 * K;

		x = new int[n];
		ans = new int[n];
		select = new boolean[n];
		lose = 0;
		count = 0;

		// 初期値
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		backtrack(0);

		for (int i = 0; i < x.length; i++) {
			System.out.println(ans[i] + 1);
		}

	}

	// i:i番目、k:ans[]配列の添え字k
	private static void backtrack(int k) {
		if (finish)
			return;

		if (k == n) {

			// System.out.println("ans = " + Arrays.toString(ans));

			int sum = 0;
			int cnt = 0;
			int win = 0;
			for (int j = 0; j < n; j++) {
				sum += x[ans[j]];
				cnt++;
				if (cnt % K == 0) {
					if (sum > (K * N) / 2) {
						win++;
					}
					sum = 0;
				}
			}
			if (win >= 2) {
				finish = true;
				return;
			}
			return;
		}

		for (int j = 0; j < n; j++) {
			if (select[j])
				continue;
			select[j] = true;
			ans[k] = j;
			k++;
			backtrack(k);
			if (finish)
				return;
			k--;
			select[j] = false;
		}
	}
}
