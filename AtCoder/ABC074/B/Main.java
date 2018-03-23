package B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int sum = 0;
		for(int i = 0; i < n; i++) {
			int diff = 0;
			if(a[i] - 0 > k - a[i]) {
				diff = k - a[i];
			}
			else if (a[i] - 0 <= k - a[i]) {
				diff = a[i] - 0;
			}
			sum += diff * 2;
		}

		System.out.println(sum);
	}
}
