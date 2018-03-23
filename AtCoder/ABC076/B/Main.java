package B;

import java.util.Scanner;
import java.lang.Math;

public class Main{
	public int n;
	public int k;
	public int min;

	public void search(int i, int sum, boolean mode) {
		if(mode) {
			sum *= 2;
		} else {
			sum += k;
		}

		if(i == n) {
			// System.out.println("i : " + i + " sum : " + sum);
			min = Math.min(min, sum);
			return;
		}

		search(i + 1, sum, true);
		search(i + 1, sum, false);

		return;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();

		min = Integer.MAX_VALUE / 2;
		search(1, 1, true);

		System.out.println(min);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
