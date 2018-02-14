package A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.next().toCharArray();

		int count = 0;
		for(int i = 0; i < in.length; i++) {
			if(in[i] == '1') {
				count++;
			}
		}

		System.out.println(count);
	}
}

