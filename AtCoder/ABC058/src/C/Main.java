package C;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		int size = 'z' - 'a' + 1;
		int[][] count = new int[n][size];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < s[i].length(); j++) {
				char c = s[i].charAt(j);
				int k = c - 'a';
				count[i][k]++;
			}
		}

		int[] cnt = new int[size];
		for(int i = 0; i < size; i++) {
			int min = Integer.MAX_VALUE / 2;
			for(int j = 0; j < n; j++) {
				int val = count[j][i];
				min = Math.min(count[j][i], min);
			}
			cnt[i] = min;
		}

		char c = 'a';
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < cnt[i]; j++) {
				System.out.print(String.valueOf(c));
			}
			c++;
		}
		System.out.println();

	}
}
