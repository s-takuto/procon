package taskB053;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();
		char[] c = s.toCharArray();
		int[] count = new int[26];

		for (int i = 0; i < n; i++) {
			count[c[i] - 'a']++;
		}

		int oddCount = 0;
		int pairCount = 0;

		for (int i = 0; i < 26; i++) {
			if (count[i] % 2 != 0) {
				oddCount++;
			}
			pairCount += count[i] / 2;
		}

		if (oddCount == 0) {
			System.out.println(n);
		} else {
			System.out.println(pairCount / oddCount * 2 + 1);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
