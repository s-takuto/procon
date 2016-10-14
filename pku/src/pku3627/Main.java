package pku3627;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int sum = 0;
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			sum += a[i];
			count++;
			if (sum >= h) {
				break;
			}
		}
		System.out.println(count);

	}

}
