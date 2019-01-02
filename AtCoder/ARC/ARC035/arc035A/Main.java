package arc035A;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] s = new char[1000];
		s = sc.next().toCharArray();

		int i = 0;
		int j = s.length - 1;
		while (i <= j) {
			if (s[i] == s[j] || s[i] == '*' || s[j] == '*') {
				i++;
				j--;
			} else {
				break;
			}
		}

		if (j < i) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
