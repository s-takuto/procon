#include <iostream>
#include <string>
#include <cstdlib>
#include <climits>

using namespace std;

const int BASE_NUMBER = 753;

int main() {
  string str;
  cin >> str;

  int diffMin = INT_MAX;
  for (int i = 0; i < (str.length() - 2); i++) {
    int num = stoi(str.substr(i,3));

    int diff = abs(num - BASE_NUMBER);

    if (diff < diffMin) {
      diffMin = diff;
    }
  }

  cout << diffMin << endl;
}