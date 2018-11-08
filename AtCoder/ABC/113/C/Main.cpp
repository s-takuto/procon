#include<iostream>
#include<vector>
#include<algorithm>
#include<iomanip>
#include<utility>

using namespace std;

int main() {
	int n, m;
	cin >> n >> m;

	vector< pair<int, int> > cities[n];
	for (int i = 0; i < m; i++) {
		int prefecture, year;
		cin >> prefecture >> year;

		cities[prefecture - 1].push_back(pair<int, int> (year, i));
	}

	pair<int, int> ans[m];
	for (int i = 0; i < n; i++) {
		sort(cities[i].begin(), cities[i].end());
		for (int j = 0; j < cities[i].size(); j++) {
			int index = cities[i][j].second;
			ans[index] = make_pair(i, j);
		}
	}

	for (int i = 0; i < m; i++) {
		cout << setfill('0') << setw(6) << right << (ans[i].first + 1);
		cout << setfill('0') << setw(6) << right << (ans[i].second + 1) << endl;
	}

}
