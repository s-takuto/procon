package abc033B;

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] t = new String[n];
		int[] p = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			t[i] = sc.next();
			p[i] = sc.nextInt();
			sum += p[i];
		}
		
		int maj = sum / 2;

		for(int i = 0; i < n; i++) {
			if(maj < p[i]) {
				System.out.println(t[i]);
				return;
			}
		}
		
		System.out.println("atcoder");
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
