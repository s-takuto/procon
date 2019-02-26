#include <iostream>
#include <string>

using namespace std;

bool judge(string s, string t) {
  string str = s;
  for (int i = 0; i < s.size(); i++) {
    if (str == t) {
      return true;
    }

    str = str[str.size() - 1] + str.substr(0, str.size()-1);
  }

  return false;
}

int main() {
  string s, t;
  cin >> s >> t;

  if (judge(s, t)) {
    cout << "Yes" << endl;
  }
  else {
    cout << "No" << endl;
  }

}