package B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();

		int low = 0;
		int high = 0;
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			if(a < x) {
				low++;
			}
			else {
				high++;
			}
		}

		if(low < high) {
			System.out.println(low);
		}
		else {
			System.out.println(high);
		}
	}
}
