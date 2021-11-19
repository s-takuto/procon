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

  static const long MOD = 1000000007;

  int n, m;
  cin >> n >> m;
  int a[m];
  for (int i = 0; i < m; i++) {
    cin >> a[i];
  }

  for (int i = 0; i < m - 1; i++) {
    if (a[i] + 1 == a[i + 1]) {
      cout << 0 << endl;
      return 0;
    }
  }

  long c[n + 1];
  c[0] = 1;
  c[1] = 1;
  for (int i = 2; i <= n; i++) {
    c[i] = (c[i - 1] + c[i - 2]) % MOD;
  }

  long sum = 1L;
  int start = 0;
  int end = n;
  int length;
  for (int i = 0; i < m; i++) {
    end = a[i] - 1;
    length = end - start;

    sum = (sum * c[length]) % MOD;
    start = a[i] + 1;
  }

  length = n - start;
  sum = (sum * c[length]) % MOD;

  cout << sum << endl;
}
