package B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();

		for(int i = n - 2; i > 0; i-=2)  {
			if(s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
				System.out.println(i);
				return;
			}
		}
	}
}
