package taskC053;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Element {
	int up;
	int down;

	// コンストラクタ
	public Element(int up, int down) {
		this.up = up;
		this.down = down;
	}
}

class MagicComparator implements Comparator<Element> {

	@Override
	public int compare(Element m1, Element m2) {
		int m1gap = m1.up - m1.down;
		int m2gap = m2.up - m2.down;

		if (m1gap < 0 && m2gap > 0) {
			return -1;
		}
		else if (m1gap > 0 && m2gap < 0) {
			return 1;
		}
		else if (m1gap >= 0 && m2gap >= 0) {
			if (m1gap == 0 && m2gap != 0) {
				return -1;
			}
			else if (m2gap == 0 && m1gap != 0) {
				return 1;
			}
			else if (m1gap == m2gap) {
				return m1.up - m2.up;
			}
			else if (m1gap > m2gap) {
				return -1;
			}
			else if (m1gap < m2gap) {
				return 1;
			}
			return (m1.up - m2.up);
		}
		else if (m1gap < 0 && m2gap < 0) {
			return (m1.up - m2.up);
		}
		return (m1.up - m2.up);
	}

}

public class Main {

	int max;
	int premax;
	int N;
	int[] ans;

	void run() {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		Element[] magic = new Element[N];

		for (int i = 0; i < N; i++) {
			magic[i] = new Element(sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(magic, new MagicComparator());

		int max = 0;
		int tem = 0;
		for (int i = 0; i < N; i++) {
			tem += magic[i].up;
			if (tem > max) {
				max = tem;
			}
			tem -= magic[i].down;
			if (tem > max) {
				max = tem;
			}
		}

		max = 0;

		System.out.println(max);
	}

	void search(int i, int tem) {
		if (i == N) {
			if (max > tem) {

			}
		}

		if (max != 0 && max < tem) {
			return;
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
