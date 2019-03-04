#include <iostream>
#include <algorithm>
#include <climits>
#include <vector>
#include <utility>
#include <functional>
#include <map>
#include <string>

using namespace std;

class UnionFind {
  public:

    // 各頂点iの親を表すリスト
    // 親は-(要素数)に設定する
    vector<int> parent;

    UnionFind(int N) {
      parent = vector<int>(N, -1);
    }

    // Aの親を返す
    int root(int A) {
      if (parent[A] < 0) {
        return A;
      }
      else {
        // Aの親を更新することができる
        return parent[A] = root(parent[A]);
      }
    }

    // Aの所属するグループの大きさ
    int size(int A) {
      return -parent[root(A)]; // Aの親
    }

    // A, Bを同じグループにする。
    bool connect(int A, int B) {
      int parentA = root(A);
      int parentB = root(B);

      // AとBがそもそも同じグループ
      if (parentA == parentB) {
        return false;
      }

      // AとBが違うグループならば、どちらかに合体する
      // parentA < parentBの気持ち
      if (size(parentA) > size(parentB)) {
        swap(parentA, parentB);
      }

      // バグがありそう
      int sizeA = size(parentA);
      parent[parentA] = parentB;
      parent[parentB] = -(sizeA + size(parentB));

      return true;
    }
};

int main() {
  cin.tie(0);
  ios::sync_with_stdio(false);

  int N, M;
  cin >> N >> M;

  int a[M], b[M];
  for (int i = M - 1; i >= 0; i--) {
    cin >> a[i] >> b[i];
    a[i]--;
    b[i]--;
  }

  vector<long> ans = vector<long>(M);
  ans[0] = (long) N * (N - 1) / 2;

  UnionFind uni = UnionFind(N);

  for (int i = 0; i < M - 1; i++) {
    if (uni.root(a[i]) != uni.root(b[i])) {
      // a[i], b[i]は違うグループ
      ans[i + 1] = ans[i] - (long)(uni.size(a[i]) * uni.size(b[i]));
      // cout << ans[i + 1] << ", " << ans[i] << endl;
      uni.connect(a[i], b[i]);
    }
    else {
      ans[i + 1] = ans[i];
    }
  }

  for (int i = M - 1; i >= 0; i--) {
    cout << ans[i] << endl;
  }
}