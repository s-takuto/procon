#include <iostream>
#include <algorithm>
#include <climits>
#include <vector>
#include <utility>
#include <functional>
#include <map>
#include <string>

using namespace std;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  string s;
  cin >> s;

  int count0 = 0;
  int count1 = 0;
  for (int i = 0; i < s.size(); i++) {
    if (s[i] == '0') {
      count0++;
    }
    else {
      count1++;
    }
  }

  cout << 2 * min(count0, count1) << endl;
}