package pku3199;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			if (n == 0 && d == 0) {
				break;
			}

			BigDecimal count = new BigDecimal(n);
			BigDecimal ans = new BigDecimal(1);
			for (int i = 0; i < d; i++) {
				ans = ans.multiply(count);
			}
			System.out.println(ans);
		}

	}

}
