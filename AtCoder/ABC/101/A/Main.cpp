#include <iostream>
#include <string>

using namespace std;

int main() {
  string str;
  cin >> str;

  int ans = 0;
  for (int i = 0; i < str.length(); i++) {
    char c = str[i];
    if (c == '+') {
      ans += 1;
    }
    else {
      ans -= 1;
    }
  }

  cout << ans << endl;
}