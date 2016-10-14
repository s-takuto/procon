package pku1013;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		// 0:same, 1:heavy, 2:light, -1:format
		int[] w;
		for (; t > 0; t--) {
			w = new int['L' - 'A' + 1];
			Arrays.fill(w, -1);
			for (int n = 0; n < 3; n++) {
				char[] left = sc.next().toCharArray();
				char[] right = sc.next().toCharArray();
				char[] status = sc.next().toCharArray();

				if (status[0] == 'e') {
					for (int i = 0; i < left.length; i++) {
						int l = left[i] - 'A';
						int r = right[i] - 'A';
						w[l] = 0;
						w[r] = 0;
					}
				} else if (status[0] == 'u') {
					// 残りものは必ず本物
					boolean[] used = new boolean['L' - 'A' + 1];
					for (int i = 0; i < left.length; i++) {
						int l = left[i] - 'A';
						int r = right[i] - 'A';
						used[l] = true;
						used[r] = true;
					}
					for (int i = 0; i < used.length; i++) {
						if (!used[i] && w[i] == -1) {
							w[i] = 0;
						}
					}

					// 左側がすべて本物ならば、右側には軽い偽物が存在する。
					for (int i = 0; i < left.length; i++) {
						int l = left[i] - 'A';
						if (w[l] == -1) {
							break;
						} else if (w[l] == 0) {
							
						}
					}
				}

			}

		}
	}

}
