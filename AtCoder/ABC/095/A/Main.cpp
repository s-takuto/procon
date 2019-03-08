#include <iostream>
#include <algorithm>
#include <climits>
#include <vector>
#include <utility>
#include <functional>
#include <map>
#include <string>
#include <set>
#include <math.h>

using namespace std;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  string str;
  cin >> str;

  int ans = 700;
  for (auto s : str) {
    if (s == 'o') {
      ans += 100;
    }
  }

  cout << ans << endl;
}