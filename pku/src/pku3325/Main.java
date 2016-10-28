package pku3325;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);

			int sum = 0;
			for (int i = 1; i < n - 1; i++) {
				sum += a[i];
			}
			System.out.println(sum / (n - 2));
		}
	}

}
