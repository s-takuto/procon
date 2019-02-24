#include <iostream>
#include <algorithm>

using namespace std;

// a >= b
int gcd( int a, int b )
{
	// 引数に０がある場合は０を返す
	if ( ( a == 0 ) || ( b == 0 ) ) {
		return 0;
  }

  if (a < b) {
    swap(a, b);
  }

  // ユークリッドの互除法
  int r = a % b;
  while (r != 0) {
    a = b;
    b = r;
    r =  a % b;
  }

  return b;
}

int main() {
  int n;
  cin >> n;

  int hitpoint[n];
  for (int i = 0; i < n; i++) {
    cin >> hitpoint[i];
  }

  int ans = gcd(hitpoint[0], hitpoint[1]);
  for (int i = 2; i < n; i++) {
    ans = gcd(ans, hitpoint[i]);
  }

  cout << ans << endl;

}
