#include<iostream>
#include<algorithm>

using namespace std;

int main() {
	int x[4], y[4];

	for (int i = 0; i < 2; i++) {
		cin >> x[i] >> y[i];
	}

	for (int i = 2; i < 4; i++) {
		int disX = x[i - 1] - x[i - 2];
		int disY = y[i - 1] - y[i - 2];

		// cout << "disX : " << disX << ", disY : " << disY << endl;

		if (disX > 0 && disY > 0) {
			// 右上 -> 左上
			swap(disX, disY);
			disX *= -1;
		}
		else if (disX < 0 && disY > 0) {
			// 左上 -> 左下
			swap(disX, disY);
			disX *= -1;
		}
		else if (disX < 0 && disY < 0) {
			// 左下 -> 右下
			swap(disX, disY);
			disX *= -1;
		}
		else if (disX > 0 && disY < 0) {
			// 右下 -> 右上
			swap(disX, disY);
			disX *= -1;
		}
		else if (disX == 0 && disY > 0) {
			// 上 -> 左
			swap(disX, disY);
			disX *= -1;
		}
		else if (disX < 0 && disY == 0) {
			// 左 -> 下
			swap(disX, disY);
		}
		else if (disX == 0 && disY < 0) {
			// 下 -> 右
			swap(disX, disY);
			disX *= -1;
		}
		else if (disX > 0 && disY == 0) {
			// 右 -> 上
			swap(disX, disY);
		}

		x[i] = x[i - 1] + disX;
		y[i] = y[i - 1] + disY;
	}

	cout << x[2] << " " << y[2] << " " << x[3] << " " << y[3] << endl;

	return 0;
}
