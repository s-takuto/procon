#include <iostream>

using namespace std;

// コーナーケース
// n = 7, k = 3, minIndex = 3
// 1をk個のうち、右端左端にするよりも、真ん中周辺にした方がいいケース

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
  int minIndex = -1;
  for (int i = 0; i < n; i++) {
    cin >> a[i];
    if (a[i] == 1) {
      minIndex = i;
    }
  }

  if (n == k) {
    cout << 1 << endl;
    return 0;
  }

  int left = minIndex;
  int right = n - minIndex - 1;
  int ans = 0;

  if (left < (k - 1)) {
    right -= ((k - 1) - left);
    // ans += calc(left, k - 1);
    ans += 1;
    ans += calc(right, k - 1);
  }
  else if (right < (k - 1)) {
    left -= ((k - 1) - right);
    // ans += calc(right, k - 1);
    ans += 1;
    ans += calc(left, k - 1);
  }
  else {
    ans += calc(left, k - 1);
    ans += calc(right, k - 1);
  }

  cout << ans << endl;
}