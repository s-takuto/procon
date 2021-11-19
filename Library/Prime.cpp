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

class Prime {

  public:
    // a以下の素数を全て求める関数(ちゃんとデバックしてない)
    // エラトステネスの篩を使用
    set<int> enumerateAllPrime(int a) {
      set<int> prime;
      for (int i = 2; i <= a; i++) {
        prime.insert(i);
      }

      for (auto p : prime) {
        if (p > sqrt(a)) {
          break;
        }

        for (int i = 2; i <= (a / p); i++) {
          prime.erase(p * i);
        }
      }

      return prime;
    }
};