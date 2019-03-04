#include <iostream>
#include <algorithm>
#include <climits>
#include <vector>
#include <utility>
#include <functional>
#include <map>

using namespace std;

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int a, b, k;
  cin >> a >> b >> k;

  vector <int> list;
  for (int i = 1; i <= max(a, b); i++) {
    if (a % i == 0 && b % i == 0) {
      list.push_back(i);
    }
  }

  cout << list[list.size() - k] << endl;

}