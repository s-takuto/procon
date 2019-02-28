#include <iostream>

using namespace std;

int calc(int num, int k) {
  int ans = 0;
  ans += (num / k);
  if (num % k != 0) {
    ans += 1;
  }

  return ans;
}

int main() {
  int n, k;
  cin >> n >> k;

  int a[n];
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }

  cout << calc(n - 1, k - 1) << endl;
}