#include<iostream>
#include<vector>

using namespace std;

int main() {
	long k, a, b;

	cin >> k >> a >> b;

	long biscuits = 1;

	long count_pocket = 0;
	long count = 0;

	if (a >= (b - 2)) {
		count_pocket = k;
	}
	else {
		biscuits += (a - 1);
		int remain_k = (k - (a - 1));
		
		if (remain_k < (remain_k / 2) * (b - a)) {
			if (remain_k % 2 != 0) {
				count_pocket = 1;
			}
			count = remain_k / 2;
		}
		else {
			count_pocket = remain_k;
		}
	}

	cout << (biscuits + count_pocket + ((b - a) * count)) << endl;

	return 0;
}
