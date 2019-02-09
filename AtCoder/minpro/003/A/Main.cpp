#include<iostream>

using namespace std;

int main() {
	int	n, k;

	cin >> n >> k;

	int count = n / 2;
	if (n % 2 != 0) {
		count++;
	}

	if (k <= count) {
		cout << "YES" << endl;
	}
	else {
		cout << "NO" << endl;
	}

}
