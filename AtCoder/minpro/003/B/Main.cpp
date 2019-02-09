#include<iostream>
#include<vector>

using namespace std;

int main() {
	int n = 3;
	vector< vector<int> > nbs;

	for (int i = 0; i < 4; i++) {
		vector<int> city;
		nbs.push_back(city);
	}

	for (int i = 0; i < n; i++) {
		int a, b;
		cin >> a >> b;

		a--;
		b--;

		nbs[a].push_back(b);
		nbs[b].push_back(a);
	}

	bool ans = true;
	for (int i = 0; i < 4; i++) {
		if (nbs[i].size() == 3) {
			ans = false;
		}
	}

	if (ans) {
		cout << "YES" << endl;
	}
	else {
		cout << "NO" << endl;
	}

	return 0;
}
