package pku1231;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// 各文字の配列
	public static Letter[] letters;

	// 縦線
	public static int[] verticals;

	// 横線
	public static int[] horizons;

	// 各文字の領域
	public static LettersField[] fields;

	// 文字の領域を示すクラス
	static class Letter {
		int xmin, xmax;
		int ymin, ymax;

		// コンストラクタ
		public Letter(int xmin, int xmax, int ymin, int ymax) {
			this.xmin = xmin;
			this.xmax = xmax;
			this.ymin = ymin;
			this.ymax = ymax;
		}

	}

	// 縦線or横線を引くことができる場所を探すためのEventクラス
	static class Event implements Comparable<Event> {
		boolean opening;
		int pos;

		Event(boolean opening, int pos) {
			this.opening = opening;
			this.pos = pos;
		}

		// 昇順で、同じposのときはopeningがtrue優先
		public int compareTo(Event e) {
			if (this.pos != e.pos) {
				return this.pos - e.pos;
			} else {
				// true優先
				if (this.opening == e.opening) {
					return 0;
				} else if (this.opening == true && e.opening == false) {
					return -1;
				} else {
					return 1;
				}
			}
		}
	}

	// 各文字の領域を保存するクラス
	static class LettersField {
		int x;
		int y;

		public LettersField(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	// 縦線を引くことが出来る場所を探すメソッド
	static void findVerticalLines() {
		Event[] events = new Event[letters.length * 2];
		int k = 0;
		for (int i = 0; i < letters.length; i++) {
			events[k++] = new Event(true, letters[i].xmin);
			events[k++] = new Event(false, letters[i].xmax);
		}
		Arrays.sort(events);

		verticals = new int[100];
		// verticalsの添え字
		int l = 0;
		int count = 0;
		for (int i = 0; i < events.length; i++) {
			if (events[i].opening) {
				count++;
			} else {
				count--;
				if (count == 0) {
					verticals[l++] = events[i].pos;
				}
			}
		}
	}

	// 横線を引くことが出来る場所を探すメソッド
	// findVerticalLinesメソッドと同様
	static void findHorizontalLines() {
		Event[] events = new Event[letters.length * 2];
		int k = 0;
		for (int i = 0; i < letters.length; i++) {
			events[k++] = new Event(true, letters[i].ymin);
			events[k++] = new Event(false, letters[i].ymax);
		}
		Arrays.sort(events);

		horizons = new int[100];

		int l = 0;
		int count = 0;
		for (int i = 0; i < events.length; i++) {
			if (events[i].opening) {
				count++;
			} else {
				count--;
				if (count == 0) {
					horizons[l++] = events[i].pos;
				}
			}
		}
	}

	// 各文字の領域が縦線と横線によって分割された場所にそれぞれ含まれているか
	// を判定するメソッド
	public static boolean findLettersField() {
		fields = new LettersField[letters.length];

		// 各文字がどの場所に含まれているか調べる
		for (int i = 0; i < letters.length; i++) {
			// x軸
			for (int j = 0; j < verticals.length; j++) {
				if (letters[i].xmin <= verticals[j]) {
					fields[i] = new LettersField(verticals[j], 0);
					break;
				}
			}
			// y軸
			for (int j = 0; j < horizons.length; j++) {
				if (letters[i].ymin <= horizons[j]) {
					fields[i].y = horizons[j];
					break;
				}
			}
		}

		// 各文字が重複することなくそれぞれの領域に含まれているかcheck
		for (int i = 0; i < fields.length; i++) {
			for (int j = i + 1; j < fields.length; j++) {
				if (fields[i].x == fields[j].x && fields[i].y == fields[j].y) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test case
		int t = sc.nextInt();

		for (int m = 0; m < t; m++) {
			// アルファベットの種類
			int k = sc.nextInt();
			// 各アルファベットの個数
			int p = sc.nextInt();

			letters = new Letter[k];

			// input
			for (int i = 0; i < k; i++) {
				int xmax = sc.nextInt();
				int xmin = xmax;
				int ymax = sc.nextInt();
				int ymin = ymax;

				for (int j = 1; j < p; j++) {
					int tmpx = sc.nextInt();
					xmax = Math.max(xmax, tmpx);
					xmin = Math.min(xmin, tmpx);
					int tmpy = sc.nextInt();
					ymax = Math.max(ymax, tmpy);
					ymin = Math.min(ymin, tmpy);
				}
				// 各アルファベットの領域の左上と右下の座標を保存
				letters[i] = new Letter(xmin, xmax, ymin, ymax);
			}

			// 各fieldを分ける縦線を探す
			findVerticalLines();
			// 各fieldを分ける横線を探す
			findHorizontalLines();

			// 各アルファベットが同じ領域内にいないかcheck
			if (findLettersField()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
