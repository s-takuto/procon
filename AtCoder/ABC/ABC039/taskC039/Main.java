package taskC039;

import java.util.Scanner;

public class Main {

	String[] ans = { "WBWBWWBWBWBWWBWBWWBW", "WBWWBWBWBWWBWBWWBWBW", "WWBWBWBWWBWBWWBWBWBW", "WBWBWBWWBWBWWBWBWBWW",
			"WBWBWWBWBWWBWBWBWWBW", "WBWWBWBWWBWBWBWWBWBW", "WWBWBWWBWBWBWWBWBWWB" };

	String[] sound = { "Do", "Re", "Mi", "Fa", "So", "La", "Si" };

	void run() {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		for (int i = 0; i < 7; i++) {
			if (s.equals(ans[i])) {
				System.out.println(sound[i]);
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
