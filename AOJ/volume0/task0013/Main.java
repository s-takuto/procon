package task0013;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();

		while (sc.hasNext()) {
			int p = sc.nextInt();

			if (p == 0) {
				System.out.println(st.pop());
			}
			else {
				st.push(p);
			}
		}
		sc.close();

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
