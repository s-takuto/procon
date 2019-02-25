#include <iostream>
#include <vector>
#include <cmath>
#include <limits.h>

using namespace std;

int N;
int A, B, C;
int min_mp;

int calc(vector<int> s, int l[]) {
  // 0 -> Aの材料
  // 1 -> Bの材料
  // 2 -> Cの材料
  // 3 -> 使わない

  int mp = 0;
  int la = 0;
  int lb = 0;
  int lc = 0;
  for (int i = 0; i < s.size(); i++) {
    if (s[i] == 0) {
      if (la != 0) {
        mp += 10;
      }
      la += l[i];
    }
    else if (s[i] == 1) {
      if (lb != 0) {
        mp += 10;
      }
      lb += l[i];
    }
    else if (s[i] == 2) {
      if (lc != 0) {
        mp += 10;
      }
      lc += l[i];
    }
  }

  // A, B, Cに少なくとも一本は割り当てる必要がある
  if (la == 0 || lb == 0 || lc == 0) {
    return INT_MAX;
  }

  // A
  mp += abs(la - A);
  // B
  mp += abs(lb - B);
  // C
  mp += abs(lc - C);

  return mp;
}

void dfs(int depth, vector<int> s, int l[]) {
  if (depth == N) {
    min_mp = min(min_mp, calc(s, l));
    return;
  }

  for (int i = 0; i < 4; i++) {
    s[depth] = i;
    dfs(depth + 1, s, l);
  }
}

int main() {
  cin >> N >> A >> B >> C;

  int l[N];
  for (int i = 0; i < N; i++) {
    cin >> l[i];
  }

  vector<int> state(N);
  min_mp = INT_MAX;

  dfs(0, state, l);

  cout << min_mp << endl;
}