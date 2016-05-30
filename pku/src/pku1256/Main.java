package pku1256;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	// 入力した文字の個数
	int n;
	Element elements[];
	// 添え字の順番を入れる配列
	int ans[];

	void run() {
		Scanner sc = new Scanner(System.in);

		// test case
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			// input
			String str = sc.next();
			char[] c = str.toCharArray();
			n = c.length;
			elements = new Element[n];

			// 最初の文字だけ個別で処理
			elements[0] = new Element(String.valueOf(c[0]), 1);
			int l = 1;

			// 入力された文字を一文字ごと
			for (int j = 1; j < n; j++) {
				String s = String.valueOf(c[j]);
				// 同じ文字がすでにあるのかどうかのチェック
				for (int k = 0; k < l; k++) {
					if (elements[k].letter.equals(s)) {
						elements[k].count++;
						break;
					}
					// 最後までチェックしてかぶりがなかったら新たに作る
					if (k == l - 1) {
						elements[l++] = new Element(s, 1);
						break;
					}
				}
			}

			// element配列は入力された文字数の大きさを持っていたが
			// 本来は文字の種類だけの大きさにしたいから配列を取り直す。
			Element tmpElement[] = new Element[l];
			System.arraycopy(elements, 0, tmpElement, 0, l);
			elements = tmpElement;

			// 辞書順になるようにソート
			Arrays.sort(elements, new LexComparator());

			ans = new int[n];
			// バックトラック
			search(0);
		}

	}

	// バックトラックsearch(int i) i:再帰の深さ
	// 順列を考えるバックトラック
	void search(int i) {
		if (i == n) {
			for (int j = 0; j < n; j++) {
				System.out.print(elements[ans[j]].letter);
			}
			System.out.println();
			return;
		}

		for (int j = 0; j < elements.length; j++) {
			if (elements[j].count != 0) {
				ans[i] = j;
				elements[j].count--;
				search(i + 1);
				elements[j].count++;
			}
		}
	}

	// クラスElement
	// letter：文字、count:文字の個数
	class Element {
		String letter;
		int count;

		// コンストラクタ
		public Element(String letter, int count) {
			this.letter = letter;
			this.count = count;
		}
	}

	// 辞書順にソートするためのComparator
	class LexComparator implements Comparator<Element> {

		public int compare(Element a, Element b) {
			// 全て大文字に変更することで、アルファベット順の処理
			int result = a.letter.toUpperCase().compareTo(
					b.letter.toUpperCase());
			if (result != 0)
				return result;
			// resultが0　⇒　同じ文字の大文字、小文字
			// 同じ種類の文字の大文字>小文字の場合は、普通に比較してreturnする
			return a.letter.compareTo(b.letter);
		}

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();

	}

}
