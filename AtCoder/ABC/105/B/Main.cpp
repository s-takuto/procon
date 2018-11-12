#include<iostream>

using namespace std;

int main() {
	int n;

	cin >> n;

	bool f = false;
	for (int x = 0; x <= 100; x++) {
		for (int y = 0; y <= 100; y++) {
			if (4 * x + 7 * y == n) {
				f = true;
				break;
			}
		}
	}

	if (f) {
		cout << "Yes" << endl;
	}
	else {
		cout << "No" << endl;
	}


	return 0;
}
