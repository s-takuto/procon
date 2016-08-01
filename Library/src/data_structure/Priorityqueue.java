package data_structure;

import java.util.Scanner;

//プライオリティーキュー
public class Priorityqueue {

	// ヒープを配列で実装
	// i番目のとき
	// 左の子はi * 2 + 1、右の子はi*2 + 2となるようにする。
	public int[] heap;
	public int size;

	// 初期化
	void init() {
		heap = new int[100000];
		size = 0;
	}

	// 数xを追加する
	void push(int x) {
		// 数xのノード番号
		int i = size++;

		while (i > 0) {
			// 親のノード番号
			int p = (i - 1) / 2;

			if (heap[p] <= x) {
				break;
			}
			heap[i] = heap[p];
			i = p;
		}
		heap[i] = x;
	}

	// 最小値を取り出し、その値を削除
	int pop() {
		// 最小値
		int ret = heap[0];

		// 根に持ってくる値
		int x = heap[--size];

		int i = 0;
		while (i * 2 + 1 < size) {
			// 左の子
			int a = i * 2 + 1;
			// 右の子
			int b = i * 2 + 2;

			if (heap[a] < x) {
				heap[i] = heap[a];
				i = a;
			} else if (heap[b] < x) {
				heap[i] = heap[b];
				i = b;
			} else {
				break;
			}
		}

		heap[i] = x;

		return ret;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		init();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			push(x);
		}

		System.out.println(pop());
		System.out.println(pop());

	}

	public static void main(String[] args) {
		new Priorityqueue().run();
	}

}
