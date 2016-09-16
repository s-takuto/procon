package abc044B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();

		Map<Character, Integer> count = new HashMap<>();

		for (char key : c) {
			if (!count.containsKey(key)) {
				count.put(key, 1);
			} else {
				int value = count.get(key);
				count.put(key, value + 1);
			}
		}

		for (char key : count.keySet()) {
			int value = count.get(key);
			if (value % 2 != 0) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
