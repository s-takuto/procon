#include <bits/stdc++.h>

using namespace std;
using ll = long long;

/**
 * @brief 文字列Sの中に含まれる"."の個数をカウントするメソッド
 *
 * @param S 文字列("." or "X")
 * @return (int)"."の個数
 */
int countDot(string S) {
  int count = 0;
  for (int i = 0; i < S.size(); i++) {
    if (S[i] == '.') {
      count++;
    }
  }

  return count;
}

/**
 * @brief 文字列Sに対してK回"X"に置き換えることで、"X"をn回連続発生することができるか判断する
 * →O(|S|^2)となってしまいTLE
 *
 * @param S 文字列("." or "X")
 * @param K "."を"X"に置き換えることのできる回数
 * @param n "X"が連続する回数
 * @return true できる
 * @return false できない
 */
bool judge(string S, int K, int n) {
  int i = 0;
  while((i + n) <= S.size()) {
    string subStr = S.substr(i, n);

    // subStrの.個数を算出する
    int count = countDot(subStr);

    // cout << "subStr : " << subStr << ", .Count : " << count << endl;

    // .の個数 <= K ならばtrue
    if (count <= K) {
      return true;
    }

    i++;
  }

  return false;
}

/**
 * @brief 文字列Sに対してK回"X"に置き換えることで、"X"をn回連続発生することができるか判断する
 * →尺取法による実装
 *
 * @param S 文字列("." or "X")
 * @param K "."を"X"に置き換えることのできる回数
 * @param n "X"が連続する回数
 * @return true できる
 * @return false できない
 */
bool judge1(string S, int K, int n) {
  int i = 0;
  int j = 0;
  int countDot = 0;
  if (S[0] == '.') {
    countDot = 1;
  }

  while(j < S.size()) {
    // debug
    // cout << "(" << i << ", " << j << "), countDot : " << countDot << endl;

    // 長さがnになったとき、K回で全ての"."を"X"に置換できるか判定する
    if ((j - i + 1) == n) {
      if (countDot <= K) {
        return true;
      }
    }

    // iを進める条件
    if (((j + 1) - i + 1) > n) {
      if (S[i] == '.') {
        countDot--;
      }
      i++;
    }
    // jを進める条件
    if ((j - i + 1) < n) {
      j++;
      if (S[j] == '.') {
        countDot++;
      }
    }
  }

  return false;
}

// 問：文字列Sに最大K回ある操作をして、"X"を最大で何個連続させることができるか求める
// ある操作："."を"X"へ置換する
int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  // 入力
  // S := 文字列S、"."か"X"のみでなる(1 <= |S| <= 2*10^5)
  // K := "."を"X"に置き換えることのできる回数(0 <= K <= 2*10^5)
  string S;
  int K;
  cin >> S >> K;

  // 計算
  // (1). コーナーケース
  // -> "."の個数がK以下ならば、全てを"X"に置換できるため文字列の長さが答えになる
  if (countDot(S) <= K){
    cout << S.size() << endl;
    return 0;
  }

  // (2). 「(1)」以外の場合、"X"を連続させる個数について2分探索をして解を求める
  int left = K;
  int right = S.size();
  while ((right - left) > 1) {
    int mid = (right + left) / 2;

    // debug
    // cout << "left : " << left << ", right : " << right << ", mid : " << mid << endl;

    // "X"をmid個連続することができるか調べる
    // bool ok = judge(S, K, mid);
    bool ok = judge1(S, K, mid);

    if (ok) {
      left = mid;
    } else {
      right = mid;
    }
  }

  // 出力
  cout << left << endl;
}
