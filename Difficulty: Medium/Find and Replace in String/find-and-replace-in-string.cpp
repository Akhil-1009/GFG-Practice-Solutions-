//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

 class Solution {
  public:
    string findAndReplace(string S ,int Q, int index[], string sources[], string targets[]) {
        string ans="";
        unordered_map<int,int>mp;
        for(int i=0;i<Q;i++){
            mp[index[i]]=i;
        }
        for(int i=0;i<S.size();){
            if(mp.find(i)!=mp.end()){
                int j=mp[i];
                string s=S.substr(index[j],sources[j].size());
                if(s==sources[j]){
                    ans+=targets[j];
                    i+=sources[j].size();
                }
                else {
                    ans+=S[i];
                    i++;
                }
                
            }
            else {
                ans+=S[i];
                i++;
            }
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string S;
        cin>>S;
        
        int Q;
        cin>>Q;
        int index[Q];
        string sources[Q], targets[Q];
        
        for(int i=0; i<Q; i++)
            cin>>index[i];
        for(int i=0; i<Q; i++)
            cin>>sources[i];
        for(int i=0; i<Q; i++)
            cin>>targets[i];

        Solution ob;
        cout<<ob.findAndReplace(S,Q,index,sources,targets)<<endl;
    }
    return 0;
}
// } Driver Code Ends