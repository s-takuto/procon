package pku3475;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			int count = 0;
			int min = Integer.MAX_VALUE / 2;

			int tmpc = c;
			int tmpd = d;

			while (a < c) {
				c /= 2;
				count++;
			}
			while (b < d) {
				d /= 2;
				count++;
			}
			
			min = count;
			c = tmpc;
			d = tmpd;
			count = 0;
			while (b < c) {
				c /= 2;
				count++;
			}
			while (a < d) {
				d /= 2;
				count++;
			}
			min = Math.min(min, count);

			System.out.println(min);
		}
		sc.close();
	}

}
