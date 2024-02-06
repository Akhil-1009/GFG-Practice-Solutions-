//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    int editDistance(string s, string t) {
        // Code here
        
        // Code here
        int dp[101][101];
        for(int i=0;i<=s.length();i++)
        {
            dp[0][i]=i;
        }
        for(int i=1;i<=t.length();i++)
        {
            dp[i][0]=i;
        }
        for(int i=1;i<=t.length();i++)
        {
            for(int j=1;j<=s.length();j++)
            {
                if(s[s.length()-j]==t[t.length()-i])
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+min(dp[i-1][j],min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[t.length()][s.length()];
    }
};


//{ Driver Code Starts.
int main() {
    int T;
    cin >> T;
    while (T--) {
        string s, t;
        cin >> s >> t;
        Solution ob;
        int ans = ob.editDistance(s, t);
        cout << ans << "\n";
    }
    return 0;
}

// } Driver Code Ends