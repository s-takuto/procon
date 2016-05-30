package test1;

import java.util.Scanner;

public class Main3 {

	public static boolean[] visit;

	public static String[] s;

	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		visit = new boolean[n];

		for (int i = 0; i < visit.length; i++) {
			visit[i] = false;
		}

		for (int i = 0; i < n; i++) {
			visit[i] = true;
			String a = s[i].substring(0, 1);
			String b = s[i].substring(s[i].length() - 1, s[i].length());

			for (int j = i + 1; j < n; j++) {
				if (visit[j])
					continue;

				String c = s[j].substring(0, 1);
				if (b == c) {
					visit[j] = true;
				}
			}
		}

		System.out.println(s[0].substring(0, 2));

	}

	public static boolean search(int i) {

		if (visit[i]) {

		}

		String a = s[i].substring(0, 1);
		String b = s[i].substring(s[i].length() - 1, s[i].length());

		for (int j = 0; j < n; j++) {
			if (i != j) {
				String c = s[j].substring(0, 1);
			}
		}

		return false;
	}

}
