#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main()
{
    ll t;
    cin >> t;

    while (t--)
    {
        ll n;
        cin >> n;
        ll a = 1e9;
        ll b = 1e9;
        ll count = 0;

        vector<ll> V(n);
        for (auto &i : V)
        {
            cin >> i;

            if (a > b)
            {
                swap(a, b);
            }

            if (i <= a)
            {
                a = i;
            }
            else if (i <= b)
            {
                b = i;
            }
            else
            {
                a = i;
                count++;
            }
        }

        cout << count << endl;
    }

    return 0;
}
