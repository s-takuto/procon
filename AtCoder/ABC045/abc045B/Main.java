package abc045B;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		char[] c = sc.next().toCharArray();

		int i = 0;
		int j = 0;
		int k = 0;

		int an = a.length;
		int bn = b.length;
		int cn = c.length;

		char s = a[i++];
		while (i <= an && j <= bn && k <= cn) {
			if (s == 'a') {
				if (i == an) {
					System.out.println("A");
					break;
				}
				s = a[i++];
			} else if (s == 'b') {
				if (j == bn) {
					System.out.println("B");
					break;
				}
				s = b[j++];
			} else {
				if (k == cn) {
					System.out.println("C");
					break;
				}
				s = c[k++];
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
