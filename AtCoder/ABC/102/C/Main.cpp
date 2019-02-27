#include <iostream>
#include <algorithm>

using namespace std;

int main() {
  int n;
  cin >> n;

  long a[n];
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }

  long b[n];
  for (int i = 0; i < n; i++) {
    b[i] = a[i] - (i + 1);
  }

  sort(b, b + n);
  long mid = b[n / 2];

  long ans = 0;
  for (int i = 0; i < n; i++) {
    ans += abs(b[i] - mid);
  }

  cout << ans << endl;
}