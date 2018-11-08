package B;

import java.util.Scanner;

public class Main {
	public static int MOD = 1_000_000_000 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long power = 1;
		for(int i = 1; i <= n; i++) {
			power *= i;
			power %= MOD;
		}

		System.out.println(power);
	}
}
