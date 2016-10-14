package pku2027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (; t > 0; t--) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a < b) {
				System.out.println("NO BRAINS");
			} else {
				System.out.println("MMM BRAINS");
			}
		}
	}

}
