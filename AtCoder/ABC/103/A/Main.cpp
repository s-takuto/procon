#include <iostream>
#include <cmath>
#include <limits.h>

using namespace std;

int main() {
  int a, b, c;

  cin >> a >> b >> c;

  int ab = abs(a - b);
  int ac = abs(a - c);
  int bc = abs(b - c);

  int ans = INT_MAX;
  ans = min(ans, (ab + ac));
  ans = min(ans, (ab + bc));
  ans = min(ans, (ac + bc));

  cout << ans << endl;
}