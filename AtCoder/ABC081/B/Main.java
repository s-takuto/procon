package B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;
		int i = 0;
		while(a[i] % 2 == 0) {
			a[i] /= 2;
			if(i == n - 1) {
				count++;
				i = 0;
			}
			i++;
		}

		System.out.println(count);
	}
}
