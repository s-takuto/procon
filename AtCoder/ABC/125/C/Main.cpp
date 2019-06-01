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

// a, bの最大公約数を求める関数
// ユークリッドの互除法を使う
int gcd(int a, int b) {
  if (a < b) {
    swap(a, b);
  }
  if (b == 0) {
    return a;
  }
  return gcd(b, a % b);
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int n;
  cin >> n;
  int a[n];
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }

  int l[n];
  l[0] = a[0];
  for (int i = 0; i < n - 1; i++) {
    l[i + 1] = gcd(l[i], a[i + 1]);
  }

  int r[n];
  r[n - 1] = a[n - 1];
  for (int i = n - 2; i >= 0; i--) {
    r[i] = gcd(r[i + 1], a[i]);
  }

  int m[n];
  for (int i = 0; i < n; i++) {
    if (i == 0) {
      m[i] = r[i + 1];
    }
    else if (i == n - 1) {
      m[i] = l[i - 1];
    }
    else {
      m[i] = gcd(l[i - 1], r[i + 1]);
    }
  }

  int maxM = 0;
  for (int i = 0; i < n; i++) {
    maxM = max(maxM, m[i]);
  }

  cout << maxM << endl;
}