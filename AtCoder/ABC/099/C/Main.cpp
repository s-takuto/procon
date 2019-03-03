#include <iostream>
#include <algorithm>
#include <climits>

using namespace std;

int calc(int val, int a) {
  int cur = a;
  while (cur <= val) {
    cur *= a;
  }

  return cur / a;
}

int main() {
  int n;
  cin >> n;

  int dp[n + 1];
  dp[0] = 0;
  for (int i = 1; i < n + 1; i++) {
    dp[i] = INT_MAX;
  }

  for (int i = 1; i < n + 1; i++) {
    int a = calc(i, 6);
    int b = calc(i, 9);
    if (i < 6) {
      a = 0;
    }
    else if (6 <= i && i < 9) {
      b = 0;
    }

    int minVal = dp[i - a];
    minVal = min(minVal, dp[i - b]);
    minVal = min(minVal, dp[i - 1]);

    dp[i] = minVal + 1;
  }

  cout << dp[n] << endl;
}