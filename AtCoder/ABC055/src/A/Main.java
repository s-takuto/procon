package A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = (800 * n) - (200 * (n / 15));
		System.out.println(sum);
	}
}
