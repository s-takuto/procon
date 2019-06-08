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

#define llong long long

using namespace std;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  llong n;
  cin >> n;
  llong minP = LLONG_MAX;
  for (int i = 0; i < 5; i++) {
    llong p;
    cin >> p;
    minP = min(minP, p);
  }

  cout << 4 + ((n + (minP - 1)) / minP) << endl;

  // if (n % minP == 0) {
  //   cout << 5 + (n / minP) - 1 << endl;
  // }
  // else {
  //   cout << 5 + (n / minP) << endl;
  // }
}