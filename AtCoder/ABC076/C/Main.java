package C;

import java.util.Scanner;

public class Main{
	char[] s;
	char[] t;
	char[] tmp;
	char[] ans;

	public boolean judge() {
		if(s.length < t.length) {
			return false;
		}

		int size = s.length - t.length + 1;
		boolean f = false;

		for(int i = 0; i < size; i++) {
			tmp = (char[])s.clone();
			if(search(i)) {
				f = true;
				convert();
				update();
			}
		}

		return f;
	}

	public boolean search(int k) {
		int i = k;
		int j = 0;

		while(j < t.length) {
			if(s[i] == t[j]) {
				i++; j++;
				continue;
			}
			else if(s[i] != '?' && s[i] != t[j]) {
				return false;
			}
			else if(s[i] == '?') {
				tmp[i] = t[j];
			}
			i++; j++;
		}

		return true;
	}

	public void convert() {
		for(int i = 0; i < tmp.length; i++) {
			if(tmp[i] == '?') {
				tmp[i] = 'a';
			}
		}
	}

	public void update() {
		if(ans == null) {
			ans = tmp;
			return;
		}

		boolean f = false;
		for(int i = 0; i < ans.length; i++) {
			if(ans[i] > tmp[i]) {
				f = true;
			}
		}

		if(f) {
			ans = tmp;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		s = sc.next().toCharArray();
		t = sc.next().toCharArray();

		if(judge()) {
			System.out.println(ans);
		}
		else {
			System.out.println("UNRESTORABLE");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
