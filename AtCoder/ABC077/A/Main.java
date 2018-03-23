package A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		char[] d = sc.next().toCharArray();

		int j = d.length - 1;
		boolean f = true;
		for(int i = 0; i < c.length; i++) {
			if(c[i] != d[j]) {
				f = false;
			}
			j--;
		}

		if(f) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
