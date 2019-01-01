package C;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[n + 1];
		int variety = 0;
		for(int i = 0; i < n; i++) {
			int ball = sc.nextInt();
			if(num[ball] == 0) {
				variety++;
			}
			num[ball]++;
		}

		Arrays.sort(num);

		int ans = 0;
		int i = 0;
		while(variety > k) {
			if(num[i] != 0) {
				ans += num[i];
				variety--;
			}
			i++;
		}
		System.out.println(ans);
	}
}
