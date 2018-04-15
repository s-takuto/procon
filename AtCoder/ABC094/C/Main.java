package C;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		int[] y = Arrays.copyOf(x, x.length);

		Arrays.sort(x);

		for(int i = 0; i < n; i++) {
			if(y[i] <= x[(n - 1) / 2]) {
				System.out.println(x[(n + 1) / 2]);
			}
			else {
				System.out.println(x[(n - 1) / 2]);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
