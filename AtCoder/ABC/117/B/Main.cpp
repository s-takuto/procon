#include<iostream>

using namespace std;

int main() {
  int N;
  cin >> N;

  int l[N];
  int max = 0;
  for (int i = 0; i < N; i++) {
    int length;
    cin >> length;

    l[i] = length;
    if (max < length) {
      max = length;
    }
  }

  int sum = 0;
  for (int i = 0; i < N; i++) {
    sum += l[i];
  }
  sum -= max;

  if (max < sum) {
    cout << "Yes" << endl;
  }
  else {
    cout << "No" << endl;
  }
}