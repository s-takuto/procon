#include <iostream>
#include <algorithm>
#include <climits>
#include <vector>
#include <utility>
#include <functional>
#include <map>
#include <string>
#include <set>

using namespace std;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int n;
  cin >> n;

  string s;
  cin >> s;

  int ans = 0;
  for (int i = 0; i < n; i++) {
    string left = s.substr(0, (i + 1));
    string right = s.substr(i + 1);

    set<char> l;
    for (int j = 0; j < left.size(); j++) {
      l.insert(left[j]);
    }

    set<char> r;
    for (int j = 0; j < right.size(); j++) {
      r.insert(right[j]);
    }

    int count = 0;
    for (auto x : l) {
      if (r.count(x) == 1) {
        count++;
      }
    }

    ans = max(ans, count);
  }

  cout << ans << endl;
}