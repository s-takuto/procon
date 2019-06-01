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

  int n;
  cin >> n;


  int v[n], c[n];
  for (int i = 0; i < n; i++) {
    cin >> v[i];
  }
  for (int i = 0; i < n; i++) {
    cin >> c[i];
  }

  int sum = 0;
  for (int i = 0; i < n; i++) {
    if (v[i] - c[i] > 0) {
      sum += (v[i] - c[i]);
    }
  }

  cout << sum << endl;
}