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

  int n;
  cin >> n;
  int w[n];
  for (int i = 0; i < n; i++) {
    cin >> w[i];
  }

  int minAbs = INT_MAX;
  for (int t = 0; t < n; t++) {
    int s1 = 0;
    for (int i = 0; i <= t; i++) {
      s1 += w[i];
    }

    int s2 = 0;
    for (int i = t + 1; i < n; i++) {
      s2 += w[i];
    }

    minAbs = min(minAbs, abs(s1 - s2));
  }

  cout << minAbs << endl;
}