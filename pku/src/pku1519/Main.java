package pku1519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char[] a = sc.next().toCharArray();
			if (a[0] == '0') {
				break;
			}

			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i] - '0';
			}
			while (sum > 9) {
				a = Integer.toString(sum).toCharArray();
				sum = 0;
				for (int i = 0; i < a.length; i++) {
					sum += a[i] - '0';
				}
			}

			System.out.println(sum);
		}
	}

}
