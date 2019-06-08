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

// 自分で考えてた解法
void solve1() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int n, q;
  cin >> n >> q;

  string s;
  cin >> s;

  int l[q], r[q];
  for (int i = 0; i < q; i++) {
    cin >> l[i] >> r[i];
  }

  // count[i]:=i番目までの文字列に含まれている"AC"の個数(0-index)
  int count[n];
  for (int i = 0; i < n; i++) {
    count[i] = 0;
  }

  for (int i = 1; i < n; i ++) {
   if (s.substr(i - 1, 2) == "AC") {
     count[i] = 1;
   }

    count[i] += count[i - 1];
  }

  for (int i = 0; i < q; i++) {
    // 0-indexのため
    int left = l[i] - 1;
    int right = r[i] - 1;

    if (left == 0) {
      cout << count[right] << endl;
    }
    else if (count[left] == count[left - 1]) {
      cout << count[right] - count[left - 1] << endl;
    }
    else {
      cout << count[right] - count[left - 1] - 1 << endl;
    }
  }
}

// 解答例
void solve2() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int n, q;
  cin >> n >> q;

  string s;
  cin >> s;

  int l[q], r[q];
  for (int i = 0; i < q; i++) {
    cin >> l[i] >> r[i];
  }

  // count[i]:=i+1番目までの文字列で、
  // i番目の文字が"A"で、その右隣が"C"である個数
  int count[n];
  for (int i = 0; i < n; i++) {
    count[i] = 0;
  }

  if (s.substr(0, 2) == "AC") {
    count[0] = 1;
  }
  for (int i = 1; i < n; i ++) {
   if (s.substr(i, 2) == "AC") {
     count[i] += (count[i - 1] + 1);
   }
   else {
     count[i] += count[i - 1];
   }
  }

  for (int i = 0; i < q; i++) {
    int left = l[i] - 1;
    int right = r[i] - 1;

    if (left == 0) {
      cout << count[right - 1] << endl;
    }
    else {
      cout << count[right - 1] - count[left - 1] << endl;
    }
  }
}

int main() {
  solve1();
  // solve2();
}

