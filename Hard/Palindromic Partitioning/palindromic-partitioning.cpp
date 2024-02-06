//{ Driver Code Starts
// Initial Template for c++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int palindromicPartition(string str)
    {
        // code here
         
        // code here
        int n=str.length();
        bool dp[n][n];
    for(int g=0;g<n;g++)
    {
        for(int i=0,j=g;j<n;i++,j++)
        {
            if(i==j)
            {
                dp[i][j]=true;
            }
            else if(g==1)
            {
                dp[i][j]=(str[i]==str[j]);
            }
            else{
                if(str[i]==str[j])
                {
                    dp[i][j]=dp[i+1][j-1];
                }
                else{
                    dp[i][j]=false;
                }
            }
            
        }
        
    }
    int *dp2=new int[n];
        dp2[0]=0;
        for(int i=1;i<n;i++)
        {   if(dp[0][i]==false)
        {
            int min=INT_MAX;
            for(int j=i;j>=1;j--)
            {
                if(dp[j][i])
                {
                    if((dp2[j-1]+1)<min)
                    {
                        min=dp2[j-1]+1;
                    }
                    
                }
                
            }
            dp2[i]=min;
        }
        else{
            dp2[i]=0;
        }
        }
        return dp2[n-1];
     
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        string str;
        cin>>str;
        
        Solution ob;
        cout<<ob.palindromicPartition(str)<<"\n";
    }
    return 0;
}
// } Driver Code Ends