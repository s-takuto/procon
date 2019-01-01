package C;

import java.util.Scanner;

class Main {
	private static final char ALPHABET_SIZE = 'z' - 'a' + 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();

		int[] repS = new int[ALPHABET_SIZE];
		int[] repT = new int[ALPHABET_SIZE];
		for(int i = 0; i < ALPHABET_SIZE; i++) {
			repS[i] = -1;
			repT[i] = -1;
		}

		boolean judge = true;
		for(int i = 0; i < s.length; i++) {
			int si = s[i] - 'a';
			int ti = t[i] - 'a';

			if(repS[si] < 0) {
				repS[si] = ti;
			}
			else {
				if(repS[si] != ti) {
					judge = false;
					break;
				}
			}

			if(repT[ti] < 0) {
				repT[ti] = si;
			}
			else {
				if(repT[ti] != si) {
					judge = false;
					break;
				}
			}
		}

		if(judge) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
