#include<iostream>
#include<string>

using namespace std;

int main() {
	string str;

	cin >> str;

	for(int i = 0; i < str.length(); i++) {
		if(str[i] == '1') {
			str[i] = '9';
		}
		else if(str[i] == '9') {
			str[i] = '1';
		}
	}

	cout << str << endl;

	return 0;
}
