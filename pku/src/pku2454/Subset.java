package pku2454;

import java.util.Arrays;
import java.util.Scanner;

public class Subset {

	static int t[];
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		t = new int[n];

		subsets(1, 0);
	}

	private static void subsets(int i, int k) {
		if (i > n) {
			for (int j = 0; j < k; j++) {
				System.out.print(t[j] + " ");
			}
			System.out.println();
		} else {
			t[k] = i;
			subsets(i + 1, k + 1);
			subsets(i + 1, k);
		}
	}
}
