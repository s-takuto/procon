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

void print(int a[], int n) {
  for (int i = 0; i < n; i++) {
    cout << a[i] << ", ";
  }
  cout << endl;
}

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int n;
  cin >> n;

  string s;
  cin >> s;

  int l[n], r[n];
  for (int i = 0; i < n; i++) {
    l[i] = 0;
    r[i] = 0;
  }

  for (int i = 1; i < n; i++) {
    if (s[i - 1] == 'W') {
      l[i] = l[i - 1] + 1;
    }
    else {
      l[i] = l[i - 1];
    }
  }

  for (int i = n - 2; i >= 0; i--) {
    if (s[i + 1] == 'E') {
      r[i] = r[i + 1] + 1;
    }
    else {
      r[i] = r[i + 1];
    }
  }

  int ans = INT_MAX;
  for (int i = 0; i < n; i++) {
    ans = min(ans, l[i] + r[i]);
  }

  cout << ans << endl;
}
