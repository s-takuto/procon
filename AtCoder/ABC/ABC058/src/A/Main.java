package A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(5 / 2);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(b - a ==	c - b) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
