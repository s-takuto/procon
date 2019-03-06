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

  int x;
  cin >> x;

  int ans = 1;
  for (int b = 2; b <= (int)sqrt(x); b++) {
    int exp = b * b;
    for (int p = 2; p <= x; p++) {
      if (exp > x) {
        exp /= b;
        break;
      }
      exp *= b;
    }
    // cout << b << " : " << exp << endl;
    ans = max(ans, exp);
  }

  cout << ans << endl;
}