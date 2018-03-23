package B;

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 0; i <= 1_000_000_000; i++) {
			int square = i * i;
			if(square > n) {
				System.out.println((i - 1) * (i - 1));
				break;
			}
		}

	}
}

