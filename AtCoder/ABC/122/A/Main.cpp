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

  string s;
  cin >> s;

  string ans;
  if (s == "A") {
    ans = "T";
  }
  else if (s == "T") {
    ans = "A";
  }
  else if (s == "C") {
    ans = "G";
  }
  else if (s == "G") {
    ans = "C";
  }

  cout << ans << endl;
}