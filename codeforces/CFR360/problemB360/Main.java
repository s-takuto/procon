package problemB360;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		StringBuffer sb = new StringBuffer(s);
		s += sb.reverse().toString();

		System.out.println(s);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
