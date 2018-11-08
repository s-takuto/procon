#include<iostream>
#include<algorithm>
#include<functional>

using namespace std;

int main() {
	cin.tie(0);
	ios::sync_with_stdio(false);

	int a[3];

	for(int i = 0; i < 3; i++) {
		cin >> a[i];
	}

	sort(a, a + 3, greater<int>());

	int ans = a[0] * 10 + a[1] + a[2];

	cout << ans << endl;

	return 0;
}

