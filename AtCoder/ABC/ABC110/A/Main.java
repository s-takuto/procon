package A;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[3];
		for(int i = 0; i < 3; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		int a = array[2] * 10 + array[1];

		System.out.println(a + array[0]);
	}
}
