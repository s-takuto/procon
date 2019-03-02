#include <iostream>

using namespace std;

bool judge(int a, int b) {
  return (a <= 8 && b <= 8);
}

int main() {
  int A, B;
  cin >> A >> B;

  if (judge(A, B)) {
    cout << "Yay!" << endl;
  }
  else {
    cout << ":(" << endl;
  }
}