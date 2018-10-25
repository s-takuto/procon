#include<iostream>
#include<map>
#include<string>
#include<vector>

using namespace std;

int main() {
	int N;
	cin >> N;

	map<string, int> count;
	vector<string> word(N);

	for (int i = 0; i < N; i++) {
		string w;
		cin >> word[i];
		// word.push_back(w);
	}

	// 0th
	int size = word[0].size();
	string word_end = word[0].substr(size - 1);

	count[word[0]] = 1;
	
	// judge flag
	bool ans = true;

	for (int i = 1; i < N; i++) {
		string word_first = word[i].substr(0, 1);

		if (word_first != word_end) {
			ans = false;
			break;
		}

		// count up
		if (count.find(word[i]) == count.end()) {
			count[word[i]] = 1;
		}
		else {
			ans = false;
			break;
		}

		size = word[i].size();
		word_end = word[i].substr(size - 1);
	}

	if (ans) {
		cout << "Yes" << endl;
	}
	else {
		cout << "No" << endl;
	}
	return 0;
}
