package D;

import java.util.Scanner;

public class Main {

	public static char[] assign;
	public static char[] ans;
	public static int n;

	public static boolean check() {

		int i = n - 1;
		for(int cnt = 0; cnt < 3; cnt++) {
			i %= n;
			int next = (i + 1) % n;
			int back = (i + n - 1) % n;

			if(assign[i] == 'o' && ans[i] == 'S') {
				if(ans[back] == 'S' && ans[next] == 'W') {
					return false;
				}else if(ans[back] == 'W' && ans[next] == 'S') {
					return false;
				}
			}
			else if(assign[i] == 'o' && ans[i] == 'W') {
				if(ans[back] == 'S' && ans[next] == 'S') {
					return false;
				}else if(ans[back] == 'W' && ans[next] == 'W') {
					return false;
				}
			}
			else if(assign[i] == 'x' && ans[i] == 'S') {
				if(ans[back] == 'S' && ans[next] == 'S') {
					return false;
				}else if(ans[back] == 'W' && ans[next] == 'W') {
					return false;
				}
			}
			else if(assign[i] == 'x' && ans[i] == 'W') {
				if(ans[back] == 'S' && ans[next] == 'W') {
					return false;
				}else if(ans[back] == 'W' && ans[next] == 'S') {
					return false;
				}
			}

			i++;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		assign = sc.next().toCharArray();

		for(int cnt = 0; cnt < 4; cnt++) {
			ans = new char[n];

			if(cnt == 0) {
				ans[0] = 'S';
				ans[1] = 'S';
			}
			else if(cnt == 1) {
				ans[0] = 'S';
				ans[1] = 'W';
			}
			else if(cnt == 2) {
				ans[0] = 'W';
				ans[1] = 'S';
			}
			else if (cnt == 3) {
				ans[0] = 'W';
				ans[1] = 'W';
			}

			// i番目はi-1番目とi-2番目によって定まる(i >= 1)
			for (int i = 1; i < n; i++) {

				int next = (i + 1) % n;
				int back = (i + n - 1) % n;

				if(assign[i] == 'o') {
					if(ans[i] == 'S') {
						if(ans[back] == 'S') {
							ans[next] = 'S';
						}
						else if(ans[back] == 'W') {
							ans[next] = 'W';
						}
					}
					else if(ans[i] == 'W') {
						if(ans[back] == 'S') {
							ans[next] = 'W';
						}
						else if(ans[back] == 'W') {
							ans[next] = 'S';
						}
					}
				}
				else if(assign[i] == 'x') {
					if(ans[i] == 'S') {
						if(ans[back] == 'S') {
							ans[next] = 'W';
						}
						else if(ans[back] == 'W') {
							ans[next] = 'S';
						}
					}
					else if(ans[i] == 'W') {
						if(ans[back] == 'S') {
							ans[next] = 'S';
						}
						else if(ans[back] == 'W') {
							ans[next] = 'W';
						}
					}
				}
			}

			if(check()) {
				String str = String.valueOf(ans);
				System.out.println(str);
				return;
			}
		}
		System.out.println(-1);
	}
}
