package taskA038;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		int size = c.length;

		String s = "T";
		char tmp = s.charAt(0);
		if (c[size - 1] == tmp) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

	public static void main(String[] args) {
		new Main().run();

	}

}
