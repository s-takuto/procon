package D;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Main {
	int[] a;
	int n;

	public boolean isNonNegativeInteger() {
		for(int i = 0; i < n; i++) {
			if(a[i] <= 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isNegativeInteger() {
		for(int i = 0; i < n; i++) {
			if(a[i] > 0) {
				return false;
			}
		}
		return true;
	}

	public int max() {
		int max = Integer.MIN_VALUE / 2;
		int index = -1;
		for(int i = 0; i < n; i++) {
			if(max < a[i]) {
				max = a[i];
				index = i;
			}
		}
		return index;
	}

	public int min() {
		int min = Integer.MAX_VALUE / 2;
		int index = -1;
		for(int i = 0; i < n; i++) {
			if(a[i] < min) {
				min = a[i];
				index = i;
			}
		}
		return index;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		if(isNonNegativeInteger()) {
			System.out.println(n - 1);
			for(int i = 0; i < n - 1; i++) {
				System.out.println((i + 1) + " " + (i + 2));
				a[i + 1] += a[i];
			}
		}
		else if(isNegativeInteger()) {
			System.out.println(n - 1);
			for(int i = n - 2; i >= 0; i--) {
				System.out.println((i + 2) + " " + (i + 1));
				a[i] += a[i + 1];
			}
		}
		else {
			System.out.println(n + (n - 1));
			int max = max();
			int min = min();
			if(Math.abs(a[max]) >= Math.abs(a[min])) {
				int maxv = a[max];
				for(int i = 0; i < n; i++) {
					System.out.println((max + 1) + " " + (i + 1));
					a[i] += maxv;
				}
				for(int i = 0; i < n - 1; i++) {
					System.out.println((i + 1) + " " + (i + 2));
					a[i + 1] += a[i];
				}
			}
			else {
				int minv = a[min];
				for(int i = 0; i < n; i++) {
					System.out.println((min + 1) + " " + (i + 1));
					a[i] += minv;
				}
				for(int i = n - 2; i >= 0; i--) {
					System.out.println((i + 2) + " " + (i + 1));
					a[i] += a[i + 1];
				}
			}
		}

		// System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
