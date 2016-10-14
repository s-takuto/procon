package pku3619;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		while (k-- > 0) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int r = sc.nextInt();

			int time = 0;
			// 本を読むのにかかる時間
			if (n % s == 0) {
				time = n / s;
			} else {
				time = (n / s) + 1;
			}

			// 休憩する回数
			int rest = 0;
			if (time % t == 0) {
				rest = (time / t) - 1;
				if (rest < 0) {
					rest = 0;
				}
			} else {
				rest = (n / s) / t;
			}
			time += r * rest;

			System.out.println(time);
		}
	}

}
