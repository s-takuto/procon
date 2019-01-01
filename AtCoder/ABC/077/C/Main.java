package C;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
	public static int upperBound(int val, int[] a) {
		int low = 0;
		int high = a.length - 1;
		while(low < high) {
			int mid = (low + high) / 2;
			if(val == a[mid]) {
				return mid;
			}
			if(val < a[mid]) {
				high = mid;
			}
			else if(a[mid] < val) {
				low = mid + 1;
			}
		}

		return high;
	}

	public static int lowerBound(int val, int[] a) {
		int low = 0;
		int high = a.length - 1;
		while(low < high) {
			int mid = (low + high) / 2;
			if(val == a[mid]) {
				return mid;
			}
			if(val < a[mid]) {
				high = mid;
			}
			else if(a[mid] < val) {
				low = mid + 1;
			}
		}

		if(low != 0) {
			return low -1;
		}
		else {
			return low;
		}
	}

	public static int binarySearch(int val, int[] a) {
		int low = 0;
		int high = a.length - 1;
		while(low < high) {
			int mid = (low + high) / 2;
			if(val == a[mid]) {
				return mid;
			}
			if(val < a[mid]) {
				high = mid;
			}
			else if(a[mid] < val) {
				low = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] up = new int[n];
		int[] middle = new int[n];
		int[] down = new int[n];
		for(int i = 0; i < n; i++) {
			up[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			middle[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			down[i] = sc.nextInt();
		}

		Arrays.sort(up);
		Arrays.sort(middle);
		Arrays.sort(down);

		int count = 0;
		for(int j = 0; j < n; j++) {
			int mid = middle[j];
			int i = upperBound(mid, up);
			int k = lowerBound(mid, down);

			System.out.println("upper bound : " + i + ", " + up[i] + ", lower bound : " + k + ", " + down[k]);
			count += (i + 1) * (n - j);
		}

		System.out.println(count);
	}
}

