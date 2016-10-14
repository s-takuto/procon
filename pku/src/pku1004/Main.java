package pku1004;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = 12;
		float sum = 0;
		for (int i = 0; i < n; i++) {
			sum += sc.nextFloat();
		}
		System.out.printf("$" + "%.2f", (sum / n));
	}


	public static void main(String[] args) {
		new Main().run();
	}

}
