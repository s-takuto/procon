#include <algorithm>
#include <vector>

using namespace std;

// グループ分けを効率よく管理することができるデータ構造.
// ・要素a, bが同じグループかどうか判定できる
// ・要素aのグループとbのグループを、併合することができる
class UnionFind {
  private:
    // 各頂点vの親を表すリスト.
    // v自身が親ならば、-(vを含む集合の要素数)に設定する
    vector<int> parent;

  public:
    // 頂点数Nの親を-1に初期化することで、バラバラを表現する.
    UnionFind(int N) {
      parent = vector<int>(N, -1);
    }

    // 頂点vを含む木のrootを返す.
    int root(int v) {
      // v自身が親
      if (parent[v] < 0) {
        return v;
      }
      else {
        // vを含む木のrootをvの親とする。
        // (言い換え)vを含む集合の代表をvの親とする。
        return parent[v] = root(parent[v]);
      }
    }

    // 頂点vの所属する集合の要素数.
    int size(int v) {
      return -parent[root(v)];
    }

    // 頂点vとwが同じ集合に含まれているかどうかを示す.
    bool isSame(int v, int w) {
      return root(v) == root(w);
    }

    // 頂点v, wを同じグループにする。
    bool connect(int v, int w) {
      v = root(v);
      w = root(w);

      // vとwは同じ集合に属しているならば、この操作は必要ない。
      if (v == w) {
        return false;
      }

      // size(v) <= size(w)という想定。
      if (size(v) > size(w)) {
        swap(v, w);
      }

      // サイズが小さい集合を大きい集合にマージする。
      // サイズが小さい集合のrootの親は、大きい集合のrootとする。
      parent[w] += parent[v];
      parent[v] = w;

      return true;
    }
};