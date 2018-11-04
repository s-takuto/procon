#include<iostream>
#include<cmath>

using namespace std;

int main() {
	int n;
	double t, a;

	cin >> n;
	cin >> t >> a;

	double h[n];
	for (int i = 0; i < n; i++) {
		cin >> h[i];
	}

	double ans = 10000000;
	int ans_i;
	for (int i = 0; i < n; i++) {
		double tem = t - h[i] * 0.006;
		
		if (fabs(a - tem) < ans) {
			ans = fabs(a -tem);
			ans_i = i;
		}
	}
	
	cout << ans_i + 1 << endl;
}
