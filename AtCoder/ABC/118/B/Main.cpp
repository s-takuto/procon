#include <iostream>

using namespace std;

int main() {
  int n, m;
  cin >> n >> m;

  int countFoods[m];
  for (int i = 0; i < m; i++) {
    countFoods[i] = 0;
  }

  for (int i = 0; i < n; i++) {
    int k;
    cin >> k;

    for (int j = 0; j < k; j++) {
      int food;
      cin >> food;
      food -= 1;

      countFoods[food] += 1;
    }
  }

  int ans = 0;
  for (int i = 0; i < m; i++) {
    if (countFoods[i] == n) {
      ans += 1;
    }
  }

  cout << ans << endl;
}