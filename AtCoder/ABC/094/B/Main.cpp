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

  int n, m, x;
  cin >> n >> m >> x;

  bool isCost[n];
  for (int i = 0; i < n; i++) {
    // isCost[i] = false;
    cout << i << " " << isCost[i] << endl;
  }
  for (int i = 0; i < m; i++) {
    int a;
    cin >> a;
    isCost[a] = true;
  }

  int costToN = 0;
  for (int i = x + 1; i < n; i++) {
    if (isCost[i]) {
      costToN++;
    }
  }

  int costTo0 = 0;
  for (int i = x - 1; i > 0; i--) {
    if (isCost[i]) {
      costTo0++;
    }
  }

  cout << min(costToN, costTo0) << endl;
}