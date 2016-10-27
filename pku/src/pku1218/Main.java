package pku1218;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean[] lock = new boolean[n + 1];
			Arrays.fill(lock, false);

			for (int i = 2; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j % i == 0) {
						lock[j] = !lock[j];
					}
				}
			}

			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (!lock[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
