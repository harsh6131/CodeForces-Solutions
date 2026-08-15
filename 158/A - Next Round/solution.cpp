#include<bits/stdc++.h>
using namespace std;
 
int main(){
	int k,n;
	cin>>n>>k;
	vector<int> v(n);
	for(int i=0;i<n;i++)
		cin>>v[i];
		
	int count=0, check = v[k-1];
	for(int i=0;i<n;i++){
		if(v[i]>=check && v[i]>0) 
			count+=1;
		else break;
	}
	cout<<count;
	return 0;	
}