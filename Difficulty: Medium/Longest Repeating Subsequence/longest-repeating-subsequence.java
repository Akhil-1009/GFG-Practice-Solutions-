//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int n=str.length();
        int dp[][]=new int[str.length()+1][str.length()+1];
        for(int i=1;i<=str.length();i++)
        {
            for(int j=1;j<=str.length();j++)
            {
                int indexi=str.length()-i;
                int indexj=str.length()-j;
                if(str.charAt(indexi)==str.charAt(indexj)&&indexi!=indexj)
                {
                        dp[i][j]=1+dp[i-1][j-1];                
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
        
        
    }
}