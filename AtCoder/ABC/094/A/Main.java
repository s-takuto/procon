package A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		boolean f = true;
		if(a > x) {
			f = false;
		}
		else {
			if(x - a > b) {
				f = false;
			}
		}

		if(f) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
