package problemA360;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();

		char[][] c = new char[d][];

		for (int i = 0; i < d; i++) {
			c[i] = sc.next().toCharArray();
		}

		int consecutive = 0;
		boolean[] f = new boolean[d];
		Arrays.fill(f, false);

		for (int i = 0; i < d; i++) {
			for (int j = 0; j < n; j++) {
				if (c[i][j] == '0') {
					f[i] = true;
					break;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < d; i++) {
			if (f[i]) {
				consecutive++;
			} else {
				max = Math.max(max, consecutive);
				consecutive = 0;
			}
		}

		max = Math.max(max, consecutive);
		System.out.println(max);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
