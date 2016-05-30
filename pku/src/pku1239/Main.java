package pku1239;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		String str = "0123";
		String str1 = "019124";
		
		System.out.println(str.compareTo(str1));
		
		while (true) {
			// input
			String s = sc.next();
			if (s.equals("0")) {
				break;
			}
			int n = s.length();

			String[] f = new String[n + 1];
			f[0] = "0";
			for (int i = 1; i <= n; i++) {
				for (int j = i - 1; j >= 0; j--) {
					String k = s.substring(j, i);
					if (k.compareTo(f[j]) > 0 || f[j].equals("0")) {
						f[i] = k;
						break;
					}
				}
			}

			System.out.println(Arrays.toString(f));

		}
	}

	public static void main(String[] args) {
		new Main().run();

	}

}
