#include <bits/stdc++.h>
using namespace std;
 
int main() {
    string guest, host, pile;
 
    cin >> guest;
    cin >> host;
    cin >> pile;
 
    string required = guest + host;
 
    int count1[26] = {};
    int count2[26] = {};
 
    for (char c : required) {
        count1[c - 'A']++;
    }
 
    for (char c : pile) {
        count2[c - 'A']++;
    }
 
    for (int i = 0; i < 26; i++) {
        if (count1[i] != count2[i]) {
            cout << "NO";
            return 0;
        }
    }
 
    cout << "YES";
 
    return 0;
}