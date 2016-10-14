package pku3302;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			char[] s1 = sc.next().toCharArray();
			char[] s2 = sc.next().toCharArray();

			int l = 0;
			boolean f = false;
			int count = 0;
			for (int i = 0; i < s1.length; i++) {
				if (s1[i] == s2[l]) {
					count++;
					l++;
				}
				if (count == s2.length) {
					f = true;
					break;
				}
			}

			l = 0;
			count = 0;
			if (!f) {
				for (int i = s1.length - 1; i >= 0; i--) {
					if (s1[i] == s2[l]) {
						count++;
						l++;
					}
					if (count == s2.length) {
						f = true;
						break;
					}
				}
			}
			if (f) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
