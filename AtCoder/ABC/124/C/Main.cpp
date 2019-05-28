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

  string s0;
  string s1;

  int count0 = 0;
  for (int i = 0; i < s.size(); i++) {
    if (i % 2 == 0 && s[i] != '0') {
      count0++;
    }
    else if (i % 2 != 0 && s[i] != '1') {
      count0++;
    }
  }

  int count1 = 0;
  for (int i = 0; i < s.size(); i++) {
    if (i % 2 == 0 && s[i] != '1') {
      count1++;
    }
    else if (i % 2 != 0 && s[i] != '0') {
      count1++;
    }
  }

  cout << min(count0, count1) << endl;
}