#include<iostream>
#include<string>
#include<vector>

using namespace std;

int main() {
	int H, W;

	cin >> H >> W;

	string grid[H];
	for (int i =  0; i < H; i++) {
		cin >> grid[i];
	}

	for (int i = 0; i < H; i++) {
		bool f = true;

		for (int j = 0; j < W; j++) {
			if (grid[i][j] == '#') {
				f = false;
				break;
			}
		}

		if (f) {
			for (int j = 0; j < W; j++) {
				grid[i][j] = '?';
			}
		}
	}

	for (int j = 0; j < W; j++) {
		bool f = true;

		for (int i = 0; i < H; i++) {
			if (grid[i][j] == '#') {
				f = false;
				break;
			}
		}

		if (f) {
			for (int i = 0; i < H; i++) {
				grid[i][j] = '?';
			}
		}
	}

	for (int i = 0; i < H; i++) {
		int count = 0;
		for (int j = 0; j < W; j++) {
			if (grid[i][j] == '?') {
				count++;
				continue;
			}
			else {
				cout << grid[i][j];
			}
		}

		if (count == W) {
			continue;
		}
		cout << endl;
	}

	return 0;
}
