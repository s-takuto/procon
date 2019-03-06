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

// 辞書順でk番目に小さいということは、部分文字列の長さも高々kでよい。
// O(N * k) -> 部分文字列の列挙
// O(N * k * log(N * k)) -> ソート
int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  string s;
  int k;
  cin >> s >> k;

  set<string> stringSet;
  for (int i = 1; i <= k; i++) {
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