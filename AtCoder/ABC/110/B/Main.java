package B;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] aCity = new int[n];
		int[] bCity = new int[m];

		int x = sc.nextInt();
		int y = sc.nextInt();

		for(int i = 0; i < n; i++) {
			aCity[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			bCity[i] = sc.nextInt();
		}

		Arrays.sort(aCity);
		Arrays.sort(bCity);

		int aRightEdge = aCity[n - 1];
		int bLeftEdge = bCity[0];

		if(aRightEdge > bLeftEdge) {
			System.out.println("War");
			return;
		}

		boolean f = false;
		for(int i = aRightEdge; i <= bLeftEdge; i++) {
			int z = i;
			if(x < z && z <= y) {
				if(aRightEdge < z && z <= bLeftEdge) {
					f = true;
					break;
				}
			}
		}

		if(f) {
			System.out.println("No War");
		}
		else {
			System.out.println("War");
		}
	}
}
