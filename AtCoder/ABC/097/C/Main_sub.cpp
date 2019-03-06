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

// 部分点
// N := |s|
// O(N^2) -> 長さiの部分文字列を全て列挙する
// O(N * logN) -> ある部分文字列を挿入するのにlogN。それをN回繰り返す。
// O(N ^ 3 * logN)であるため、N=10^3は解けない。
int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  string s;
  int k;
  cin >> s >> k;

  set<string> stringSet;
  for (int i = 1; i <= s.size(); i++) {
    for (int j = 0; j <= s.size(); j++) {
      string str = s.substr(j, i);
      if (str.size() != i) {
        break;
      }

      stringSet.insert(str);
    }
  }

  auto itr = stringSet.begin();
  for (int i = 1; i < k; i++) {
    itr++;
  }

  cout << *itr << endl;
}