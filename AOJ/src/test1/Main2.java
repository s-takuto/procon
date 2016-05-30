package test1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int N = sc.nextInt();
			
			if(N == 0) {
				break;
			}

			int sum = 0;

			int count = 0;

			for (int i = 1; i < N; i++) {
				sum = i;
				for (int j = i + 1; j < N; j++) {
					sum += j;
					if (N == sum) {
						count++;
					}
					if (N < sum) {
						break;
					}
				}
			}

			System.out.println(count);

		}

	}

}
