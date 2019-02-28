#include <iostream>
#include <string>

using namespace std;

int main() {
  string str;
  cin >> str;

  int sum = 0;
  for (int i = 0; i < str.length(); i++) {
    char c = str[i];
    sum += (c - '0');
  }

  int n = stoi(str);

  if (n % sum == 0) {
    cout << "Yes" << endl;
  }
  else {
    cout << "No" << endl;
  }
}