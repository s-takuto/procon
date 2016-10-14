package pku1003;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			float a = sc.nextFloat();
			if (a == 0.00) {
				break;
			}
			int count = 0;
			float sum = 0;
			float n = 2;
			while (sum < a) {
				sum += (1 / n);
				count++;
				n++;
			}
			System.out.println(count + " card(s)");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
