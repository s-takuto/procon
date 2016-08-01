package problemB362;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		int an = 1;
		int dn = 0;
		int bn = 0;

		if (c[2] == '0' && c[4] == '0') {
			System.out.println(c[0]);
			return;
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '.') {
				for (int j = i + 1; j < c.length; j++) {
					if (c[j] != 'e') {
						dn++;
					} else {
						i = j;
						break;
					}
				}
			}
			if (c[i] == 'e') {
				bn = c[i + 1] - '0';
				for (int j = i + 2; j < c.length; j++) {
					bn = ((bn * 10) + (c[j] - '0'));
				}
				break;
			}
		}

		if (dn <= bn) {
			char[] ans = new char[an + bn];
			int size = an + dn;
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '.' && bn > 0) {
					if (c[i + 1] == 'e') {
						break;
					}
					int j = i + 1;
					char tmp = c[j];
					c[j] = c[i];
					c[i] = tmp;
					bn--;
				}
			}

			for (int i = 0; i < ans.length; i++) {
				if (i < size) {
					ans[i] = c[i];
				} else {
					ans[i] = '0';
				}
			}
			System.out.println(ans);
		} else {
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '.' && bn > 0) {
					int j = i + 1;
					char tmp = c[j];
					c[j] = c[i];
					c[i] = tmp;
					bn--;
				}
			}

			for (int i = 0; i < c.length; i++) {
				if (c[i] != 'e') {
					System.out.print(c[i]);
				} else {
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
