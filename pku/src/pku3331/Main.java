package pku3331;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int t = 0; t < n; t++) {
			int a = sc.nextInt();
			char d = sc.next().charAt(0);
			BigDecimal bd = new BigDecimal(1);

			for (int i = 2; i <= a; i++) {
				BigDecimal tmp = new BigDecimal(i);
				bd = bd.multiply(tmp);
			}

			int count = 0;
			char[] c = bd.toPlainString().toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == d) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
