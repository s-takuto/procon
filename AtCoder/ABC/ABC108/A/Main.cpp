#include<iostream>

using namespace std;

int main() {
	int K;

	cin >> K;

	int evenNum = K / 2;
	int oddNum = K - evenNum;

	cout << evenNum * oddNum << endl;

	return 0;
}
