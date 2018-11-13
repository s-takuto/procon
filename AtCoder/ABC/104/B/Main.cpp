#include<iostream>
#include<string>
#include<cctype>

using namespace std;

bool check(string str) {
	if (str[0] != 'A') {
		return false;
	}

	int c_index = str.find("C");
	if (c_index < 2 || str.length() - 2 < c_index) {
		return false;
	}

	int count_A = 0;
	int count_C = 0;
	for (int i = 0; i < str.length(); i++) {
		char s = str[i];

		if (s == 'A') {
			if (count_A == 0) {
				count_A++;
				continue;
			}
			else {
				return false;
			}
		}
		else if (s == 'C') {
			if (count_C == 0) {
				count_C++;
				continue;
			}
			else {
				return false;
			}
		}

		if (!islower(s)) {
			return false;
		}
	}

	return true;
}

int main() {
	string str;

	cin >> str;

	if (check(str)) {
		cout << "AC" << endl;
	}
	else {
		cout << "WA" << endl;
	}

	return 0;
}
