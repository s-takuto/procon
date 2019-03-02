#include <iostream>

using namespace std;

int main() {
  int d, n;
  cin >> d >> n;

  int ans = n;
  if (n == 100) {
    ans = 101;
  }

  for (int i = 0; i < d; i++) {
    ans *= 100;
  }

  cout << ans << endl;
}