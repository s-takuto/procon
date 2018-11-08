#include<iostream>

using namespace std;

int main() {
	int n;

	cin >> n;

	int ans = 0;
	for (int i = 3; i <= n; i+=2) {
		int count = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}

		if (count == 8) {
			ans++;
		}
	}

	cout << ans << endl;

	return 0;
}
