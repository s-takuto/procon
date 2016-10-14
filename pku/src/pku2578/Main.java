package pku2578;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean f = true;
		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			if (a < 168) {
				f = false;
				System.out.println("CRASH " + a);
			}
		}

		if (f) {
			System.out.println("NO CRASH");
		}
	}

}
