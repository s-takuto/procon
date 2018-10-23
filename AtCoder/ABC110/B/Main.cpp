#include<iostream>
#include<algorithm>
#include<functional>

using namespace std;

int main() {
	cin.tie(0);
	ios::sync_with_stdio(false);

	int N, M, X, Y;
	cin >> N >> M >> X >> Y;

	int x[N], y[M];
	for(int i = 0; i < N; i++) {
		cin >> x[i];
	}
	for(int i = 0; i < M; i++) {
		cin >> y[i];
	}

	sort(x, x + N);
	sort(y, y + M);

	int xRight = x[N - 1];
	int yLeft = y[0];

	bool ans = false;
	for(int z = X + 1; z <= Y; z++) {
		if(xRight < z && z <= yLeft) {
			ans = true;
			break;
		}
	}

	if(ans) {
		cout << "No War" << endl;
	}
	else {
		cout << "War" << endl;
	}

	return 0;
}

