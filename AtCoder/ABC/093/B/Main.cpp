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

  int a, b, k;
  cin >> a >> b >> k;

  set<int> set;
  for (int i = 0; i < k; i++) {
    int x = a + i;
    int y = b - i;

    if (x <= b) {
      set.insert(x);
    }
    if (a <= y) {
      set.insert(y);
    }
  }

  for (auto s : set) {
    cout << s << endl;
  }
}