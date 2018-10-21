#include<iostream>
#include<limits>

using namespace std;

int main() {
	int N, T;
	cin >> N >> T;

	int c[N], t[N];
	for(int i = 0; i < N; i++) {
		cin >> c[i] >> t[i];
	}

	int minCost = numeric_limits<int>::max();
	for (int i = 0; i < N; i++) {
		if(t[i] <= T && c[i] < minCost) {
			minCost = c[i];
		}
	}

	if(minCost == numeric_limits<int>::max()) {
		cout << "TLE" << endl;
	}
	else {
		cout << minCost << endl;
	}

	return 0;
}
