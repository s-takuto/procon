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

  int a, b;
  cin >> a >> b;

  if (a > b) {
    cout << a - 1 << endl;
  }
  else {
    cout << a << endl;
  }
}